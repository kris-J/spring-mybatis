package com.fangjie.mybatis.common.request;

import javax.validation.Valid;

/**
 * description: BaseReq
 * date: 2020/11/24 17:07
 * author: fangjie24
 */
public class BaseReq<T> {

    private BaseCommons commons;

    @Valid
    private T datas;

    public BaseCommons getCommons() {
        return commons;
    }

    public void setCommons(BaseCommons commons) {
        this.commons = commons;
    }

    public T getDatas() {
        return datas;
    }

    public void setDatas(T datas) {
        this.datas = datas;
    }

    @Override
    public String toString() {
        return "BaseReq{" +
                "commons=" + commons +
                ", datas=" + datas +
                '}';
    }
}
