package com.feng.mm.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Member implements Serializable {
    private Integer mid;
    private String mname;
    private String sex;
    private Integer phone;
    private String email;
    private String address;
    private Integer points;
    private Date createTime;
    private Integer lid;
    private Integer status;
}
