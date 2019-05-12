package com.hippie.houzhidaoadmin.mapper;

import com.hippie.houzhidaoadmin.domain.Label;
import com.hippie.houzhidaoadmin.domain.example.LabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LabelMapper {
    long countByExample(LabelExample example);

    int deleteByExample(LabelExample example);

    int insert(Label record);

    int insertSelective(Label record);

    List<Label> selectByExampleWithRowbounds(LabelExample example, RowBounds rowBounds);

    List<Label> selectByExample(LabelExample example);

    int updateByExampleSelective(@Param("record") Label record, @Param("example") LabelExample example);

    int updateByExample(@Param("record") Label record, @Param("example") LabelExample example);
}