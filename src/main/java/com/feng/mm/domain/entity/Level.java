package com.feng.mm.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Level implements Serializable {
    private Integer lid;
    private String lname;
    private Integer num;
}
