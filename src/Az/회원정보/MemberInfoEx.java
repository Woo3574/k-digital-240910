package Az.회원정보;

public class MemberInfoEx {
    public static void main(String[] args) {
        // Member calss에 대한 객체를 생성하기 위해 기본 생성자 호출
        Member member = new Member(); // Member = 클래스, member = main클래스에서 만든 변수(주소)
                                      // new = 객체생성을 위한 Heap 메모리 확보, Member() = 생성자 호출 (생성자는 클래스이름과 같아야한다,또는 부모클래스에 상속된 자식 생성자호출 가능)

        member.setName();
        member.setAge();
        member.setGender();
        member.setJob();
        member.getInfo();
        // 회원의 이름확인 (getter의 사용법)
        System.out.println("회원의 이름 : " + member.getName());

        // 캡슐화 : 내부 인스턴스의 값을 숨기기위해서 제한적접근자 praivate,getter,setter
    }
}
