package Cg.Math클래스;

// 클래스 메서드 : 수학에서 자주 사용하는 상수들과 함수들을 미리  구현해 놓은 클래스
// 모든 메서드는 클래스 메서드이므로 객체 생성 없이 바로 사용
// java.lang에 포함되어 있어 별도의 import가 필요 없음

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathClassEx {
    public static void main(String[] args) {
        randomFunc();
        MathMethodFunc();
    }
     // random() 메서드는 0.0이상에서 1.0 미만의 범위에 임의의 double 형 값 한개를 반환
    static void randomFunc() {
        for (int i = 0; i < 50; i++) {
            System.out.print((int) (Math.random() * 45) + " "); // 1 ~ 100사이의 임의의 수
        }
    }
    // abs() 메서드 : 절대값 구하는 메서드
    // floor() : 주어진 숫자를 내림한 결과를 반환
    // ceil() : 주어진 숫자을 올림한 결과를 반환
    // round() : 소수점 첫째 자리에서 반올림 결과를 반환
    // BigDecimal() : 메서드를 import 해서 사용하는 방법이 권장되는 방식
    static void MathMethodFunc() {
        System.out.println(Math.abs(-10)); // 10을 반환
        System.out.println(Math.abs(10));
        System.out.println(Math.floor(10.99999999));
        System.out.println(Math.ceil(10.000000001));
        System.out.println(Math.round(10.49999999999)); // 10, 소수점 첫째자리 반올림
        System.out.println(Math.round(10.5999999999)); //11
        System.out.println(Math.min(20, 30));
        System.out.println(Math.max(20, 30));
        BigDecimal number = new BigDecimal("10.355");
        System.out.println(number.setScale(2, RoundingMode.HALF_UP));
    }
}
