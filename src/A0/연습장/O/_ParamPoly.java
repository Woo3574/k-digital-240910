package A0.연습장.O;

// 매개변수의 다형성
// 상속 관계를 이용해 매개변수에 자식 타입의 객체를 대입함

public class _ParamPoly {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buy(new PlayStation());
        buyer.buy(new Computer());
        buyer.buy(new TV());
        buyer.viewInfo();

    }
}

class Prouduct {
    int price;
    int bonusPoint;
}

class TV extends Prouduct {

    public TV() {
        this.price = 1000;
        this.bonusPoint = 10;
    }
}

class Computer extends Prouduct{

    public Computer() {
        this.price = 200;
        this.bonusPoint = 20;
    }
}

class PlayStation extends Prouduct {

    public PlayStation() {
        this.price = 120;
        this.bonusPoint = 12;
    }
}

class Buyer {
    int money = 1000;
    int bonuspoint = 0;

    void buy(Prouduct p) {
        money -= p.price;
        bonuspoint += p.bonusPoint;
    }

    void viewInfo(){
        System.out.println("잔액 : " + money);
        System.out.println("포인트 : " + bonuspoint);
    }
}