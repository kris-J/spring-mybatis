package com.fangjie.mybatis.bean;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * description: ValidParam
 * date: 2020/11/24 17:10
 * author: fangjie24
 */
public class ValidParam {

    @NotEmpty(message = "p1不能为空")
    private String p1;

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    @Override
    public String toString() {
        return "ValidParam{" +
                "p1='" + p1 + '\'' +
                '}';
    }
}
