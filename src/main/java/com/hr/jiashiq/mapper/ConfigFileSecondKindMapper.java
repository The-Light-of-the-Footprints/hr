package com.hr.jiashiq.mapper;

import com.hr.entity.ConfigFileSecondKind;
import com.hr.entity.ConfigFileSecondKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigFileSecondKindMapper {
    long countByExample(ConfigFileSecondKindExample example);

    int deleteByExample(ConfigFileSecondKindExample example);

    int deleteByPrimaryKey(Integer secondKindId);

    int insert(ConfigFileSecondKind record);

    int insertSelective(ConfigFileSecondKind record);

    List<ConfigFileSecondKind> selectByExample(ConfigFileSecondKindExample example);

    ConfigFileSecondKind selectByPrimaryKey(Integer secondKindId);

    int updateByExampleSelective(@Param("record") ConfigFileSecondKind record, @Param("example") ConfigFileSecondKindExample example);

    int updateByExample(@Param("record") ConfigFileSecondKind record, @Param("example") ConfigFileSecondKindExample example);

    int updateByPrimaryKeySelective(ConfigFileSecondKind record);

    int updateByPrimaryKey(ConfigFileSecondKind record);
}