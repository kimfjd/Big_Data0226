package 매개변수의다형성;

import java.util.Scanner;

public class TypeCastCarEx {
    public static void main(String[] args) {
        Driver driver=new Driver("장원영");
        Bus bus=new Bus();
        Taxi taxi=new Taxi();
        SportsCar sportsCar=new SportsCar();
        Scanner sc=new Scanner(System.in);
        System.out.println("타고 싶은 차를 선택 하시오: [1]버스/[2]택시,[3]스포츠카: ");
        int selMenu =sc.nextInt();
        switch (selMenu){
            case 1: driver.driver(bus); break;
            case 2: driver.driver(taxi); break;
            case 3: driver.driver(sportsCar); break;
            default: System.out.println("선택하신 차량이 없습니다."); break;
        }
    }
}

class Driver {
    String name;
    public Driver(String name){
        this.name=name;
    }
    public void driver(Vehicle vehicle){
        System.out.print(name+"의");
        vehicle.run();
    }
}

class Vehicle{
    public void run(){
        System.out.println("차량이 달립니다.");
    }
}

class Bus extends Vehicle{
    @Override
    public void run(){
        System.out.println("버스가 달립니다");
    }
}
class Taxi extends Vehicle{
    @Override
    public void run(){
        System.out.println("택시가 달립니다");
    }
}
class SportsCar extends Vehicle{
    @Override
    public void run(){
        System.out.println("스포츠카가 달립니다");
    }
}