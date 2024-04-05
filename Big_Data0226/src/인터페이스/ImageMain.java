package 인터페이스;

public class ImageMain {
    public static void main(String[] args) {
        //핸드폰과 컴퓨터 이미지 크기 출력
        ImageSize phone=new Phone();
        ImageSize computer=new Computer();
        phone.resize(360,600);
        computer.resize(1280,720);
        phone.buttonsize(50,25);
        computer.buttonsize(300,150);
    }
}
