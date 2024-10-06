package A0.연습장;

public interface U_RemoteControl {
    int MAX_VOLUME = 100; // 변수가 대문자로 시작하는 경우는 값이 변하지않는 상수일때
    int MIN_VOLUME = 0;   // 인터페이스에 포함된 필드는 모두 상수로 만들어 짐(final static 추가 됨)
    // 설계명세에서 볼륨의 설정 범위를 표시 하기 위해서 사용 할 수 있음

    public void turnON();  // 자동으로 public abstract가 추가됨;
    public void turnOFF();
    public void setVolume(int volume);
    // 디폴트 메서드는 이 후 추가 (예외 조항)
    // 상속 받은 클래스에서 오버라이딩해도 되고, 하지 않아도 됨
    default void setMute(boolean mute) {
        if (mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 처리를 해제 합니다.");
    }

    // 인터페이스 생성 시 함께 생성되고 상속되지 않음
    static void changeBattery() {
        System.out.println("건전지를 교환 합니다.");
    }
}
