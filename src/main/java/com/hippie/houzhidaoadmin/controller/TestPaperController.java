package com.hippie.houzhidaoadmin.controller;

import com.hippie.houzhidaoadmin.domain.TestPaper;
import com.hippie.houzhidaoadmin.domain.TestPaperOption;
import com.hippie.houzhidaoadmin.domain.TestPaperQuestion;
import com.hippie.houzhidaoadmin.request.*;
import com.hippie.houzhidaoadmin.respbody.PaperDetailRespBody;
import com.hippie.houzhidaoadmin.respbody.PaperQuestionRespBody;
import com.hippie.houzhidaoadmin.respbody.PaperRespBody;
import com.hippie.houzhidaoadmin.respbody.RootRespBody;
import com.hippie.houzhidaoadmin.service.TestPaperService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 39239
 * @Date 2019/5/7 20:16
 * @Package com.hippie.houzhidaoadmin.controller
 * @Description:
 */
@RestController
@RequestMapping(path = "/paper")
@Api("试卷相关接口")
public class TestPaperController {
    @Autowired
    private TestPaperService testPaperService;

    @PostMapping(path = "/insert/paper")
    @ApiOperation("新增试卷")
    public RootRespBody<String> insertPaper(@RequestBody InsertTestPaperRequestBody requestBody) {
        TestPaper testPaper = new TestPaper();
        testPaper.setTitle(requestBody.getTitle());
        testPaper.setAuthor(requestBody.getAuthor());
        testPaper.setDifficulty(requestBody.getDifficulty());
        testPaper.setGrade(requestBody.getGrade());
        if (!testPaperService.insertTestPaper(testPaper)) {
            return RootRespBody.failure(RootRespBody.Status.INSERT_RECORD_ERROR, "新增试卷失败");
        }

        List<InsertTestQuestionRequestBody> questionRequestBodyList = requestBody.getQuestionRequestBodies();
        for (InsertTestQuestionRequestBody testQuestionRequestBody : questionRequestBodyList) {
            TestPaperQuestion testPaperQuestion = new TestPaperQuestion();
            testPaperQuestion.setPaperId(testPaper.getId());
            testPaperQuestion.setContent(testQuestionRequestBody.getQuestion());
            testPaperQuestion.setCorrectOption(testQuestionRequestBody.getCorrectOption());
            testPaperQuestion.setQuestionNum(testQuestionRequestBody.getQuestionNumber());
            testPaperQuestion.setOptionaContent(testQuestionRequestBody.getOptionaContent());
            testPaperQuestion.setOptionbContent(testQuestionRequestBody.getOptionbContent());
            testPaperQuestion.setOptioncContent(testQuestionRequestBody.getOptioncContent());
            testPaperQuestion.setOptiondContent(testQuestionRequestBody.getOptiondContent());

//            List<TestPaperOption> testPaperOptions = new ArrayList<>();
//
//            TestPaperOption testPaperOptionA = new TestPaperOption();
//            testPaperOptionA.setOptionNum(1);
//            testPaperOptionA.setContent(testQuestionRequestBody.getOptionA());
//
//            TestPaperOption testPaperOptionB = new TestPaperOption();
//            testPaperOptionB.setOptionNum(2);
//            testPaperOptionB.setContent(testQuestionRequestBody.getOptionB());
//
//            TestPaperOption testPaperOptionC = new TestPaperOption();
//            testPaperOptionC.setOptionNum(3);
//            testPaperOptionC.setContent(testQuestionRequestBody.getOptionC());
//
//            TestPaperOption testPaperOptionD = new TestPaperOption();
//            testPaperOptionD.setOptionNum(4);
//            testPaperOptionD.setContent(testQuestionRequestBody.getOptionD());
//
//            testPaperOptions.add(testPaperOptionA);
//            testPaperOptions.add(testPaperOptionB);
//            testPaperOptions.add(testPaperOptionC);
//            testPaperOptions.add(testPaperOptionD);

            if (!testPaperService.insertTestQuestion(testPaperQuestion)) {
                return RootRespBody.failure(RootRespBody.Status.INSERT_RECORD_ERROR, "新增试卷失败");
            }
        }

        return RootRespBody.success("新增成功");

    }

