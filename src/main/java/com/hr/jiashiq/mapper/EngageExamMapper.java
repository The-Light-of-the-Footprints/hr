package com.hr.jiashiq.mapper;

import com.hr.entity.EngageExam;
import com.hr.entity.EngageExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngageExamMapper {
    long countByExample(EngageExamExample example);

    int deleteByExample(EngageExamExample example);

    int deleteByPrimaryKey(String examNumber);

    int insert(EngageExam record);

    int insertSelective(EngageExam record);

    List<EngageExam> selectByExample(EngageExamExample example);

    EngageExam selectByPrimaryKey(String examNumber);

    int updateByExampleSelective(@Param("record") EngageExam record, @Param("example") EngageExamExample example);

    int updateByExample(@Param("record") EngageExam record, @Param("example") EngageExamExample example);

    int updateByPrimaryKeySelective(EngageExam record);

    int updateByPrimaryKey(EngageExam record);
}