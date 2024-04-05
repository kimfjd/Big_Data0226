package 상속기본;
// 상속에서 final 사용
// final 키워드: 수정불가 상태로 만드는 것
public class InheritanceEx2 {
    public static void main(String[] args) {

    }
}

class car {
    int speed;
    String color;
    String name;
    final void accelerator() {
        System.out.println("차의 속도를 증가 시킵니다");
    }
    final void breakPanel(){
        System.out.println("차의 속도를 감소 시킵니다");
    }
}
class SportsCar extends car{
    boolean isTurbo;
    SportsCar(String name){
        isTurbo = false;
        speed=280;
        this.name=name;
        color="Red";
    }
    int getSpeed(){
        if (isTurbo) return speed *=1.2;
        return speed;
    }
    boolean isTurbo(){
        return isTurbo;
    }
    void infoCar(){
        System.out.println("이름: "+name);
        System.out.println("속도: "+getSpeed());
        System.out.println("색상: "+color);
        System.out.println("부스트"+isTurbo);
    }
}