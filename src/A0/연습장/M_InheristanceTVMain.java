package A0.연습장;

public class M_InheristanceTVMain {
    public static void main(String[] args) {

        Mb_ProdoutcTV mbProdoutcTV = new Mb_ProdoutcTV("삼성TV");
        mbProdoutcTV.setChannel(50,true);
        mbProdoutcTV.setPower(true);
        mbProdoutcTV.setVolume(99);
        mbProdoutcTV.tvInfo();

    }
}
