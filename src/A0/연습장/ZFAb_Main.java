package A0.연습장;

public class ZFAb_Main {
    public static void main(String[] args) {
        ZFA_Product<String,Integer> product = new ZFA_Product<>();
        product.setName("삼성TV");
        product.setYear(2002);
        System.out.println(product.getName() + "는 " + product.getYear() + "년에 만들어진 TV이다.");
    }
}
