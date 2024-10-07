package A0.연습장;

public class ZA_MathClass {
    public static void main(String[] args) {
        randomFunc();
        mathMethodFunc();
    }

    static void randomFunc() {
        for (int i = 0; i < 50; i++) {
            System.out.print((int) (Math.random() * 45) + " ");
        }
        System.out.println();
    }

    static void mathMethodFunc() {
        System.out.println(Math.ceil(10.5555)); // 11.0
        System.out.println(Math.floor(9.888888)); // 9.0
        System.out.println(Math.round(7.499999)); // 7
        System.out.println(Math.round(7.599999)); // 8 ,실수 첫번째자리를 반올림하여 정수를 반환
        System.out.println(Math.max(10,30)); // 30
        System.out.println(Math.min(5,10)); // 5
        System.out.println(Math.abs(-10)); // 10  abs는 음수이면 절대값을 변환 후 반환,정수이면 그대로 반환
        System.out.println(Math.abs(10));  // 10
        System.out.println(Math.random()); // 0.0이상 1.0미만 랜덤값 반환
    }
}
