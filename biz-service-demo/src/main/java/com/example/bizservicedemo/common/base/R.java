package com.example.bizservicedemo.common.base;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class R {
    private Integer code;
    private String message;
    private Boolean success;
    private Map<String, Object> data;

    private R() {}

    public static R ok() {
        R r = new R();
        r.setCode(2000);
        r.setSuccess(true);
        r.setData(new HashMap<>());
        r.setMessage("成功");
        return r;
    }

    public static R error() {
        R r = new R();
        r.setCode(5000);
        r.setSuccess(false);
        r.setData(new HashMap<>());
        r.setMessage("失败");
        return r;
    }

    public R code(Integer code) {
        this.setCode(code);
        return this;
    }

    public R message(String message) {
        this.setMessage(message);
        return this;
    }

    public R success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

    public R data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public R data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }
}
