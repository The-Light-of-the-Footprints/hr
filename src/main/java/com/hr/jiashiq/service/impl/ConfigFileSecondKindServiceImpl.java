package com.hr.jiashiq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.entity.ConfigFileSecondKind;
import com.hr.entity.ConfigFileSecondKindExample;
import com.hr.entity.ConfigFileSecondKindExample.Criteria;
import com.hr.jiashiq.mapper.ConfigFileSecondKindMapper;
import com.hr.jiashiq.service.ConfigFileSecondKindService;
@Service("cfsks")
public class ConfigFileSecondKindServiceImpl implements ConfigFileSecondKindService {
	@Autowired
	private ConfigFileSecondKindMapper cfskm;
	@Override
	public ConfigFileSecondKind queryByName(Integer id) {
		// TODO Auto-generated method stub
		return cfskm.selectByPrimaryKey(id);
	}
	@Override
	public List<ConfigFileSecondKind> queryByFirstKindId(Integer id) {
		// TODO Auto-generated method stub
		ConfigFileSecondKindExample configFileSecondKindExample = new ConfigFileSecondKindExample();
		Criteria createCriteria = configFileSecondKindExample.createCriteria();
		createCriteria.andFirstKindIdEqualTo(id);
		return cfskm.selectByExample(configFileSecondKindExample);
	}

}
