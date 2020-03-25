package com.hr.jiashiq.mapper;

import com.hr.entity.EngageSubjects;
import com.hr.entity.EngageSubjectsExample;
import com.hr.entity.EngageSubjectsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngageSubjectsMapper {
    long countByExample(EngageSubjectsExample example);

    int deleteByExample(EngageSubjectsExample example);

    int deleteByPrimaryKey(Short subId);

    int insert(EngageSubjectsWithBLOBs record);

    int insertSelective(EngageSubjectsWithBLOBs record);

    List<EngageSubjectsWithBLOBs> selectByExampleWithBLOBs(EngageSubjectsExample example);

    List<EngageSubjects> selectByExample(EngageSubjectsExample example);

    EngageSubjectsWithBLOBs selectByPrimaryKey(Short subId);

    int updateByExampleSelective(@Param("record") EngageSubjectsWithBLOBs record, @Param("example") EngageSubjectsExample example);

    int updateByExampleWithBLOBs(@Param("record") EngageSubjectsWithBLOBs record, @Param("example") EngageSubjectsExample example);

    int updateByExample(@Param("record") EngageSubjects record, @Param("example") EngageSubjectsExample example);

    int updateByPrimaryKeySelective(EngageSubjectsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EngageSubjectsWithBLOBs record);

    int updateByPrimaryKey(EngageSubjects record);
}