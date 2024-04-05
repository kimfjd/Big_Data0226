package 필드연습;

//필드란 클레스 내부에 선언된 변수를 의미함 즉, 클레스로 생성된 각각의 개체마다 별도로 값을 지정하는 용도
// 인스턴스 필드를 의미(객체가 생생되 때 마다 생성됨)
// 접근제한자를 가짐( private, default(킹워드 아님,접근제한자를 지정하지 않으면 default(),protected(), public)
// static 키워드를 사용하면 클레스 변수(필드)라 하고  하며, 객체 생성시 생성되지 않고 클래스 생성시 단 한번만 생서
// 필드의 값을 읽고 쓰기 위해서 게터와 세터를 만들어 주느ㄴ 것이 일반적인 문법
// 핃드의 값을 읽고 쓰기 위해서 게터와 세터를 만들어 주는것이 알반적인 문법(스프링부트에서 콤복 사용으로 대체 가능)
public class FieldEx {
    public static void main(String[] args) {
        int localVal = 30; // 지역변수, stack 영역에 생성됨, {}범위 내에서만 생존함, 초기화되지 않음
        FieldClass field1 = new FieldClass(); // 인스턴스(객체) 생성
        FieldClass field2 = new FieldClass(); // 두번째 인스턴스 생성

        // 인스턴스 필드에서 값 대입 (참조 변수로 접근), 객체 생성 개수만큼 생성 됨
        field1.instanceVar = 1000;
        field2.instanceVar = 2000;

        // 클래스 변수: 클레스 생성 시 생성되고 클레스 이름 접근
        FieldClass.classVar=3000;

        System.out.println("지역 변수 : "+ localVal);
        System.out.println("인스턴스 필드: "+ field1.instanceVar);
        System.out.println("인스턴스 필드: "+ field2.instanceVar);
        System.out.println("클래스 필드: "+ FieldClass.classVar);


    }
}

class FieldClass {
    int instanceVar = 20; // 인스턴스 변수(필드), 객체 생성시 생성 됨, 힙 영역에 할당 됨
    static int classVar = 10; // 클래스 변수(필드), 클래스 생성시 생성됨, 메소드(static)영역에 할당 됨

}