package 상속기본;

// 상속이란: 자식클래스가 부모 클래스의 기능을 물려 받는 것(필드,메소드)
// 자식클래스는 부모클래스를 상속 받으면 부모클래스의 크기와 같거나 커진다.
// 상속을 받아서 그대로 사용하면 상속 개념이 적용되고, 기능을 개선하거나 새롭게 만들면 다양성(오버라이딩)이 발생함
public class InheritanceEx1 {
    public static void main(String[] args) {
        HouseDog HouseDog=new HouseDog(); //HpousDog를 클래스의 기본 생성자로 객체 생성
        HouseDog.setName("댕댕이1번");
        System.out.println(HouseDog.name);
        HouseDog.sleep();
        HouseDog.sleep(3);
    }
}

class Animal{
    String name; //인스턴스 필드
    void setName(String name){
        this.name=name;
    }
}
// Animal을 상속 받아 Dog 만들기
class Dog extends Animal{
    void sleep(){
        System.out.println(name+"zzz");
    }
}
class HouseDog extends Dog{
    @Override // 오버라이딩 관계가 문법적으로 확인
    void sleep(){
        System.out.println(name+"zzz in house dog");
    }
    //메소드로 오버로딩
    void sleep(int hour){
        System.out.println(name+"zzz in for"+hour+"dog");
    }
}