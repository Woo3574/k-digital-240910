package A0.연습장;

// 인간 으로 부터 상속 받아 직장인, 학생 클래스 만들기
// 인간은 밥을 먹는다, 잠을 잔다 기본 특성을 가짐
// 직장인은 일한다라는 특성을 추가로 가짐
// 학생은 공부한다하는 특성을 추가로 가짐

public class K_HccInheritance {
    public static void main(String[] args) {
        WorkPerson workPerson = new WorkPerson();
        workPerson.viewWorkPerson();

        Student student = new Student();
        student.viewStudent();

    }

}

class Person{
    String eat = "밥을 먹는다";
    String sleep = "잠을 잔다";

    String getEat(){
        return eat;
    }
    String getSleep() {
        return sleep;
    }
}

class WorkPerson extends Person{
    String work = "일을 한다";
    String getWork() {
        return "직장인이 " + work;
    }

    void viewWorkPerson() {
        System.out.println(getWork());
        System.out.println("직장인이 " + getEat());
        System.out.println("직장인이 " + getSleep());
    }
}

class Student extends Person {
    String study = "공부한다";

    String getStudy() {
        return "학생이 " + study;
    }

    void viewStudent() {
        System.out.println(getStudy());
        System.out.println("학생이 " + getEat());
        System.out.println("학생이 " + getSleep());
    }

}