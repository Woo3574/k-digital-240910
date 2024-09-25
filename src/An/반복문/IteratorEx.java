package An.반복문;
// 반복문이란? 주어진 조건이 참인 동안 혹은 정해진 횟수 만큼 반복적으로 프로그램을 수행 하는 것
// while문, do ~ while문, for문(범위 기반), Enhanced for문(요소의 갯수를 자동 순회)

import java.util.Scanner;

public class IteratorEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 : ");
        int n = sc.nextInt();
        int sum = 0; // 값을 누적하기 위한 변수
//        while (n > 0) { // 참을보지만 조건식의 참을 봐야함 == java 조건식이 아닐경우 Error
//            sum += n; //sum = sum + n;
//            n--; // n = n - 1, 값을 대입하지않으면 전위,후위 상관없이 값이 감소 됨
//        }
//        System.out.println("합계 : " + sum);
        for(int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println("합계 :  " + sum);

        int i = 1;
        for(; i < n;) {
            sum += i;
            i++;
        }
        System.out.println("합계 : " + sum);


    }
}
