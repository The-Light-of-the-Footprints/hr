package com.hr.jiashiq.mapper;

import com.hr.entity.Training;
import com.hr.entity.TrainingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainingMapper {
    long countByExample(TrainingExample example);

    int deleteByExample(TrainingExample example);

    int deleteByPrimaryKey(Short traId);

    int insert(Training record);

    int insertSelective(Training record);

    List<Training> selectByExampleWithBLOBs(TrainingExample example);

    List<Training> selectByExample(TrainingExample example);

    Training selectByPrimaryKey(Short traId);

    int updateByExampleSelective(@Param("record") Training record, @Param("example") TrainingExample example);

    int updateByExampleWithBLOBs(@Param("record") Training record, @Param("example") TrainingExample example);

    int updateByExample(@Param("record") Training record, @Param("example") TrainingExample example);

    int updateByPrimaryKeySelective(Training record);

    int updateByPrimaryKeyWithBLOBs(Training record);

    int updateByPrimaryKey(Training record);
}