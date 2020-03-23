package com.hr.jiashiq.service;

import java.util.List;

import com.hr.entity.SysRight;


public interface SysRightService {
	public List<SysRight> queryRight();
	public List<SysRight> queryRightByParentId(Integer id);
}
