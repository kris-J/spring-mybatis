package com.fangjie.mybatis.controller;

import com.fangjie.mybatis.bean.ValidParam;
import com.fangjie.mybatis.common.request.BaseReq;
import com.fangjie.mybatis.common.response.BaseResponse;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description: ValidController
 * date: 2020/11/24 17:09
 * author: fangjie24
 */
@Controller
@RequestMapping("/valid")
public class ValidController {

    @RequestMapping("/index")
    @ResponseBody
    public BaseResponse index(@RequestBody @Validated BaseReq<ValidParam> req) {
        BaseResponse<String> result = new BaseResponse<>();
        result.setCode("0");
        result.setData("SUCCESS");
        return result;
    }
}
