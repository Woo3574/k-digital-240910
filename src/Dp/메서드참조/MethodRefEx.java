package Dp.메서드참조;

// 메서드 참조 : 메서드를 참조해서 매개변수의 정보 및 리턴 타입을 알아내어, 불필요한 매개변수 제거 목적

import java.util.function.IntBinaryOperator;

class Calculator {
    static int staticMethod(int x, int y) {
        return x + y;
    }
    int instanceMethod(int x, int y) {
        return x + y;
    }
}

public class MethodRefEx {
    public static void main(String[] args) {
        // 함수형 인터페이스 : 두 개의 int 타입 값을 받아 int 값을 반환하는 이항 연산자
        IntBinaryOperator operator;
        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("결과 : " + operator.applyAsInt(1, 2));

        // 정적 메서드 참조
        operator = Calculator::staticMethod;
        System.out.println("결과 : " + operator.applyAsInt(3,4));

    }
}
