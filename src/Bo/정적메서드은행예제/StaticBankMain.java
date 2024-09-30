package Bo.정적메서드은행예제;
// static 멤버와 메서드는 클래스 생성 시 함께 생성되고 객체가 생성 시 만들어 지지 않음
// 하나의 클래스 한개만 존재
// 한번 생성되면 프로그램 종료 시까지 사라지지 않음
// 정적(static) 메서드에서는 인스턴트 필드나 메서드를 사용할수 없음

public class StaticBankMain {
    public static void main(String[] args) {
        Bank hana = new Bank("하나은행", 1000);
        Bank shinhan = new Bank("신한은행", 1000);
        Bank nh = new Bank("신한은행", 1000);
        hana.setDeposit(3000);
        hana.setWithdarw(2000);
        System.out.println(hana.getBank() + " 계좌에 " + hana.getAccount() + "원이 있습니다.");

        System.out.println("계좌가 " + Bank.getCount() + "개설 되었습니다.");

        System.out.println(Util.max(100,200));
        System.out.println(Util.isEven(50));
        System.out.println(Util.getCurrentDate("20240930"));

    }
}
