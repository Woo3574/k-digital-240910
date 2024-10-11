package Dl.예외처리기본;

// 프로그램에서 오류가 발생하는 경우는 키게 두 가지
// 첫번째는 컴파일 오류(문법을 잘 못 작성하는 경우)
// 두번째는 실행중에 오류가 발생하는 경우(런타임 오류)
// 컴파일 타임의 오류와 런타임에 오류의 걍우는 컴파일 타임에 발생하는 것 훨씬 바람직

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args) {
        // arrayExceptionFunc();
        // fileNotFoundFunc();
        // nullPointerFunc();
        arithmeticFunc();
    }
    static void arrayExceptionFunc() {
        try {
            int[] arr = new int[5];
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 배열의 범위를 벗어났습니다.");
        }System.out.println("프로그램 정상 종료");
    }

    static void fileNotFoundFunc() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("해당 파일이 없습니다. 계속 진행하시겠습니까?");
        }
    }

    //NullPointerException
    static void nullPointerFunc() {
        try {
            Test test = null; // 참조하는 객체가 없음을 의미
            System.out.println(test.name);
        } catch (NullPointerException e) {
            System.out.println("참조하고자하는 객체가 생성되지않았습니다.");
        }
    }

    static void arithmeticFunc() {
        int rst = 0;
        try {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 값 : ");
        int a = sc.nextInt();
        System.out.print("두번째 값 : ");
        int b = sc.nextInt();
            rst = a / b;
            System.out.println(rst);
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println(e + "오류 발생");
        } finally {
            System.out.println("무조건 수행되는 구문");
        }
    }
}

class Test {
    String name = "민지";
}