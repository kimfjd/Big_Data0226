package com.kh.jdbc.vo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InfoVo {
    private String user_mail;
    private String password;
    private String name;
    private int first_id_cardnum;
    private int phone_number;
    private String address;
    private int gender;
    private String nickname;
}
