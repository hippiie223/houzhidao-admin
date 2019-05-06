package com.hippie.houzhidaoadmin.mapper;

import com.hippie.houzhidaoadmin.domain.TopicPost;
import com.hippie.houzhidaoadmin.domain.example.TopicPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TopicPostMapper {
    int countByExample(TopicPostExample example);

    int deleteByExample(TopicPostExample example);

    int insert(TopicPost record);

    int insertSelective(TopicPost record);

    List<TopicPost> selectByExampleWithBLOBsWithRowbounds(TopicPostExample example, RowBounds rowBounds);

    List<TopicPost> selectByExampleWithBLOBs(TopicPostExample example);

    List<TopicPost> selectByExampleWithRowbounds(TopicPostExample example, RowBounds rowBounds);

    List<TopicPost> selectByExample(TopicPostExample example);

    int updateByExampleSelective(@Param("record") TopicPost record, @Param("example") TopicPostExample example);

    int updateByExampleWithBLOBs(@Param("record") TopicPost record, @Param("example") TopicPostExample example);

    int updateByExample(@Param("record") TopicPost record, @Param("example") TopicPostExample example);
}