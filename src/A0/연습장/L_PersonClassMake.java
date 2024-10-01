package A0.연습장;

import java.util.Scanner;

public class L_PersonClassMake {
    public static void main(String[] args) {
        KStudent kStudent = new KStudent();
        kStudent.setAge(20);
        kStudent.setSleep(8);
        kStudent.setStudy(2);
        System.out.println("한국학생의 나이는 " + kStudent.getAge() + "살 입니다");
        System.out.println("한국학생의 수면시간은 " + kStudent.getSleep() + "시간 정도입니다.");
        System.out.println("한국학생은 공부를 " + kStudent.getStudy() + " 합니다.");

    }
}

class KoreaPerson {
    int age;
    int sleep;

    void setAge(int age) {
        this.age = age;
    }
    void setSleep(int sleep) {
        this.sleep = sleep;
    }

    int getAge() {
       return age;
    }

    int getSleep() {
        return sleep;
    }
}


class KStudent extends KoreaPerson {
    int study;

    void setStudy(int study) {
        this.study = study;
    }

    String getStudy() {
    String[] studyStr = {"", "\"열심히\"", "\"적당히\"", "\"놀면서\""};
    return studyStr[study];
    }
}
