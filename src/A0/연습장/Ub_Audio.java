package A0.연습장;

import Bv.디폴트메서드.RemoteControl;

public class Ub_Audio implements U_RemoteControl {
    private int volume;

    @Override
    public void turnON() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if ( volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
    }

    void getInfo() {
        System.out.println("오디오 입니다.");
        System.out.println("현재 볼륨은 " + volume + " 입니다.");
    }

    @Override
    public void setMute(boolean mute) {
        if(mute) System.out.println("오디오를 무음 처리 합니다.");
        else System.out.println("오디오 무음 처리를 해제 합니다.");

    }

}
