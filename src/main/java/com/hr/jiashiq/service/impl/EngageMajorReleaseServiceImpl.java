package com.hr.jiashiq.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.entity.EngageMajorRelease;
import com.hr.entity.EngageMajorReleaseExample;
import com.hr.entity.EngageMajorReleaseWithBLOBs;
import com.hr.jiashiq.mapper.EngageMajorReleaseMapper;
import com.hr.jiashiq.service.EngageMajorReleaseService;

@Service("emrs")
public class EngageMajorReleaseServiceImpl implements EngageMajorReleaseService {
	@Autowired
	private EngageMajorReleaseMapper emrm;
	@Override
	public List<EngageMajorRelease> queryEngageMajorReleaseService(Integer page,Integer rows) {
		return emrm.queryByFen(page,rows);
	}
	@Override
	public Integer queryCount() {
		// TODO Auto-generated method stub
		List<EngageMajorRelease> selectByExample = emrm.selectByExample(new EngageMajorReleaseExample());
		return selectByExample.size();
	}
	@Override
	public EngageMajorRelease queryByMreId(Integer id) {
		// TODO Auto-generated method stub
		return emrm.selectByPrimaryKey(Short.valueOf(id+""));
	}
	@Override
	public Integer deleteById(Integer id) {
		// TODO Auto-generated method stub
		return emrm.deleteByPrimaryKey(Short.valueOf(id+""));
	}
	@Override
	public Integer updateEngageMajorRelease(EngageMajorReleaseWithBLOBs emr) {
		// TODO Auto-generated method stub
		return emrm.updateByPrimaryKeySelective(emr);
	}
	@Override
	public Integer insertEngageMajorRelease(EngageMajorReleaseWithBLOBs emr) {
		// TODO Auto-generated method stub
		return emrm.insertSelective(emr);
	}

}
