package com.hr.jiashiq.mapper;

import com.hr.entity.EngageAnswerDetails;
import com.hr.entity.EngageAnswerDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngageAnswerDetailsMapper {
    long countByExample(EngageAnswerDetailsExample example);

    int deleteByExample(EngageAnswerDetailsExample example);

    int deleteByPrimaryKey(Short andId);

    int insert(EngageAnswerDetails record);

    int insertSelective(EngageAnswerDetails record);

    List<EngageAnswerDetails> selectByExample(EngageAnswerDetailsExample example);

    EngageAnswerDetails selectByPrimaryKey(Short andId);

    int updateByExampleSelective(@Param("record") EngageAnswerDetails record, @Param("example") EngageAnswerDetailsExample example);

    int updateByExample(@Param("record") EngageAnswerDetails record, @Param("example") EngageAnswerDetailsExample example);

    int updateByPrimaryKeySelective(EngageAnswerDetails record);

    int updateByPrimaryKey(EngageAnswerDetails record);
}