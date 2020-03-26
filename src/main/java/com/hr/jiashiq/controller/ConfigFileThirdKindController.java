package com.hr.jiashiq.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.ConfigFileThirdKind;
import com.hr.jiashiq.service.ConfigFileThirdKindService;

@Controller
@RequestMapping("/ConfigFileThirdKind")
public class ConfigFileThirdKindController {
	@Resource(name="cftks")
	private ConfigFileThirdKindService cftks;
	
	@RequestMapping("/queryConfigFileThirdKindName")
	@ResponseBody
	public ConfigFileThirdKind queryConfigFileThirdKindName(Integer id) {
		List<ConfigFileThirdKind> queryConfigFileThirdKindName = cftks.queryConfigFileThirdKindName(id);
		return queryConfigFileThirdKindName.get(0);
	}
	@RequestMapping("/queryById")
	@ResponseBody
	public ConfigFileThirdKind queryById(Integer id) {
		return cftks.queryById(id);
	}
	
	@RequestMapping("/queryBySecondKindId")
	@ResponseBody
	public List<ConfigFileThirdKind> queryBySecondKindId(Integer id) {
		return cftks.queryBySecondKindId(id);
	}
}
