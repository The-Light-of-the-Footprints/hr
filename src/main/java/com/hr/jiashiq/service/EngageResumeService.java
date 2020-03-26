package com.hr.jiashiq.service;

import java.util.List;

import com.hr.entity.EngageResume;
import com.hr.entity.EngageResumeWithBLOBs;

public interface EngageResumeService {
	Integer insertEngageResume(EngageResumeWithBLOBs er);
	Integer queryCount(EngageResume er);
	List<EngageResume> queryByWhere(EngageResume er,Integer page,Integer rows);
	Integer queryCount2(EngageResume er);
	List<EngageResume> queryByWhere2(EngageResume er,Integer page,Integer rows);
	EngageResume queryById(Integer id);
	Integer updateEngageResume(EngageResumeWithBLOBs er);
}
