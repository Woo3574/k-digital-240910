package Aj.스위치문;

public class memory {
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
    }
}
