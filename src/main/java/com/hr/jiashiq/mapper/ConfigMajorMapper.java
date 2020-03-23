package com.hr.jiashiq.mapper;

import com.hr.entity.ConfigMajor;
import com.hr.entity.ConfigMajorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigMajorMapper {
    long countByExample(ConfigMajorExample example);

    int deleteByExample(ConfigMajorExample example);

    int deleteByPrimaryKey(Integer majorId);

    int insert(ConfigMajor record);

    int insertSelective(ConfigMajor record);

    List<ConfigMajor> selectByExample(ConfigMajorExample example);

    ConfigMajor selectByPrimaryKey(Integer majorId);

    int updateByExampleSelective(@Param("record") ConfigMajor record, @Param("example") ConfigMajorExample example);

    int updateByExample(@Param("record") ConfigMajor record, @Param("example") ConfigMajorExample example);

    int updateByPrimaryKeySelective(ConfigMajor record);

    int updateByPrimaryKey(ConfigMajor record);
}