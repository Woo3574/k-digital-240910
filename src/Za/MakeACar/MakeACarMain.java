package Za.MakeACar;

import Aj.스위치문.SwitchEx;

import java.util.Scanner;

public class MakeACarMain {
    public static void main(String[] args) {
        BmwXSportsCar bmwXSportsCar = new BmwXSportsCar("X2");
        BmwXPassengerCar bmwXPassengerCar = new BmwXPassengerCar("X4");
        BmwXBus bmwXBus = new BmwXBus("X6");

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
            int area = sc.nextInt();
            System.out.print("이동 할 승객 수 입력 : ");
            int nop = sc.nextInt();
            System.out.print("이동 할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            int carType = sc.nextInt();
            System.out.print("부가 기능 [1]ON [2]OFF : ");
            int add_Ons = sc.nextInt();
            System.out.print("날씨 [1]맑음 [2]비 [3]눈 : ");
            int weather = sc.nextInt();

            if (carType == 1) {
                switch (add_Ons) {
                    case 1: {
                        System.out.println("========== " + bmwXSportsCar.name + " ==========");
                        System.out.println("총 비용 : " + (long) bmwXSportsCar.totalPrice(nop, area) + "원");
                        System.out.println("총 주유 횟수 : " + (long) bmwXSportsCar.totalOilCnt(nop, area) + "회");
                        System.out.println("총 이동 시간 : " + (long) (bmwXSportsCar.totalDistanceTime(nop, area, weather) / 60) + "시간" + (long) (bmwXSportsCar.totalDistanceTime(nop, area, weather) % 60) + "분");
                    }
                    case 2: {
                        System.out.println("========== " + bmwXSportsCar.name + " ==========");
                        System.out.println("총 비용 : " + (long) bmwXSportsCar.totalPrice(nop, area) + "원");
                        System.out.println("총 주유 횟수 : " + (long) bmwXSportsCar.totalOilCnt(nop, area) + "회");
                        System.out.println("총 이동 시간 : " + (long) (bmwXSportsCar.totalDistanceTime(nop, area, weather) / 60) + "시간" + (long) (bmwXSportsCar.totalDistanceTime(nop, area, weather) % 60) + "분");
                    }
                }
            }
            if (carType == 2) {
                switch (add_Ons) {
                    case 1: {
                        System.out.println("========== " + bmwXPassengerCar.name + " ==========");
                        System.out.println("총 비용 : " + (long) bmwXPassengerCar.totalPrice(nop, area) + "원");
                        System.out.println("총 주유 횟수 : " + (long) bmwXPassengerCar.totalOilCnt(nop, area) + "회");
                        System.out.println("총 이동 시간 : " + (long) (bmwXPassengerCar.totalDistanceTime(nop, area, weather) / 60) + "시간" + (long) (bmwXPassengerCar.totalDistanceTime(nop, area, weather) % 60) + "분");
                    }
                    case 2 : {
                        System.out.println("========== " + bmwXPassengerCar.name + " ==========");
                        System.out.println("총 비용 : " + (long) bmwXPassengerCar.totalPrice(nop, area) + "원");
                        System.out.println("총 주유 횟수 : " + (long) bmwXPassengerCar.totalOilCnt(nop, area) + "회");
                        System.out.println("총 이동 시간 : " + (long) (bmwXPassengerCar.totalDistanceTime(nop, area, weather) / 60) + "시간" + (long) (bmwXPassengerCar.totalDistanceTime(nop, area, weather) % 60) + "분");
                    }
                }
            }
            if (carType == 3) {
                switch (add_Ons) {
                    case 1 : {
                        System.out.println("========== " + bmwXBus.name + " ==========");
                        System.out.println("총 비용 : " + (long) bmwXBus.totalPrice(nop, area) + "원");
                        System.out.println("총 주유 횟수 : " + (long) bmwXBus.totalOilCnt(nop, area) + "회");
                        System.out.println("총 이동 시간 : " + (long) (bmwXBus.totalDistanceTime(nop, area, weather) / 60) + "시간" + (long)(bmwXBus.totalDistanceTime(nop, area, weather) % 60) + "분");
                    }
                    case 2 : {
                        System.out.println("========== " + bmwXBus.name + " ==========");
                        System.out.println("총 비용 : " + (long) bmwXBus.totalPrice(nop, area) + "원");
                        System.out.println("총 주유 횟수 : " + (long) bmwXBus.totalOilCnt(nop, area) + "회");
                        System.out.println("총 이동 시간 : " + (long) (bmwXBus.totalDistanceTime(nop, area, weather) / 60) + "시간" + (long)(bmwXBus.totalDistanceTime(nop, area, weather) % 60) + "분");
                    }
                }
            }
            if (area >= 1 && area <= 4 && nop >= 0 && carType >= 1 && carType <= 3 && add_Ons >= 1 && add_Ons  <= 2 && weather >= 1 && weather <= 2) break;
            else System.out.println("잘못입력하셨습니다.");
        } while (true);
    }
}