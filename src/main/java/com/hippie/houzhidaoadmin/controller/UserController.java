package com.hippie.houzhidaoadmin.controller;

import com.hippie.houzhidaoadmin.respbody.RootRespBody;
import com.hippie.houzhidaoadmin.respbody.UserRespBody;
import com.hippie.houzhidaoadmin.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 39239
 * @Date 2019/5/6 13:49
 * @Package com.hippie.houzhidaoadmin.controller
 * @Description:
 */
@RestController
@RequestMapping(path = "/user")
@Api("用户管理接口")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/list")
    public RootRespBody<List<UserRespBody>> getList(@RequestParam int pageNum, @RequestParam int pageSize){
        return RootRespBody.success(userService.getUserList(pageNum, pageSize));
    }
}
