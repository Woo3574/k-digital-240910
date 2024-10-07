package Cq.제네릭프린터;

// <T extends Material> Material 클래스로 부터 상속 받은 타입만 올 수잇음
public class GenericPrinter<T extends Material> {
    private T material; // T 타입변수 재료의 형태가 결정

    public void settMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }
    public String toString() {
        return material.toString();
    }
    public void printing() {
        material.doPrinting();
    }
}
