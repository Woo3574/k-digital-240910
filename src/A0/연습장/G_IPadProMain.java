package A0.연습장;

// iPad Pro 구입하기 : Yes or No 선택 기능 (반복 구매 가능, while 문 처리)
// 디스플레이 선택 기능 (입력은 정수, 출력은 “11인치”, “12.9인치”)
// 컬러 선택 기능 (입력은 정수로 입력 받고 출력은 “스페이스그레이”, “실버”)
// 용량 선택 기능 (입력은 정수, 출력은 “128GB”, “256GB”, “512GB”, “1TB”)
// 네트워크 선택 기능
// 각인 서비스
// 출고까지 제품 준비중…이라고 표시하고 30초간 대기  후 (진행 상황을 보여 줄 수 있으면 구현 하면 좋음. 진행바와 같은거…)
// 제품 출고 (화면, 색상, 용량, 네트워크, 이름, 일련번호)

public class G_IPadProMain {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Ga_IPadPro iPadPro = new Ga_IPadPro("iPadPro");
            if (!iPadPro.continueOder()) break;
            iPadPro.setScreen();
            iPadPro.setColor();
            iPadPro.setDataSize();
            iPadPro.setWiFi();
            iPadPro.setName();
            iPadPro.setSerialnumber();
            iPadPro.progressIPadPro();
            iPadPro.getIphoneInfo();
        }

    }
}
