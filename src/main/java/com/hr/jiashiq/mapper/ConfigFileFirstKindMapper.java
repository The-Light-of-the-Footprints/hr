package com.hr.jiashiq.mapper;

import com.hr.entity.ConfigFileFirstKind;
import com.hr.entity.ConfigFileFirstKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigFileFirstKindMapper {
    long countByExample(ConfigFileFirstKindExample example);

    int deleteByExample(ConfigFileFirstKindExample example);

    int deleteByPrimaryKey(Integer firstKindId);

    int insert(ConfigFileFirstKind record);

    int insertSelective(ConfigFileFirstKind record);

    List<ConfigFileFirstKind> selectByExample(ConfigFileFirstKindExample example);

    ConfigFileFirstKind selectByPrimaryKey(Integer firstKindId);

    int updateByExampleSelective(@Param("record") ConfigFileFirstKind record, @Param("example") ConfigFileFirstKindExample example);

    int updateByExample(@Param("record") ConfigFileFirstKind record, @Param("example") ConfigFileFirstKindExample example);

    int updateByPrimaryKeySelective(ConfigFileFirstKind record);

    int updateByPrimaryKey(ConfigFileFirstKind record);
}