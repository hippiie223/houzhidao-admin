package com.hippie.houzhidaoadmin.mapper;

import com.hippie.houzhidaoadmin.domain.TestPaperQuestion;
import com.hippie.houzhidaoadmin.domain.example.TestPaperQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TestPaperQuestionMapper {
    long countByExample(TestPaperQuestionExample example);

    int deleteByExample(TestPaperQuestionExample example);

    int insert(TestPaperQuestion record);

    int insertSelective(TestPaperQuestion record);

    List<TestPaperQuestion> selectByExampleWithBLOBsWithRowbounds(TestPaperQuestionExample example, RowBounds rowBounds);

    List<TestPaperQuestion> selectByExampleWithBLOBs(TestPaperQuestionExample example);

    List<TestPaperQuestion> selectByExampleWithRowbounds(TestPaperQuestionExample example, RowBounds rowBounds);

    List<TestPaperQuestion> selectByExample(TestPaperQuestionExample example);

    int updateByExampleSelective(@Param("record") TestPaperQuestion record, @Param("example") TestPaperQuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") TestPaperQuestion record, @Param("example") TestPaperQuestionExample example);

    int updateByExample(@Param("record") TestPaperQuestion record, @Param("example") TestPaperQuestionExample example);
}