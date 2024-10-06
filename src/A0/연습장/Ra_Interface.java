package A0.연습장;

public interface Ra_Interface {
    void connect(); // 인터페이스 메서드에는 public abstract가 생략되어있다
}

class Wifi implements Ra_Interface {
    String company;
    int age;

    Wifi(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + "Wifi에 연결 되었습니다.");

    }
}

class FiveG implements Ra_Interface {
    String company;

    FiveG(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + " 5G에 연결 되었습니다.");
    }
}

class LTE implements Ra_Interface {
    String company;

    public LTE(String company) {
        this.company = company;
    }

    @Override
    public void connect() {
        System.out.println(company + " LTE에 연결 되었습니다.");
    }
}