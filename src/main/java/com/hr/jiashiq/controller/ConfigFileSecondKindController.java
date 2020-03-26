package com.hr.jiashiq.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.ConfigFileSecondKind;
import com.hr.jiashiq.service.ConfigFileSecondKindService;

@Controller
@RequestMapping("/ConfigFileSecondKind")
public class ConfigFileSecondKindController {
	@Resource(name="cfsks")
	private ConfigFileSecondKindService cfsks;
	@RequestMapping("/queryById")
	@ResponseBody
	public ConfigFileSecondKind queryById(Integer id) {
		return cfsks.queryByName(id);
	}
	
	@RequestMapping("/queryByFirstKindId")
	@ResponseBody
	public List<ConfigFileSecondKind> queryByFirstKindId(Integer id) {
		return cfsks.queryByFirstKindId(id);
	}
}
