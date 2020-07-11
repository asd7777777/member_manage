package com.feng.mm.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class SearchDto implements Serializable {
    private String keyword;
    private String createDate;
}
