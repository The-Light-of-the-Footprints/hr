package com.hr.jiashiq.mapper;

import com.hr.entity.ConfigPublicChar;
import com.hr.entity.ConfigPublicCharExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigPublicCharMapper {
    long countByExample(ConfigPublicCharExample example);

    int deleteByExample(ConfigPublicCharExample example);

    int deleteByPrimaryKey(Integer pbcId);

    int insert(ConfigPublicChar record);

    int insertSelective(ConfigPublicChar record);

    List<ConfigPublicChar> selectByExample(ConfigPublicCharExample example);

    ConfigPublicChar selectByPrimaryKey(Integer pbcId);

    int updateByExampleSelective(@Param("record") ConfigPublicChar record, @Param("example") ConfigPublicCharExample example);

    int updateByExample(@Param("record") ConfigPublicChar record, @Param("example") ConfigPublicCharExample example);

    int updateByPrimaryKeySelective(ConfigPublicChar record);

    int updateByPrimaryKey(ConfigPublicChar record);
}