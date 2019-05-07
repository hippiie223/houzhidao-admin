package com.hippie.houzhidaoadmin.controller;

import com.hippie.houzhidaoadmin.domain.UserInfo;
import com.hippie.houzhidaoadmin.respbody.RootRespBody;
import com.hippie.houzhidaoadmin.service.UserService;
import com.hippie.houzhidaoadmin.util.CheckSumBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 39239
 * @Date 2019/5/6 13:49
 * @Package com.hippie.houzhidaoadmin.controller
 * @Description:
 */
@RestController
@RequestMapping(path = "/admin")
@Api("管理员接口")
public class AdminController {
    @Autowired
    private UserService userService;

    @PostMapping(path = "/login")
    @ApiOperation("管理员登录")
    public RootRespBody<String> login(@RequestParam String userName, @RequestParam String password, HttpServletRequest request, HttpServletResponse response){
        Subject subject = SecurityUtils.getSubject();
        try {
            UsernamePasswordToken token = new UsernamePasswordToken(userName, CheckSumBuilder.getMD5(password));
            subject.login(token);

            UserInfo userInfo = (UserInfo)subject.getPrincipal();
            String newToken = userService.generateJwtToken(userInfo.getUserName());
            response.setHeader("x-auth-token", newToken);
            return RootRespBody.success();
        } catch (AuthenticationException e){
            return RootRespBody.failure(RootRespBody.Status.BAD_REQUEST,"密码错误");
        } catch (Exception e){
            return RootRespBody.failure(RootRespBody.Status.PERMISSION_DENIED_ERROR, e.toString());
        }
    }

    @PostMapping(path = "/logout")
    @ApiOperation("登出")
    public RootRespBody<String> logout(){
        Subject subject = SecurityUtils.getSubject();
        if(subject.getPrincipals() != null){
            UserInfo userInfo = (UserInfo) subject.getPrincipals().getPrimaryPrincipal();
            userService.deleteLoginInfo(userInfo.getUserName());
        }
        SecurityUtils.getSubject().logout();
         return RootRespBody.success();
    }
}
