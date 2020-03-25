package com.hr.jiashiq.mapper;

import com.hr.entity.SalaryStandardDetails;
import com.hr.entity.SalaryStandardDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalaryStandardDetailsMapper {
    long countByExample(SalaryStandardDetailsExample example);

    int deleteByExample(SalaryStandardDetailsExample example);

    int deleteByPrimaryKey(Short itemId);

    int insert(SalaryStandardDetails record);

    int insertSelective(SalaryStandardDetails record);

    List<SalaryStandardDetails> selectByExample(SalaryStandardDetailsExample example);

    SalaryStandardDetails selectByPrimaryKey(Short itemId);

    int updateByExampleSelective(@Param("record") SalaryStandardDetails record, @Param("example") SalaryStandardDetailsExample example);

    int updateByExample(@Param("record") SalaryStandardDetails record, @Param("example") SalaryStandardDetailsExample example);

    int updateByPrimaryKeySelective(SalaryStandardDetails record);

    int updateByPrimaryKey(SalaryStandardDetails record);
}