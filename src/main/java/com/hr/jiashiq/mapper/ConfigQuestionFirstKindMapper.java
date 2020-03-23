package com.hr.jiashiq.mapper;

import com.hr.entity.ConfigQuestionFirstKind;
import com.hr.entity.ConfigQuestionFirstKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigQuestionFirstKindMapper {
    long countByExample(ConfigQuestionFirstKindExample example);

    int deleteByExample(ConfigQuestionFirstKindExample example);

    int deleteByPrimaryKey(Short firstKindId);

    int insert(ConfigQuestionFirstKind record);

    int insertSelective(ConfigQuestionFirstKind record);

    List<ConfigQuestionFirstKind> selectByExample(ConfigQuestionFirstKindExample example);

    ConfigQuestionFirstKind selectByPrimaryKey(Short firstKindId);

    int updateByExampleSelective(@Param("record") ConfigQuestionFirstKind record, @Param("example") ConfigQuestionFirstKindExample example);

    int updateByExample(@Param("record") ConfigQuestionFirstKind record, @Param("example") ConfigQuestionFirstKindExample example);

    int updateByPrimaryKeySelective(ConfigQuestionFirstKind record);

    int updateByPrimaryKey(ConfigQuestionFirstKind record);
}