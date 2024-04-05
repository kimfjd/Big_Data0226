package Roominfo;

import Roominfo.Vo.RoominfoVo;
import Roominfo.dao.RoominfoDao;

import java.text.ParseException;
import java.util.Scanner;

public class RoominifMain {
    public void RoominfoMainfunc() throws ParseException {
        Scanner sc = new Scanner(System.in);
        RoominfoDao dao = new RoominfoDao();
        //방 데이터 입력 input함수 rvo 객체에 저장
        RoominfoVo rvo = dao.RoomInputFunc();
        while(true){
            System.out.print("[0]종료하기 [1]입력된 데이터 확인하기 [2]데이터 DB에 저장 : ");
            int sel = sc.nextInt();
            switch(sel) {
                case 0:
                    System.out.println("종료합니다.");
                    break;
                case 1:
                    //입력된 방 데이터 확인 함수 rvo 객체 출력
                    dao.RoomInputPrF(rvo);
                    break;
                case 2:
                    //데이터베이스에 Insert하는 함수 rvo객체 INSERT
                    dao.RoomInsert(rvo);
                    break;
                default:
                    System.out.println("잘못 입력했습니다.");
            }
            if(sel == 0) break;
        }
    }

}


