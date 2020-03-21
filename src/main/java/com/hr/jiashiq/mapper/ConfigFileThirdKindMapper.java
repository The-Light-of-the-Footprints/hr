package com.hr.jiashiq.mapper;

import com.hr.entity.ConfigFileThirdKind;
import com.hr.entity.ConfigFileThirdKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigFileThirdKindMapper {
    long countByExample(ConfigFileThirdKindExample example);

    int deleteByExample(ConfigFileThirdKindExample example);

    int deleteByPrimaryKey(Integer thirdKindId);

    int insert(ConfigFileThirdKind record);

    int insertSelective(ConfigFileThirdKind record);

    List<ConfigFileThirdKind> selectByExample(ConfigFileThirdKindExample example);

    ConfigFileThirdKind selectByPrimaryKey(Integer thirdKindId);

    int updateByExampleSelective(@Param("record") ConfigFileThirdKind record, @Param("example") ConfigFileThirdKindExample example);

    int updateByExample(@Param("record") ConfigFileThirdKind record, @Param("example") ConfigFileThirdKindExample example);

    int updateByPrimaryKeySelective(ConfigFileThirdKind record);

    int updateByPrimaryKey(ConfigFileThirdKind record);
}