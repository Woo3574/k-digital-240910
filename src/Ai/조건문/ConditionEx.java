package Ai.조건문;
// 제어문: 프로그램의 순차적인 흐름을 제어 할 때 사용
// 제어문에는 조건문과 반복문이 있음
// 조건문 :
// - if, if ~ else, if ~ else if ~ else
// - switch ~ case 문, 조건식은 올 수 없고 값만 올 수 있음
// - 삼항연산자

import java.util.Scanner;

public class ConditionEx {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수 값 입력 : ");
//        int num = sc.nextInt();
//
//        if (num >= 0) {
//            System.out.println("양수 입니다.");
//        }
//        else {
//            System.out.println("음수 입니다.");
//        }
//
//        if (num > 100) {
//            System.out.println(num + "이 100보다 커요.");
//        }
//        else if(num < 100) {
//            System.out.println(num + "이 100보다 작아요.");
//        }
//        else {
//            System.out.println(num + "이 100과 같아요.");
//        }
//
//        // 조건문 내의 코드가 한줄인 경우는 { }생략 가능
//        if (num > 100) System.out.println(num + "이 100보다 커요.");
//        else if(num < 100) System.out.println(num + "이 100보다 작아요.");
//        else System.out.println(num + "이 100과 같아요.");
//
//        //입력 받은 문자가 대문자인지 소문자인지 출력 하기
//        System.out.print("문자를 입력 : ");
//        Scanner ac = new Scanner(System.in);
//        char ch = ac.next().charAt(0);
//        if ( ch >= 'a' && ch<= 'z') {
//            System.out.println(ch + "는 소문자 입니다.");
//        }
//        else if (ch >= 'A' && ch <= 'Z') {
//            System.out.println(ch + "는 대문자 입니다.");
//        }
//        else {
//            System.out.println(ch + "는 알파벳이 아닙니다.");
//        }



        //100의 자리 정수를 입력 받아서 3개의 변수에 나누어 대입 하기
        // 354 -> a > 3 b -> 5 c ->4
        Scanner bc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int number = bc.nextInt();
        int q = number/100;
        int w = (number/10)% 10;
        int e = number%10;

        System.out.printf("100의 자리 %d 10의 자리 %d 1의자리 %d", q,w,e );



    }
}
