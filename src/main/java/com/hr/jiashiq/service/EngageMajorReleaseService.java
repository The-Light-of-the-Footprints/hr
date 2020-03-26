package com.hr.jiashiq.service;

import java.util.List;

import com.hr.entity.EngageMajorRelease;
import com.hr.entity.EngageMajorReleaseWithBLOBs;

public interface EngageMajorReleaseService {
	List<EngageMajorRelease> queryEngageMajorReleaseService(Integer page,Integer rows);
	Integer queryCount();
	EngageMajorRelease queryByMreId(Integer id);
	Integer deleteById(Integer id);
	Integer updateEngageMajorRelease(EngageMajorReleaseWithBLOBs emr);
	Integer insertEngageMajorRelease(EngageMajorReleaseWithBLOBs emr);
}
