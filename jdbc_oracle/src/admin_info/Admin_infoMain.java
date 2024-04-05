package admin_info;

import Roominfo.Vo.RoominfoVo;
import admin_info.dao.Admin_infoDao;
import admin_info.vo.Admin_infoVo;
import log.VO.Log_Vo;
import log.dao.Log_Dao;

import java.util.List;
import java.util.Scanner;

public class Admin_infoMain {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        Admin_infoDao dao=new Admin_infoDao();
        Log_Dao dao1=new Log_Dao();
           List<String> aa =dao.Adminlogin();
            System.out.println("접속할 페이지 [1] 관리자 정보 [2] 회원정보 [3] 방정보 [4] 종료");
            int mana=sc.nextInt();
            switch (mana){
                case 1:
                    System.out.println("[1] 관리자 조회 [2]관리자 추가 [3] 관리자 삭제 [4] 종료");
                    int ger=sc.nextInt();
                    if (ger==1){
                        List<Admin_infoVo> list =dao.admin_infoSelect();
                        dao.AdminSelectPrn(list);
                        break;
                    }
                    else if(ger==2){
                        dao.AdminInsert();
                        break;
                    }
                    else if(ger==3){
                        dao.AdminDelete();
                        break;
                    }
                    else if(ger==4){
                        break;
                    }
                    else {
                        System.out.println("번호를 잘못 입력 하였습니다.");
                    }
                case 2:
                    System.out.println("[1] 회원 정보 조회 [2] 회원 정보 삭제 [3] 종료");
                    int mem=sc.nextInt();
                    if(mem==1){
                        List<Log_Vo> list=dao1.logsel();
                        dao1.logSelectPrn(list);
                        break;
                    }
                    else if(mem==2){
                        dao.LogDelete();
                        break;
                    }
                    else if (mem==3) {
                        break;
                    }
                    else {
                        System.out.println("번호를 잘못 입력 하였습니다.");
                    }
                case 3:
                    System.out.println("[1] 방 조회 [2] 방 정보 수정 [3] 방 삭제 [3] 종료");
                    int ro = sc.nextInt();
                    if(ro==1){
                        List<RoominfoVo> list=dao.RoomSelect();
                        dao.RoomSelcetPrn(list);
                        break;
                    } else if(ro==2){
                        dao.RoomUpdate();
                        break;
                    } else if (ro==3) {
                        dao.RoomDelete();
                        break;
                    }
            }
    }
}
