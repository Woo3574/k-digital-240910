package Ap.반복문연습;
// 교수님이 푼문제

import java.util.Scanner;

public class IteratorEx999 {
    public static void main(String[] args) {
        multipleSeven();
        multiTable();
        multipleStar();
    }

    public static void multipleSeven() {
        for (int i = 1; i <= 1000; i++) {
            if (i % 7 == 0) {
                System.out.printf("%5d", i);
                if (i % 70 == 0) System.out.println();
            }
        }
        System.out.println();

    }

    public static void multiTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("단수 입력 : ");
        int n = sc.nextInt();
        System.out.println("==== " + n + "단 ====");
        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }

    public static void multipleStar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
