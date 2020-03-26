package com.hr.jiashiq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.entity.ConfigFileThirdKind;
import com.hr.entity.ConfigFileThirdKindExample;
import com.hr.entity.ConfigFileThirdKindExample.Criteria;
import com.hr.jiashiq.mapper.ConfigFileThirdKindMapper;
import com.hr.jiashiq.service.ConfigFileThirdKindService;

@Service("cftks")
public class ConfigFileThirdKindServiceImpl implements ConfigFileThirdKindService{
	@Autowired
	private ConfigFileThirdKindMapper cftkm;
	@Override
	public List<ConfigFileThirdKind> queryConfigFileThirdKindName(Integer id) {
		// TODO Auto-generated method stub
		ConfigFileThirdKindExample configFileThirdKindExample = new ConfigFileThirdKindExample();
		Criteria createCriteria = configFileThirdKindExample.createCriteria();
		createCriteria.andThirdKindIdEqualTo(id);
		return cftkm.selectByExample(configFileThirdKindExample);
	}
	@Override
	public ConfigFileThirdKind queryById(Integer id) {
		// TODO Auto-generated method stub
		return cftkm.selectByPrimaryKey(id);
	}
	@Override
	public List<ConfigFileThirdKind> queryBySecondKindId(Integer id) {
		// TODO Auto-generated method stub
		ConfigFileThirdKindExample configFileThirdKindExample = new ConfigFileThirdKindExample();
		Criteria createCriteria = configFileThirdKindExample.createCriteria();
		createCriteria.andSecondKindIdEqualTo(id);
		return cftkm.selectByExample(configFileThirdKindExample);
	}

}
