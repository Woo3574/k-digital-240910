package A0.연습장;

import Ba.필드와메서드.FildAndMethodEx;

import java.util.Scanner;

public class
PlacticeNote {
    public static void main(String[] args) {
        condition(); // Ai조건문 연습
        switchEx(); // Ajswitch case문 연습
        gradeEx(); // Ak.등급출력하기
        swtichEX(); // Al.스위치문계산기
        alarmEx(); // AM.상근이알람
        iterator(); // Ap.반복문연습
        iterator2();
        iterator3();
        iterator4();
        arrayEx(); // Ar.배열
        arraySort(); // At.배열정렬
        doubleArrEx(); // Au.이차원배열
        averEx(); // Aw.평균점수구하기
        averEx2();
        stringEx(); // Ax문.자열다루기
        stringEx();
        upperlowch();
        kmpRx(); // Ay.KMP암호화
        kmpRx2();
        kmpRx3();
        kmpRx4();
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

    //간단한 계산기 만들기
    static  void swtichEX() {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt(); // 좌변
//        char y = sc.next().charAt(0); // 연산자
//        int z = sc.nextInt(); // 우변
//
//        switch (y) {
//            case '+' : System.out.println(x + z); break;
//            case '-' : System.out.println(x - z); break;
//            case '*' : System.out.println(x * z); break;
//            case '/' : System.out.println(x / z); break;
//            case '%' : System.out.println(x % z); break;
//        }
    }

    // 스캐너 객체 생성
    // 시간 입력 :
    // 분 입력 :
    // 시간과 분을 분으로 환산
    // 계산된 분이 45 미만이면 하루의 시간을 더해주고
    // 계산된 시간에서 45를 빼줌
    // 다시 시간과 분으로 환산해서 결과 출력
    static void alarmEx() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("시간 입력 : ");
//        int hour = sc.nextInt();
//        System.out.print("분 입력 : ");
//        int min = sc.nextInt();
//        int allTime = hour * 60 + min;
//        if (allTime < 45 ) {
//            allTime = 1440 + min;
//        } allTime -= 45;
//        System.out.printf("예정된 알람시간은 %d시%d분 입니다.", (allTime / 60), (allTime % 60));
//            hour = (1440 + min - 45) / 60;
//            min =  (1440 + min - 45) % 60;
//            System.out.printf("예정된 알람시간은 " + hour + "시" + min +"분 입니다.");
//        } else if ( allTime >= 45 ) {
//            hour = (allTime - 45) / 60;
//            min = (allTime - 45) % 60;
//            System.out.printf("예정된 알람시간은 " + hour + "시" + min +"분 입니다.");
//        }
    }

    // 구구단 구하기
    // 단수 입력:
    static void iterator() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("구구단 단수 입력 : ");
//        int mpcT = sc.nextInt(); // mutiplicationTable 곱셈표
//        for (int i = 1; i < 10; i++) {
//            System.out.println(mpcT + "x" + i + "=" + mpcT*i );
//        }
    }

    // 구구단 표만들기
    static void iterator2() {
//        int cnt = 1;
//        while (cnt < 10) {
//            for (int i = 1; i < 10; i++) {
//                System.out.print(i + "단 : ");
//                for (int j = 1; j < 10; j++) {
//                    System.out.printf("%-12S", (i + " X " + j + " = " + i*j));
//                } System.out.println();
//              cnt++;
//            }
//        } System.out.println("구구단을 마치겠습니다");
    }

    // 입력이 5인 경우
    // *****
    // ****
    // ***
    // **
    // *
    static void iterator3() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수 입력 : ");
