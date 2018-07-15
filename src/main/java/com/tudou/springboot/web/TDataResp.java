package com.tudou.springboot.web;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TDataResp<T> implements TResponse {

    private int status;

    private T data;

    private String msg;

    public TDataResp()  {

    }

    public TDataResp(T t, int status, String msg) {
        this.data = t;
        this.status = status;
        this.msg = msg;
    }

    @SuppressWarnings("unchecked")
    public static<T> TDataResp build(T data) {
        return new TDataResp(data, TResponse.SUCCESS, null);
    }

    @SuppressWarnings("unchecked")
    public static<T> TDataResp buildError(T data, String msg) {
        return new TDataResp(data, TResponse.ERROR, msg);
    }
}
