package com.feng.mm.utils;

public enum Status {
    SUCCESS(20000,"成功"),
    SYS_ERROR(40000,"系统繁忙"),
    DAO_ERROR(40001,"数据层错误"),
    SERVICE_ERROR(40002,"业务层错误");
    int status;
    String msg;

    Status(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
