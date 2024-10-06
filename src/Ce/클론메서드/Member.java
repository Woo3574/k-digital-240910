package Ce.클론메서드;

import javax.swing.text.Style;

// Cloneable 인터페이스는 복제 허용에 대한 부분
public class Member implements Cloneable {
    String id;
    String name;
    String password;
    int age;
    boolean isAdult;

    public Member(String id, String name, String password, int age, boolean isAdult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.isAdult = isAdult;
    }
    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone(); // 클론메서드는 Object타입이므로 형변환이 필요
        } catch (CloneNotSupportedException e) { // 클론복제를 허용하지않는 경우
            System.out.println("예외 발생 : " + e); // e.printStackTrace;
        }
        return cloned;
    }
}
