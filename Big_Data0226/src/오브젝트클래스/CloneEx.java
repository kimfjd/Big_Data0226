package 오브젝트클래스;

// clone 메소드 : 얕은 복사가 일어날 상황에서 깊은 복사가 일어나도록 해주는 메소드
public class CloneEx {
    public static void main(String[] args) {
        Member mem1 = new Member("bear", "곰돌이사육사", "12345", 23, true);
        Member mem2 = mem1;
        mem2.age = 100;
        mem2.name = "test";

        System.out.println("name : " + mem1.name);
        System.out.println("name : " + mem2.name);

        System.out.println("name : " + mem1.age);
        System.out.println("name : " + mem2.age);
    }
}
