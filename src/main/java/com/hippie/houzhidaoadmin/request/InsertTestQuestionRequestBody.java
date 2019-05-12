package com.hippie.houzhidaoadmin.request;

/**
 * @author 39239
 * @Date 2019/5/7 20:01
 * @Package com.hippie.houzhidaoadmin.request
 * @Description:
 */

public class InsertTestQuestionRequestBody {

    private Integer paperId;

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    private Integer questionNumber;
    private String question;
    private Integer correctOption;
    private String optionaContent;
    private String optionbContent;
    private String optioncContent;
    private String optiondContent;


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
}
