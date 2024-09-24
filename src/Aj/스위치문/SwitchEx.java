package Aj.스위치문;
// switch문은 if문과 마찬가지로 조건 제어문 입니다.
// if문은 조건식의 결과가 true 또는 false에 따라 분기하고,
// switch문은 변수의 값에 따라 실행문이 결정
// switch(변수) {
// case 값 : 정수, 문자, 문자열이 올 수 있음
//  실행문
//  break; // switch문을 벗어남

// 참조변수는 주소의 리터럴 상수값이 다르면비교할수없음
// equals 내용을 비교하는 내부 메서드
import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {
        String name = "곰돌이사육사"; // "곰돌이사육사" r 밸류는 Static 주소에 할당됨, name 참조변수이며 stac에 할당됨, 리터럴상수의 주소는 Static에 할당됨
        String addr = "곰돌이사육사";
        String city = new String("곰돌이사육사"); // new String 클래스로인해  "곰돌이 사육사" 주소는 Heap 영역에 할당됨
        String awd = new String("곰돌이사육사");
        if (name == city) {
            System.out.println("name과 addr의 주소가 같습니다.");
        } else {
            System.out.println("name과 addr의 주소가 다릅니다.");
        }
        if (name.equals(city)) {
            System.out.println("name과 addr 내용이 같습니다.");
        } else {
            System.out.println("name과 aadr의 내용이 다릅니다.");
        }
        if (name == name) {
            System.out.println("name과 addr의 주소가 같습니다.");
        } else {
            System.out.println("name과 addr의 주소가 다릅니다.");
        }
        if (name.equals(name)) {
            System.out.println("name과 addr 내용이 같습니다.");
        } else {
            System.out.println("name과 aadr의 내용이 다릅니다.");
        }


//        Scanner sc = new Scanner(System.in);
//        System.out.print("계절을 입력 하세요 : ");
//        String season = sc.next();  // 앞에 대문자면 참조타입 시즌은 참조변수
//        switch (season){
//            case "spring":
//                System.out.println("꽃이 피는 봄이 왔어요~~~!");
//                break;
//            case "summer":
//                System.out.println("무더운 여름 입니다.");
//                break;
//            case "fall" :
//            case "autumn":
//                System.out.println("선선한 가을 입니다.");
//                break;
//            case "winter":
//                System.out.println("추위가 매서운 겨울 입니다.");
//                break;
//            default:
//                System.out.println("계절을 잘 못 입력하셨습니다.");
//        }

//        if (season.equals("spring")) {
//            System.out.println("꽃이 피는 봄이 왔어요~~~!");
//        } else if (season.equals("summer")) {
//            System.out.println("무더운 여름 입니다.");
//        } else if (season.equals("fall") || season.equals("autumn")) {
//            System.out.println("선선한 가을 입니다.");
//        } else if (season.equals("winter")) {
//            System.out.println("추위가 매서운 겨울 입니다.");
//        } else {
//            System.out.println("계절을 잘 못 입력하셨습니다.");
//        }
    }
}
