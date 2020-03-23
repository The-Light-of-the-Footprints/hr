package com.hr.jiashiq.mapper;

import com.hr.entity.EngageExamDetails;
import com.hr.entity.EngageExamDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngageExamDetailsMapper {
    long countByExample(EngageExamDetailsExample example);

    int deleteByExample(EngageExamDetailsExample example);

    int deleteByPrimaryKey(Short exdId);

    int insert(EngageExamDetails record);

    int insertSelective(EngageExamDetails record);

    List<EngageExamDetails> selectByExample(EngageExamDetailsExample example);

    EngageExamDetails selectByPrimaryKey(Short exdId);

    int updateByExampleSelective(@Param("record") EngageExamDetails record, @Param("example") EngageExamDetailsExample example);

    int updateByExample(@Param("record") EngageExamDetails record, @Param("example") EngageExamDetailsExample example);

    int updateByPrimaryKeySelective(EngageExamDetails record);

    int updateByPrimaryKey(EngageExamDetails record);
}