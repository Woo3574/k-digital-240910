package A0.연습장;

import java.util.Scanner;

public class T_CocoaTalkMain {
    public static void main(String[] args) {
        Tb_CocoaTalk tbCocoaTalk = new Tb_CocoaTalk("태우");
        tbCocoaTalk.writeMsg("오늘부터 갑자기 날씨가 쌀쌀해졌어요. 옷을 따듯하게 입고다니세요.");
        Ta_CocoaTalkInterface cti = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("메세지를 전송할 네트워크 : [1]WiFi [2]5G [3]LTE : ");
        int sel = sc.nextInt();
        switch (sel) {
            case 1 : cti = new WiFii();break;
            case 2 : cti = new Fivegg();break;
            case 3 : cti = new Ltee();break;
            default: System.out.println("연결할 네트워크 선택이 잘못되었습니다.");
        }
        if (cti != null)tbCocoaTalk.send(cti);
    }
}
