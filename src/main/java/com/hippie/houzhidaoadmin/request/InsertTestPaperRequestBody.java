package com.hippie.houzhidaoadmin.request;

import java.util.List;

/**
 * @author 39239
 * @Date 2019/5/7 19:42
 * @Package com.hippie.houzhidaoadmin.request
 * @Description:
 */

public class InsertTestPaperRequestBody {
    private String title;
    private Integer difficulty;
    private Integer grade;
    private String author;
    private List<InsertTestQuestionRequestBody> questionRequestBodies;

    public List<InsertTestQuestionRequestBody> getQuestionRequestBodies() {
        return questionRequestBodies;
    }

    public void setQuestionRequestBodies(List<InsertTestQuestionRequestBody> questionRequestBodies) {
        this.questionRequestBodies = questionRequestBodies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
