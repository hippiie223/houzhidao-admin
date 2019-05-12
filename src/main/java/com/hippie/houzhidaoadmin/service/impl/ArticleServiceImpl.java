package com.hippie.houzhidaoadmin.service.impl;

import com.github.pagehelper.PageHelper;
import com.hippie.houzhidaoadmin.domain.Article;
import com.hippie.houzhidaoadmin.domain.example.ArticleExample;
import com.hippie.houzhidaoadmin.domain.example.ArticlePostExample;
import com.hippie.houzhidaoadmin.domain.example.ArticlePostReplyExample;
import com.hippie.houzhidaoadmin.mapper.ArticleMapper;
import com.hippie.houzhidaoadmin.mapper.ArticlePostMapper;
import com.hippie.houzhidaoadmin.mapper.ArticlePostReplyMapper;
import com.hippie.houzhidaoadmin.mapper.ExtMapper;
import com.hippie.houzhidaoadmin.respbody.ArticlePostReplyRespBody;
import com.hippie.houzhidaoadmin.respbody.ArticlePostRespBody;
import com.hippie.houzhidaoadmin.respbody.ArticleRespBody;
import com.hippie.houzhidaoadmin.service.ArticleService;
import com.hippie.houzhidaoadmin.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 39239
 * @Date 2019/5/5 15:15
 * @Package com.hippie.houzhidaoadmin.service.impl
 * @Description:
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private ExtMapper extMapper;
    @Autowired
    private ArticlePostMapper articlePostMapper;
    @Autowired
    private ArticlePostReplyMapper articlePostReplyMapper;
    @Override
    public List<ArticleRespBody> getAllList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        return extMapper.getAllArticleList().parallelStream().map(articleDTO -> {
            ArticleRespBody articleRespBody = new ArticleRespBody();
            articleRespBody.setId(articleDTO.getId());
            articleRespBody.setTitle(articleDTO.getTitle());
            articleRespBody.setAuthor(articleDTO.getAuthor());
            articleRespBody.setContent(articleDTO.getContent());
            articleRespBody.setPic(articleDTO.getPic());
            articleRespBody.setReviewNum(articleDTO.getReviewNum());
            articleRespBody.setViewNum(articleDTO.getViewNum());
            articleRespBody.setIsChecked(articleDTO.getIsChecked());
            articleRespBody.setBrief(articleDTO.getBrief());
            if(articleDTO.getCheckTime() != null){
                articleRespBody.setCheckTime(TimeUtil.getTime(articleDTO.getCheckTime()));
            }
            articleRespBody.setCreateTime(TimeUtil.getTime(articleDTO.getCreateTime()));
            return articleRespBody;
        }).collect(Collectors.toList());

    }

    @Override
    public Boolean check(Integer articleId) {
        ArticleExample articleExample = new ArticleExample();
        articleExample.createCriteria().andIdEqualTo(articleId);
        Article article = new Article();
        article.setIsChecked(1);
        article.setCheckTime(TimeUtil.getCurrentTime());
        return articleMapper.updateByExampleSelective(article, articleExample) == 1;
    }

    @Override
    public Boolean deleteArticlePost(Integer postId) {
        ArticlePostExample articlePostExample = new ArticlePostExample();
        articlePostExample.createCriteria().andIdEqualTo(postId);
        if (articlePostMapper.deleteByExample(articlePostExample) == 1){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean deleteArticlePostReply(Integer replyId) {
        ArticlePostReplyExample articlePostReplyExample = new ArticlePostReplyExample();
        articlePostReplyExample.createCriteria().andIdEqualTo(replyId);
        if (articlePostReplyMapper.deleteByExample(articlePostReplyExample) == 1){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<ArticlePostRespBody> getArtcilePostList(Integer articleId , int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        return extMapper.getArticlePostList(articleId).parallelStream().map(articlePostDTO -> {
            ArticlePostRespBody articlePostRespBody = new ArticlePostRespBody();
            articlePostRespBody.setId(articlePostDTO.getId());
            articlePostRespBody.setContent(articlePostDTO.getContent());
            articlePostRespBody.setUserName(articlePostDTO.getUserName());
            articlePostRespBody.setReplyNum(articlePostDTO.getReplyNum());
            articlePostRespBody.setCreateTime(TimeUtil.getTime(articlePostDTO.getCreateTime()));
            return articlePostRespBody;
        }).collect(Collectors.toList());
    }

    @Override
    public List<ArticlePostReplyRespBody> getArticlePostReplyList(Integer postId, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        return extMapper.getArticlePostReplyList(postId).parallelStream().map(articlePostReplyDTO -> {
            ArticlePostReplyRespBody articlePostReplyRespBody = new ArticlePostReplyRespBody();
            articlePostReplyRespBody.setId(articlePostReplyDTO.getId());
            articlePostReplyRespBody.setContent(articlePostReplyDTO.getContent());
            articlePostReplyRespBody.setUserName(articlePostReplyDTO.getUserName());
            articlePostReplyRespBody.setReplyTo(articlePostReplyDTO.getReplyTo());
            articlePostReplyRespBody.setCreateTime(TimeUtil.getTime(articlePostReplyDTO.getCreateTime()));
            return articlePostReplyRespBody;
        }).collect(Collectors.toList());
    }

    @Override
    public List<ArticleRespBody> getCheckedList(int isChecked, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        return extMapper.getCheckedArticleList(isChecked).parallelStream().map(articleDTO -> {
            ArticleRespBody articleRespBody = new ArticleRespBody();
            articleRespBody.setId(articleDTO.getId());
            articleRespBody.setTitle(articleDTO.getTitle());
            articleRespBody.setAuthor(articleDTO.getAuthor());
            articleRespBody.setContent(articleDTO.getContent());
            articleRespBody.setPic(articleDTO.getPic());
            articleRespBody.setReviewNum(articleDTO.getReviewNum());
            articleRespBody.setViewNum(articleDTO.getViewNum());
            articleRespBody.setIsChecked(articleDTO.getIsChecked());
            articleRespBody.setBrief(articleDTO.getBrief());
            if(articleDTO.getCheckTime() != null){
                articleRespBody.setCheckTime(TimeUtil.getTime(articleDTO.getCheckTime()));
            }
            articleRespBody.setCreateTime(TimeUtil.getTime(articleDTO.getCreateTime()));
            return articleRespBody;
        }).collect(Collectors.toList());
    }
}
