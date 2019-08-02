package com.army.api.response;

public class Response {

    private static final int SUCCESS = 1;
    private static final int FAILURE = -1;

    private int code;
    private String msg;
    private Object obj;


    private Response(int code, String msg, Object obj) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }

    public static Response createSuccess() {
        return new Response(SUCCESS, "", "");
    }

    public static Response createSuccess(Object obj) {
        return new Response(SUCCESS, "", obj);
    }

    public static Response createFailure(String msg) {
        return new Response(FAILURE, msg, "");
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

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
