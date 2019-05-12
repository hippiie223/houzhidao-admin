package com.hippie.houzhidaoadmin.controller;

import com.hippie.houzhidaoadmin.request.CheckRequestBody;
import com.hippie.houzhidaoadmin.respbody.ArticlePostReplyRespBody;
import com.hippie.houzhidaoadmin.respbody.ArticlePostRespBody;
import com.hippie.houzhidaoadmin.respbody.ArticleRespBody;
import com.hippie.houzhidaoadmin.respbody.RootRespBody;
import com.hippie.houzhidaoadmin.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 39239
 * @Date 2019/5/5 15:33
 * @Package com.hippie.houzhidaoadmin.controller
 * @Description:
 */
@RestController
@RequestMapping(path = "/article")
@Api("文章管理接口")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping(path = "/list")
    @ApiOperation("所有文章列表")
    public RootRespBody<List<ArticleRespBody>> getAllArticleList(@RequestParam int pageNum, @RequestParam int pageSize){
        return RootRespBody.success(articleService.getAllList(pageNum, pageSize));
    }

    @PostMapping(path = "/check")
    @ApiOperation("文章审核")
    public RootRespBody<Boolean> check(@RequestBody CheckRequestBody requestBody){
        return RootRespBody.success(articleService.check(requestBody.getArticleId()));
    }

    @DeleteMapping(path = "/delete/post")
    @ApiOperation("删除文章评论")
    public RootRespBody<Boolean> deletePost(@RequestParam int postId){
        return RootRespBody.success(articleService.deleteArticlePost(postId));

    }

    @DeleteMapping(path = "/delete/reply")
    @ApiOperation("删除评论回复")
    public RootRespBody<Boolean> deletePostReply(@RequestParam int replyId){
        return RootRespBody.success(articleService.deleteArticlePostReply(replyId));
    }

    @GetMapping(path = "/get/post/list")
    @ApiOperation("获取文章评论列表")
    public RootRespBody<List<ArticlePostRespBody>> getArtilcePostList(@RequestParam int artilceId, @RequestParam int pageNum, @RequestParam int pageSize){
        return RootRespBody.success(articleService.getArtcilePostList(artilceId, pageNum ,pageSize));
    }

    @GetMapping(path = "/get/reply/list")
    @ApiOperation("获取评论回复")
    public RootRespBody<List<ArticlePostReplyRespBody>> getArticlePostReplyList(@RequestParam int postId, @RequestParam int pageNum, @RequestParam int pageSize){
        return RootRespBody.success(articleService.getArticlePostReplyList(postId, pageNum, pageSize));
    }

    @GetMapping(path = "/list/isChecked")
    @ApiOperation("获取审核列表")
    public RootRespBody<List<ArticleRespBody>> getCheckedList(@RequestParam Integer isChecked, @RequestParam int pageNum, @RequestParam int pageSize){
        return RootRespBody.success(articleService.getCheckedList(isChecked, pageNum, pageSize));
    }

}
