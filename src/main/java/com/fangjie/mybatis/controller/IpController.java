package com.fangjie.mybatis.controller;

import com.fangjie.mybatis.common.response.BaseResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description: ValidController
 * date: 2020/11/24 17:09
 * author: fangjie24
 */
@Controller
@RequestMapping("/ip")
public class IpController extends BaseController{

    @RequestMapping("/get")
    @ResponseBody
    public BaseResponse index() {
        BaseResponse<String> result = new BaseResponse<>();
        result.setCode("0");
        result.setData("SUCCESS");
        String ip = this.getIpFromRequest();
        System.out.println(ip);
        return result;
    }
}
