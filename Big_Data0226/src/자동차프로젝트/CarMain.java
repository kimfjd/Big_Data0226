package 자동차프로젝트;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("어떤 차로 이동 하세요? [1]스포츠카 [2] 승용차 [3] 버스");
       int carcar=sc.nextInt();

       if(carcar==1){
           SportsCar car=new SportsCar();
           car.setSportsCar();
           car.SportsCarInfo();
       }
       else if (carcar==2) {
           SCar car=new SCar();
           car.setSCar();
           car.SCarinfo();
       }
       else {
           BUS car=new BUS();
           car.setBUS();
           car.BUSInfo();
       }
    }
}
