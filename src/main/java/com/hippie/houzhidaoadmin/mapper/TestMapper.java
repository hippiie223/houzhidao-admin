package com.hippie.houzhidaoadmin.mapper;

import com.hippie.houzhidaoadmin.domain.Test;
import com.hippie.houzhidaoadmin.domain.example.TestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TestMapper {
    int countByExample(TestExample example);

    int deleteByExample(TestExample example);

    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByExampleWithRowbounds(TestExample example, RowBounds rowBounds);

    List<Test> selectByExample(TestExample example);

    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);
}