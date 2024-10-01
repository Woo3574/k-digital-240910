package A0.연습장;
// this란 자기자신의 객체를 참조하는 변수
// this()메서드 : 다른 생성자 호출할때 사용

public class Fa_ThisAndThis {
    public static void main(String[] args) {
        BmWCar bmwCar = new BmWCar();
    }

}


class BmWCar {
    private String name;
    private String color;
    private int speed;
    private int horsePower;

    public BmWCar(String name, String color, int speed, int horsePower) {
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.horsePower = horsePower;
    }

    public BmWCar() {
        this("싼타페", "black", 250, 400);
    }

}