package com.hr.jiashiq.service;

import java.util.List;

import com.hr.entity.ConfigFileSecondKind;

public interface ConfigFileSecondKindService {
	ConfigFileSecondKind queryByName(Integer id);
	List<ConfigFileSecondKind> queryByFirstKindId(Integer id);
}
