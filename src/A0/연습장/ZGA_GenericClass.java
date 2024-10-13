package A0.연습장;

public class ZGA_GenericClass {
    public static void main(String[] args) {
        ZGAb_GenericPrinter<ZGAa_Powder> printer = new ZGAb_GenericPrinter<>();
        printer.setMaterial(new ZGAa_Powder());
        ZGAa_Powder zgAaPowder = printer.getMaterial();
        System.out.println(printer);
        System.out.println(zgAaPowder);
    }
}
