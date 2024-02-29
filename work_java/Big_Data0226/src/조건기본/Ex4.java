package 조건기본;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("시간을 설정해 주세요");
        int hour=sc.nextInt();
        System.out.println("분을 설정해 주세요");
        int min=sc.nextInt();
        int calc=(hour*60)+min; //계산의 편의를 위해서 모두 분으로 환산

        if(calc < 45 ) {
            calc=(24*60)+min;
        }
        calc-=45;
        System.out.println((calc/60)+":"+(calc%60));

    }
}
