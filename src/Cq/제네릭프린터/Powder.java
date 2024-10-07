package Cq.제네릭프린터;

public class Powder extends Material {
    @Override
    public void doPrinting() {
        System.out.println("powder 재료로 출력 합니다.");
    }

    @Override
    // toString 오브젝트에 있었던 기능
    public String toString() { // toString 클래스 이름 @ 객체에 올라가 있는 해쉬코드값을 16진수변환해서 출력
        return "재료는 Powder 입니다.";
    }
}
