package com.hippie.houzhidaoadmin.controller;

import com.hippie.houzhidaoadmin.domain.TopicPostReply;
import com.hippie.houzhidaoadmin.respbody.RootRespBody;
import com.hippie.houzhidaoadmin.respbody.TopicPostReplyRespBody;
import com.hippie.houzhidaoadmin.respbody.TopicPostRespBody;
import com.hippie.houzhidaoadmin.service.TopicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 39239
 * @Date 2019/5/6 13:47
 * @Package com.hippie.houzhidaoadmin.controller
 * @Description:
 */
@RestController
@RequestMapping(path = "topic")
@Api("话题管理接口")
public class TopicController {
    @Autowired
    private TopicService topicService;

    @DeleteMapping(path = "/delete/post")
    @ApiOperation("删除评论")
    public RootRespBody<Boolean> deletePost(@RequestParam int topicId){
        return RootRespBody.success(topicService.deletePost(topicId));
    }

    @DeleteMapping(path = "/delete/reply")
    @ApiOperation("删除回复")
    public RootRespBody<Boolean> deletePostReply(@RequestParam int postId){
        return RootRespBody.success(topicService.deletePostReply(postId));
    }

    @GetMapping(path = "/get/post/list")
    @ApiOperation("获取评论列表")
    public RootRespBody<List<TopicPostRespBody>> getTopicPostList(@RequestParam int topicId, int pageNum, int pageSize){
        return RootRespBody.success(topicService.getPostList(topicId, pageNum, pageSize));
    }

    @GetMapping(path = "/get/reply/list")
    @ApiOperation("获取评论回复列表")
    public RootRespBody<List<TopicPostReplyRespBody>> getTopicPostReplyList(@RequestParam int postId, int pageNum, int pageSize){
        return RootRespBody.success(topicService.getPostReplyList(postId, pageNum, pageSize));
    }
}
