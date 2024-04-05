package 자동차프로젝트;

import java.util.Scanner;

public class SCar extends Car{
    SCar() {
        fey = 12;
        seat = 4;
        speed = 200;
        tank = 45;
        name="소나타";
    }
public void setSCar(){
    Scanner sc=new Scanner(System.in);
    System.out.println("[1]부산 [2]강릉 [3] 대전 [4] 광주");
    ae=sc.nextInt();
    final int[] ma={0,400,200,150,300};
    System.out.println("이동할 승객수를 입력해 주세요");
    people=sc.nextInt();
    System.out.println("부가 기능을 선택 하실 건가요? [1]yes[2]no");
    add=sc.nextInt();

    if (add == 1) {
        seat=seat+1;
    }

        if(people%seat==0){
            totalpeople = (people / seat);
            totaldistance = (distance * totalpeople);
        } else if (people%seat>0) {
            totalpeople = (people / seat)+1;
            totaldistance = (distance * totalpeople);
        }



}
public void SCarinfo(){
        System.out.println("===="+name+"=====");
        System.out.println("총 비용은"+(totaldistance/fey)*2000+"원");
        System.out.println("총 주유횟수는 "+(totaldistance/(fey*tank))+1);
        System.out.println("총 시간은: "+(totaldistance/speed)+"시"+(totaldistance%speed)+"분");
        System.out.println(seat);
        System.out.println(totaldistance);
}
    }