//        int star = sc.nextInt();
//        for (int i = 0; i < star; i++) {
//            for (int j = 0; j < star - i ; j++) {
//                System.out.print("*");
//            }System.out.println();
//        }
    }

    // 1 ~ 1000까지의 7의 배수를 구하고, 한줄에 10개 항목씩 출력하기
    // for (초기값; 조건식; 증감값)
    static void iterator4() {
//        int sum;
//        int cnt = 0;
//        for (int i = 1; i < 1000; i++) {
//            sum = i % 7;
//            if (sum == 0 ){
//                System.out.printf("%6d", i);
//                cnt++;
//            }
//            else if (cnt == 10) {
//                System.out.println();
//                cnt = 0;
//            }
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

    static void doubleArrEx() {
//        int[][] arr = new int[3][4]; // 3행4열
//        int cnt = 1;
//        for (int i = 0; i < arr.length; i++ ) { // arr 배열 참조변수 길이값은 3
//            for(int j = 0; j < arr[i].length; j++) { // arr[i] 길이값은 4
//                arr[i][j] = cnt;
//                cnt++;
//            }
//        }
//        for(int[] ee : arr) { // ee == 행 요소 arr은 3행4열 전체
//            for(int e : ee) { // ee[1],[2],[3]행에 대한 길이 한번씩 1행 순회
//                System.out.printf( "%3d ", e);
//            }
//            System.out.println();
//            1열 2열 3열 4열
//            1행 [ ] [ ] [ ] [ ]
//
//            2행 [ ] [ ] [ ] [ ]
//
//            3행 [ ] [ ] [ ] [ ]
//
//            arr[i][j] =
//            arr[0] 4 = 4 0  0 1
//                       4 1  0 2
//                       4 2  0 3
//                       4 3  0 4
//            arr[1] 4 = 4 0  1 5
//                       4 1  1 6
//                       4 2  1 7
//                       4 3  1 8
//            arr[2] 4 = 4 0  1 9
//                       4 1  1 10
//                       4 2  1 11
//                       4 3  1 12
//        }
    }
    // 학생수 5명에 대한 성적을 입력 받음
    // 입력 받은 성적 중에서 40점 미만이 있으면 40점으로 올림
    // 평균 점수를 구해서 출력 하기
    // 점수는 모두 0점 이상, 100점 이하인 5의 배수이다. 따라서, 평균 점수는 항상 정수이다.
    static void averEx(){
//        Scanner sc = new Scanner(System.in);
//        int avg = 0;
//        int sum = 0;
//        for(int i = 0; i < 5; i++) {
//            System.out.print("점수 입력 : ");
//            avg = sc.nextInt();
//            if( avg < 40 && avg >= 0) {
//                avg = 40;
//            } else if (avg < 0 || avg> 100) {
//                System.out.println("잘 못된 값을 받았습니다. 다시 입력하세요.");
//                i -= 1;
//                avg = 0;
//            }
//            sum += avg;
//
//        }
//        System.out.println((double)sum/5);
    }

    static void averEx2() {
//        Scanner sc = new Scanner(System.in);
//        int[] arry = new int[5];
//        int avg = 0;
//        for (int i = 0; i < arry.length; i++) { // aray.length 의 길이는 5
//            System.out.print("점수 입력 : ");
//            arry[i] = sc.nextInt();
//            if (arry[i] < 40) {
//                arry[i] = 40;
//            } avg += arry[i];
//        }
//        System.out.println(avg/5);
    }

    static void stringEx() {
//        String a = "hello";
//        String b = "Hello";
//        System.out.println(a.equals(b));
//        System.out.println(a.equalsIgnoreCase(b)); // equalsIgnoreCase = 대소문자 구분 X
//        // System.out.println(a == b); // a의 주소와 b의 주소가 같은지 물어보는 경우가 됨
//
//        // .indexOf = 문자열에서 사용자가 정한 문자의 시작 되는 인덱스 값
//        String c = "Hello Java";
//        System.out.println(c.indexOf("Java"));
//
//        // .contains() :문자열에서 특정 문자열이 포함되어 있는지 여부를 반환
//        System.out.println(c.contains("Hello"));
//
//        // .charAt() : 문자열에서 특정 위치의 문자를 리턴
//        System.out.println(6);
//
//        // .replace() : 특정 문자열을 다른 문자열로 대체할때
//        String d = "안녕하세요 자바입니다.";
//        System.out.println(d.replace("안녕하세요", "Hi"));
//        System.out.println(d);
//        String f = d.replace("자바입니다.", "반갑습니다.");
//        System.out.println(f);
//
//        // .substring() = 문자열의 특정위치부터 뽑아낼때
//        String e = "Hello Java";
//        System.out.println(e.substring(5));
//        System.out.println(e.substring(5,8));
//
//        // .toUpperCase,toLowerCase
//        System.out.println(e.toUpperCase());
//        System.out.println(e.toLowerCase());
//
//        // .trim() :앞,뒤 공백제거
//        String g = "   오늘따라 유난    히 즐겁다.   ";
//        System.out.println(g.trim());
//
//        // split() : 문자열을 특정 문자열 기준으로 분리
//        String h = "23:48:25";
//        String[] timeStr = h.split(":");
//        for (String k : timeStr){
//            System.out.print(k + " ");
//        }
//        System.out.println(timeStr[0] + "시" + timeStr[1] + "분" + timeStr[2] +"초" );
//
//        // 서식 지정작 printf()
//        System.out.printf("오늘도 무더운 %d도 입니다.", 38);
//
//        // toChatArray() : 문자열을 문자 배열로 반환
//        String chArry = "adwdjfkkfbkfbFk";
//        char[] ch = chArry.toCharArray();
//        for(char el : ch ) {
//            System.out.print(el+ " ");
//        }
    }

    // 실습 문제 : 대문자,소문자로 이루어진 문자열을 입력 받아, 대문자는 소문자로, 소문자는 대문자로 반환
    // 'A' = 65 'a' = 97 'Z' = 90 'z'=122
    static void upperlowch() {
//        // 스캐너 객체 생성
//        // 문자열을 입력 받음
//        // 입력 받은 문자열 길이 만큼 반복 순회하면서 인덱스로 문자 추출
//        // 추출된 문자가 소문자이면 문자 'a' ~ 'A'만큼의 값을 빼줌
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        for ( int i = 0; i < str.length(); i++ ) {
//            char ch = str.charAt(i);
//            if (ch >= 'a' && ch <= 'z') {
//                System.out.print((char)(ch + ('A' - 'a')));
//            } else if (ch >= 'A' && ch <= 'Z') {
//                System.out.print((char)(ch + ('a' - 'A')));
//            }
//        }
    }

    // Knuth-Morris-Pratt => KMP
    // Korea-Seoul => KS
    // Mirko-Slavko => MS
    static void kmpRx() { // 문자열을 순회해서 조건에 해당하는 값만 출력
//        Scanner sc = new Scanner(System.in);
//        System.out.print("문자열을 입력 : ");
//        String str = sc.nextLine();
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch >= 'A' && ch <= 'Z') System.out.print(ch);
//        }
    }

    static void kmpRx2() { // - 기준으로 분리해서 첫번째 문자만 출력
//        Scanner sc = new Scanner(System.in);
//        System.out.print("문자열 입력 : ");
//        String str = sc.nextLine();
//        String[] strSplit = str.split("-");
//        for (String e : strSplit) {
//            System.out.print(e.charAt(0));
//        }
    }

    static void kmpRx3() { // tocharArray 메서드를 사용하여 문자열을 문자로 변환한뒤 조건문에 해당하는것을 출력
//        Scanner sc = new Scanner(System.in);
//        System.out.print("문자열 입력 : ");
//        String str = sc.next();
//        char[] ch = str.toCharArray();
//        for (char e : ch) {
//            if (e >= 'A' && e <= 'Z') {
//             System.out.print(e);
//            }
//        }
    }

    static void kmpRx4() { // 0번째 문자와 - 다음 문자를 출력
//        Scanner sc = new Scanner(System.in);
//        System.out.print("문자열 입력 : ");
//        String str = sc.next();
//        System.out.print(str.charAt(0));
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '-') {
//                System.out.print(str.charAt(i+1));
//            }
//        }

    }
}