package com.hr.jiashiq.mapper;

import com.hr.entity.Bonus;
import com.hr.entity.BonusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BonusMapper {
    long countByExample(BonusExample example);

    int deleteByExample(BonusExample example);

    int deleteByPrimaryKey(Short bonId);

    int insert(Bonus record);

    int insertSelective(Bonus record);

    List<Bonus> selectByExampleWithBLOBs(BonusExample example);

    List<Bonus> selectByExample(BonusExample example);

    Bonus selectByPrimaryKey(Short bonId);

    int updateByExampleSelective(@Param("record") Bonus record, @Param("example") BonusExample example);

    int updateByExampleWithBLOBs(@Param("record") Bonus record, @Param("example") BonusExample example);

    int updateByExample(@Param("record") Bonus record, @Param("example") BonusExample example);

    int updateByPrimaryKeySelective(Bonus record);

    int updateByPrimaryKeyWithBLOBs(Bonus record);

    int updateByPrimaryKey(Bonus record);
}