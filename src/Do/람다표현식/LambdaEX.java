package Do.람다표현식;

// 람다란? 자바 8 버전에서 도입, 간단한 익명 함수를 생성하기 위한 방법 제공
// 람다표현식은 주로 함수형 프로그래밍 스타일을 지원
// (매개변수 목록) - > {구현부}
// 타입 추론이 가능한 모든 것을 생략 함
// 매개 변수가 하나인 경우는 ()를 생략 할 수 있음
// 구현부(함수의 몸체)가 하나의 명령문인 경우 {}로 생략 가능


import java.util.function.BiFunction;

public class LambdaEX {
    public static void main(String[] args) {
        System.out.println(add(100, 200));
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(100, 200));

    }

    static int add(int x, int y) {
        return x + y;
    }
}
