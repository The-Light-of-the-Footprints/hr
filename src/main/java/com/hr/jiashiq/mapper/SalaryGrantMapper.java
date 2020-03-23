package com.hr.jiashiq.mapper;

import com.hr.entity.SalaryGrant;
import com.hr.entity.SalaryGrantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalaryGrantMapper {
    long countByExample(SalaryGrantExample example);

    int deleteByExample(SalaryGrantExample example);

    int deleteByPrimaryKey(String salaryGrantId);

    int insert(SalaryGrant record);

    int insertSelective(SalaryGrant record);

    List<SalaryGrant> selectByExample(SalaryGrantExample example);

    SalaryGrant selectByPrimaryKey(String salaryGrantId);

    int updateByExampleSelective(@Param("record") SalaryGrant record, @Param("example") SalaryGrantExample example);

    int updateByExample(@Param("record") SalaryGrant record, @Param("example") SalaryGrantExample example);

    int updateByPrimaryKeySelective(SalaryGrant record);

    int updateByPrimaryKey(SalaryGrant record);
}