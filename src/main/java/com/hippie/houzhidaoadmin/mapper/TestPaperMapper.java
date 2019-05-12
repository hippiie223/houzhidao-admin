package com.hippie.houzhidaoadmin.mapper;

import com.hippie.houzhidaoadmin.domain.TestPaper;
import com.hippie.houzhidaoadmin.domain.example.TestPaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TestPaperMapper {
    int countByExample(TestPaperExample example);

    int deleteByExample(TestPaperExample example);

    int insert(TestPaper record);

    int insertSelective(TestPaper record);

    List<TestPaper> selectByExampleWithRowbounds(TestPaperExample example, RowBounds rowBounds);

    List<TestPaper> selectByExample(TestPaperExample example);

    int updateByExampleSelective(@Param("record") TestPaper record, @Param("example") TestPaperExample example);

    int updateByExample(@Param("record") TestPaper record, @Param("example") TestPaperExample example);
}