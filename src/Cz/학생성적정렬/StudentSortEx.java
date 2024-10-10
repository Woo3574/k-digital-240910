package Cz.학생성적정렬;

// 5명의 학생에 대해 이름과 국어, 영어, 수학 성적을 입력 받아서 정렬하기
// 첫번째 조건은 총점 기준
// 총점이 같으면 이름의 사전순으로 정렬

import java.util.Scanner;
import java.util.TreeSet;

public class StudentSortEx {
    public static void main(String[] args) {
        //myself();
        teacher();
    }


    static void myself() {
        Scanner sc = new Scanner(System.in);
        TreeSet<Score> treeSet = new TreeSet<>();
        System.out.print("학생1 이름 국어 영어 수학 순으로 입력 : ");
        treeSet.add(new Score(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        System.out.print("학생2 이름 국어 영어 수학 순으로 입력 : ");
        treeSet.add(new Score(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        System.out.print("학생3 이름 국어 영어 수학 순으로 입력 : ");
        treeSet.add(new Score(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        System.out.print("학생4 이름 국어 영어 수학 순으로 입력 : ");
        treeSet.add(new Score(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        System.out.print("학생5 이름 국어 영어 수학 순으로 입력 : ");
        treeSet.add(new Score(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));

        for (Score e : treeSet) {
            System.out.println(" 이름 : " + e.getName() + " 국어 : " + e.getKor() + " 영어 : " + e.getEng() + " 수학 : " + e.getMath());
        }
    }

    static void teacher() {
        Scanner sc = new Scanner(System.in);
        TreeSet<Student> treeSet =new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("이름 입력 : ");
            String name = sc.next();
            System.out.print("국어 성적 : ");
            int kor = sc.nextInt();
            System.out.print("영어 성적 : ");
            int eng = sc.nextInt();
            System.out.print("수학 성적 : ");
            int mat = sc.nextInt();
            treeSet.add(new Student(name, kor, eng, mat));
        }
        System.out.println("====== 성적 결과 ======");
        for (Student e : treeSet) { // Student 객체의 요소를 해당 객체의 오버라이딩tosTring 출력값에 반영됨 
            System.out.println(e);
        }
    }

}
