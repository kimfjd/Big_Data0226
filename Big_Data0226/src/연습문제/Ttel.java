package 연습문제;

import java.util.Scanner;

public class Ttel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("통화 횟수를 입력해 주세요.");
        int C = sc.nextInt();
        for(int j=0; j<C;j++){
            int rat = sc.nextInt();
            for(int i=0; i<rat;i++){

                if(Ysik(rat)>Msik(rat)){
                    System.out.print("M");
                    System.out.println(Msik(rat));
                }
                else if (Ysik(rat)==Msik(rat)) {
                    System.out.print("Y");
                    System.out.print("M");
                }
                else {
                    System.out.print("Y");
                    System.out.print("M");
                }
            }
        }


    }

    static int Ysik(int rat) {
        int R = 0;
        for(int i=0;i<rat;i++){
            if (rat % 30==0) {
                R=+10;
            }
        }

        return R;
    }
    static int Msik(int rat){
        int R1=0;
        for(int i=0;i<rat;i++){
            if (rat%60==0){
                R1=+15;
            }
        }
        return R1;
    }
}
