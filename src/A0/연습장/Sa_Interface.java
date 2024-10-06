package A0.연습장;

public interface Sa_Interface {
    void summonersWar();
}

class KoreaServer implements Sa_Interface{
    String monster;
    public KoreaServer(String monster) {
        this.monster = monster;
    }

    @Override
    public void summonersWar() {
        System.out.println(monster + "를 사용한 한국서버가 우승했습니다.");
    }
}

class JapenServer implements Sa_Interface {
    String monster;

    public JapenServer(String monster) {
        this.monster = monster;
    }

    @Override
    public void summonersWar() {
        System.out.println(monster + "를 사용한 일본서버가 우승했습니다.");
    }
}

