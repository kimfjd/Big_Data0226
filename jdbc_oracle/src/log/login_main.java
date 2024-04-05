package log;

import log.VO.Log_Vo;
import log.dao.Log_Dao;

import java.util.List;
import java.util.Scanner;

public class login_main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Log_Dao dao=new Log_Dao();
        System.out.println("[1] 로그인 창 [2] 회원가입 [3] (임시) 회원 정보 조회 [4] 종료");
        int log=sc.nextInt();
        switch (log){
            case 1 :
                dao.login();
                    break;
            case 2 :
                dao.logInsert();
                break;
            case 3:
                List<Log_Vo> list=dao.logsel();
                dao.logSelectPrn(list);
            case 4:
                break;
            default:
                System.out.println("번호를 잘못 입력함");
                break;
        }
    }
}
