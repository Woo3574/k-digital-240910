package A0.연습장;

import static A1.Common.Common.PROTOTYPE_CHANNEL_MAX;
import static A1.Common.Common.PROTOTYPE_CHANNEL_MIN;

public class Ma_ProtoTypeTV {
    boolean isPower;
    int channel;
    int volume;

    public Ma_ProtoTypeTV(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }

    void setChannel(int cnl) {
        if (cnl > PROTOTYPE_CHANNEL_MIN && cnl <= PROTOTYPE_CHANNEL_MAX ) {
            this.channel = cnl;
        } else {
            System.out.println("지원하지 않는 채널입니다.");
        }
    }

}
