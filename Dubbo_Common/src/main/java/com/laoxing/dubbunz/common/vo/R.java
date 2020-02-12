package com.laoxing.dubbunz.common.vo;

import lombok.Data;

/**
 * @program: Dubbo_NZ1906
 * @description:  统一结果返回
 * @author: Feri
 * @create: 2020-02-11 11:46
 */
@Data
public class R {
    private int code;
    private String msg;
    private Object data;

    public static R setR(boolean issuccess,String msg,Object obj){
        R r=new R();
        if(issuccess){
            r.setCode(0);
        }else {
            r.setCode(1);
        }
        r.setMsg(msg);
        r.setData(obj);
        return r;
    }
    public static R ok(Object obj){
        return setR(true,"OK",obj);
    }
    public static R fail(){
        return setR(true,"ERROR",null);
    }
}
