package com.hr.jiashiq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.entity.EngageResume;
import com.hr.entity.EngageResumeExample;
import com.hr.entity.EngageResumeExample.Criteria;
import com.hr.entity.EngageResumeWithBLOBs;
import com.hr.jiashiq.mapper.EngageResumeMapper;
import com.hr.jiashiq.service.EngageResumeService;

@Service("ers")
public class EngageResumeServiceImpl implements EngageResumeService {
	@Autowired
	private EngageResumeMapper erm;

	@Override
	public Integer insertEngageResume(EngageResumeWithBLOBs er) {
		// TODO Auto-generated method stub
		return erm.insertSelective(er);
	}

	
	@Override
	public List<EngageResume> queryByWhere(EngageResume er, Integer page, Integer rows) {
		// TODO Auto-generated method stub
		List<EngageResume> selectByExample = erm.queryByWhere(er, page,rows);
		return selectByExample;
	}


	@Override
	public Integer queryCount(EngageResume er) {
		// TODO Auto-generated method stub
		EngageResumeExample engageResumeExample = new EngageResumeExample();
		Criteria createCriteria = engageResumeExample.createCriteria();
		if(er.getHumanMajorId()!=null) {
			createCriteria.andHumanMajorIdEqualTo(er.getHumanMajorId());
		}
		if(er.getHumanName()!=null) {
			createCriteria.andHumanNameLike(er.getHumanName());
		}
		if(er.getRegistTime()!=null) {
			createCriteria.andRegistTimeBetween(er.getRegistTime(), er.getCheckTime());
		}
		createCriteria.andCheckStatusEqualTo(new Short(0+""));
		List<EngageResume> selectByExample = erm.selectByExample(engageResumeExample);
		return selectByExample.size();
	}


	@Override
	public EngageResume queryById(Integer id) {
		// TODO Auto-generated method stub
		return erm.selectByPrimaryKey(new Short(id+""));
	}


	@Override
	public Integer updateEngageResume(EngageResumeWithBLOBs er) {
		// TODO Auto-generated method stub
		return erm.updateByPrimaryKeySelective(er);
	}


	@Override
	public Integer queryCount2(EngageResume er) {
		EngageResumeExample engageResumeExample = new EngageResumeExample();
		Criteria createCriteria = engageResumeExample.createCriteria();
		if(er.getHumanMajorId()!=null) {
			createCriteria.andHumanMajorIdEqualTo(er.getHumanMajorId());
		}
		if(er.getHumanName()!=null) {
			createCriteria.andHumanNameLike(er.getHumanName());
		}
		if(er.getRegistTime()!=null) {
			createCriteria.andRegistTimeBetween(er.getRegistTime(), er.getCheckTime());
		}
		createCriteria.andCheckStatusEqualTo(new Short(2+""));
		List<EngageResume> selectByExample = erm.selectByExample(engageResumeExample);
		return selectByExample.size();
	}


	@Override
	public List<EngageResume> queryByWhere2(EngageResume er, Integer page, Integer rows) {
		// TODO Auto-generated method stub
		List<EngageResume> selectByExample = erm.queryByWhere2(er, page,rows);
		return selectByExample;
	}
}
