package A0.연습장;

import java.util.Scanner;

public class PlacticeNote {
    public static void main(String[] args) {
        condition(); // Ai조건문 연습
        switchEx(); // Ajswitch case문 연습
        gradeEx(); // Ak.등급출력하기
        arrayEx(); // Ar.배열
        arraySort(); // At.배열정렬
    }

    static void condition() {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        if( num > 0) {
//            System.out.println("양수 입니다.");
//        }
//        else {
//            System.out.println("음수 입니다.");
//        }
//        if(num > 100) {
//            System.out.println(num + "이 100보다 큽니다.");
//        } else if (num < 100) {
//            System.out.println(num + "이 100보다 작습니다.");
//        }else {
//            System.out.println(num + "이 100과 같습니다.");
//        }

//        * 조건문 내의 코드가 한줄이면 {} 블록스코프 생략 가능
//        if(num > 100) System.out.println(num + "이 100보다 큽니다.");
//        else if (num < 100) System.out.println(num + "이 100보다 작습니다.");
//        else System.out.println(num + "이 100과 같습니다.");

//        * 입력 받은 문자가 대문자인지 소문자인지 출력 하기
//        char ch = sc.next().charAt(0); // 'A'65 'Z'90 'a' 97 'z'127
//        if(ch >= 'a' && ch <= 'z') System.out.println(ch + "는 소문자입니다.");
//        else if (ch >= 'A' && ch <= 'Z' ) System.out.println(ch + "는 대문자입니다.");
//        else System.out.println(ch + "는 알파벳이 아닙니다.");

//        100의 자리 정수를 입력 받아서 3개의 변수에 나누어 대입 하기
//        354 -> a > 3 b -> 5 c ->4
//        System.out.print("세자리 정수 값 입력 : ");
//        int num = sc.nextInt();
//        int a = num / 100;
//        int b = (num/10) % 10;
//        int c = num % 10;
//        System.out.printf(" 100의 자리는 %d, 10의 자리는 %d, 1의 자리는 %d 입니다.", a, b, c);
    }

    static void switchEx() {
        Scanner sc = new Scanner(System.in);
//        System.out.print("원하는 계절 영단어로 입력 : ");
//        String season = sc.next();
//        switch(season) {
//            case "spring" :
//                System.out.println("아주 향긋한 꽃내음이 맡아져오는 봄입니다.");
//                break;
//            case "summer" :
//                System.out.println("무더위가 말썽인 여름입니다.");
//                break;
//            case "fall" :
//            case "autumn" :
//                System.out.println("바바리안 코트가 잘어울릴것 같은 가을입니다.");
//                break;
//            case "winter" :
//                System.out.println("꽃샘추위가 벌써부터 느껴지는 겨울입니다.");
//                break;
//        }
//        if (season.equals("spring")) {
//            System.out.println("아주 향긋한 꽃내음이 맡아져오는 봄입니다.");
//        } else if (season.equals("summer")) {
//            System.out.println("무더위가 말썽인 여름입니다.");
//        } else if (season.equals("fall")|| season.equals("atutumn")) {
//            System.out.println("바바리안 코트가 잘어울릴것 같은 가을입니다.");
//        } else if (season.equals("winter")) {
//            System.out.println("꽃샘추위가 벌써부터 느껴지는 겨울입니다.");
//        } else {
//            System.out.println("계절을 잘못 입력 하셨습니다.");
//        }

    }

// 국어, 영어, 수학 성적을 입력 받아서 총점을 구하고
// 평균이 90점이상이면 A
//        80점 이상이면 B
//        70점 이상이면 C
//        60점 이상이면 D
//        나머지는 F
// 각각의 성적은 0 ~ 100으로 입력되어야하고 입력값이 잘못된 경우 재입력을 받아야 함.

    static void gradeEx() {
        Scanner sc = new Scanner(System.in);
//        System.out.print("kor 성적 입력 : ");
//        int a = sc.nextInt();
//        System.out.print("eng 성적 입력 : ");
//        int b = sc.nextInt();
//        System.out.print("math 성적 입력 : ");
//        int c = sc.nextInt();
//        double avg = (double)(a + b + c) / 3;
//        if (a >= 0 && a <= 100 && b >= 0 && b <= 100 && c >= 0 && c <= 100) {
//            if (avg >= 90) {
//                System.out.println("A");
//            } else if (avg >= 80) {
//                System.out.println("B");
//            } else if (avg >= 70) {
//                System.out.println("C");
//            } else if (avg >= 60) {
//                System.out.println("D");
//            } else if (avg >= 50) {
//                System.out.println("E");
//            } else {
//                System.out.println("F");
//            }
//
//        }else{
//            System.out.println("잘못된 값을 입력하셨습니다.");
//        }
    }

    static void arrayEx() {
        int[] score = new int[3];

//        score[0] = 70;
//        score[1] = 80;
//        score[2] = 90;
//
//        // 범위 기반 for문 사용, 배열의 내용을 변경 할 수 있음,범위를 지정해서 순회 가능
//        for (int i = 0; i < score.length; i++) {
//            score[i] = score[i] + 10;
//            System.out.print(score[i] + " ");
//        }
//        System.out.println();
//
//        // 향상된 for문 사용,배열의 내용을 변경 할 수 없음,무조건 전체 순회
//        for(int e : score) { //배열 변수 할당된 메모리 요소(e)개별로 전체 순회
//            e = e + 10;
//            System.out.print(e + " ");
//        }
//
//        // 배열의 선언하는 여러가지 방법
//        int[] num = new int[4];
//        int[] num2 = {88, 99, 452};
//        int[] num3;
//        num3 = new int[4];
//        int[] num4;
//        num4 = new int[]{35, 68, 80};
    }

    static void arraySort() {
        // 정렬 알고리즘 종류 : 버블 정렬0(n2), 삽입정렬0(n2), 병합정렬0(nlogn), 퀵정렬0(nlogn)
//        int[] arry = {9, 4, 6, 7 ,2 ,3 ,5 ,1}; // 길이 8
//        int empty = 0;
//        for (int i = 0; i < arry.length; i++) {
//            for (int j = i; j < arry.length; j++) {
//                if(arry[i] > arry[j]) {
//                    empty = arry[i];
//                    arry[i] = arry[j];
//                    arry[j] = empty;
//                }
//            }
//        } for (int e : arry){
//            System.out.print(e + " ");
//        }
    }
}