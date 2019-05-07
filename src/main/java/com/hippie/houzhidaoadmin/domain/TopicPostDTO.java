package com.hippie.houzhidaoadmin.domain;

import java.util.Date;

/**
 * @author 39239
 * @Date 2019/5/6 16:37
 * @Package com.hippie.houzhidaoadmin.domain
 * @Description:
 */

public class TopicPostDTO {
    private Integer id;

    private String content;

    private String userName;

    private Integer replyNum;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getReplyNum() {
        return replyNum;
    }

    public void setReplyNum(Integer replyNum) {
        this.replyNum = replyNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
