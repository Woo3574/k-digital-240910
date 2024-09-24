package Ah.비트연산자;

public class BitOperatorEx {
    public static void main(String[] args) {    // 128 64 32 16 8 4 2 1
        int num1 = 10;                          //   0  0  0  0 1 0 1 0
        int num2 = 12;                          //   0  0  0  0 1 1 0 0
        System.out.println(num1 & num2); // 8  둘다 참인 값
        System.out.println(num1 | num2); // 14 둘중 하나라도 참인 값
        System.out.println(num1 ^ num2); // 6 xor  서로 참이 다른 값
        System.out.println(~num1); // -11 (2의보수)
        System.out.println(num1 << 1); // 20 (쉬프트 연산자)  왼쪽 1 쉬프트
        System.out.println(num1 >> 1); //5  오른쪽1 쉬프트
    }
}
