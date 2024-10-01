package A0.연습장;
// 상속이란?
// 자식 클래스가 부모 클래스의 기능을 그대로 물려 받는 것
// 부모클래스가 먼저 생성되고 자식클래스가 생성, 소멸시에는 자식 클래스가 사라지고 부모 클래스가 소멸됨
// 상속을 사용하는 이유로는 재사용성, 확장성, 다형성(오버라이딩 : 상속받은 기능을 재정의, 그 메서드를 부모가 만들어 줫냐 아니냐가 중요)
// 다형성(부모가 자식의 메서드를 접근할수있냐 없느냐가 중요)
// 자바는 다중 상속을 지원하지않음 (다중상속과 유사한 기능을 제공하기위해서 인터페이스가 있음)
// 상속의 키워드는 extands
// 상속을 받지 않는 모든 클래스는 기본적으로 object 클래스로 부터 상속을 받음
// 오버라이딩은 부모가 물려준 기능을 재정의 하는것

public class I_InheritanceBasic {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("바보댕댕이");
        System.out.println(dog.getName());
        Rabit rabit = new Rabit();
        rabit.setName("댕댕이");
        System.out.println(rabit.getName());
        rabit.sleep("오늘도");
    }

}

class Animal {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    void sleep(String name2) {
        System.out.println(name + "zzz");
    }
}

class Rabit extends Dog {
    @Override
    void sleep(String name2) {
        System.out.println(name + "ㅋㅋㅋ");
    }
//    void sleep(String name2, int hour) {
//        System.out.println(name + "ㅎㅎㅎ" + hour + "잘간다");
//    }
}
