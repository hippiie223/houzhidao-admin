package com.hippie.houzhidaoadmin.service;

import com.hippie.houzhidaoadmin.respbody.TopicPostReplyRespBody;
import com.hippie.houzhidaoadmin.respbody.TopicPostRespBody;

import java.util.List;

/**
 * @author 39239
 * @Date 2019/5/6 14:50
 * @Package com.hippie.houzhidaoadmin.service
 * @Description:
 */

public interface TopicService {
    Boolean deletePost(Integer postId);
    Boolean deletePostReply(Integer replyId);
    List<TopicPostRespBody> getPostList(Integer topicId ,int pageNum, int pageSize);
    List<TopicPostReplyRespBody> getPostReplyList(Integer postId, int pageNum, int pageSize);
}
