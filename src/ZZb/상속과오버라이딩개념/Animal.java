package ZZb.상속과오버라이딩개념;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String speak() {
        return "Some sound ";
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String speak() {
        return "woof!";
    }

    public String fetch() {
        return "Fetching";
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String speak() {
        return "Meow!";
    }

    public String chaseMouse() {
        return "Chasing mouse!";
    }

}