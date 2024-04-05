package 제네릭;

public class GenericPrintEx {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter=new GenericPrinter<>();
        powderPrinter.setMatercal(new Powder());
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);
        System.out.println(powder);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMatercal(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);
        System.out.println(plastic);
    }

}
