package Cq.제네릭프린터;

public class Plastic extends Material {
    @Override
    public void doPrinting() {
        System.out.println("Plastic 재료로 출력 합니다.");
    }
    @Override
    public String toString() {
     return "재료는 플라스틱입니다.";
    }
}
