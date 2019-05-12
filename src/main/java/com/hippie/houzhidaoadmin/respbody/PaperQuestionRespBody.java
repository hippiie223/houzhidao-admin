package com.hippie.houzhidaoadmin.respbody;

import com.hippie.houzhidaoadmin.domain.PaperOptionDTO;

import java.util.List;

/**
 * @author 39239
 * @Date 2019/5/8 13:20
 * @Package com.hippie.houzhidaoadmin.respbody
 * @Description:
 */

public class PaperQuestionRespBody {
    private Integer id;
    private Integer questionNumber;
    private String question;
    private Integer correctOption;
    private Integer reviewNum;
    private String optionaContent;
    private String optionbContent;
    private String optioncContent;
    private String optiondContent;

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
    //    List<PaperOptionDTO> papest;rOptionLi


    public Integer getReviewNum() {
        return reviewNum;
    }

    public void setReviewNum(Integer reviewNum) {
        this.reviewNum = reviewNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(Integer questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Integer getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(Integer correctOption) {
        this.correctOption = correctOption;
    }
//
//    public List<PaperOptionDTO> getPaperOptionList() {
//        return paperOptionList;
//    }
//
//    public void setPaperOptionList(List<PaperOptionDTO> paperOptionList) {
//        this.paperOptionList = paperOptionList;
//    }
}
