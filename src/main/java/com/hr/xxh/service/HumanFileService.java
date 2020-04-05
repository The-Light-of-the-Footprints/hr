package com.hr.xxh.service;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hr.entity.HumanFileWithBLOBs;

public interface HumanFileService {
	//查询全部HumanFile
    List<HumanFileWithBLOBs> queryAllHumanFile();
    
    //修改humanfile信息
    int updateByPrimaryKeySelective(HumanFileWithBLOBs record);
    
    //登记humanfile
    int insert(HumanFileWithBLOBs record);
    
    //未复核信息查询
    List<HumanFileWithBLOBs> queryAllHumanFileByCheck_Stutas();
    
    //上传图片
    int updatePicture(HumanFileWithBLOBs record);
    
    //上传附件
    int updateattAchmentName(HumanFileWithBLOBs record);
    
    //删除档案
    int updateDelete(HumanFileWithBLOBs record);
    
    //档案变更模糊查询
    List<HumanFileWithBLOBs> queryAllByName(HumanFileWithBLOBs record);
    List<HumanFileWithBLOBs> queryAllByCount(HumanFileWithBLOBs record,Date startTime,Date endTime);
    
    List<HumanFileWithBLOBs> queryAllHumanFile2();
    
    //永久删除查询
    List<HumanFileWithBLOBs> queryAllHumanFileByCheck_Stutas_delete();
    
    //永久删除
    int deleteByPrimaryKey(String humanId);
    
    //删除查询
    List<HumanFileWithBLOBs> queryAllByDelete(HumanFileWithBLOBs record);
    
    //档案查询查看
    List<HumanFileWithBLOBs> queryAllHumanFile3();
    List<HumanFileWithBLOBs> queryAllByQuery(HumanFileWithBLOBs record);
    
    //模糊查询
    List<HumanFileWithBLOBs> queryAllByQueryLocate(HumanFileWithBLOBs record,Date startTime,Date endTime);
    List<HumanFileWithBLOBs> queryAllByDeleteLocate(HumanFileWithBLOBs record,Date startTime,Date endTime);
    List<HumanFileWithBLOBs> queryAllByRecoveryLocate(HumanFileWithBLOBs record,Date startTime,Date endTime);
}
