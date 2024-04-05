package 영화표예매하기;

import java.util.Scanner;

// 예매하기 먼져 좌석 상태를 보여주고 예약을 받음, 예약을 하게 되면 예약된 상태를 보여 줌
// 종료하기 시 총 판매금액 구하기
public class MovieTicket {
    int[] seat=new int[10];
    int ticketPrice;
    MovieTicket(int price){//객체 생성시 생성자를 통해서 티켓 가격을 정함
        ticketPrice = price;
    }
    void printSeat(){//현재 좌석 목록 보여주기
        for(int i=0; i<seat.length;i++){
            if(seat[i]==0) System.out.print("[ ]");
            else System.out.print("[V]");
        }
        System.out.println();// 줄바꿈
    }
    void selectSeat(){//좌석 예매 하기
        printSeat();
        Scanner sc=new Scanner(System.in);
        System.out.print("좌석 번호를 찍어주세요");
        int seatnum=sc.nextInt();
        if(seat[seatnum-1]==0){// 예약 가능함을 의미
            seat[seatnum-1]=1; //좌석 선택
            printSeat();
        }
        else System.out.println("이미 예약된 좌석입니다.");
    }
    // 종료 시  좌석의 판매에 대한 총 지불액 구하기
    int totalAmount(){
        int cnt=0;
        for(int e:seat) if(e==01) cnt++;
        return cnt*ticketPrice;
    }
}
