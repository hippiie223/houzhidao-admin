package com.hippie.houzhidaoadmin.respbody;

/**
 * @author 39239
 * @Date 2019/5/11 15:10
 * @Package com.hippie.houzhidaoadmin.respbody
 * @Description:
 */

public class UserRespBody {
    private Integer id;
    private String name;
    private String phone;
    private String address;
    private String createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
