package com.hr.jiashiq.mapper;

import com.hr.entity.EngageInterview;
import com.hr.entity.EngageInterviewExample;
import com.hr.entity.EngageInterviewWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngageInterviewMapper {
    long countByExample(EngageInterviewExample example);

    int deleteByExample(EngageInterviewExample example);

    int deleteByPrimaryKey(Short einId);

    int insert(EngageInterviewWithBLOBs record);

    int insertSelective(EngageInterviewWithBLOBs record);

    List<EngageInterviewWithBLOBs> selectByExampleWithBLOBs(EngageInterviewExample example);

    List<EngageInterview> selectByExample(EngageInterviewExample example);

    EngageInterviewWithBLOBs selectByPrimaryKey(Short einId);

    int updateByExampleSelective(@Param("record") EngageInterviewWithBLOBs record, @Param("example") EngageInterviewExample example);

    int updateByExampleWithBLOBs(@Param("record") EngageInterviewWithBLOBs record, @Param("example") EngageInterviewExample example);

    int updateByExample(@Param("record") EngageInterview record, @Param("example") EngageInterviewExample example);

    int updateByPrimaryKeySelective(EngageInterviewWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EngageInterviewWithBLOBs record);

    int updateByPrimaryKey(EngageInterview record);
}