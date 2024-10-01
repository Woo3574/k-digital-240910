package A0.연습장;
// 사용자가 공홈을 통해서 제품 구매를 한다.  (구매를 진행 할지 말지를 선택)
// 화면 크기 11인치와 13인치
// 컬러는 스페이스그레이와 실버
// 저장 용량은 128GB, 256GB, 512GB, 1TB
// 네트워크는 Wi-Fi 모델과 Wi-Fi + Cellular 모델
// 각인 서비스지원으로 이름을 입력 할 수 있음
// 일련번호는 iPad + 인치 + 메모리 + W/C + 제조일 + 생산댓수
// 예) iPad11256W2201061 (제품명 + 화면크기+용량+네트워크+출시일+생산댓수)

// iPad Pro 구입하기 : Yes or No 선택 기능 (반복 구매 가능, while 문 처리)
// 디스플레이 선택 기능 (입력은 정수, 출력은 “11인치”, “12.9인치”)
// 컬러 선택 기능 (입력은 정수로 입력 받고 출력은 “스페이스그레이”, “실버”)
// 용량 선택 기능 (입력은 정수, 출력은 “128GB”, “256GB”, “512GB”, “1TB”)
// 네트워크 선택 기능
// 각인 서비스
// 출고까지 제품 준비중…이라고 표시하고 30초간 대기  후 (진행 상황을 보여 줄 수 있으면 구현 하면 좋음. 진행바와 같은거…)
// 제품 출고 (화면, 색상, 용량, 네트워크, 이름, 일련번호)

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Ga_IPadPro {
    private int screen;
    private int color;
    private int dataSize;
    private int network;
    private String name;
    private String serialnumber;
    private String prodctDate;
    private static int cnt = 0;
    private int price;
    private final Scanner sc = new Scanner(System.in);

    public Ga_IPadPro(String name) {
        this.name = name;
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        prodctDate = sdf.format(now);
        cnt++;
        prodctDate += cnt;
    }

    public boolean continueOder() {
        System.out.println("======== IPADPRO 구매하기 ========");
        System.out.print("IPADPRO를 구매하시겠습니까? yes / no : ");
        String iscontinue = sc.next();
        if ( iscontinue.equalsIgnoreCase("yes")) return true;
        else return false;
    }


    public void setScreen() {
        while (true) {
            System.out.print("[화면 인치 선택]  [1] 11인치 [2] 13인치 : ");
            screen = sc.nextInt();
            if (screen == 1 || screen == 2) return;
            else System.out.println("잘못고르셨습니다.");
        }
    }

    public void setColor() {
        while (true) {
            System.out.print("[색상 선택]  [1] 스페이스그레이 [2] 실버 : ");
            color = sc.nextInt();
            if (color == 1 || color == 2) return;
            else System.out.println("잘못고르셨습니다.");
        }
    }

    public void setDataSize() {
        while (true) {
            System.out.print("[저장 용량 선택]  [1] 128GB [2] 256GB [3] 512GB [4] 1TB : ");
            dataSize = sc.nextInt();
            if (dataSize  > 0 && dataSize < 5) return;
            else System.out.println("잘못고르셨습니다.");
        }
    }

    public void setWiFi() {
        while (true) {
            System.out.print("[네트워크 선택]  [1] WiFi [2] Wi-Fi + Cellula : ");
            network = sc.nextInt();
            if (network == 1 || network == 2) return;
            else System.out.println("잘못고르셨습니다.");
        }
    }

    public void setName() {
        System.out.print("각인을 입력하시겠습니까 yes / no : ");
        String nameService = sc.next();
        sc.nextLine();
        if (nameService.equalsIgnoreCase( "yes")) {
            System.out.print("각인 입력 : ");
            name = sc.nextLine();
        }
    }

    public void setSerialnumber() {
        String screenStr = (screen == 1) ? "11" : "13";
        String[] dataSizeStr = {"", "256", "512", "1024", "2048"};
        String wiFiStr = (network == 1) ? "W" : "C";
        serialnumber = "iPadPro" + screenStr + dataSizeStr[network] + wiFiStr + prodctDate;

    }

    public void progressIPadPro() throws InterruptedException {
        int cnt = 0;
        while (true) {
            sleep(300);
            cnt++;
            System.out.printf("<<< iPadPro 제작 중 :  [%d%%] >>>\r", cnt);
            if(cnt >= 100) break;
        }
    }

    public void getIphoneInfo() {
        String[] screenType = {"", "11인치", "13인치"};
        String[] colorType = {"", "스페이스 그레이", "실버"};
        String[] dataSizeType = {"", "128GB", "256GB", "512GB", "1TB"};
        String[] wiFiType = {"", "WiFi", "WiFi + Cellular"};

        System.out.println("========== iphone 출시 ==========");
        System.out.println("화면 인치 : " + screenType[screen]);
        System.out.println("색상 : " + colorType[color]);
        System.out.println("저장 용량 : " + dataSizeType[dataSize]);
        System.out.println("네트워크 : " + wiFiType[network]);
        System.out.println("각인 : " + name);
        System.out.println("시리얼 넘버 : " + serialnumber);
        System.out.println("제품 가격 : " + iPadProCalcPrice() + "원"        );
    }

    public String iPadProCalcPrice() {
        NumberFormat numberFormat = NumberFormat.getInstance();
        int[] screenPrice = {0, 1499000, 1990000};
        int[] dataSizePrice = {0, 0, 300000, 900000, 1500000};
        int[] wiFiPrice = {0, 0, 300000};

        price += screenPrice[screen];
        price += dataSizePrice[dataSize];
        price += wiFiPrice[network];

        return numberFormat.format(price);
    }


}