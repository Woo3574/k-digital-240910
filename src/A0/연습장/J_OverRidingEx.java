package A0.연습장;

// final 키워드 : 클래스, 필드, 메서드, 선언 시 사용할수 있음
// 메서드 사용하는 경우 상속하면 오버라이딩을 금지 할 수있음

import java.util.Scanner;

public class J_OverRidingEx {
    public static void main(String[] args) {
        KiaCar kiaCar = new KiaCar();
        SportsCar sportsCar = new SportsCar();
        sportsCar.setName();
        sportsCar.setTurbo(true);
        sportsCar.getInfoCar();

    }
}

class KiaCar {
    int speed;
    String name;
    String color;
    Scanner sc = new Scanner(System.in);
    final void accelerator() {
        System.out.println("차이 속도가 증가합니다.");
    }
    void breakPanel() {
        System.out.println("차의 속도가 감소합니다.");
    }
}

class SportsCar extends KiaCar {
    boolean isTurbo;
    SportsCar() {
        isTurbo = false;
        speed = 200;
        this.name = name;
        color = "red";
    }
    void setName(){
        System.out.print("차량명 입력 : ");
        name = sc.next();
    }

    int getSpeed() {
        if (isTurbo) return speed *= 1.6;
        return speed;
    }

    boolean setTurbo(boolean isTurbo) {
        this.isTurbo = isTurbo;
        return isTurbo;
    }

    void getInfoCar() {
        System.out.println("차량명 : " + name );
        System.out.println("색상 : " + color);
        System.out.println("속도 : " + getSpeed());
        System.out.println("터보모드 : "+ isTurbo);
    }
}