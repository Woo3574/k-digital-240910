package Zd.단어정렬;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
// 1.길이가 짧은 것부터
// 2.길이가 같으면 사전 순으로
// 3.중복 제거

public class WordArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("알파벳 소문자 단어 갯수 입력 : ");
        int n = sc.nextInt();
        System.out.println("알파벳 소문자 입력");
        sc.nextLine();

        Set<String> set =  new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 길이가 같으면 사전순 정렬
                }
                return o1.length() - o2.length(); // 길이 순으로 정렬
            }
        });
        for (int i = 0; i < n; i++) {
            set.add(sc.nextLine().trim());
        }
        sc.close();

        System.out.println("=".repeat(30));
        for (String e : set) {
            System.out.println(e);
        }
    }
}
