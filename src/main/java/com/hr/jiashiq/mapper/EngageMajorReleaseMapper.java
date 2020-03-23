package com.hr.jiashiq.mapper;

import com.hr.entity.EngageMajorRelease;
import com.hr.entity.EngageMajorReleaseExample;
import com.hr.entity.EngageMajorReleaseWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngageMajorReleaseMapper {
    long countByExample(EngageMajorReleaseExample example);

    int deleteByExample(EngageMajorReleaseExample example);

    int deleteByPrimaryKey(Short mreId);

    int insert(EngageMajorReleaseWithBLOBs record);

    int insertSelective(EngageMajorReleaseWithBLOBs record);

    List<EngageMajorReleaseWithBLOBs> selectByExampleWithBLOBs(EngageMajorReleaseExample example);

    List<EngageMajorRelease> selectByExample(EngageMajorReleaseExample example);

    EngageMajorReleaseWithBLOBs selectByPrimaryKey(Short mreId);

    int updateByExampleSelective(@Param("record") EngageMajorReleaseWithBLOBs record, @Param("example") EngageMajorReleaseExample example);

    int updateByExampleWithBLOBs(@Param("record") EngageMajorReleaseWithBLOBs record, @Param("example") EngageMajorReleaseExample example);

    int updateByExample(@Param("record") EngageMajorRelease record, @Param("example") EngageMajorReleaseExample example);

    int updateByPrimaryKeySelective(EngageMajorReleaseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EngageMajorReleaseWithBLOBs record);

    int updateByPrimaryKey(EngageMajorRelease record);
}