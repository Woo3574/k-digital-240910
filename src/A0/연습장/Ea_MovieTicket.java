package A0.연습장;
// 예매하기와 종료하기 메뉴 작성
// 총 좌석은 10개
// 좌석당 가격은 생성자를 통해서 입력
// 좌석 정보에 대한 메서드 ([][][V][][][][][][][][])
// 좌석 예약 하기 : 값이 0이면 예약 안된 좌석, 1이면 판매된 좌석
// 총 판매 금액에 대한 메서드 작성


import java.util.Scanner;

public class Ea_MovieTicket {
    // 좌석 10개에 대한 정수형 배열의 인스턴스 변수 생성\
    private final int[] seat = new int[10];
    // 좌석당 가격에 대한 인스턴스 필드
    private int price;
    // 입력을 받기 위한 스캐너 객체 생성
    private final Scanner sc = new Scanner(System.in);
    // 생성자는 좌석당 가격 정보를 객체 생성 시 넣어야 되므로 매개변수가 있는 생성자 필요
    public Ea_MovieTicket(int price) {this.price = price;}
    // 좌석 상태 표시 메서드 구현
    public void printSeat() {
        for (int e : seat) {
            if ( e == 0) System.out.print("[ ]");
            else System.out.print("[V]");
        }

    }

    public void buySeat() {
        printSeat();
        System.out.print("예매할 좌석 선택 : ");
        int seatPos = sc.nextInt();
        if (seat[seatPos - 1] == 0) {
            seat[seatPos - 1] = 1; System.out.println("선택 좌석을 예매했습니다.");
            printSeat();
            System.out.println();
        } else System.out.println("잘못된 좌석을 선택하셨습니다.");
    }

    public void seatCellPrice() {
        int cnt = 0;
        for (int e : seat) {
            if (e == 1) cnt += price;
        } System.out.println(" 예매하신 좌석 총금액은 " + cnt + "원 입니다.");
    }

}
