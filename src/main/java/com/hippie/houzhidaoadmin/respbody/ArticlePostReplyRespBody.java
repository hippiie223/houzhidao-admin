package com.hippie.houzhidaoadmin.respbody;

/**
 * @author 39239
 * @Date 2019/5/6 12:52
 * @Package com.hippie.houzhidaoadmin.respbody
 * @Description:
 */

public class ArticlePostReplyRespBody {
    private Integer id;
    private String content;
    private String userName;
    private String replyTo;
    private String createTime;

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

    public String getCreateTime() {

        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
