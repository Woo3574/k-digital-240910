package A0.연습장;

public class Aa_memberInfo {
    public static void main(String[] args) {
        A_member member = new A_member();

        member.setName();
        member.setAge();
        member.setGender();
        member.setJob();
        member.getInfo();

        System.out.println("회원 이름 : " + member.getName());
    }
}
