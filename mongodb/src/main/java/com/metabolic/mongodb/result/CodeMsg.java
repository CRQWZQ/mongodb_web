package com.metabolic.mongodb.result;

import lombok.Data;

/**
 * Created by Administrator on 2018/08/25.
 */
@Data
public class CodeMsg {
    private int code;
    private String msg;

    //通用异常
    public static CodeMsg SUCEESS = new CodeMsg(0, "success");
    public static CodeMsg SERVER_ERROR = new CodeMsg(100, "服务端异常！");
    public static CodeMsg BIND_ERROR = new CodeMsg(101, "参数校验异常：%s!");
    public static CodeMsg REQUEST_ILLEGAL = new CodeMsg(102, "请求非法！");
    public static CodeMsg ACCESS_LIMIT_REACHED = new CodeMsg(103, "访问太频繁！");


    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public CodeMsg fillArgs(Object... objects) {
        int code = this.code;
        String message = String.format(this.msg, objects);
        return new CodeMsg(code, message);
    }

    @Override
    public String toString() {
        return "CodeMsg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
