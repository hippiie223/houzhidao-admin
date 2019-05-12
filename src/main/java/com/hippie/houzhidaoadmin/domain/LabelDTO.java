package com.hippie.houzhidaoadmin.domain;

/**
 * @author 39239
 * @Date 2019/5/11 17:45
 * @Package com.hippie.houzhidaoadmin.domain
 * @Description:
 */

public class LabelDTO {
    private Integer id;
    private String labelName;
    private Integer ofLabelId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public Integer getOfLabelId() {
        return ofLabelId;
    }

    public void setOfLabelId(Integer ofLabelId) {
        this.ofLabelId = ofLabelId;
    }
}
