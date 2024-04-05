package 인터페이스;

public class CarMain {
    public static void main(String[] args) {
        Car Sonata = new Sonata();
        Car Avante = new Avante();

        System.out.println("====소나타====");
        Sonata.Start();
        Sonata.Stop();
        System.out.println(("====아반떼====="));
        Avante.Start();
        Avante.Stop();
    }
}
