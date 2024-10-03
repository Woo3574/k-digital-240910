package Bt.인터페이스기본;
// 인터페이스란? 자바에서 다중 상속을 지원하기 위해서 만들어짐 (자바는 다중 상속을 지원하지 않음)
// 인터페이스는 개발에 있어서 설계명세서 개념이라고 생각하면 됨
// 완벽한 추상화 : 모든 메서드가 추상메서드 (단, 예외가 있음)
// 인터페이스에 포함되는 필드 : final static 이 자동으로 추가 됨(컴파일러) - 상수가 됨
// 인터페이스에 포함되는 메서드는 전부 자동으로 public abstract가 자동으로 추가됨 (컴파일러) - 추상메서드
// 정적메서드 : 객체와 상관없으므로 사용해도 됨 (구현부가 있음)
// 인터페이스 상속은 implements 키워드를 사용하고, 상속받는 개수는 무한대
// 인터페이스 문법을 사용하는 이유는 느슨한 결합관계를 달성하기 위해서 사용

import java.util.Scanner;

public class InterfaceMain {
    public static void main(String[] args) {
//        String[] area = {"", "부산", "대전", "강릉", "광주"};
//        String[] carType = {"", "스포츠카", "승용차", "버스"};
        NetworkAdapter adapter;  // 변수 adapter에 5g 와이파이 lte 등 붙을수있다. // 객체화가 될수없다.
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.print("연결할 네트워크 선택 : [1]WiFi [2]5G [3]LTE : ");
        int num = sc.nextInt();
        switch (num) {
            case 1 :
                adapter = new wiFi(name);
                adapter.connect();
                break;
            case 2 :
                adapter = new FiveG("SK Telecom");
                adapter.connect();
                break;
            case 3 :
                adapter = new Lte("LG U+");
                adapter.connect();
                break;
            default:
                System.out.println("네트워크 선택이 잘 못 되었습니다.");
        }

    }
}
