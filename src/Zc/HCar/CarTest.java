package Zc.HCar;

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {
        ArrayList<HCar> hCars = new ArrayList<HCar>();
        hCars.add(new HSonata("sonata"));

        for (HCar c : hCars) {
            c.run();
            System.out.println("============");
        }
    }
}
