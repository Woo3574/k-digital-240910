package A0.연습장;

import static A1.Common.Common.*;

public class Mb_ProdoutcTV extends Ma_ProtoTypeTV {
    String name;
    boolean isInternet;
    public Mb_ProdoutcTV(String name) {
        super(false,10,10);
        this.name = name;
    }

    void setPower(boolean power) {
        this.isPower = power;
    }

    void setVolume(int vol) {
        if (vol >= MIN_VOLUME  && vol <=  MAX_VOLUME ) {
            this.volume = vol;
        } else {
            System.out.println("볼륨 설정 범위를 벗어났습니다.");
        }
    }

    @Override
    void setChannel(int cnl) {
        if ( cnl > PROTOTYPE_CHANNEL_MIN && cnl <= PROTOTYPE_CHANNEL_MAX) {
            this.channel = cnl;
        } else {
            System.out.println("지원하지않는 채널입니다.");
        }
    }
    //오버로딩
    void setChannel(int cnl, boolean isInternet) {
        if (isInternet) {
            System.out.println("인터넷 모드입니다.");
            this.isInternet = true;
        } else {
            if ( cnl > PROTOTYPE_CHANNEL_MIN && cnl <= PROTOTYPE_CHANNEL_MAX) {
                this.channel = cnl;
            } else {
                System.out.println("지원하지 않는 채널입니다.");
            }
        }
    }

    void tvInfo() {
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷모드 : " + isInternet);
    }


}