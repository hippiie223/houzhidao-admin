package com.hippie.houzhidaoadmin.domain;

import java.util.List;

/**
 * @author 39239
 * @Date 2019/5/8 13:44
 * @Package com.hippie.houzhidaoadmin.domain
 * @Description:
 */

public class PaperQuestionDTO {
    private Integer id;
    private Integer questionNum;
    private String content;
    private Integer correctOption;
    private Integer replyNum;
    private String optionaContent;
    private String optionbContent;
    private String optioncContent;
    private String optiondCOntent;

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

    public String getOptiondCOntent() {
        return optiondCOntent;
    }

    public void setOptiondCOntent(String optiondCOntent) {
        this.optiondCOntent = optiondCOntent;
    }
    //    List<PaperOptionDTO> paperOptionDTOList;
//
//    public List<PaperOptionDTO> getPaperOptionDTOList() {
//        return paperOptionDTOList;
//    }
//
//    public void setPaperOptionDTOList(List<PaperOptionDTO> paperOptionDTOList) {
//        this.paperOptionDTOList = paperOptionDTOList;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(Integer questionNum) {
        this.questionNum = questionNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    @Override
    public String toString() {
        return this.getId()+this.getContent()+this.getCorrectOption();
    }
}
