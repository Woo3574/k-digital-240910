package Aw.평균점수구하기;
// 내가 푼 방법

// 학생수 5명에 대한 성적을 입력 받음
// 입력 받은 성적 중에서 40점 미만이 있으면 40점으로 올림
// 평균 점수를 구해서 출력 하기
// 점수는 모두 0점 이상, 100점 이하인 5의 배수이다. 따라서, 평균 점수는 항상 정수이다.

import java.util.Scanner;

public class AverEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("5명의 학생의 점수를 순서대로 입력 하세요 : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        int avg = 0;

        for(int i = 0; i < arr.length;i++) {
            if( arr[i] < 40) {
                arr[i] = 40;
            }
            avg += arr[i];
        }
        System.out.print(avg/5);

    }
}
