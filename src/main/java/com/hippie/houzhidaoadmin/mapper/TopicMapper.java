package com.hippie.houzhidaoadmin.mapper;

import com.hippie.houzhidaoadmin.domain.Topic;
import com.hippie.houzhidaoadmin.domain.example.TopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TopicMapper {
    long countByExample(TopicExample example);

    int deleteByExample(TopicExample example);

    int insert(Topic record);

    int insertSelective(Topic record);

    List<Topic> selectByExampleWithBLOBsWithRowbounds(TopicExample example, RowBounds rowBounds);

    List<Topic> selectByExampleWithBLOBs(TopicExample example);

    List<Topic> selectByExampleWithRowbounds(TopicExample example, RowBounds rowBounds);

    List<Topic> selectByExample(TopicExample example);

    int updateByExampleSelective(@Param("record") Topic record, @Param("example") TopicExample example);

    int updateByExampleWithBLOBs(@Param("record") Topic record, @Param("example") TopicExample example);

    int updateByExample(@Param("record") Topic record, @Param("example") TopicExample example);
}