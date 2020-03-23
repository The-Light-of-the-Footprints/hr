package com.hr.jiashiq.mapper;

import com.hr.entity.ConfigQuestionSecondKind;
import com.hr.entity.ConfigQuestionSecondKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigQuestionSecondKindMapper {
    long countByExample(ConfigQuestionSecondKindExample example);

    int deleteByExample(ConfigQuestionSecondKindExample example);

    int deleteByPrimaryKey(Short secondKindId);

    int insert(ConfigQuestionSecondKind record);

    int insertSelective(ConfigQuestionSecondKind record);

    List<ConfigQuestionSecondKind> selectByExample(ConfigQuestionSecondKindExample example);

    ConfigQuestionSecondKind selectByPrimaryKey(Short secondKindId);

    int updateByExampleSelective(@Param("record") ConfigQuestionSecondKind record, @Param("example") ConfigQuestionSecondKindExample example);

    int updateByExample(@Param("record") ConfigQuestionSecondKind record, @Param("example") ConfigQuestionSecondKindExample example);

    int updateByPrimaryKeySelective(ConfigQuestionSecondKind record);

    int updateByPrimaryKey(ConfigQuestionSecondKind record);
}