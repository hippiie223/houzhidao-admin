package com.hippie.houzhidaoadmin.controller;

import com.hippie.houzhidaoadmin.domain.Label;
import com.hippie.houzhidaoadmin.domain.LabelDTO;
import com.hippie.houzhidaoadmin.domain.QiNiu;
import com.hippie.houzhidaoadmin.domain.UserInfo;
import com.hippie.houzhidaoadmin.request.LoginRequestBody;
import com.hippie.houzhidaoadmin.respbody.RootRespBody;
import com.hippie.houzhidaoadmin.service.AdminService;
import com.hippie.houzhidaoadmin.service.UserService;
import com.hippie.houzhidaoadmin.util.CheckSumBuilder;
import com.hippie.houzhidaoadmin.util.TimeUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 39239
 * @Date 2019/5/6 13:49
 * @Package com.hippie.houzhidaoadmin.controller
 * @Description:
 */
@RestController
@Api("管理员接口")
public class AdminController {
    @Autowired
    private UserService userService;
    @Autowired
    private AdminService adminService;

    @PostMapping(path = "/login")
    @ApiOperation("管理员登录")
    public RootRespBody<String> login(@RequestBody LoginRequestBody requestBody){
        Subject subject = SecurityUtils.getSubject();
        try {
            UsernamePasswordToken token = new UsernamePasswordToken(requestBody.getUsername(), CheckSumBuilder.getMD5(requestBody.getPassword()));
            subject.login(token);

            UserInfo userInfo = (UserInfo)subject.getPrincipal();
            String newToken = userService.generateJwtToken(userInfo.getUserName());
//            response.setHeader("x-token", newToken);
            return RootRespBody.success(newToken);
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
            System.out.println(subject.getPrincipals().asList());
            UserInfo userInfo = (UserInfo) subject.getPrincipals().getPrimaryPrincipal();
            userService.deleteLoginInfo(userInfo.getUserName());
        }
//        try {
//            UsernamePasswordToken token = new UsernamePasswordToken(requestBody.getUsername(), CheckSumBuilder.getMD5(requestBody.getPassword()));
//            subject.logout(token);
//
//            UserInfo userInfo = (UserInfo)subject.getPrincipal();
//            String newToken = userService.generateJwtToken(userInfo.getUserName());
////            response.setHeader("x-token", newToken);
//            return RootRespBody.success(newToken);
//        } catch (AuthenticationException e){
//            return RootRespBody.failure(RootRespBody.Status.BAD_REQUEST,"密码错误");
//        } catch (Exception e){
//            return RootRespBody.failure(RootRespBody.Status.PERMISSION_DENIED_ERROR, e.toString());
//        }
        SecurityUtils.getSubject().logout();
         return RootRespBody.success();
    }

    @PostMapping(path = "/insert/label/1st")
    @ApiOperation("添加一级标签")
    public RootRespBody<String> insert1stLabel(@RequestParam String labelName, @RequestParam String userName){
        Label label = new Label();
        label.setAuthor(userName);
        label.setLabelClass(1);
        label.setOfLabelId(0);
        label.setCreateTime(TimeUtil.getCurrentTime());
        label.setLabelName(labelName);
        if(adminService.insertLabel(label)){
            return RootRespBody.success("新增成功");
        }else {
            return RootRespBody.failure(RootRespBody.Status.INSERT_RECORD_ERROR,"新增失败");
        }
    }

    @PostMapping(path = "/insert/label")
    @ApiOperation("添加二级标签")
    public RootRespBody<String> insertLabel(@RequestParam String labelName, @RequestParam Integer ofLabelId, @RequestParam String userName){
        Label label = new Label();
        label.setLabelName(labelName);
        label.setOfLabelId(ofLabelId);
        label.setAuthor(userName);
        label.setLabelClass(2);
        label.setCreateTime(TimeUtil.getCurrentTime());
        if(adminService.insertLabel(label)){
            return RootRespBody.success("新增成功");
        }else {
            return RootRespBody.failure(RootRespBody.Status.INSERT_RECORD_ERROR,"新增失败");
        }
    }

    @GetMapping(path = "/admin/token")
    public RootRespBody<QiNiu> getToken(){
        return RootRespBody.success(adminService.getToken());
    }

    @DeleteMapping(path = "/delete/label")
    @ApiOperation("删除标签")
    public RootRespBody<String> deleteLabel(@RequestParam Integer labelId){
        if(adminService.deleteLabel(labelId)){
            return RootRespBody.success("删除成功");
        }else {
            return RootRespBody.failure(RootRespBody.Status.BAD_REQUEST,"删除失败");
        }
    }

    @GetMapping(path = "/get/first/label")
    public RootRespBody<List<LabelDTO>> getFirstLabel(){
        return RootRespBody.success(adminService.getFirstLabel());
    }

    @GetMapping(path = "/get/second/label")
    public RootRespBody<List<LabelDTO>> getSecondLabel(@RequestParam Integer ofLabelId){
        return RootRespBody.success(adminService.getSecondLabel(ofLabelId));

    }
}
