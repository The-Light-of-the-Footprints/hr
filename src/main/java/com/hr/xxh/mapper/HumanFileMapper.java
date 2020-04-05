package com.hr.xxh.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hr.entity.HumanFile;
import com.hr.entity.HumanFileWithBLOBs;
@Repository
public interface HumanFileMapper {
    int deleteByPrimaryKey(String humanId);

    int insert(HumanFileWithBLOBs record);

    int insertSelective(HumanFileWithBLOBs record);

    HumanFileWithBLOBs selectByPrimaryKey(String humanId);

    int updateByPrimaryKeySelective(HumanFileWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HumanFileWithBLOBs record);

    int updateByPrimaryKey(HumanFile record);
    
    List<HumanFileWithBLOBs> queryAllHumanFile();
    
    List<HumanFileWithBLOBs> queryAllHumanFileByCheck_Stutas();
    
    int updatePicture(HumanFileWithBLOBs record);
    
    int updateattAchmentName(HumanFileWithBLOBs record);
    
    int updateDelete(HumanFileWithBLOBs record);
    
    List<HumanFileWithBLOBs> queryAllByName(HumanFileWithBLOBs record);
    
    List<HumanFileWithBLOBs> queryAllByCount(@Param("record") HumanFileWithBLOBs record,@Param("startTime") Date startTime,@Param("endTime") Date endTime);
    
    List<HumanFileWithBLOBs> queryAllByQueryLocate(@Param("record") HumanFileWithBLOBs record,@Param("startTime") Date startTime,@Param("endTime") Date endTime);
    
    List<HumanFileWithBLOBs> queryAllByDeleteLocate(@Param("record") HumanFileWithBLOBs record,@Param("startTime") Date startTime,@Param("endTime") Date endTime);
    
    List<HumanFileWithBLOBs> queryAllByRecoveryLocate(@Param("record") HumanFileWithBLOBs record,@Param("startTime") Date startTime,@Param("endTime") Date endTime);
    
    List<HumanFileWithBLOBs> queryAllHumanFile2();
    
    List<HumanFileWithBLOBs> queryAllHumanFileByCheck_Stutas_delete();
    
    List<HumanFileWithBLOBs> queryAllByDelete(HumanFileWithBLOBs record);
    
    List<HumanFileWithBLOBs> queryAllHumanFile3();
    
    List<HumanFileWithBLOBs> queryAllByQuery(HumanFileWithBLOBs record);
}