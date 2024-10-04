package Ca.다중인터페이스2번;

public class MultiInterfaceEx2 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer; //Customer 클래스 타입의 참조 변수를 Buy 인터페이스형에 대입

        customer.sell();
        customer.buy();
        customer.order();
    }
}

interface Buy {
    void buy();
    default void order() {
        System.out.println("구매 주문");
    }
}
interface Sell {
    void sell();
    default void order() {
        System.out.println("판매 주문");
    }
}

class Customer implements Buy,Sell {

    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void order() {  // 상속 부모가 2개가 똑같은게 존재하기때문에 자식에서 오버라이딩해서 재정의해줘야함
        System.out.println("고객 주문");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }
}