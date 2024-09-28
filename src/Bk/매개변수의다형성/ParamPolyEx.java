package Bk.매개변수의다형성;
// 상속 관계를 이용해 매개변수에 자식 타입의 객체를 대입 함

public class ParamPolyEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buy(new PlayStation()); // Product p = new (TV,Computer,Playstation)
        buyer.buy(new TV());
        buyer.buy(new Computer());
        buyer.viewInfo();
    }
}

class Product {
    int price;
    int bonusPoint;

}

class TV extends Product {
    public TV() {
        this.price = 1000;
        this.bonusPoint = 10;
    }
}

class Computer extends Product {
    public Computer() {
        this.price = 200;
        this.bonusPoint = 20;
    }
}

class PlayStation extends Product {
    public PlayStation() {
        this.price = 120;
        this.bonusPoint = 12;
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    void buy(Product p) { // buy의 매개변수 = Product p <- p는 Product의 객체, 부모클래스의 참조변수
        // p는 부모인 Product를 바라보고있다.
        //부모 클래스로 자식 객체를 바라볼수있다. 상속 개념
        money -= p.price;
        bonusPoint += p.bonusPoint;
    }
    void viewInfo() {
        System.out.println("잔액 : " + money);
        System.out.println("포인트 : " + bonusPoint);
    }
}