package Bu.코코아톡;

public interface NetworkAdapter {
    void connect(); // public abstract가 추가됨
    void send(String msg);
}

class WiFi implements NetworkAdapter{
    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("WiFi >> " + msg);
    }
}

class Fiveg implements NetworkAdapter{
    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("Fiveg >> " + msg);
    }
}

class Lte implements NetworkAdapter{
    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("Lte >> " + msg);
    }
}