package Cd.오브젝트클래스;
// Object 클래스 : 모든 자바 클래스의 조상클래스
// Object 클래스는 필드 없이 11개의 메서드로 구성

public class ObjectClassEx {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1.getClass()); // 해당 객체의 클래스 반환
        // String인 경우는 문자열의 내용을 비교하는 동작
        // equals의 메서드는 해당인스턴스를 매개변수로 전달받는 참조변수와 비교하여 결과를 반환
        System.out.println(student1.equals(student2));
        student1 = student2;
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}

class Student {
    int id;
    String name;
}
