package A0.연습장;

public interface Ta_CocoaTalkInterface {
    void connect();
    void send(String msg);
}

class WiFi implements Ta_CocoaTalkInterface {

    @Override
    public void connect() {
    }

    @Override
    public void send(String msg) {
        System.out.println("WiFi >>" + msg);
    }
}

class Fiveg implements Ta_CocoaTalkInterface {

    @Override
    public void connect() {
    }

    @Override
    public void send(String msg) {
        System.out.println("Fiveg >> " + msg);
    }
}

class Lte implements Ta_CocoaTalkInterface {

    @Override
    public void connect() {
    }

    @Override
    public void send(String msg) {
        System.out.println("LTE >> " + msg);
    }
}
