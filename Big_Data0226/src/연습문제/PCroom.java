package 연습문제;

import java.util.Scanner;

public class PCroom {
    public static void main(String[] args) {
        String[] room=new String[100];
        Scanner sc=new Scanner(System.in);
        int count = 0;
        for(int i=0; i<= room.length;i++){
            System.out.println("예약좌석을 말해주세요");
            int aa= sc.nextInt();
            if(room[aa]==null) {
                room[aa]="예약";
                System.out.println("예약이 완료 되엇습니다");
            }
            else{
                count++;
                System.out.println("이미 자리가 있습니다");
                System.out.println("예약이 빠꾸당한 수: "+count);
            }
        }
    }
}
