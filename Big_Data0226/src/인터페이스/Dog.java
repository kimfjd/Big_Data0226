package 인터페이스;
// 강아지의 소리를 만들어줘야함
// 강아지소리 어디감?
// 동물인터페이스에서 가져옴
// implements 를 사용해서 원하는 인터페이스를 가져온다
public class Dog implements animal{
    public void Sound(){
        System.out.println("강아지는 멍망");
    }
    public void 밥먹기(){
        System.out.println("밥먹다.");
    }
}
