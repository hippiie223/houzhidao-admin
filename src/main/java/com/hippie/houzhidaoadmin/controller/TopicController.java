package com.hippie.houzhidaoadmin.controller;

import com.hippie.houzhidaoadmin.domain.Topic;
import com.hippie.houzhidaoadmin.domain.TopicPostReply;
import com.hippie.houzhidaoadmin.request.DeleteTopicRequestBody;
import com.hippie.houzhidaoadmin.request.InsertTopicRequestBody;
import com.hippie.houzhidaoadmin.request.UpdateTopicRequestBody;
import com.hippie.houzhidaoadmin.respbody.RootRespBody;
import com.hippie.houzhidaoadmin.respbody.TopicPostReplyRespBody;
import com.hippie.houzhidaoadmin.respbody.TopicPostRespBody;
import com.hippie.houzhidaoadmin.respbody.TopicRespBody;
import com.hippie.houzhidaoadmin.service.TopicService;
import com.hippie.houzhidaoadmin.util.TimeUtil;
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
@RequestMapping(path = "/topic")
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

    @PostMapping(path = "/insert")
    @ApiOperation("发表话题")
    public RootRespBody<String> insertTopic(@RequestBody InsertTopicRequestBody requestBody){
        Topic topic = new Topic();
        topic.setTitle(requestBody.getTitle());
        topic.setStartTime(TimeUtil.getTimestamp(requestBody.getStartTime()));
        topic.setEndTime(TimeUtil.getTimestamp(requestBody.getEndTime()));
        topic.setContent(requestBody.getContent());
        topic.setAuthorName(requestBody.getAuthor());
        System.out.println(requestBody.getPic());
        topic.setImgUrl(requestBody.getPic());

        if(topicService.insertTopic(topic)){
            return RootRespBody.success("新增成功");
        }else {
            return RootRespBody.failure(RootRespBody.Status.INSERT_RECORD_ERROR,"新增失败");
        }
    }

    @PostMapping(path = "/update")
    @ApiOperation("修改话题")
    public RootRespBody<String> updateTopic(@RequestBody UpdateTopicRequestBody requestBody){
        if (null == requestBody.getId()){
            return RootRespBody.failure(RootRespBody.Status.BAD_REQUEST,"id不能为空");
        }

        Topic topic = new Topic();
        topic.setId(requestBody.getId());
        topic.setTitle(requestBody.getTitle());
        if(requestBody.getStartTime() != null && !"".equals(requestBody.getStartTime())){
            topic.setStartTime(TimeUtil.getTimestamp(requestBody.getStartTime()));
        }
        if(requestBody.getEndTime() != null && !"".equals(requestBody.getStartTime())){
            topic.setEndTime(TimeUtil.getTimestamp(requestBody.getEndTime()));
        }
        topic.setContent(requestBody.getContent());

        if(topicService.updateTopic(topic)){
            return RootRespBody.success("修改成功");
        }else {
            return RootRespBody.failure(RootRespBody.Status.BAD_REQUEST,"修改失败");
        }
    }

    @DeleteMapping("/delete")
    @ApiOperation("删除话题")
    public RootRespBody<String> deleteTopic(@RequestBody DeleteTopicRequestBody requestBody){
        System.out.println(requestBody.getId());
        if(topicService.deleteTopic(requestBody.getId())){
            return RootRespBody.success("删除成功");
        }else {
            return RootRespBody.failure(RootRespBody.Status.BAD_REQUEST, "删除失败");
        }
    }

    @GetMapping(path = "/get/all")
    @ApiOperation("获取所有话题")
    public RootRespBody<List<TopicRespBody>> getAllList(@RequestParam int pageNum, @RequestParam int pageSize){
        return RootRespBody.success(topicService.getAllTopic(pageNum, pageSize));
    }

    @GetMapping(path = "/get/top")
    @ApiOperation("获取前十话题")
    public RootRespBody<List<TopicRespBody>> getTopList(){
        return RootRespBody.success(topicService.getTopTopic());
    }

    @GetMapping(path = "/get/detail")
    @ApiOperation("获取文章详情")
    public RootRespBody<List<TopicRespBody>> getTopicDetail(@RequestParam String title, @RequestParam String authorName){
        return RootRespBody.success(topicService.getTopicDetail(title, authorName));
    }
}
