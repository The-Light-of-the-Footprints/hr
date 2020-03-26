package com.hr.jiashiq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.entity.ConfigMajor;
import com.hr.entity.ConfigMajorExample;
import com.hr.entity.ConfigMajorExample.Criteria;
import com.hr.jiashiq.mapper.ConfigMajorMapper;
import com.hr.jiashiq.service.ConfigMajorService;

@Service("cms")
public class ConfigMajorServiceImpl implements ConfigMajorService {
	@Autowired
	private ConfigMajorMapper cmm;
	@Override
	public List<ConfigMajor> queryConfigMajorName(Integer id) {
		// TODO Auto-generated method stub
		ConfigMajorExample configMajorExample = new ConfigMajorExample();
		Criteria createCriteria = configMajorExample.createCriteria();
		createCriteria.andMajorIdEqualTo(id);
		return cmm.selectByExample(configMajorExample);
	}
	@Override
	public List<ConfigMajor> queryByConfigMajorId(Integer id) {
		// TODO Auto-generated method stub
		ConfigMajorExample configMajorExample = new ConfigMajorExample();
		Criteria createCriteria = configMajorExample.createCriteria();
		createCriteria.andMajorKindIdEqualTo(id);
		return cmm.selectByExample(configMajorExample);
	}
	@Override
	public ConfigMajor queryById(Integer id) {
		// TODO Auto-generated method stub
		return cmm.selectByPrimaryKey(id);
	}
	@Override
	public List<ConfigMajor> queryConfigMajor() {
		// TODO Auto-generated method stub
		return cmm.selectByExample(new ConfigMajorExample());
	}

}
