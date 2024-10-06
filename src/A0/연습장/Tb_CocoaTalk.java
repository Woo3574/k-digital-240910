package A0.연습장;

public class Tb_CocoaTalk {
    private String to; // 수신자
    private String msg; // 수신자에게 전달할 메세지
    public Tb_CocoaTalk(String name) {
        to = name;
    }

    public void writeMsg(String msg) {
        this.msg = to + " : " + msg;
    }

    public void send(Ta_CocoaTalkInterface cti) {
        cti.send(msg);
    }
}
