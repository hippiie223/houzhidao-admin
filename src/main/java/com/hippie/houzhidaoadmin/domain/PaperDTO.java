package com.hippie.houzhidaoadmin.domain;

import java.util.Date;

/**
 * @author 39239
 * @Date 2019/5/8 13:43
 * @Package com.hippie.houzhidaoadmin.domain
 * @Description:
 */

public class PaperDTO {
    private Integer id;
    private String title;
    private String author;
    private Integer difficulty;
    private Integer grade;
    private Integer questionTotal;
    private Integer viewNum;
    private Date createTime;

    public Integer getViewNum() {
        return viewNum;
    }

    public void setViewNum(Integer viewNum) {
        this.viewNum = viewNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getQuestionTotal() {
        return questionTotal;
    }

    public void setQuestionTotal(Integer questionTotal) {
        this.questionTotal = questionTotal;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
