package com.hippie.houzhidaoadmin.service.impl;

import com.github.pagehelper.PageHelper;
import com.hippie.houzhidaoadmin.domain.TestPaper;
import com.hippie.houzhidaoadmin.domain.TestPaperOption;
import com.hippie.houzhidaoadmin.domain.TestPaperQuestion;
import com.hippie.houzhidaoadmin.domain.example.TestPaperExample;
import com.hippie.houzhidaoadmin.domain.example.TestPaperQuestionExample;
import com.hippie.houzhidaoadmin.mapper.ExtMapper;
import com.hippie.houzhidaoadmin.mapper.TestPaperMapper;
import com.hippie.houzhidaoadmin.mapper.TestPaperOptionMapper;
import com.hippie.houzhidaoadmin.mapper.TestPaperQuestionMapper;
import com.hippie.houzhidaoadmin.respbody.PaperQuestionRespBody;
import com.hippie.houzhidaoadmin.respbody.PaperRespBody;
import com.hippie.houzhidaoadmin.service.TestPaperService;
import com.hippie.houzhidaoadmin.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 39239
 * @Date 2019/5/7 20:05
 * @Package com.hippie.houzhidaoadmin.service.impl
 * @Description:
 */
@Service
public class TestPaperServiceImpl implements TestPaperService {
    @Autowired
    private TestPaperMapper testPaperMapper;
    @Autowired
    private TestPaperQuestionMapper testPaperQuestionMapper;
    @Autowired
    private TestPaperOptionMapper testPaperOptionMapper;
    @Autowired
    private ExtMapper extMapper;
    @Override
    public boolean insertTestPaper(TestPaper testPaper) {
        testPaper.setCreateTime(TimeUtil.getCurrentTime());

        return testPaperMapper.insertSelective(testPaper) == 1;
    }

    @Override
    public boolean insertTestQuestion(TestPaperQuestion testPaperQuestion) {
        Date date = TimeUtil.getCurrentTime();
        testPaperQuestion.setCreateTime(date);
        extMapper.updatePaperQuestionTotal(testPaperQuestion.getPaperId());
        return testPaperQuestionMapper.insertSelective(testPaperQuestion) == 1;


//
//        for(TestPaperOption testPaperOption : testPaperOptions){
//            testPaperOption.setCreateTime(date);
//            testPaperOption.setQuestionId(testPaperQuestion.getId());
//            if(testPaperOptionMapper.insertSelective(testPaperOption) != 1){
//                return false;
//            }
//        }
//        return true;
    }

    @Override
    public List<PaperRespBody> getPaperList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        return extMapper.getPaperList().parallelStream().map(paperDTO -> {
            PaperRespBody paperRespBody = new PaperRespBody();
            paperRespBody.setId(paperDTO.getId());
            paperRespBody.setTitle(paperDTO.getTitle());
            paperRespBody.setAuthor(paperDTO.getAuthor());
            paperRespBody.setDifficulty(paperDTO.getDifficulty());
            paperRespBody.setGrade(paperDTO.getGrade());
            paperRespBody.setQuestionTotal(paperDTO.getQuestionTotal());
            paperRespBody.setViewNum(paperDTO.getViewNum());
            paperRespBody.setCreateTime(TimeUtil.getTime(paperDTO.getCreateTime()));
            return paperRespBody;
        }).collect(Collectors.toList());
    }

    @Override
    public List<PaperQuestionRespBody> getQuestioniList(int paperId) {

        return extMapper.getPaperQuestionList(paperId).parallelStream().map(paperQuestionDTO -> {
            PaperQuestionRespBody paperQuestionRespBody = new PaperQuestionRespBody();
            paperQuestionRespBody.setId(paperQuestionDTO.getId());
            paperQuestionRespBody.setQuestion(paperQuestionDTO.getContent());
            paperQuestionRespBody.setCorrectOption(paperQuestionDTO.getCorrectOption());
            paperQuestionRespBody.setQuestionNumber(paperQuestionDTO.getQuestionNum());
            paperQuestionRespBody.setReviewNum(paperQuestionDTO.getReplyNum());
            paperQuestionRespBody.setOptionaContent(paperQuestionDTO.getOptionaContent());
            paperQuestionRespBody.setOptionbContent(paperQuestionDTO.getOptionbContent());
            paperQuestionRespBody.setOptioncContent(paperQuestionDTO.getOptioncContent());
            paperQuestionRespBody.setOptiondContent(paperQuestionDTO.getOptiondCOntent());
            return paperQuestionRespBody;
        }).collect(Collectors.toList());
    }

    @Override
    public boolean updatePaper(TestPaper testPaper) {
        TestPaperExample testPaperExample = new TestPaperExample();
        testPaperExample.createCriteria().andIdEqualTo(testPaper.getId());
        return testPaperMapper.updateByExampleSelective(testPaper, testPaperExample) == 1;

    }

    @Override
    public boolean updateQuestion(TestPaperQuestion testPaperQuestion) {
        TestPaperQuestionExample testPaperQuestionExample = new TestPaperQuestionExample();
        testPaperQuestionExample.createCriteria().andIdEqualTo(testPaperQuestion.getId());
        return testPaperQuestionMapper.updateByExampleSelective(testPaperQuestion, testPaperQuestionExample) == 1;
    }

    @Override
    public TestPaper getPaperById(Integer id) {
        TestPaperExample testPaperExample = new TestPaperExample();
        testPaperExample.createCriteria().andIdEqualTo(id);
        return testPaperMapper.selectByExample(testPaperExample).get(0);
    }

    @Override
    public boolean deleteQuestion(Integer id) {
        TestPaperQuestionExample testPaperQuestionExample = new TestPaperQuestionExample();
        testPaperQuestionExample.createCriteria().andIdEqualTo(id);
        return testPaperQuestionMapper.deleteByExample(testPaperQuestionExample) == 1;
    }

    @Override
    public Integer getIdByName(String name) {
        TestPaperExample testPaperExample = new TestPaperExample();
        testPaperExample.createCriteria().andTitleEqualTo(name);
        return testPaperMapper.selectByExample(testPaperExample).get(0).getId();
    }

    @Override
    public List<Integer> getIds(Integer paperId) {
        return extMapper.getIdByPaperId(paperId);

    }

    @Override
    public boolean deletePaper(Integer id) {
        TestPaperExample testPaperExample = new TestPaperExample();
        testPaperExample.createCriteria().andIdEqualTo(id);
        return testPaperMapper.deleteByExample(testPaperExample) == 1 && extMapper.deleteQuestion(id) == 1;
    }
}
