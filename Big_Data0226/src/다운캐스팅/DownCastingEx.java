package 다운캐스팅;

import java.util.ArrayList;

public class DownCastingEx {
    ArrayList<Animal> aniList = new ArrayList<>();// Animal 클래스 타입의 객체를 리스트 형태로 관리하기 위해
    public static void main(String[] args) {
        DownCastingEx downCasting=new DownCastingEx();
        downCasting.addAniml();
        System.out.println("원래 형으로 다운 캐스팅");
        downCasting.downCasting();
    }
    public void addAniml(){
        aniList.add(new Animal());
        aniList.add(new tiger());
        aniList.add(new Eagle());
        for(Animal e : aniList)e. move();
    }
    public void downCasting(){
        for(int i=0; i<aniList.size();i++){
            Animal ani = aniList.get(i);
            if(ani instanceof Human){//현재의 리스트가 Human형으로 다운캐스팅 가능한지 확인
                Human h = (Human) ani;
                h.readBook();
            }
            else if(ani instanceof tiger){
                tiger t= (tiger) ani;
                t.hunting();
            } else if (ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            }else {
                System.out.println("지원 안됨");
            }
        }
    }
}
class Animal {
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
class Human extends Animal{
    @Override
    public void move(){
        System.out.println("사람은 두 발로 걷습니다.");
    }
    public void readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }
}

class tiger extends Animal{
    @Override
    public void move(){
        System.out.println("호랑이는 네 발로 뜁니다.");
    }
    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
class Eagle extends Animal{
    @Override
    public void move(){
        System.out.println("독수리가 하늘을 납니다.");
    }
    public void flying(){
        System.out.println("독수리가 난다요");
    }
}

