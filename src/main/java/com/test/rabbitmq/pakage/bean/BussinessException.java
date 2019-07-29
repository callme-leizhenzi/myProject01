package com.test.rabbitmq.pakage.bean;

/**
 * Created by xulei on 2019/6/11.
 */
public class BussinessException extends Exception{
    private static final long serialVersionUID = 1L;

    private int code;
    private String msg;

    public BussinessException(String msg) {
        super();
        this.msg = msg;
    }

    public BussinessException(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
