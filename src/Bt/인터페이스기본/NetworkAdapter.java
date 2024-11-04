package Bt.인터페이스기본;

// 인터페이스에 일반 메서드가 들어가면안된다 들어간 순간 다중상속이되기때문

public interface NetworkAdapter {
    void connect();  // 인터페이스에 포함된 메서드는 자동으로 public abstract 가 추가됨
}

class WiFi implements NetworkAdapter {
    String company;
    WiFi(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + "WiFi에 연결 되었습니다.");

    }

}

class FiveG implements NetworkAdapter {
    String company;
    FiveG(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + "Fiveg에 연결 되었습니다.");

    }
}

class Lte implements NetworkAdapter {
    String company;
    Lte(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + "Lte에 연결 되었습니다.");

    }
}
