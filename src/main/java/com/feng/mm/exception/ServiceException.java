package com.feng.mm.exception;

import com.feng.mm.utils.Status;

public class ServiceException extends Exception{
    private int status;
    private String msg;

    public ServiceException(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public ServiceException(Status status) {
        this.status = status.getStatus();
        this.msg = status.getMsg();
    }
}
