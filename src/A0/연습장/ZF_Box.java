package A0.연습장;

public class ZF_Box {
    public static void main(String[] args) {
        Can<String> can = new Can<>("음료수");
        Price<Integer> price = new Price<>(1500);
        System.out.print(can.coke + "가격은 ");
        System.out.print(price.price + "원 입니다.");

    }
}

class Can<T> {
    public T coke; // T를 타입 변수, 임의의 참조형 타입

    Can(T coke) {
        this.coke= coke;
    }
}

class Price<M> {
    public M price;

    Price(M price) {
        this.price = price;
    }

}