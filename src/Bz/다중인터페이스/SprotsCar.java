package Bz.다중인터페이스;

public class SprotsCar extends Car implements AirCon,AutoDrive{
    private boolean isAirCon;  // 에어컨에 대한 ON/OFF
    private int setTemp;
    private boolean isAutoDrv;
    private boolean isTurbo;

    public SprotsCar(boolean isAirCon, int setTemp, boolean isAutoDrv, boolean isTurbo) {
        super(150, "White","1999");
        this.isAirCon = isAirCon;
        this.setTemp = setTemp;
        this.isAutoDrv = isAutoDrv;
        this.isTurbo = isTurbo;
    }

    @Override
    public void airConON() {
        System.out.println("에어컨을 켭니다.");
    }

    @Override
    public void airConOFF() {
        System.out.println("에어컨을 끕니다.");
    }

    @Override
    public void setAirConTemp(int tmp) {
        System.out.println("에어컨 설정 온도를 " + tmp + "로 변경합니다.");
    }

    @Override
    public void autoDrvON() {
        System.out.println("자율 주행 모드를 켰습니다.");
    }

    @Override
    public void autoDrvOFF() {
        System.out.println("자율 주행 모드를 껐습니다.");
    }
    public void viewInfo() {
        String airConStr = (isAirCon) ? "ON" : "OFF";
        String autoStr = (isAutoDrv) ? "ON" : "OFF";
        String turboStr = (isTurbo) ? "ON" : "OFF";
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("제작연도 : " + year);
        System.out.println("에어컨 : " + airConStr);
        System.out.println("에어컨 온도 : " + setTemp);
        System.out.println("자율 주행 : " + autoStr);
        System.out.println("터보 모드 : " + turboStr);
    }
}
