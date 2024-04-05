package 인터페이스;

public class Sonata implements Car{
    public void Start(){
        System.out.println("소나타의 시동을 걸었다");
    }
    public void Stop(){
        System.out.println("소나타 시동을 끕니다");
    }
}
