package com.hr.jiashiq.service;

import java.util.List;

import com.hr.entity.ConfigMajor;

public interface ConfigMajorService {
	List<ConfigMajor> queryConfigMajorName(Integer id);
	List<ConfigMajor> queryByConfigMajorId(Integer id);
	ConfigMajor queryById(Integer id);
	List<ConfigMajor> queryConfigMajor();
}
