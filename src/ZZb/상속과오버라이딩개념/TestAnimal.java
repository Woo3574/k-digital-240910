package ZZb.상속과오버라이딩개념;

public class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog("buddy",3);
        Cat cat = new Cat("whiskers",2);
        dog.fetch();
        cat.chaseMouse();
        System.out.print(dog.fetch());
        System.out.print(cat.chaseMouse());
    }
}
