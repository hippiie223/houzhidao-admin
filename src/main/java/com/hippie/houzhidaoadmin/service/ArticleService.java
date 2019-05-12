package com.hippie.houzhidaoadmin.service;

import com.hippie.houzhidaoadmin.respbody.ArticlePostReplyRespBody;
import com.hippie.houzhidaoadmin.respbody.ArticlePostRespBody;
import com.hippie.houzhidaoadmin.respbody.ArticleRespBody;

import java.util.List;

/**
 * @author 39239
 * @Date 2019/5/5 15:15
 * @Package com.hippie.houzhidaoadmin.service
 * @Description:
 */

public interface ArticleService {
    List<ArticleRespBody> getAllList(int pageNum, int pageSize);
    Boolean check(Integer articleId);
    Boolean deleteArticlePost(Integer postId);
    Boolean deleteArticlePostReply(Integer replyId);
    List<ArticlePostRespBody> getArtcilePostList(Integer articleId , int pageNum, int pageSize);
    List<ArticlePostReplyRespBody> getArticlePostReplyList(Integer postId, int pageNum, int pageSize);
    List<ArticleRespBody> getCheckedList(int isChecked, int pageNum, int pageSize);
}
