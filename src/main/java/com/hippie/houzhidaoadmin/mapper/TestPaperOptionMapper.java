package com.hippie.houzhidaoadmin.mapper;

import com.hippie.houzhidaoadmin.domain.TestPaperOption;
import com.hippie.houzhidaoadmin.domain.example.TestPaperOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TestPaperOptionMapper {
    int countByExample(TestPaperOptionExample example);

    int deleteByExample(TestPaperOptionExample example);

    int insert(TestPaperOption record);

    int insertSelective(TestPaperOption record);

    List<TestPaperOption> selectByExampleWithBLOBsWithRowbounds(TestPaperOptionExample example, RowBounds rowBounds);

    List<TestPaperOption> selectByExampleWithBLOBs(TestPaperOptionExample example);

    List<TestPaperOption> selectByExampleWithRowbounds(TestPaperOptionExample example, RowBounds rowBounds);

    List<TestPaperOption> selectByExample(TestPaperOptionExample example);

    int updateByExampleSelective(@Param("record") TestPaperOption record, @Param("example") TestPaperOptionExample example);

    int updateByExampleWithBLOBs(@Param("record") TestPaperOption record, @Param("example") TestPaperOptionExample example);

    int updateByExample(@Param("record") TestPaperOption record, @Param("example") TestPaperOptionExample example);
}