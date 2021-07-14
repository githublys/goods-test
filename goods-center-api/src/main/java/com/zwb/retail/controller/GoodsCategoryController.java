package com.zwb.retail.controller;

import com.zwb.retail.data.ResponseCode;
import com.zwb.retail.data.ResponseVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyong
 * @version 1.0.0
 * @ClassName GoodsCategoryController.java
 * @Description TODO
 * @createTime 2021年05月28日 16:54:00
 */
@RestController
@Api(tags = "商品分类控制器")
public class GoodsCategoryController {
    @GetMapping("/goods/category/search")
    @ApiOperation(value = "/goods/category/search", httpMethod = "POST", response = ResponseVO.class, notes = "查询商品分类")
    @ResponseBody
    public ResponseVO search() {
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        String

        return new  ResponseVO<>(ResponseCode.OK,user);
    }
}
