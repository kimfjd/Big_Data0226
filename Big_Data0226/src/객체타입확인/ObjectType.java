package 객체타입확인;

//instanceof: 상속 관계를 묻는 메소드
public class ObjectType {
    public static void main(String[] args) {
    Parent parent=new Parent("부모 클래스");
    Child child=new Child("자식클래스");
    System.out.println(parent instanceof Parent); // true
    System.out.println(child instanceof Parent); // true child가 Parent로 부터 상속 받았냐고 묻는것
    System.out.println(parent instanceof Child); // false 자식 클레스에서 부모 클레스 참조 못함
    System.out.println(child instanceof Child); ///true

    }
}
class Parent{
    String name;
    Parent(String name){
        this.name=name;
    }
}
class Child extends Parent{
    Child(String name){
        super(name); //부모 생성자 호출 부모 클레스의 생성자가 기본 생성자면 생략 가능
        this.name=name;
    }

}