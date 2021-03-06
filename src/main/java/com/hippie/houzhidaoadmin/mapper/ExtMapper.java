package com.hippie.houzhidaoadmin.mapper;

import com.hippie.houzhidaoadmin.domain.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

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

    List<TopicPostDTO> getTopicPostList(@Param("topicId") Integer topicId);

    List<TopicPostReplyDTO> getTopicPostReplyList(@Param("postId") Integer postId);

    List<String> getUserRoles(@Param("userName") String userName);

    int updateUserSalt(@Param("userName") String userName);

    List<ArticleDTO> getCheckedArticleList(@Param("isChecked") Integer isChecked);

    int updatePaperQuestionTotal(@Param("paperId") Integer paperId);

    List<PaperDTO> getPaperList();

    List<PaperOptionDTO> getOptionListByQuestoinId(@Param("id") Integer id);

    List<PaperQuestionDTO> getPaperQuestionList(@Param("paperId") Integer paperId);

    List<Integer> getIdByPaperId(@Param("paperId")Integer paperId);

    int deleteQuestion(@Param("paperId") Integer paperId);

    List<UserDTO> getUserList();

    List<LabelDTO> getFirstLabel();

    List<LabelDTO> getSecondLabel(@Param("ofLabelId") Integer ofLabelId);
}
