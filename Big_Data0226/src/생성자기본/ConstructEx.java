package 생성자기본;

// 생성자: 클레스가 객체로 만들어질때 무조건 호출되는 메서드(무조건 호출)
// 사용 용도: 인스턴스 필드 초기화 목적
// 생성자는 클레스 이름과 동일해야 함
// 생성자는 반환타입이 없지만 void를 사용하지 않음
// 하나의 클레스는 여려개의 생성자를 가질수 있음(생성자는 오버로딩)
public class ConstructEx {
    public static void main(String[] args) {
        Car car1 = new Car(); // Car 클레스로 객체를 생성하고 car 참조변수에 대입 함, 이때 기본 생성자가 호출
        Car car2 = new Car("싼타페");
        Car car3 = new Car("현대 자동차", "코나");
        Car car4 = new Car("현대 자동차","제네시스G80",230,350);

        car1.carInfo();
        car2.carInfo();
        car3.carInfo();
        car4.carInfo();
    }
}

class Car{
    String compony;
    String model;
    String color;
    int speed;
    int horsePower;
    Car() {} // 기본 생성자, 아무것도 안함
    Car(String model) {
        this.model=model; // 생성자 오버로딩, 오버로딩이란: 동일한 이름의 메소드를 매개변수의 개수나 타입으로 구분
    }
    Car(String com, String model) {
        compony=com;
        this.model=model; // 인스턴스 필드와 전달받은 매개변수의 이름이 같은 경우는 인스턴스 필드앞에 숨겨진 this를 사용해야함
}
    Car(String compony, String model, int speed, int horsePower){
        this.compony=compony;
        this.model=model;
        this.speed=speed;
        this.horsePower=horsePower;
    }
    public void carInfo(){
        System.out.println("제조사: "+ compony);
        System.out.println("모델명: "+ model);
        System.out.println("최고속도: "+ speed);
        System.out.println(("최대 출력: "+ horsePower));
    }
}