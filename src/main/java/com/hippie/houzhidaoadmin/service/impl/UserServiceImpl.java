package com.hippie.houzhidaoadmin.service.impl;

import com.hippie.houzhidaoadmin.domain.UserInfo;
import com.hippie.houzhidaoadmin.domain.example.UserInfoExample;
import com.hippie.houzhidaoadmin.mapper.ExtMapper;
import com.hippie.houzhidaoadmin.mapper.UserInfoMapper;
import com.hippie.houzhidaoadmin.mapper.UserRoleMapper;
import com.hippie.houzhidaoadmin.service.UserService;
import com.hippie.houzhidaoadmin.util.JwtUtils;
import com.hippie.houzhidaoadmin.util.MathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 39239
 * @Date 2019/5/6 21:05
 * @Package com.hippie.houzhidaoadmin.service.impl
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private ExtMapper extMapper;
    @Override
    public UserInfo getUserInfo(String userName) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUserNameEqualTo(userName);
        return userInfoMapper.selectByExample(userInfoExample).get(0);
    }

    @Override
    public List<String> getUserRoles(String userName) {
        return extMapper.getUserRoles(userName);
    }

    @Override
    public String generateJwtToken(String userName) {
        String salt = MathUtil.getRandomCode();

        //将salt存入数据库
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUserNameEqualTo(userName);
        UserInfo userInfo = new UserInfo();
        userInfo.setSalt(salt);
        userInfoMapper.updateByExampleSelective(userInfo, userInfoExample);
        return JwtUtils.sign(userName, salt, 1800);
    }

    @Override
    public UserInfo getJwtTokenInfo(String userName) {
        return getUserInfo(userName);
    }

    @Override
    public void deleteLoginInfo(String userName) {
//        UserInfoExample example = new UserInfoExample();
//        example.createCriteria().andUserNameEqualTo(userName);
//        UserInfo userInfo = new UserInfo();
//        userInfo.setSalt("");
//        userInfoMapper.updateByExampleSelective(userInfo, example);
        extMapper.updateUserSalt(userName);
    }
}
