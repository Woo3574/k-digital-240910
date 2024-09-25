package Af.입력받기연습;
// 이름 : String, next()
// 주소 : String, nextLine()
// 성별 : Char, next().charAt(0)
// 나이 : int, nextInt()
// === 회원 정보 출력 ===
// 이름 :
// 주소 :
// 성적 :
// 나이 :

import java.util.Scanner;

public class ScannerInputEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //sc.nextLine(); // 버퍼 비우기  <- 엔터를 쳣을때 에러발생 줄바꿈(enter)이라는 입력문자를 처리해주지못하기때문
        String addr = sc.nextLine();
        char gender = sc.next().charAt(0);
        int age = sc.nextInt();
        System.out.println("=== 회원 정보 출력 ===");
        System.out.printf("이름 : %s\n", name);
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("나이 : %d\n", age);

    }
}
