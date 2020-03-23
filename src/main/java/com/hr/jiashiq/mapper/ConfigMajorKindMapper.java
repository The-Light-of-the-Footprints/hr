package com.hr.jiashiq.mapper;

import com.hr.entity.ConfigMajorKind;
import com.hr.entity.ConfigMajorKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigMajorKindMapper {
    long countByExample(ConfigMajorKindExample example);

    int deleteByExample(ConfigMajorKindExample example);

    int deleteByPrimaryKey(Integer majorKindId);

    int insert(ConfigMajorKind record);

    int insertSelective(ConfigMajorKind record);

    List<ConfigMajorKind> selectByExample(ConfigMajorKindExample example);

    ConfigMajorKind selectByPrimaryKey(Integer majorKindId);

    int updateByExampleSelective(@Param("record") ConfigMajorKind record, @Param("example") ConfigMajorKindExample example);

    int updateByExample(@Param("record") ConfigMajorKind record, @Param("example") ConfigMajorKindExample example);

    int updateByPrimaryKeySelective(ConfigMajorKind record);

    int updateByPrimaryKey(ConfigMajorKind record);
}