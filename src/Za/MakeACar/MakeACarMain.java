package Za.MakeACar;

import java.util.Scanner;

public class MakeACarMain {
    public static void main(String[] args) {
        String[] area = {"", "부산", "대전", "강릉", "광주"};
        int nop; // 승객 수
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        sc.nextInt();
        sc.nextInt();
        sc.nextInt();




        System.out.println();

//        가야하는 길이 400km
//        1l = 8km  = 50l
//
//        시속250km
//        스포츠카 공식 구하기
//        부산 연료 12명  =  (( n명 / 2 * 400) / 8) = 250l
//        12명 =6*400 = 2400km / 8km  = 300l*2000 60만원
//
//
//        부산 주유 횟수  = (n명 /2 * 400km) / 240km} = 10번
//            (12명 6 =2400km)
//
//    부산 시간 = (n명 / 2 * 400km )  /  250  = 9.6 = 9시간 36분
//             12명  6 *400 =2400
//
//








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

class BmwSportsCar extends BmwCar {
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