    @PostMapping(path = "/insert/question")
    @ApiOperation("新增问题")
    public RootRespBody<String> insertPaperQuestion(@RequestBody InsertTestQuestionRequestBody requestBody) {
        TestPaperQuestion testPaperQuestion = new TestPaperQuestion();
        testPaperQuestion.setPaperId(requestBody.getPaperId());
        testPaperQuestion.setContent(requestBody.getQuestion());
        testPaperQuestion.setCorrectOption(requestBody.getCorrectOption());
//        testPaperQuestion.setQuestionNum(requestBody.getQuestionNumber());
        testPaperQuestion.setOptionaContent(requestBody.getOptionaContent());
        testPaperQuestion.setOptionbContent(requestBody.getOptionbContent());
        testPaperQuestion.setOptioncContent(requestBody.getOptioncContent());
        testPaperQuestion.setOptiondContent(requestBody.getOptiondContent());

//        List<TestPaperOption> testPaperOptions = new ArrayList<>();
//
//        TestPaperOption testPaperOptionA = new TestPaperOption();
//        testPaperOptionA.setOptionNum(1);
//        testPaperOptionA.setContent(requestBody.getOptionA());
//
//        TestPaperOption testPaperOptionB = new TestPaperOption();
//        testPaperOptionB.setOptionNum(2);
//        testPaperOptionB.setContent(requestBody.getOptionB());
//
//        TestPaperOption testPaperOptionC = new TestPaperOption();
//        testPaperOptionC.setOptionNum(3);
//        testPaperOptionC.setContent(requestBody.getOptionC());
//
//        TestPaperOption testPaperOptionD = new TestPaperOption();
//        testPaperOptionD.setOptionNum(4);
//        testPaperOptionD.setContent(requestBody.getOptionD());
//
//        testPaperOptions.add(testPaperOptionA);
//        testPaperOptions.add(testPaperOptionB);
//        testPaperOptions.add(testPaperOptionC);
//        testPaperOptions.add(testPaperOptionD);

        if (testPaperService.insertTestQuestion(testPaperQuestion)) {
            return RootRespBody.success("新增成功");
        } else {
            return RootRespBody.failure(RootRespBody.Status.INSERT_RECORD_ERROR, "新增失败");
        }
    }

    @GetMapping(path = "/get/all/list")
    @ApiOperation("获取文章列表")
    public RootRespBody<List<PaperRespBody>> getAllList(@RequestParam int pageNum, @RequestParam int pageSize) {
        return RootRespBody.success(testPaperService.getPaperList(pageNum, pageSize));
    }

    @GetMapping(path = "/get/detail")
    @ApiOperation("获取试卷内容")
    public RootRespBody<PaperDetailRespBody> getDetail(@RequestParam int paperId) {
        PaperDetailRespBody respBody = new PaperDetailRespBody();
        TestPaper testPaper = testPaperService.getPaperById(paperId);
        respBody.setName(testPaper.getTitle());
        respBody.setDifficulty(testPaper.getDifficulty());
        respBody.setQuestionRespBodyList(testPaperService.getQuestioniList(paperId));
        return RootRespBody.success(respBody);
    }



