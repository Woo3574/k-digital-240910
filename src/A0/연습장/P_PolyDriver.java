package A0.연습장;

import java.util.Scanner;

public class P_PolyDriver {
    public static void main(String[] args) {
        EDriver eDriver = new EDriver("태우");

        Scanner sc = new Scanner(System.in);
        System.out.print("운전하고 싶은 차를 선택 [1]스포츠카 [2]버스 [3] 택시 : ");
        int select = sc.nextInt();
        switch (select) {
            case 1 : eDriver.drive(new ESportsCar()); break;
            case 2 : eDriver.drive(new EBus()); break;
            case 3 : eDriver.drive(new ETaxi()); break;
            default: System.out.println("선택한 차량이 준비 되지 않았습니다.");

        }

    }
}

class EDriver{
    String name;
    EDriver(String name) {
        this.name = name;
    }
    void drive(EVehicle e) {
        System.out.print(name + "의 ");
        e.run();
    }
}


class EVehicle {
    void run() {
        System.out.println("탈 것이 달립니다.");
    }
}

class ESportsCar extends EVehicle {
    @Override
    void run() {
        System.out.println("스포츠카가 달립니다.");
    }
}

class EBus extends EVehicle {
    @Override
    void run() {
        System.out.println("버스가 달립니다.");
    }
}

class ETaxi extends EVehicle {
    @Override
    void run() {
        System.out.println("택시가 달립니다.");
    }
}