package 연습문제정답;

import java.util.Scanner;

public class PCroomEX {
    public static void main(String[] args) {
        //백대의 pc만들기
        int[] pcRoom=new int[100]; //heap영역에 공간이 확보되고 0으로 자동 초기화
        Scanner sc=new Scanner(System.in);
        int cnt=0;
        int seatNum; //고객이 예약하는 좌석
        int number = sc.nextInt(); //예약 손님수
        for(int i =0; i<number ;i++){
            seatNum=sc.nextInt();//예약 좌석 입력 받기(1~100)
            if(pcRoom[seatNum-1]==1) cnt++; // 값이 1이면 예약된 자리 이므로 거절 횟수 누적
            else pcRoom[seatNum-1]=1; //좌석 예약을 의미
        }
        System.out.println(cnt);
    }
}


