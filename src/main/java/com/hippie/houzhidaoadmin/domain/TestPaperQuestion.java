package com.hippie.houzhidaoadmin.domain;

import java.util.Date;

public class TestPaperQuestion {
    private Integer id;

    private Integer paperId;

    private Integer correctOption;

    private Integer replyNum;

    private Date createTime;

    private Date updateTime;

    private Integer questionNum;

    private String optionaContent;

    private String optionbContent;

    private String optioncContent;

    private String optiondContent;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(Integer correctOption) {
        this.correctOption = correctOption;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(Integer questionNum) {
        this.questionNum = questionNum;
    }

    public String getOptionaContent() {
        return optionaContent;
    }

    public void setOptionaContent(String optionaContent) {
        this.optionaContent = optionaContent;
    }

    public String getOptionbContent() {
        return optionbContent;
    }

    public void setOptionbContent(String optionbContent) {
        this.optionbContent = optionbContent;
    }

    public String getOptioncContent() {
        return optioncContent;
    }

    public void setOptioncContent(String optioncContent) {
        this.optioncContent = optioncContent;
    }

    public String getOptiondContent() {
        return optiondContent;
    }

    public void setOptiondContent(String optiondContent) {
        this.optiondContent = optiondContent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}