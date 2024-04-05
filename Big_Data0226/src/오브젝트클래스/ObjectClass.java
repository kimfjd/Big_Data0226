package 오브젝트클래스;

import 자동차프로젝트.Car;

// 오브젝트 클래스는 모든 클래스의 조상 클래스
public class ObjectClass {
    public static void main(String[] args) {
        Student student =new Student();
        car car=new car();
        car car1=new car();
        System.out.println(car.equals(car1));
        System.out.println(car1.toString());
    }
}

class Student{
    int id;
    String name;
}

class car {

}
