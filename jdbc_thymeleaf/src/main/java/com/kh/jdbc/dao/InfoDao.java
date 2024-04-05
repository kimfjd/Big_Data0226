package com.kh.jdbc.dao;

import com.kh.jdbc.common.Common;
import com.kh.jdbc.vo.InfoVo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InfoDao {
    Connection conn = null;
    PreparedStatement pStmt = null;
    ResultSet rs = null;
    Statement stmt = null;

    public List<InfoVo> infoSelect() {
        List<InfoVo> list = new ArrayList<>();
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String query = "SELECT * FROM INFO";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                String user_mail = rs.getString("USER_MAIL");
                String password = rs.getString("PASSWORD");
                String name = rs.getString("NAME");
                int first_id_cardnum = rs.getInt("FIRST_ID_CARDNUM");
                int phone_number = rs.getInt("PHONE_NUMBER");
                String address = rs.getString("ADDRESS");
                int gender = rs.getInt("GENDER");
                String nickname = rs.getString("NICKNAME");

                InfoVo infoVo = new InfoVo(user_mail, password, name, first_id_cardnum, phone_number, address, gender, nickname);
                list.add(infoVo);
            }
            Common.close(rs);
            Common.close(stmt);
            Common.close(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}