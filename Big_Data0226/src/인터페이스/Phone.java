package 인터페이스;

public class Phone implements ImageSize{
    public void resize(int 가로, int 세로){
        System.out.println("핸드폰의 가로 크기는 "+가로+ " 세로크기는 "+세로);
    }
    public void buttonsize (int a, int b){
        System.out.println("핸드폰의 버튼가로 크기는 "+a+ " 버튼세로크기는 "+b);
    }

}
