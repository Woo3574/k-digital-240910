package Bv.디폴트메서드;

public interface RemoteControl {
    int MAX_VOLUME = 100; // 변수가 대문자로 시작하는 경우는 값이 변하지않는 상수일때
    int MIN_VOLUME = 0; // 인터페이스에 포함된 필드는 모두 상수로 만들어 짐(final static 추가 됨)
}
