package A0.연습장;


import java.util.Scanner;

public class Uc_DefaultMethodMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        U_RemoteControl rc;
        System.out.print("제품 선택 : [1]TV [2]Audio : ");
        int sel = sc.nextInt();
        if (sel == 1) {
            rc = new Ua_Television();
            rc.turnON();
            rc.setVolume(20);
            U_RemoteControl.changeBattery();
            rc.setMute(true);
        } else {
            rc = new Ub_Audio();
            rc.turnON();
            rc.setVolume(102);
            rc.setMute(true);
        }

        U_RemoteControl rc2 = new U_RemoteControl() {
            int volume;
            @Override
            public void turnON() {
                System.out.println("PS의 전원을 켭니다.");
            }

            @Override
            public void turnOFF() {
                System.out.println("PS의 전원을 끕니다");
            }

            @Override
            public void setVolume(int volume) {
                if (volume > U_RemoteControl.MAX_VOLUME) {
                    this.volume = U_RemoteControl.MAX_VOLUME;
                } else if ( volume < U_RemoteControl.MIN_VOLUME) {
                    this.volume = U_RemoteControl.MIN_VOLUME;
                } else {
                    this.volume = volume;
                }
            }
        };
        rc2.turnON();
        rc2.setVolume(30);
    }
}
