package com.hippie.houzhidaoadmin.service;

import com.hippie.houzhidaoadmin.domain.UserInfo;

import java.util.List;

/**
 * @author 39239
 * @Date 2019/5/6 21:05
 * @Package com.hippie.houzhidaoadmin.service
 * @Description:
 */

public interface UserService {
    UserInfo getUserInfo(String userName);
    List<String> getUserRoles(String userName);
    String generateJwtToken(String userName);
    UserInfo getJwtTokenInfo(String userName);
    void deleteLoginInfo(String userName);
}
