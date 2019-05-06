package com.hippie.houzhidaoadmin.domain;

import java.util.Date;

/**
 * @author 39239
 * @Date 2019/5/6 12:48
 * @Package com.hippie.houzhidaoadmin.domain
 * @Description:
 */

public class ArticlePostReplyDTO {
    private Integer id;
    private String content;
    private String userName;
    private String replyTo;
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

    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
