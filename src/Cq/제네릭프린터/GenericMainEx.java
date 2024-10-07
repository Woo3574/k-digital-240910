package Cq.제네릭프린터;

public class GenericMainEx {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.settMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powder.toString());
        powder.doPrinting();
        powderPrinter.printing();

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.settMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plastic.toString());
        plasticPrinter.printing();

        GenericPrinter<Nylon> nylonPrinter = new GenericPrinter<>(); // 메테리얼로부터 상속을 못받아서 에러
        nylonPrinter.settMaterial(new Nylon());
        System.out.println(nylonPrinter.getMaterial());
        nylonPrinter.printing();

    }
}
