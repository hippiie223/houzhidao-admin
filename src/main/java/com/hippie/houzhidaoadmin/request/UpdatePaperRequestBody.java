package com.hippie.houzhidaoadmin.request;

import java.util.List;

/**
 * @author 39239
 * @Date 2019/5/9 15:16
 * @Package com.hippie.houzhidaoadmin.request
 * @Description:
 */

public class UpdatePaperRequestBody {
    private Integer id;
    private String name;
    private Integer difficulty;
    private Integer grade;
    private String author;
    private List<UpdateQuestionRequestBody> questionRequestBodies;

    public List<UpdateQuestionRequestBody> getQuestionRequestBodies() {
        return questionRequestBodies;
    }

    public void setQuestionRequestBodies(List<UpdateQuestionRequestBody> questionRequestBodies) {
        this.questionRequestBodies = questionRequestBodies;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
