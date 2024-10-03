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
            double tdt = 0;
            double cnt = Math.ceil((double) nop / seatNumer);
            if (nop < seatNumer) cnt = 1;
            tdt = cnt * DESTINATION_LIST[area] / (speed*1.2);
            if (weather == 2 || weather == 3) tdt *= WEATHER[weather];
            return tdt * 60 ;
    }
}
