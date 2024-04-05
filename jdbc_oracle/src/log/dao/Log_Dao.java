package log.dao;



import log.Common.LogCommon;
import log.VO.Log_Vo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Log_Dao {
    Connection conn = null;
    Statement stmt = null; // create Statement 방식
    PreparedStatement pStmt = null; // Prepared Statment 방식
    ResultSet rs = null; // database 로 부터 결과를 받는 변수
    Scanner sc = new Scanner(System.in);

    String ID = null;

    public List<Log_Vo> logsel() {
        List<Log_Vo> list = new ArrayList<>();
        try {
            conn = LogCommon.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM INFO";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String user_mail = rs.getString("USER_MAIL");
                String password = rs.getString("PASSWORD");
                String name = rs.getString("NAME");
                int first_id_cardnum = rs.getInt("FIRST_ID_CARDNUM");
                int phone_number = rs.getInt("PHONE_NUMBER");
                String address = rs.getString("ADDRESS");
                int gender = rs.getInt("GENDER");
                String nickname = rs.getString("NICKNAME");
                list.add(new Log_Vo(user_mail, password, name, first_id_cardnum, phone_number, address, gender, nickname));
            }
            LogCommon.close(rs);
            LogCommon.close(pStmt);
            LogCommon.close(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public void login() {
        while (true) {
            System.out.println("아이디를 입력하세요");
            ID = sc.next();
            System.out.println("비밀번호를 입력하세요");
            String password = sc.next();
            String sql = "SELECT PASSWORD FROM INFO WHERE USER_MAIL= ? ";
            String pwd;
            try {
                conn = LogCommon.getConnection();
                pStmt = conn.prepareStatement(sql);
                pStmt.setString(1, ID);
                rs = pStmt.executeQuery(); // rs 객체에 쿼리 결과를 할당

                if (rs.next()) {
                    pwd = rs.getString("PASSWORD");
                    if (pwd.equals(password)) {
                        System.out.println("로그인 완료");
                        break;
                    } else {
                        System.out.println("비밀번호가 틀렸습니다.");
                    }
                } else {
                    System.out.println("아이디를 잘못 입력했습니다.");
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                LogCommon.close(rs);
                LogCommon.close(pStmt);
                LogCommon.close(conn);
            }
        }
    }

    public void logInsert() {
        System.out.println("아이디를 입력 하세요");
        String user_mail = sc.next();
        System.out.println("비밀번호를 입력하세요");
        String password = sc.next();
        System.out.println("이름을 입력해주세요");
        String name = sc.next();
        System.out.println("주민등록번호 앞자리");
        int first_id_cardnum = sc.nextInt();
        System.out.println("전화번호 입력해주세요");
        int phone_number = sc.nextInt();
        sc.nextLine();
        System.out.println("주소를 입력해 주세요");
        String address = sc.nextLine();
        System.out.println("성별을 입력해주세요 남자[1] 여자면[2]");
        int gender = sc.nextInt();
        sc.nextLine();
        System.out.println("닉네임을 입력해주세요");
        String nickname = sc.next();
        String sql = "INSERT INTO INFO(USER_MAIL, PASSWORD, NAME, FIRST_ID_CARDNUM, PHONE_NUMBER, ADDRESS, GENDER, NICKNAME) VALUES (?,?,?,?,?,?,?,?)";

        try {
            conn = LogCommon.getConnection();
            pStmt = conn.prepareStatement(sql);
            pStmt.setString(1, user_mail);
            pStmt.setString(2, password);
            pStmt.setString(3, name);
            pStmt.setInt(4, first_id_cardnum);
            pStmt.setInt(5, phone_number);
            pStmt.setString(6, address);
            pStmt.setInt(7, gender);
            pStmt.setString(8, nickname);
            int rst = pStmt.executeUpdate();
            System.out.println("rst : " + rst);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LogCommon.close(pStmt);
        LogCommon.close(conn);

        sql= "INSERT INTO MY_PAGE(USER_MAIL, LOVE_ROOM) VALUES(?,0)";
        try{
            conn = LogCommon.getConnection();
            pStmt = conn.prepareStatement(sql);
            pStmt.setString(1, user_mail);
            int rst = pStmt.executeUpdate();
            System.out.println("rst : " + rst);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            LogCommon.close(pStmt);
            LogCommon.close(conn);
        }
    }
        public void logSelectPrn (List < Log_Vo > list) {
            for (Log_Vo e : list) {
                System.out.print(e.getUser_mail() + " ");
                System.out.print(e.getPassword() + " ");
                System.out.print(e.getName() + " ");
                System.out.print(e.getFirst_id_cardnum() + " ");
                System.out.print(e.getPhone_number() + " ");
                System.out.print(e.getAddress() + " ");
                System.out.print(e.getGender() + " ");
                System.out.print(e.getNickname() + " ");
                System.out.println();
            }
        }
}

