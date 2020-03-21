package com.hr.jiashiq.mapper;

import com.hr.entity.SalaryStandard;
import com.hr.entity.SalaryStandardExample;
import com.hr.entity.SalaryStandardWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalaryStandardMapper {
    long countByExample(SalaryStandardExample example);

    int deleteByExample(SalaryStandardExample example);

    int deleteByPrimaryKey(String standardId);

    int insert(SalaryStandardWithBLOBs record);

    int insertSelective(SalaryStandardWithBLOBs record);

    List<SalaryStandardWithBLOBs> selectByExampleWithBLOBs(SalaryStandardExample example);

    List<SalaryStandard> selectByExample(SalaryStandardExample example);

    SalaryStandardWithBLOBs selectByPrimaryKey(String standardId);

    int updateByExampleSelective(@Param("record") SalaryStandardWithBLOBs record, @Param("example") SalaryStandardExample example);

    int updateByExampleWithBLOBs(@Param("record") SalaryStandardWithBLOBs record, @Param("example") SalaryStandardExample example);

    int updateByExample(@Param("record") SalaryStandard record, @Param("example") SalaryStandardExample example);

    int updateByPrimaryKeySelective(SalaryStandardWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SalaryStandardWithBLOBs record);

    int updateByPrimaryKey(SalaryStandard record);
}