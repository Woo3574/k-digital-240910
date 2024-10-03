package Za.MakeACar;

public class BmwXPassengerCar extends BmwXCar{
    int fuelEconomy = 12;
    int speed = 200;
    int fuelTankSize = 45;
    int seatNumber = 4;

    public BmwXPassengerCar(String name) {
        super(name);
    }

    @Override
    double totalPrice(int nop, int area, int add_Ons) {
            double tp = 0;
            if(ADD_ONS[add_Ons] == 1) seatNumber += 1;
            double cnt = Math.ceil((double) nop / seatNumber);
            if (nop < seatNumber) cnt = 1;
            tp = cnt * DESTINATION_LIST[area] / fuelEconomy * oneLOil;
            return Math.floor(tp);
        }


    @Override
    double totalOilCnt(int nop, int area, int add_Ons) {
        if (ADD_ONS[add_Ons] == 1) {
            double cnt = Math.ceil((double) nop / (seatNumber + 1));
            if (nop < seatNumber + 1) cnt = 1;
            double to = cnt * DESTINATION_LIST[area] / (fuelEconomy * fuelTankSize);
            return Math.ceil(to);
        } else {
            double cnt = Math.ceil((double) nop / seatNumber);
            if (nop < seatNumber) cnt = 1;
            double to = cnt * DESTINATION_LIST[area] / (fuelEconomy * fuelTankSize);
            return Math.ceil(to);
        }
    }

    @Override
    double totalDistanceTime(int nop, int area, int weather, int add_Ons) {
        double tdt = 0;
        if (ADD_ONS[add_Ons] == 1) seatNumber += 1;
        double cnt = Math.ceil((double) nop / seatNumber);
        if (nop < seatNumber) cnt = 1;
        tdt = cnt * DESTINATION_LIST[area] / speed;
        if (weather == 2 || weather == 3) tdt *= WEATHER[weather];
        return tdt * 60;
    }
}
