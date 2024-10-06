package A0.연습장;

import java.util.Scanner;

public class R_InterfaceMain {
    public static void main(String[] args) {
        Ra_Interface network;
        Scanner sc = new Scanner(System.in);
        System.out.print("장소 입력 : ");
        String name = sc.nextLine();
        System.out.print("연결할 네트워크 선택 [1]WiFi [2]5G [3]LTE : ");
        int num = sc.nextInt();
        switch (num) {
            case 1 :
                network = new Wifi(name);
                network.connect();
                break;
            case 2 :
                network = new FiveG(name);
                network.connect();
                break;
            case 3 :
                network = new LTE(name);
                network.connect();
                break;
            default : System.out.println("네트워크를 잘못 연결하셨습니다.");
        }
    }
}

