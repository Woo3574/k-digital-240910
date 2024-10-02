package Za.MakeACar;

import java.util.Scanner;

public class BmwXSportsCar extends BmwXCar {
    boolean booster;
    Scanner sc = new Scanner(System.in);
    public BmwXSportsCar(String carName) {
        super(carName);
        fuelEconomy = 8;
        speed = 250;
        fuelTankSize = 30;
        seatNumer = 2;
        booster = false;
    }


    @Override
    void driver() {

    }

    @Override
    void totalOillCnt() {

    }

    @Override
    void totalDistanceTime() {

    }
}
