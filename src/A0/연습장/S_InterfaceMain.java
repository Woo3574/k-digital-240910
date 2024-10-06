package A0.연습장;

import java.util.Scanner;

public class S_InterfaceMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sa_Interface summonerServer;
        System.out.print("빛암 몹 이름 : ");
        String monsterName = sc.nextLine();
        System.out.print("우승 서버 선택 [1]kroea [2]japen : ");
        int number = sc.nextInt();

        switch (number) {
            case 1 :
                summonerServer = new KoreaServer(monsterName);
                summonerServer.summonersWar();
                break;
            case 2 :
                summonerServer = new JapenServer(monsterName);
                summonerServer.summonersWar();
                break;
            default:
                System.out.println("잘못입력하셨습니다.");
        }

    }
}
