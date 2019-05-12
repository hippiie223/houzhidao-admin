package com.hippie.houzhidaoadmin.respbody;

import java.util.List;

/**
 * @author 39239
 * @Date 2019/5/10 20:16
 * @Package com.hippie.houzhidaoadmin.respbody
 * @Description:
 */

public class PaperDetailRespBody {
    private String name;
    private Integer difficulty;
    private List<PaperQuestionRespBody> questionRespBodyList;

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

    public List<PaperQuestionRespBody> getQuestionRespBodyList() {
        return questionRespBodyList;
    }

    public void setQuestionRespBodyList(List<PaperQuestionRespBody> questionRespBodyList) {
        this.questionRespBodyList = questionRespBodyList;
    }
}
