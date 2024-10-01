package A0.연습장;
// 객체 타입 확인 : instanceof
// 반환값 (true/false) = 좌항(객체) instanceof 우항(클래스)
// 객체가 특정 클래스의 인스턴스인지를 확인하기 위해서 사용

public class N_ObjectType {
    public static void main(String[] args) {
        KParent kParent = new KParent("부모");
        KChild kChild = new KChild("자식");
        System.out.println(kChild instanceof KParent);
        System.out.println(kParent instanceof KChild);
        System.out.println(kParent instanceof KParent);

    }
}


class KParent{
    String name;
    public KParent(String name) {
        this.name = name;
    }
}

class KChild extends KParent {
    String name;
    public KChild(String name) {
        super(name);
        this.name = name;
    }
}