package A0.연습장;

// super() : 부모의 생성자 호출
// super : 부모의 객체를 참조하는 변수
// this : 자기자신의 객체를 참조하는 변수

public class Q_SuperMain {
    public static void main(String[] args) {
        AParent aParent =new AParent(10);
        aParent.aParentMethod();


        AChild aChild = new AChild(30);
        aChild.childMethod();
    }
}

class AParent {
    int x = 10;

    AParent(int x) {
        this.x = x;
    }

    void aParentMethod() {
        System.out.println(x);
        System.out.println(this.x);
    }
}
class AChild extends AParent {
    int x = 40;
    AChild(int x){
        super(x);
    }

    void childMethod() {
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
}
