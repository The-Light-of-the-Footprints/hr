package com.hr.jiashiq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.entity.ConfigMajorKind;
import com.hr.entity.ConfigMajorKindExample;
import com.hr.entity.ConfigMajorKindExample.Criteria;
import com.hr.jiashiq.mapper.ConfigMajorKindMapper;
import com.hr.jiashiq.service.ConfigMajorKindService;

@Service("cmks")
public class ConfigMajorKindServiceImpl implements ConfigMajorKindService {
	@Autowired
	private ConfigMajorKindMapper cmkm;
	@Override
	public List<ConfigMajorKind> queryConfigMajorKindName(Integer id) {
		// TODO Auto-generated method stub
		ConfigMajorKindExample configMajorKindExample = new ConfigMajorKindExample();
		Criteria createCriteria = configMajorKindExample.createCriteria();
		createCriteria.andMajorKindIdEqualTo(id);
		return cmkm.selectByExample(configMajorKindExample);
	}
	@Override
	public List<ConfigMajorKind> queryConfigMajorKind() {
		// TODO Auto-generated method stub
		return cmkm.selectByExample(new ConfigMajorKindExample());
	}
	@Override
	public ConfigMajorKind queryById(Integer id) {
		// TODO Auto-generated method stub
		return cmkm.selectByPrimaryKey(id);
	}

}
