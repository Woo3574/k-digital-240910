package Ba.필드와메서드;
// 필드 : 변수의 속성을 표현하는 필드
// 메서드 : 동작을 규정, 함수와 동일한 형태이고 클래스 내부에 존재
// 자바는 클래스 기반의 언어 이므로 클래스 외부에 별도의 함수가 존재 할 수 없음

// 이것이 메서드 오버로딩 밑에 sum , 오버로딩은 매개변수의 목록반 봄(중복 X)
// 같은 문자열 타입을 본다 오버로딩은

public class FildAndMethodEx2 {
    public static void main(String[] args) {
        System.out.println(sum(100,200));
        System.out.println(sum("Tset", "Java"));
        System.out.println(sum("Tset", 1234));
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }
    //클래스 메서드, 매개변수의 입력이 존재, 반환값도 존재
    static int sum(int a, int b){
        return a + b;
    }
    static String sum(String a, String b) {
        return a + b;
    }
    static String sum(String a, int b) {
        return a + b;
    }
    // 매개변수의 개수를 알 수 없을 때 사용 하는 방법
    static int sum(int ...val) { // 전개 연산자
        int sum = 0;
        for (int e : val) {
            sum += e;
        }
        return sum;
    }
}

class Car {
    static int productNumber = 0; // 클래스 필드
    static String company = "현대자동차"; // 클래스 필드
    String modelName; // 인스턴스 필드
    int speed; // 인스턴스 필드
    int horsePower; // 인스턴스 필드
    String color; // 인스턴스 필드
    // 매개변수가 있는 생성자
    Car (String name, int speed, int power, String color) {
        modelName = name;
        this.speed = speed; // this. == 파이썬의 self와 같다.  this는 자기 객체를 가리키는 것
        horsePower = power; // this를 붙여도되고 안붙여도됨 변수 이름이 다르기때문
        this.color = color;
        productNumber += 1; // 클래스 필드
    }
}