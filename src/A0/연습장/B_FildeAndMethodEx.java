package A0.연습장;

public class B_FildeAndMethodEx {
    public static void main(String[] args) {
        String factory = "현대자동차 울산 공장";
        Car sorento = new Car();
        Car gv70 = new Car("gv70",300,300,"blue");
        Car santafe = new Car("싼타페");
        sorento.getInfo();
        santafe.getInfo();
        gv70.getInfo();
        System.out.println(Car.company);
        System.out.println("총 차량 생산 대수 : " + Car.productNumber);
    }
}


class Car {
    public static int productNumber = 0;
    static String company = "현대자동차";
    String modelName;
    int speed;
    int horsePower;
    String color;

    Car () { modelName = "쏘렌토"; speed = 200; horsePower = 200; color = "red"; productNumber += 1;}
    Car (String name) {modelName = "싼타페"; speed = 400; horsePower = 500; color = "black"; productNumber += 1;}
    Car (String name, int speed, int horsePower, String color){
        this.modelName = name;
        this.speed = speed;
        this.horsePower = horsePower;
        this.color = color;
        productNumber += 1;
    }

    void getInfo() {
        System.out.println("모델명 : " + modelName );
        System.out.println("속력 : " + speed);
        System.out.println("마력 : " + horsePower);
        System.out.println("색상 : " + color);
        System.out.println("====================");
    }


}