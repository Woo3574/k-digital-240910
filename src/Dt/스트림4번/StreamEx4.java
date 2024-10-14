package Dt.스트림4번;

// 스트림을 사용한 중간처리와 최종 연산

import java.util.ArrayList;
import java.util.List;

public class StreamEx4 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("민지",99));
        studentList.add(new Student("하니",77));
        studentList.add(new Student("혜린",98));
        // 기존 방법으로 평균 구하기
        int sum = 0;
        for (Student e : studentList) {
            sum += e.getScore();
        }
        System.out.println("평균 : " + (double)(sum / studentList.size()));

        // 스트림 중간, 최종 처리
        double average = studentList.stream()
                .mapToInt(e -> e.getScore()) // (Student::getScore) <-메소드 참조타입으로 바꿀수있음 // mapToInt 정수값만 뽑아냄
                .average()
                .orElse(0.0);
        System.out.printf("평균 : %.2f", average);
    }
}
class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
