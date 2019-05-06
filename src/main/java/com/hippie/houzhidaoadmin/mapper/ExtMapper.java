package com.hippie.houzhidaoadmin.mapper;

import com.hippie.houzhidaoadmin.domain.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 39239
 * @Date 2019/4/30 23:34
 * @Package com.hippie.houzhidaoadmin.mapper
 * @Description:
 */

public interface ExtMapper {
    List<TopicDTO> getAllTopicList();
    List<TopicDTO> getTopTopicList();
    List<TopicDTO> getTopicDetail(@Param("title") String title, @Param("authorName") String authorName);
    int updatePostNum(@Param("topicId") Integer topicId);
    int updatePostReplyNum(@Param("postId") Integer postId);
    List<QADTO> getQAAllList();
    List<QADTO> getTopQAList();
    List<QADTO> getQADetail(@Param("title") String title, @Param("authorName") String authorName);
    int updateQAAnswerNum(@Param("qAId") Integer qAId);
    int updateQAAnswerReplyNum(@Param("answerId") Integer answerId);
    List<ArticleDTO> getAllArticleList();

    List<ArticleDTO> getTopArticleList();

    List<ArticleDTO> searchArticle(@Param("keyWord") String keyWord);

    List<ArticleDTO> getArticle(@Param("title") String title, @Param("authorName") String authorName);

    List<ArticleDTO> getArticleByAuthor(@Param("authorName") String authorName);

    int updateArticlePostNum(@Param("articleId") Integer articleId);

    int updateArticleIsChecked(@Param("articleId") Integer articleId);

    List<ArticlePostDTO> getArticlePostList(@Param("articleId") Integer artcileId);

    List<ArticlePostReplyDTO> getArticlePostReplyList(@Param("postId") Integer postId);
}
