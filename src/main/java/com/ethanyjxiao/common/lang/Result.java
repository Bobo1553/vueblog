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

    private String code;
    private String message;
    private Object data;

    public static Result success(Object data) {
        Result result = new Result();
        result.setCode("0");
        result.setData(data);
        result.setMessage("操作成功！");
        return result;
    }

    public static Result success(String message, Object data) {
        Result result = new Result();
        result.setCode("0");
        result.setData(data);
        result.setMessage(message);
        return result;
    }

    public static Result fail(String message) {
        Result result = new Result();
        result.setCode("-1");
        result.setData(null);
        result.setMessage(message);
        return result;
    }

    public static Result fail(String message, Object data) {
        Result result = new Result();
        result.setCode("-1");
        result.setData(data);
        result.setMessage(message);
        return result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
