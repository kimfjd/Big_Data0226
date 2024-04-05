package 연습문제;

import java.util.Scanner;

public class MicroWave {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("필요한 시간 입력: ");
        int T=sc.nextInt();
        if (T%10!=0){
            System.out.println("-1");
            return;
        } else if (T/10>1) {
            System.out.print("A"+(T/300)+"번 ");
            System.out.print("B"+((T%300)/60)+"번 ");
            System.out.print("C"+((T%300)%60)/10+"번 ");
        }
    }
}
