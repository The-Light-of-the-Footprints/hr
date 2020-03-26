package com.hr.jiashiq.service;

import java.util.List;

import com.hr.entity.ConfigMajorKind;

public interface ConfigMajorKindService {
	List<ConfigMajorKind> queryConfigMajorKindName(Integer id);
	List<ConfigMajorKind> queryConfigMajorKind();
	ConfigMajorKind queryById(Integer id);
}
