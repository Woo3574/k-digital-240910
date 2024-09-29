package A0.연습장;
// 예매하기와 종료하기 메뉴 작성
// 총 좌석은 10개
// 좌석당 가격은 생성자를 통해서 입력
// 좌석 정보에 대한 메서드 ([][][V][][][][][][][][])
// 좌석 예약 하기 : 값이 0이면 예약 안된 좌석, 1이면 판매된 좌석
// 총 판매 금액에 대한 메서드 작성


import java.util.Scanner;

public class E_MovieMain {
    public static void main(String[] args) {
        Ea_MovieTicket movieTicket = new Ea_MovieTicket(12000);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("[1]예매하기 ");
            System.out.print("[2]예매취소하기 ");
            System.out.print("[3]종료하기 ");
            int num = sc.nextInt();
            switch (num) {
                case 1 : movieTicket.buySeat(); break;
                case 2 : movieTicket.cancleSeat(); break;
                case 3 : movieTicket.seatCellPrice(); return;
                default : System.out.println("잘못된 번호를 누르셨습니다.");
            }
        }

    }
}
