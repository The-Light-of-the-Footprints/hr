package com.hr.jiashiq.mapper;

import com.hr.entity.HumanFile;
import com.hr.entity.HumanFileExample;
import com.hr.entity.HumanFileWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HumanFileMapper {
    long countByExample(HumanFileExample example);

    int deleteByExample(HumanFileExample example);

    int deleteByPrimaryKey(String humanId);

    int insert(HumanFileWithBLOBs record);

    int insertSelective(HumanFileWithBLOBs record);

    List<HumanFileWithBLOBs> selectByExampleWithBLOBs(HumanFileExample example);

    List<HumanFile> selectByExample(HumanFileExample example);

    HumanFileWithBLOBs selectByPrimaryKey(String humanId);

    int updateByExampleSelective(@Param("record") HumanFileWithBLOBs record, @Param("example") HumanFileExample example);

    int updateByExampleWithBLOBs(@Param("record") HumanFileWithBLOBs record, @Param("example") HumanFileExample example);

    int updateByExample(@Param("record") HumanFile record, @Param("example") HumanFileExample example);

    int updateByPrimaryKeySelective(HumanFileWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HumanFileWithBLOBs record);

    int updateByPrimaryKey(HumanFile record);
}