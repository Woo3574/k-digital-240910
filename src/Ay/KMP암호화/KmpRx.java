package Ay.KMP암호화;
// Knuth-Morris-Pratt => KMP
// Korea-Seoul => KS
// Mirko-Slavko => MS

import java.util.Scanner;

public class KmpRx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        // 문자열에서 문자 추출 후 대문자만 골라서 찍기 (ASCII코드 확인)
        for(int i= 0 ; i < name.length() ; i++){
            if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
                System.out.print(name.charAt(i));
            }
        }
        System.out.println();

        // 0번째 문자 출력, '-' 다음 문자 출력
        for(int i = 0; i < name.length(); i++) {
            if(i == 0) System.out.print(name.charAt(i));
            else {
                if(name.charAt(i) == '-') System.out.print(name.charAt(i+1));
            }
        }
        System.out.println();

        // split('-') 기준으로 자르고 0번째 문자 출력
        String[] strSplit = name.split("-");
        for(String e : strSplit) {
            System.out.print(e.charAt(0));
        }
        System.out.println();

        // toCharArray()를 사용해서 문자 배열로 만들고 대문자만 골라내기
        char[] chName = name.toCharArray();
        for (char e : chName) {
            if(e >= 'A' && e <= 'Z') System.out.print(e);
        }

    }
}
