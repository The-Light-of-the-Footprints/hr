package com.hr.jiashiq.mapper;

import com.hr.entity.EngageAnswer;
import com.hr.entity.EngageAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngageAnswerMapper {
    long countByExample(EngageAnswerExample example);

    int deleteByExample(EngageAnswerExample example);

    int deleteByPrimaryKey(Short ansId);

    int insert(EngageAnswer record);

    int insertSelective(EngageAnswer record);

    List<EngageAnswer> selectByExample(EngageAnswerExample example);

    EngageAnswer selectByPrimaryKey(Short ansId);

    int updateByExampleSelective(@Param("record") EngageAnswer record, @Param("example") EngageAnswerExample example);

    int updateByExample(@Param("record") EngageAnswer record, @Param("example") EngageAnswerExample example);

    int updateByPrimaryKeySelective(EngageAnswer record);

    int updateByPrimaryKey(EngageAnswer record);
}