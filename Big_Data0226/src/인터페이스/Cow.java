package 인터페이스;

public class Cow implements animal {
    public void Sound() {
        System.out.println("음메");
        // Cow.java 클래스를 만들어서 소가 음메라는 소리를 낼수 있음
    }

    public void 밥먹기() {
        System.out.println("밥먹다.");
    }
}
