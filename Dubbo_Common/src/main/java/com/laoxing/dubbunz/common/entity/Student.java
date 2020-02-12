package com.laoxing.dubbunz.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: Dubbo_NZ1906
 * @description:
 * @author: Feri
 * @create: 2020-02-11 11:44
 */
@Data
public class Student implements Serializable {
    private String no;
    private String name;
    private String address;
}
