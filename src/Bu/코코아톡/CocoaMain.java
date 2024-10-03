package Bu.코코아톡;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTok cocoaTok = new CocoaTok("민지");
        cocoaTok.writeMsg("오늘 날씨가 갑자기 쌀쌀해 졋어요. 건강하게 활동 잘 하세요~~");
        NetworkAdapter adapter = null;  // 초기값잡아줄때 참조변수일땐 null,정수일땐 0, 문자열일땐 []
        Scanner sc = new Scanner(System.in);
        System.out.print("메세지를 전송할 네트워크 : [1]WiFi [2]5G [3]LTE : ");
        int sel = sc.nextInt();
        switch (sel) {
            case 1 : adapter = new WiFi(); break;
            case 2 : adapter = new Fiveg(); break;
            case 3 : adapter = new Lte(); break;
            default : System.out.println("전송할 네트워크 선택이 잘 못 되었습니다.");
        }
        if (adapter != null)cocoaTok.send(adapter);
    }
}