    @PostMapping(path = "/update/paper")
    @ApiOperation("更新试卷内容")
    public RootRespBody<String> updatePaper(@RequestBody UpdatePaperRequestBody requestBody) {
        TestPaper testPaper = new TestPaper();
//        testPaper.setId(requestBody.getId());
        testPaper.setTitle(requestBody.getName());
        testPaper.setAuthor(requestBody.getAuthor());
        testPaper.setDifficulty(requestBody.getDifficulty());
        testPaper.setGrade(requestBody.getGrade());
        if(requestBody.getId() != 0){
            System.out.println("编辑试卷");
            testPaper.setId(requestBody.getId());
            if (!testPaperService.updatePaper(testPaper)) {
                return RootRespBody.failure(RootRespBody.Status.INSERT_RECORD_ERROR, "修改试卷失败");
            }
        }else {
            if(!testPaperService.insertTestPaper(testPaper)){
                return RootRespBody.failure(RootRespBody.Status.INSERT_RECORD_ERROR, "新增试卷失败");
            }
            testPaper.setId(testPaperService.getIdByName(testPaper.getTitle()));
        }

        List<Integer> questionIds = testPaperService.getIds(testPaper.getId());



        List<UpdateQuestionRequestBody> questionRequestBodyList = requestBody.getQuestionRequestBodies();
        System.out.println(questionRequestBodyList);
        if(questionRequestBodyList != null){
            for (UpdateQuestionRequestBody testQuestionRequestBody : questionRequestBodyList) {
                System.out.println(testQuestionRequestBody.getId());
                TestPaperQuestion testPaperQuestion = new TestPaperQuestion();
//                testPaperQuestion.setId(testQuestionRequestBody.getId());
                testPaperQuestion.setContent(testQuestionRequestBody.getQuestion());
                testPaperQuestion.setCorrectOption(testQuestionRequestBody.getCorrectOption());
                testPaperQuestion.setQuestionNum(testQuestionRequestBody.getQuestionNumber());
                testPaperQuestion.setOptionaContent(testQuestionRequestBody.getOptionaContent());
                testPaperQuestion.setOptionbContent(testQuestionRequestBody.getOptionbContent());
                testPaperQuestion.setOptioncContent(testQuestionRequestBody.getOptioncContent());
                testPaperQuestion.setOptiondContent(testQuestionRequestBody.getOptiondContent());
                if(testQuestionRequestBody.getId() == null) {
                    testPaperQuestion.setPaperId(testPaper.getId());
                    System.out.println("新增");
                    if (!testPaperService.insertTestQuestion(testPaperQuestion)) {
                        return RootRespBody.failure(RootRespBody.Status.INSERT_RECORD_ERROR, "新增试题出错");
                    }
                }else {
                    testPaperQuestion.setId(testQuestionRequestBody.getId());
                    if (!testPaperService.updateQuestion(testPaperQuestion)) {
                        return RootRespBody.failure(RootRespBody.Status.BAD_REQUEST, "修改试卷失败");
                    }
                }

            }
        }
        return RootRespBody.success("修改成功");
    }

    @DeleteMapping("/delete/question")
    @ApiOperation("删除习题")
    public RootRespBody<String> deleteQuestion(@RequestBody DeleteQuestionRequestBody requestBody){
        if(testPaperService.deleteQuestion(requestBody.getQuestionId())){
            return RootRespBody.success("删除成功");
        }else {
            return RootRespBody.failure(RootRespBody.Status.BAD_REQUEST,"删除失败");
        }
    }

    @PostMapping("/edit/question")
    @ApiOperation("编辑习题")
    public RootRespBody<String> editQuestion(@RequestBody UpdateQuestionRequestBody requestBody){
        TestPaperQuestion testPaperQuestion = new TestPaperQuestion();
        testPaperQuestion.setId(requestBody.getId());
        testPaperQuestion.setContent(requestBody.getQuestion());
        testPaperQuestion.setCorrectOption(requestBody.getCorrectOption());
        testPaperQuestion.setOptionaContent(requestBody.getOptionaContent());
        testPaperQuestion.setOptionbContent(requestBody.getOptionbContent());
        testPaperQuestion.setOptioncContent(requestBody.getOptioncContent());
        testPaperQuestion.setOptiondContent(requestBody.getOptiondContent());

        if(testPaperService.updateQuestion(testPaperQuestion)){
            return RootRespBody.success("修改成功");
        }else {
            return RootRespBody.failure(RootRespBody.Status.BAD_REQUEST,"修改失败");
        }
    }

    @PostMapping("/edit/paper")
    @ApiOperation("编辑试卷")
    public RootRespBody<String> editPaper(@RequestBody UpdatePaperRequestBody requestBody){
        TestPaper testPaper = new TestPaper();
        testPaper.setId(requestBody.getId());
        testPaper.setTitle(requestBody.getName());
        testPaper.setAuthor(requestBody.getAuthor());
        testPaper.setDifficulty(requestBody.getDifficulty());
        testPaper.setGrade(requestBody.getGrade());
        if (!testPaperService.updatePaper(testPaper)) {
            return RootRespBody.failure(RootRespBody.Status.INSERT_RECORD_ERROR, "修改试卷失败");
        }

        return RootRespBody.success("修改成功");
    }

    @DeleteMapping("/delete/paper")
    public RootRespBody<String> deletePaper(@RequestBody DeletePaperRequestBody requestBody){
        if(testPaperService.deletePaper(requestBody.getPaperId())){
            return RootRespBody.success("删除成功");
        }else {
            return RootRespBody.failure(RootRespBody.Status.BAD_REQUEST,"删除失败");
        }
    }
}
