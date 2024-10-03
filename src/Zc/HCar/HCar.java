package Zc.HCar;

public abstract class HCar {
    String name;

    public HCar(String name){
        this.name = name;
    }

    public abstract void start();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnoff();

    public void run() {
        start();
        drive();
        stop();
        turnoff();
    }
}
