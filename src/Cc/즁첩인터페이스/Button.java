package Cc.즁첩인터페이스;

// 버튼 이벤트에서 처리할때 주로 사용됨 (안드로이드에서 주로사용함)

public class Button {
    //OnClickListener 인터페이스에 대한 참조 변수, 외부에서 객체를 만들어서 주입하는 형태
    OnClickListener listener; //  OnClickListener(내가짓는 인터페이스 명) 상속받은 객체 , listener는 참조변수가됨

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick(); // 구현된 객체의 onClick() 메서드 호출
    }

    interface OnClickListener {
        void onClick(); // 추상메서드
    }
}
