package com.kh.jdbc.dao;



import com.kh.jdbc.common.Common;
import com.kh.jdbc.vo.AdlogVo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class AdlogDao {
    Connection conn = null;

    PreparedStatement pStmt = null;
    ResultSet rs = null;
    Statement stmt = null;

//    public boolean login() {
//        String Adpwd = null;
//        try {
//            conn = Common.getConnection();
//            String sql = "SELECT ADM_PW FROM ADMIN_INFO WHERE ADM_ID = ?";
//            pStmt = conn.prepareStatement(sql);
//            pStmt.setString(1, ID);
//            rs = pStmt.executeQuery();
//
//            if (rs.next()) {
//                Adpwd = rs.getString("ADM_PW");
//                if (Adpwd == password) {
//                     // 로그인 성공
//                } else {
//
//                }
//            }else {
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        } finally {
//            Common.close(rs);
//            Common.close(pStmt);
//            Common.close(conn);
//        }
//
//    }

    public List<AdlogVo> adminSelect() {
        List<AdlogVo> list = new ArrayList<>();
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String query = "SELECT * FROM ADMIN_INFO";
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                String adm_id = rs.getString("ADM_ID");
                String adm_pw = rs.getString("ADM_PW");

                AdlogVo vo = new AdlogVo(adm_id, adm_pw);
                list.add(vo); // Vo 객체를 리스트에 추가
            }
            Common.close(rs);
            Common.close(stmt);
            Common.close(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void adInsert(AdlogVo vo) {
        String sql = "INSERT INTO ADMIN_INFO(ADM_ID,ADM_PW) VALUES (?,?)";
        try {
            conn = Common.getConnection();
            pStmt = conn.prepareStatement(sql);
            pStmt.setString(1, vo.getADM_ID());
            pStmt.setString(2, vo.getADM_PW());

            // SQL문 실행
            pStmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 자원 해제
            Common.close(pStmt);
            Common.close(conn);
        }
    }

    public void addelete(AdlogVo vo) {
        String sql = "DELETE FROM ADMIN_INFO WHERE ADM_ID=?";
        try {
            conn = Common.getConnection();
            pStmt = conn.prepareStatement(sql);
            pStmt.setString(1, vo.getADM_ID());
            int rst = pStmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            Common.close(pStmt);
            Common.close(conn);
        }
    }
}