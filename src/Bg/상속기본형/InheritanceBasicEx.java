package Bg.상속기본형;
// 자식 클래스가 부모 클래스의 기능을 그대로 물려 받는 것
// 상속 받은 자식클래스는 부모클래스와 같거나 크다.
// 부모클래스가 먼저 생성되고 자식클래스가 생성, 소멸시에는 자식 클래스가 사라지고 부모 클래스가 소멸됨
// 사용하는 이유로 첫번째는 재사용성, 확장성, 다형성(오버라이딩, 상속받은 기능을 재정의, 그메서드를 부모가 만들어줫냐 아니냐가 중요)
//  다형성(부모가 자식의 메서드를 접근할수있냐 없느냐가중요)
// 자바는 다중 상속을 지원하지 않음 (다중상속과 유사한 기능을 제공하기위해서 인터페이스 가 있음)
// 키워드 extends
// 상속을 받지않는 모든 클래스는 기본적으로 object 클래스로 부터 상속을 받음
// 오버라이딩은 부모가 물려준 기능을 재정의하는것

public class InheritanceBasicEx {
    public static void main(String[] args) {
        Dog dog =new Dog();
        dog.setName("댕댕이");
        System.out.println(dog.getName());
        HouseDog houseDog = new HouseDog();
        houseDog.setName("댕댕이");
        houseDog.sleep(4);
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
class Dog extends Animal { // 상속받는 자식클래스  extends 부모클래스
    void sleep() {
        System.out.println(name + " zzz");
    }
}

class HouseDog extends Dog {
    @Override  //  @어노테이션, 문법적으로 오버라이딩 관계 성립 여부 체크,
    // 오버라이딩 관계가 성립할려면 메서드의 이름과 반환 타입도 같아야 함
    void sleep() {
        System.out.println(name + " zzz in house");
    }
    // 오버라이딩 이후 오버로딩
    void sleep(int hour) {
        System.out.println(name + " zzz in house for " + hour + "hour");
    }
}