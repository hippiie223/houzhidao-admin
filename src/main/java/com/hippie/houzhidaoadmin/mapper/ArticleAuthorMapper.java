package com.hippie.houzhidaoadmin.mapper;

import com.hippie.houzhidaoadmin.domain.ArticleAuthor;
import com.hippie.houzhidaoadmin.domain.example.ArticleAuthorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ArticleAuthorMapper {
    int countByExample(ArticleAuthorExample example);

    int deleteByExample(ArticleAuthorExample example);

    int insert(ArticleAuthor record);

    int insertSelective(ArticleAuthor record);

    List<ArticleAuthor> selectByExampleWithRowbounds(ArticleAuthorExample example, RowBounds rowBounds);

    List<ArticleAuthor> selectByExample(ArticleAuthorExample example);

    int updateByExampleSelective(@Param("record") ArticleAuthor record, @Param("example") ArticleAuthorExample example);

    int updateByExample(@Param("record") ArticleAuthor record, @Param("example") ArticleAuthorExample example);
}