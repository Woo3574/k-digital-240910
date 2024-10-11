package Dl.예외처리기본;

// 프로그램에서 오류가 발생하는 경우는 키게 두 가지
// 첫번째는 컴파일 오류(문법을 잘 못 작성하는 경우)
// 두번째는 실행중에 오류가 발생하는 경우(런타임 오류)
// 컴파일 타임의 오류와 런타임에 오류의 걍우는 컴파일 타임에 발생하는 것 훨씬 바람직

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain {
    public static void main(String[] args) {
        arrayExceptionFunc();
        fileNotFoundFunc();
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
}