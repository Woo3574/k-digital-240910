package Za.MakeACar;

public class BmwXPassengerCar extends BmwXCar{
    int fuelEconomy = 12;
    int speed = 200;
    int fuelTankSize = 45;
    int seatNumer = 4;

    public BmwXPassengerCar(String name) {
        super(name);
    }

    @Override
    double totalPrice(int nop, int area) {
        double tp = 0;
        double cnt = Math.ceil((double) nop / seatNumer);
        if (nop < seatNumer) cnt = 1;
        tp = cnt * DESTINATION_LIST[area] / fuelEconomy * oneLOil;
        return Math.ceil(tp);
    }

    @Override
    double totalOilCnt(int nop, int area) {
        double to = 0;
        double cnt = Math.ceil((double) nop / seatNumer);
        if (nop < seatNumer) cnt = 1;
        to = cnt * DESTINATION_LIST[area] / (fuelEconomy * fuelTankSize);
        return Math.ceil(to);
    }

    @Override
    double totalDistanceTime(int nop, int area, int weather) {
        double tdt = 0;
        double cnt = Math.ceil((double) nop / seatNumer);
        if (nop < seatNumer) cnt = 1;
        tdt = cnt * DESTINATION_LIST[area] / speed;
        if(weather == 2 || weather == 3) tdt *= WEATHER[weather];
        return tdt*60 ;
    }

    @Override
    double additionalFunction(int nop, int area, int weather) {
        return 0;
    }


}
