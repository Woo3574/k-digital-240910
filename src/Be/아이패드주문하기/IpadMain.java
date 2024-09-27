package Be.아이패드주문하기;

public class IpadMain {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            IPadPro iPadPro = new IPadPro("iPad Pro");
            if (!iPadPro.continueOder()) break;
            iPadPro.setScreen();
            iPadPro.setColor();
            iPadPro.setMemory();
            iPadPro.setNetwork();
            iPadPro.setName();
            iPadPro.iPadProCalcPrice();
            iPadPro.progressIPadPro();
            iPadPro.iPadProInfo();
        }

    }
}
