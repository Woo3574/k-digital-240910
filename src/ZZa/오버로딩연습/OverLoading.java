package ZZa.오버로딩연습;

class Calculator {
    // 두 개의 정수를 더하는 메서드
    public int add(int a, int b) {
            // 합계 계산
        return a+b;
    }

    // 두 개의 실수를 더하는 메서드
    public double add(double a, double b) {
        // 합계 계산
        return a+b;
    }

        // 두 개의 정수를 빼는 메서드
    public int subtract(int a, int b) {
            // 뺄셈 계산
        return a-b;
    }

        // 두 개의 정수를 곱하는 메서드
    public int multiply(int a, int b) {
            // 곱셈 계산
        return a*b;
    }

    public static class OverLoading {
        public static void main(String[] args) {
            Calculator calc = new Calculator();
            // 메서드를 호출하여 결과 출력
            System.out.println(calc.add(3,4));
            System.out.println(calc.add(1.2,4));
            System.out.println(calc.subtract(8,5));
            System.out.println(calc.multiply(8,3));

        }
    }
}
