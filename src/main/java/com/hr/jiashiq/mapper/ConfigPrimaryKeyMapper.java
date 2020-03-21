package com.hr.jiashiq.mapper;

import com.hr.entity.ConfigPrimaryKey;
import com.hr.entity.ConfigPrimaryKeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigPrimaryKeyMapper {
    long countByExample(ConfigPrimaryKeyExample example);

    int deleteByExample(ConfigPrimaryKeyExample example);

    int deleteByPrimaryKey(Short prkId);

    int insert(ConfigPrimaryKey record);

    int insertSelective(ConfigPrimaryKey record);

    List<ConfigPrimaryKey> selectByExample(ConfigPrimaryKeyExample example);

    ConfigPrimaryKey selectByPrimaryKey(Short prkId);

    int updateByExampleSelective(@Param("record") ConfigPrimaryKey record, @Param("example") ConfigPrimaryKeyExample example);

    int updateByExample(@Param("record") ConfigPrimaryKey record, @Param("example") ConfigPrimaryKeyExample example);

    int updateByPrimaryKeySelective(ConfigPrimaryKey record);

    int updateByPrimaryKey(ConfigPrimaryKey record);
}