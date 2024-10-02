package Za.MakeACar;

public abstract class BmwXCar {
    int totalPrice;
    int totalDistanceTime;
    int totalOillCnt;
    int nop;
    String carName; // 차량 명
    int fuelEconomy; // 차량 연비
    int speed; // 차량 속도
    int fuelTankSize; // 차량 연료 탱크 크기
    int seatNumer; // 차량 좌석수
    int[] destination = {0,400,200,150,300};

    public BmwXCar(String carName) {
        this.carName = carName;
    }

    abstract void driver();
    abstract void totalOillCnt();
    abstract void totalDistanceTime();

}
