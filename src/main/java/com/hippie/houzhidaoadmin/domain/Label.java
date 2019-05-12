package com.hippie.houzhidaoadmin.domain;

import java.util.Date;

public class Label {
    private Integer id;

    private String author;

    private Integer labelClass;

    private Integer ofLabelId;

    private String labelName;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getLabelClass() {
        return labelClass;
    }

    public void setLabelClass(Integer labelClass) {
        this.labelClass = labelClass;
    }

    public Integer getOfLabelId() {
        return ofLabelId;
    }

    public void setOfLabelId(Integer ofLabelId) {
        this.ofLabelId = ofLabelId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
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
}