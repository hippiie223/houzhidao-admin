package com.hippie.houzhidaoadmin.mapper;

import com.hippie.houzhidaoadmin.domain.TestPaperReply;
import com.hippie.houzhidaoadmin.domain.example.TestPaperReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TestPaperReplyMapper {
    int countByExample(TestPaperReplyExample example);

    int deleteByExample(TestPaperReplyExample example);

    int insert(TestPaperReply record);

    int insertSelective(TestPaperReply record);

    List<TestPaperReply> selectByExampleWithRowbounds(TestPaperReplyExample example, RowBounds rowBounds);

    List<TestPaperReply> selectByExample(TestPaperReplyExample example);

    int updateByExampleSelective(@Param("record") TestPaperReply record, @Param("example") TestPaperReplyExample example);

    int updateByExample(@Param("record") TestPaperReply record, @Param("example") TestPaperReplyExample example);
}