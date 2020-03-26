package com.hr.jiashiq.service;

import java.util.List;

import com.hr.entity.ConfigFileThirdKind;

public interface ConfigFileThirdKindService {
	List<ConfigFileThirdKind> queryConfigFileThirdKindName(Integer id);
	ConfigFileThirdKind queryById(Integer id);
	List<ConfigFileThirdKind> queryBySecondKindId(Integer id);
}
