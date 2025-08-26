package com.example.demo.pojo;

public class Result<T> {
    private int code;
    private String msg;
    private T data;


    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    // success
    public static <T> Result<T> success(T data) {
        return new Result<>(200, "success", data);
    }

    // error
    public Result<T> error(int code, String msg) {
        return new Result<>(code, msg, null);
    }
}
