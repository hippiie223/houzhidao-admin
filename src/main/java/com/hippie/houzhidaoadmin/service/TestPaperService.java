package com.hippie.houzhidaoadmin.service;

import com.hippie.houzhidaoadmin.domain.TestPaper;
import com.hippie.houzhidaoadmin.domain.TestPaperOption;
import com.hippie.houzhidaoadmin.domain.TestPaperQuestion;
import com.hippie.houzhidaoadmin.respbody.PaperQuestionRespBody;
import com.hippie.houzhidaoadmin.respbody.PaperRespBody;
import io.swagger.models.auth.In;

import java.util.List;

/**
 * @author 39239
 * @Date 2019/5/7 20:04
 * @Package com.hippie.houzhidaoadmin.service
 * @Description:
 */

public interface TestPaperService {
    boolean insertTestPaper(TestPaper testPaper);
    boolean insertTestQuestion(TestPaperQuestion testPaperQuestion);
    List<PaperRespBody> getPaperList(int pageNum, int pageSize);
    List<PaperQuestionRespBody> getQuestioniList(int paperId);
    boolean updatePaper(TestPaper testPaper);
    boolean updateQuestion(TestPaperQuestion testPaperQuestion);
    TestPaper getPaperById(Integer id);
    boolean deleteQuestion(Integer id);
    Integer getIdByName(String name);
    List<Integer> getIds(Integer paperId);
    boolean deletePaper(Integer id);
}
