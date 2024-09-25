package Ap.반복문연습;
// 내가 풀어본 문제

// 1 ~ 1000까지의 7의 배수를 구하고, 한줄에 10개 항목씩 출력하기
// for (초기값; 조건식; 증감값)

// 구구단 구하기
// 단수 입력:

import java.util.Scanner;

// 입력이 5인 경우
// *****
// ****
// ***
// **
// *
public class IteratorEx2 {
    public static void main(String[] args) {
//        multipleSeven();
        multipleTable();
        multipleStar();
    }
//    public static void multipleSeven() {
//        int sum = 0;
//        int cnt = 0; //횟수를 구하기 위한 변수
//        for (int i = 1; i*7 <=1000; i++) {
//            sum = i * 7;
//            cnt++;
//            System.out.printf("%5d", sum );
//            if(cnt == 10) {
//                System.out.println();
//                cnt = 0;
//            }
//        }
//    }
    public static void multipleTable() {}
    public static void multipleStar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("찍을 별 갯수를 입력 : ");
        int num = sc.nextInt();
        for(int i = num; i < 0; i--) {
            i--;
            int sum = '*';
            if(i < num)
            System.out.printf("%c", sum);

        }
    }
}
