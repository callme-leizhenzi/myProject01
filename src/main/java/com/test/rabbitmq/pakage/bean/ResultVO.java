package com.test.rabbitmq.pakage.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xulei on 2019/6/11.
 */
public class ResultVO implements Serializable{

    private static final long serialVersionUID = 1L;
    private int code;

    private String reslut;

    private String msg;

    private Date time;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getReslut() {
        return reslut;
    }

    public void setReslut(String reslut) {
        this.reslut = reslut;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
