package Ba.필드와메서드;
// 필드 : 변수의 속성을 표현하는 필드
// 메서드 : 동작을 규정, 함수와 동일한 형태이고 클래스 내부에 존재
// 자바는 클래스 기반의 언어 이므로 클래스 외부에 별도의 함수가 존재 할 수 없음

public class FildAndMethodEx {
    public static void main(String[] args) {
        FildAndMethodEx test = new FildAndMethodEx();
        int sum = test.sum(100,200);
        System.out.println(sum);
    }
    // 인스턴스 메서드
    int sum(int a, int b) {
        return a + b;
    }
}
