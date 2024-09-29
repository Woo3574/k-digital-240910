package A0.연습장;

public class Aa_MemberInfo {
    public static void main(String[] args) {
        A_Member member = new A_Member();

        member.setName();
        member.setAge();
        member.setGender();
        member.setJob();
        member.getInfo();

        System.out.println("======== 회원정보 ========");
        System.out.println("이름 : " + member.getName());
        System.out.println("나이 : " + member.getAge());
        System.out.println("성별 : " + member.getGender());
        System.out.println("직업 : " + member.getJob());

    }
}
