package com.zab.quartzdemo.common;

/**
 * @author zab
 * @date 2019/11/8 8:31
 */
public class Message<T> extends BaseObject {

    private static final long serialVersionUID = -5068272108270221337L;

    private boolean success = false;
    private int code = 0;

    private T data;

    private String msg = "";


    public boolean getSuccess() {
        return success;
    }


    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setCode(String code) {
        this.code = Integer.valueOf(code);
    }

    public T getData() {
        return data;
    }


    public void setData(T data) {
        this.data = data;
    }


    public String getMsg() {
        return msg;
    }


    public void setMsg(String msg) {
        this.msg = msg;
    }

}
