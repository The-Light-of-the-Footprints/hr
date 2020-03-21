package com.hr.jiashiq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.entity.SysRight;
import com.hr.jiashiq.mapper.SysRightMapper;
import com.hr.jiashiq.service.SysRightService;
@Service
public class SysRightServiceImp implements SysRightService {

	@Autowired
	private SysRightMapper srm;
	@Override
	public List<SysRight> queryRight() {
		System.out.println("SysRightServiceImp");
		return srm.queryRight();
	}
	@Override
	public List<SysRight> queryRightByParentId(Integer id) {
		System.out.println("queryRightByParentId");	
		return srm.queryRightByParentId(id);
	}

}
