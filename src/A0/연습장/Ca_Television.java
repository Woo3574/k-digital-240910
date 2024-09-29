package A0.연습장;
// 생성자는 클래스 이름과 같고, 반환 타입이 없음(void 안됨)
// 생성자는 외부에서 접근해야 하기 때문 일반적으로 public 접근 제한자를 사용
// 싱글톤 객체를 생성할 때는 접근 제한자를 private해서 객체 생성을 제한 할 수 있음
// private 접근 제한자가 없으면 제품의 리미트가 없다고 생각하면 이해하기쉬움
// 생성자의 값을 넣는건 공장초기화값이랑 같다, 리모컨은 메서드에 비유



public class Ca_Television {
    private boolean isON;
    private int channel;
    private int volume;

    public Ca_Television() {
        this.isON = false;
        this.channel = 10;
        this.volume = 10;
    }

    public Ca_Television(boolean isON, int channel, int volume) {
        this.isON = isON;
        this.channel = channel;
        this.volume = volume;
    }

    public void setIsON(boolean onOff) {
        isON = onOff;
        String onOffStr = (isON) ? "ON" : "OFF" ;
        System.out.println("TV " + onOffStr);
    }

    public void setChannel(int cnl) {
        if (cnl > 0 && cnl < 1000) System.out.println("채널을 "+ cnl + "으로 변경하셨습니다.");
        else System.out.println("지원하지않는 채널이므로 채널로 변경하실수 없습니다.");
    }

    public void setVolume(int vol) {
        if (vol >= 0 && vol <= 100) System.out.println("볼륨을 " + vol + "으로 변경하셨습니다.");
        else System.out.println("지원하지않는 음량이므로 볼륨을 변경하실수 없습니다.");
    }


    public void getInfo() {
        System.out.println("========= TV정보 =========");
        System.out.println("전원 : " + isON);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("==========================");
    }



}
