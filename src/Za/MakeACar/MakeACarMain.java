package Za.MakeACar;

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
