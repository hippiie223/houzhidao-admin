package com.hippie.houzhidaoadmin.mapper;

import com.hippie.houzhidaoadmin.domain.TopicPostReply;
import com.hippie.houzhidaoadmin.domain.example.TopicPostReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TopicPostReplyMapper {
    int countByExample(TopicPostReplyExample example);

    int deleteByExample(TopicPostReplyExample example);

    int insert(TopicPostReply record);

    int insertSelective(TopicPostReply record);

    List<TopicPostReply> selectByExampleWithBLOBsWithRowbounds(TopicPostReplyExample example, RowBounds rowBounds);

    List<TopicPostReply> selectByExampleWithBLOBs(TopicPostReplyExample example);

    List<TopicPostReply> selectByExampleWithRowbounds(TopicPostReplyExample example, RowBounds rowBounds);

    List<TopicPostReply> selectByExample(TopicPostReplyExample example);

    int updateByExampleSelective(@Param("record") TopicPostReply record, @Param("example") TopicPostReplyExample example);

    int updateByExampleWithBLOBs(@Param("record") TopicPostReply record, @Param("example") TopicPostReplyExample example);

    int updateByExample(@Param("record") TopicPostReply record, @Param("example") TopicPostReplyExample example);
}