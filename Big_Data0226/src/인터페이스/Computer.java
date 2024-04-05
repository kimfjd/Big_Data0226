package 인터페이스;

public class Computer implements ImageSize{

    public void resize(int 가로, int 세로){
        System.out.println("컴퓨터 가로 크기 "+가로+ " 세로크기 "+세로);
    }
    public void buttonsize (int a, int b){
        System.out.println("컴퓨터 버튼 가로 크기 "+a+ " 버튼 세로 크기 "+b);
    }
}
