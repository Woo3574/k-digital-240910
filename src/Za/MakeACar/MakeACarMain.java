package Za.MakeACar;

import javax.swing.text.Style;
import java.util.Scanner;

public class MakeACarMain {
    public static void main(String[] args) {
        BmwXSportsCar bmwXSportsCar = new BmwXSportsCar("X2");
        BmwXPassengerCar bmwXPassengerCar = new BmwXPassengerCar("X4");
        BmwXBus bmwXBus = new BmwXBus("X6");

        Scanner sc = new Scanner(System.in);

        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int area = sc.nextInt();
        System.out.print("이동 할 승객 수 입력 : ");
        int nop = sc.nextInt();



        System.out.println("========== " + bmwXSportsCar.name + " ==========");
        System.out.println("총 비용 : " + (long)bmwXSportsCar.totalPrice(nop, area)+"원");
        System.out.println("총 주유 횟수 : " + (long)bmwXSportsCar.totalOilCnt(nop, area) + "회");
        System.out.println("총 이동 시간 : " + (long)(bmwXSportsCar.totalDistanceTime(nop, area)/60) + "시간" + (long)(bmwXSportsCar.totalDistanceTime(nop, area)%60) +"분");

        System.out.println("========== " + bmwXPassengerCar.name + " ==========");
        System.out.println("총 비용 : " + (long)bmwXPassengerCar.totalPrice(nop, area)+"원");
        System.out.println("총 주유 횟수 : " + (long)bmwXPassengerCar.totalOilCnt(nop, area) + "회");
        System.out.println("총 이동 시간 : " + (long)(bmwXPassengerCar.totalDistanceTime(nop, area)/60) + "시간" + (long)(bmwXPassengerCar.totalDistanceTime(nop, area)%60) +"분");

        System.out.println("========== " + bmwXBus.name + " ==========");
        System.out.println("총 비용 : " + (long)bmwXBus.totalPrice(nop, area)+"원");
        System.out.println("총 주유 횟수 : " + (long)bmwXBus.totalOilCnt(nop, area) + "회");
        System.out.println("총 이동 시간 : " + (long)(bmwXBus.totalDistanceTime(nop, area)/60) + "시간" + (long)(bmwXBus.totalDistanceTime(nop, area)%60) +"분");



    }
}








//class BmwCar {
//    String carName; // 차량 명
//    int fuelEconomy; // 차량 연비
//    int speed; // 차량 속도
//    int fuelTankSize; // 차량 연료 탱크 크기
//    int seatNumer; // 차량 좌석수
//    int nop; // 승객수 number of passengers
//    final int oneOill = 2000;
//    final int busan = 400;
//    final int Gangneung = 200;
//    final int daejeon = 150;
//    final int gwangju = 300;
//
//    public BmwCar(String carName) {
//        this.carName = carName;
//
//    }
//}
//
//class  BmwSportsCar extends BmwCar {
//    boolean booster;
//    public BmwSportsCar(String carName) {
//        super(carName);
//        fuelEconomy = 8;
//        speed = 250;
//        fuelTankSize = 30;
//        seatNumer = 2;
//        booster = false;
//    }
//
//    void setTotalPrice(int tp) {
//
//    }
//
//
//}
//
//class BmwPassengerCar extends BmwCar{
//    public BmwPassengerCar(String carName) {
//        super(carName);
//        fuelEconomy = 12;
//        speed = 200;
//        fuelTankSize = 45;
//        seatNumer = 4;
//    }
//}
//
//class Bmwbus extends BmwCar{
//    public Bmwbus(String carName) {
//        super(carName);
//        fuelEconomy = 5;
//        speed = 150;
//        fuelTankSize = 100;
//        seatNumer = 20;
//    }
//}
