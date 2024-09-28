package Bl.다형성Driver;

import java.util.Scanner;

public class PolyDriverEx {
    public static void main(String[] args) {
        Driver driver = new Driver("곰돌이사육사");
        Scanner sc = new Scanner(System.in);
        System.out.println("운전하고 싶은 차를 선택 [1]스포츠카 [2]버스 [3]택시 : ");
        int select = sc.nextInt();
        switch (select) {
            case 1: driver.drive(new SportsCar()); break;
            case 2: driver.drive(new Bus()); break;
            case 3: driver.drive(new Taxi()); break;
            default: System.out.println("선택한 차량이 준비 되지 않았습니다.");
        }

    }
}

class Driver {
    String name;
    Driver(String name) {
        this.name = name;
    }
    void drive(Vehicle v) {  // 오버라이딩식으로 푼것
        System.out.println(name + "의" );
        v.run();
    }
//    void drive(SportsCar s) {  // 오버 로딩식으로 푼것
//        System.out.println(name + "의" );
//        s.run();
//    }
//    void drive(Bus b) {  // 오버 로딩식으로 푼것
//        System.out.println(name + "의" );
//        b.run();
//    }
}

class Vehicle {
    void run() {
        System.out.println("탈 것이 달립니다.");
    }
}

class SportsCar extends Vehicle {
    @Override
    void run() {
        System.out.println("스포츠카가 달립니다.");
    }
}

class Bus extends Vehicle {
    @Override
    void run() {
        System.out.println("버스가 달립니다.");
    }
}

class Taxi extends Vehicle {
    @Override
    void run() {
        System.out.println("택시가 달립니다.");
    }
}