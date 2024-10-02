package Za.MakeACar;

import java.util.Scanner;

public class MakeACarMain {
    public static void main(String[] args) {
        //int totalPrice; // 총 비용
        //int totalOillCnt; // 총 주유 횟수
        //int totalDistanceTime;
        Scanner sc = new Scanner(System.in);
        BmwXSportsCar bmwXSportsCar = new BmwXSportsCar("X1");
        BmwXPassengerCar bmwXPassengerCar = new BmwXPassengerCar("X2");
        BmwXBus bmwXBus = new BmwXBus("X3");

        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int area = sc.nextInt();
        System.out.print("이동할 승객 수 입력 : ");
        int nop = sc.nextInt();
        System.out.print("이동할 차량 선택 : ");
        int carType = sc.nextInt();

        switch (carType) {
            case 1: {break;}
            case 2: {break;}
            case 3: {break;}
        }

        String[] areaStr = {"", "부산", "대전", "강릉", "광주"};
        String[] carTypeStr = {"", "스포츠카", "승용차", "버스"};
        if (carType == 1) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
        if (carType == 2) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
        if (carType == 3) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

    }
}

class BmwCar {
    String carName; // 차량 명
    int fuelEconomy; // 차량 연비
    int speed; // 차량 속도
    int fuelTankSize; // 차량 연료 탱크 크기
    int seatNumer; // 차량 좌석수
    int nop; // 승객수 number of passengers
    final int oneOill = 2000;
    final int busan = 400;
    final int Gangneung = 200;
    final int daejeon = 150;
    final int gwangju = 300;

    public BmwCar(String carName) {
        this.carName = carName;

    }
}

class  BmwSportsCar extends BmwCar {
    boolean booster;
    public BmwSportsCar(String carName) {
        super(carName);
        fuelEconomy = 8;
        speed = 250;
        fuelTankSize = 30;
        seatNumer = 2;
        booster = false;
    }

    void setTotalPrice(int tp) {

    }


}

class BmwPassengerCar extends BmwCar{
    public BmwPassengerCar(String carName) {
        super(carName);
        fuelEconomy = 12;
        speed = 200;
        fuelTankSize = 45;
        seatNumer = 4;
    }
}

class Bmwbus extends BmwCar{
    public Bmwbus(String carName) {
        super(carName);
        fuelEconomy = 5;
        speed = 150;
        fuelTankSize = 100;
        seatNumer = 20;
    }
}
