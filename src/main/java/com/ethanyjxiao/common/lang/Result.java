package com.ethanyjxiao.common.lang;

import com.baomidou.mybatisplus.extension.api.R;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Xiao Yijia
 * @create 2021/2/17 1:37
 */

@Data
public class Result implements Serializable {

    private int code;
    private String message;
    private Object data;

    public static Result success(Object data) {
        return success(200, "操作成功", data);
    }

    public static Result success(int code, String message, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setData(data);
        result.setMessage(message);
        return result;
    }

    public static Result fail(String message) {
        return fail(400, message, null);
    }

    public static Result fail(String message, Object data) {
        return fail(400, message, data);
    }

    public static Result fail(int code, String message, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setData(data);
        result.setMessage(message);
        return result;
    }

}
