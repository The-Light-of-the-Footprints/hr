package com.hr.jiashiq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.entity.ConfigFileFirstKind;
import com.hr.entity.ConfigFileFirstKindExample;
import com.hr.jiashiq.mapper.ConfigFileFirstKindMapper;
import com.hr.jiashiq.service.ConfigFileFirstKindService;

@Service("cffks")
public class ConfigFileFirstKindServiceImpl implements ConfigFileFirstKindService {
	@Autowired
	private ConfigFileFirstKindMapper cffkm;
	@Override
	public ConfigFileFirstKind queryById(Integer id) {
		// TODO Auto-generated method stub
		return cffkm.selectByPrimaryKey(id);
	}
	@Override
	public List<ConfigFileFirstKind> queryConfigFileFirstKind() {
		// TODO Auto-generated method stub
		return cffkm.selectByExample(new ConfigFileFirstKindExample());
	}

}
