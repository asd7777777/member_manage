package com.feng.mm.domain.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MemberDto {
    private Integer mid;
    private String mname;
    private String sex;
    private Integer phone;
    private String email;
    private String address;
    private Integer points;
    private Date createTime;
    private String lname;
    private Integer status;

}
