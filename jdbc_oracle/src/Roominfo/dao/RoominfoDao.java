package Roominfo.dao;

import Roominfo.Common.COMMON;
import Roominfo.Vo.RoominfoVo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class RoominfoDao {
    Connection conn = null;
    Statement stmt = null; // create Statement 방식
    PreparedStatement psmt = null; // Prepared Statement 방식
    ResultSet rs = null; // database 부터 결과를 받는 변수
    Scanner sc = new Scanner(System.in);
    public RoominfoVo RoomInputFunc() throws ParseException {
        //초기값 설정
        RoominfoVo rvo = new RoominfoVo(11,"can3487@naver.com",null,null,0,0,0,0,null,null,null,null,0,null,null);
        //날짜 입력받기 위한 SimpleDateFormat 생성.
        // RoomOlum_Page 화면
        System.out.println("======================================================================");
        System.out.println("|                           RoomOlum_Page                            |");
        System.out.println("/-------------------\\                                               |");
        System.out.println("|                   |                                                |");
        System.out.println("|                   |                                                |");
        System.out.println("|       사  진       |                                                |");
        System.out.println("|                   |                                                |");
        System.out.println("|                   |                                                |");
        System.out.println("\\-------------------/                                               |");
        System.out.print("| url: ");
        rvo.setPhoto_url(sc.nextLine());
        System.out.println("|                                                                    |");
        while(true)
        {
            System.out.print("| 거래 방식(매매,전세,월세): ");
            rvo.setTrade_method(sc.nextLine());
            System.out.println("|                                                                    |");
            switch(rvo.getTrade_method()) {
                case "매매":
                    System.out.print("| 매매가(만원): ");
                    rvo.setsale_price(sc.nextInt());
                    sc.nextLine();
                    System.out.println("|                                                                    |");
                    break;
                case "전세":
                    System.out.print("| 전세금(만원): ");
                    rvo.setJeonsegeum(sc.nextInt());
                    sc.nextLine();
                    System.out.println("|                                                                    |");
                    break;
                case "월세":
                    System.out.print("| 보증금(만원): ");
                    rvo.setDeposit(sc.nextInt());
                    sc.nextLine();
                    System.out.println("|                                                                    |");
                    System.out.print("| 월세(만원): ");
                    rvo.setMonthly(sc.nextInt());
                    sc.nextLine();
                    System.out.println("|                                                                    |");
                    break;
                default:
                    System.out.print("다시 입력해주세요.");
                    continue;
            }
            break;
        }
        System.out.print("| 평수: ");
        rvo.setArea(sc.nextLine());
        System.out.println("|                                                                    |");
        System.out.print("| 사용 승인일(YYYY-MM-DD): ");
        rvo.setAccept_date(java.sql.Date.valueOf(sc.nextLine()));
        System.out.println("|                                                                    |");
        System.out.print("| 주소: ");
        rvo.setAddress(sc.nextLine());
        System.out.println("|                                                                    |");
        System.out.print("| 층수: ");
        rvo.setFloor1(sc.nextLine());
        System.out.println("|                                                                    |");
        System.out.print("| 집주인 전화번호(-빼고): ");
        rvo.setPhonenumber(sc.nextInt());
        sc.nextLine();
        System.out.println("|                                                                    |");
        System.out.print("| 등록일(YYYY-MM-DD): ");
        rvo.setRegit_date(java.sql.Date.valueOf(sc.nextLine()));
        System.out.println("|                                                                    |");
        System.out.print("| 비고(옵션): ");
        rvo.setRemark(sc.nextLine());
        System.out.println("|                                                                    |");
        System.out.println("======================================================================");

        return rvo;
    }

    public void RoomInputPrF(RoominfoVo rvo) {
        //날짜 출력을 위한 SimpleDateFormat 생성.(YYYY-MM-DD 형식 지정)
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("매물번호: " + rvo.getHouse_num() + " 유저ID: " + rvo.getUser_id() + " 사진URL: " + rvo.getPhoto_url() + " 거래 방식: " + rvo.getTrade_method());
        System.out.println(" 평수: " + rvo.getArea() + " 사용승인일: " + date.format(rvo.getAccept_date()) + "주소: " + rvo.getAddress() + " 층수: " + rvo.getAddress());
        System.out.println(" 집주인 전화번호: " + rvo.getPhonenumber() + " 등록일: " + date.format(rvo.getRegit_date()) + " 비고: " + rvo.getRemark());
    }

    public void RoomInsert(RoominfoVo rvo) {
        String query = "INSERT INTO RoomInfo VALUES(SEQ_ROOM.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            conn = COMMON.getConnection();
            psmt = conn.prepareStatement(query);
            psmt.setString(1, rvo.getUser_id());
            psmt.setString(2, rvo.getPhoto_url());
            psmt.setString(3, rvo.getTrade_method());
            psmt.setInt(4, rvo.getDeposit());
            psmt.setInt(5, rvo.getMonthly());
            psmt.setInt(6, rvo.getJeonsegeum());
            psmt.setInt(7, rvo.getsale_price());
            psmt.setString(8, rvo.getArea());
            psmt.setDate(9, rvo.getAccept_date());
            psmt.setString(10, rvo.getAddress());
            psmt.setString(11, rvo.getFloor1());
            psmt.setInt(12, rvo.getPhonenumber());
            psmt.setDate(13, rvo.getRegit_date());
            psmt.setString(14, rvo.getRemark());
            int rst = psmt.executeUpdate();
            System.out.print("INSERT 완료 /rst : " + rst);
        } catch (Exception e) {
            e.printStackTrace();
        }
        COMMON.close(psmt);
        COMMON.close(conn);
    }
}
