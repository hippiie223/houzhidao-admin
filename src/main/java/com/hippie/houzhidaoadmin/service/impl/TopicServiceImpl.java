package com.hippie.houzhidaoadmin.service.impl;

import com.github.pagehelper.PageHelper;
import com.hippie.houzhidaoadmin.domain.TopicPost;
import com.hippie.houzhidaoadmin.domain.example.TopicPostExample;
import com.hippie.houzhidaoadmin.domain.example.TopicPostReplyExample;
import com.hippie.houzhidaoadmin.mapper.ExtMapper;
import com.hippie.houzhidaoadmin.mapper.TopicPostMapper;
import com.hippie.houzhidaoadmin.mapper.TopicPostReplyMapper;
import com.hippie.houzhidaoadmin.respbody.TopicPostReplyRespBody;
import com.hippie.houzhidaoadmin.respbody.TopicPostRespBody;
import com.hippie.houzhidaoadmin.service.TopicService;
import com.hippie.houzhidaoadmin.util.TimeUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 39239
 * @Date 2019/5/6 14:50
 * @Package com.hippie.houzhidaoadmin.service.impl
 * @Description:
 */
@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicPostMapper topicPostMapper;
    @Autowired
    private TopicPostReplyMapper topicPostReplyMapper;
    @Autowired
    private ExtMapper extMapper;
    @Override
    public Boolean deletePost(Integer postId) {
        TopicPostExample topicPostExample = new TopicPostExample();
        topicPostExample.createCriteria().andIdEqualTo(postId);
        if(topicPostMapper.deleteByExample(topicPostExample) == 1){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean deletePostReply(Integer replyId) {
        TopicPostReplyExample topicPostReplyExample = new TopicPostReplyExample();
        topicPostReplyExample.createCriteria().andIdEqualTo(replyId);
        if(topicPostReplyMapper.deleteByExample(topicPostReplyExample) == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<TopicPostRespBody> getPostList(Integer topicId ,int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        return extMapper.getTopicPostList(topicId).parallelStream().map(topicPostDTO -> {
            TopicPostRespBody topicPostRespBody = new TopicPostRespBody();
            topicPostRespBody.setId(topicPostDTO.getId());
            topicPostRespBody.setContent(topicPostDTO.getContent());
            topicPostRespBody.setUserName(topicPostDTO.getUserName());
            topicPostRespBody.setReplyNum(topicPostDTO.getReplyNum());
            topicPostRespBody.setCreateTime(TimeUtil.getTime(topicPostDTO.getCreateTime()));
            return topicPostRespBody;
        }).collect(Collectors.toList());
    }

    @Override
    public List<TopicPostReplyRespBody> getPostReplyList(Integer postId, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        return extMapper.getTopicPostReplyList(postId).parallelStream().map(topicPostReplyDTO -> {
            TopicPostReplyRespBody topicPostReplyRespBody = new TopicPostReplyRespBody();
            topicPostReplyRespBody.setId(topicPostReplyDTO.getId());
            topicPostReplyRespBody.setContent(topicPostReplyDTO.getContent());
            topicPostReplyRespBody.setUserName(topicPostReplyDTO.getUserName());
            topicPostReplyRespBody.setReplyTo(topicPostReplyDTO.getReplyTo());
            topicPostReplyRespBody.setCreateTime(TimeUtil.getTime(topicPostReplyDTO.getCreateTime()));
            return topicPostReplyRespBody;
        }).collect(Collectors.toList());
    }
}
