package com.hippie.houzhidaoadmin.domain;

/**
 * @author 39239
 * @Date 2019/5/8 14:30
 * @Package com.hippie.houzhidaoadmin.domain
 * @Description:
 */

public class PaperOptionDTO {

    private Integer id;
    private Integer optionNum;
    private String content;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOptionNum() {
        return optionNum;
    }

    public void setOptionNum(Integer optionNum) {
        this.optionNum = optionNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
