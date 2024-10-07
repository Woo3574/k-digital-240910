package A0.연습장;

// Wrapper 클래스란 ? 기본타입의 데이터를 객체 타입으로 취급하도록 변환 해주는 클래스

public class ZE_WrapClass {
    public static void main(String[] args) {
        IntegerEx integerEx = new IntegerEx();
        integerEx.x = 100;
        System.out.println(integerEx.x);

    }
}

class IntegerEx {
    int x;
    IntegerEx(){
    }
}