package 스위치문기본;

import java.util.Scanner;

// 스위치문: if과 마찬가지로 제어문이다.
// if문은 조건식이 사용될 수 있지만 스위치문은 조건식을 사용할 수 없고 변수값으로 조건 분기를 경정함
// if문에 비해서 가독성이 좋다
public class SwitchEx1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        while(true){
            System.out.print("성별을 입력하세요 : (M/m, F/f)");
            char cs= sc.next().charAt(0);
            switch(cs) {
                case'M':
                case'm':
                    System.out.println("남성입니다");
                    break;
                case 'F':
                case 'f':
                    System.out.println("여성입니다");
                    break;
                default:
                    System.out.println("성별을 잘못 입력 하셨습니다");
                    continue;
        }
                break;
        }
    }
}
