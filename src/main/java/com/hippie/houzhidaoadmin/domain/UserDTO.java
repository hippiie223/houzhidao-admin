package com.hippie.houzhidaoadmin.domain;

import java.util.Date;

/**
 * @author 39239
 * @Date 2019/5/11 15:11
 * @Package com.hippie.houzhidaoadmin.domain
 * @Description:
 */

public class UserDTO {
    private Integer id;
    private String userName;
    private String phone;
    private String address;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
