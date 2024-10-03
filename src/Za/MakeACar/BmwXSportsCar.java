package Za.MakeACar;

public class BmwXSportsCar extends BmwXCar {
    int fuelEconomy = 8;
    int speed = 250;
    int fuelTankSize = 30;
    int seatNumer = 2;
    public BmwXSportsCar(String name) {
        super(name);
    }

    @Override
    double totalPrice(int nop, int area) {
        double tp = 0;
        if (nop % seatNumer != 0 || nop <seatNumer ) nop += 1;
        tp = (double)(nop / seatNumer * DESTINATION_LIST[area]) / fuelEconomy * oneLOil;
        return Math.ceil(tp);
    }

    @Override
    double totalOilCnt(int nop, int area) {
        double to = 0;
        if (nop % seatNumer != 0 || nop <seatNumer ) nop += 1;
        to = (double)(nop / seatNumer * DESTINATION_LIST[area]) / (fuelEconomy * fuelTankSize);
        return Math.ceil(to);
    }

    @Override
    double totalDistanceTime(int nop, int area) {
        double tdt = 0;
        if (nop % seatNumer != 0 || nop <seatNumer ) nop += 1;
        tdt = (double)(nop / seatNumer * DESTINATION_LIST[area]) / speed;
        return tdt*60 ;
    }

}
