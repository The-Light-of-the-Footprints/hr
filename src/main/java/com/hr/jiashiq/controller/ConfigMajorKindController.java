package com.hr.jiashiq.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.ConfigMajorKind;
import com.hr.jiashiq.service.ConfigMajorKindService;

@Controller
@RequestMapping("/ConfigMajorKind")
public class ConfigMajorKindController {
	@Resource(name="cmks")
	private ConfigMajorKindService cmks;
	@RequestMapping("/queryConfigMajorKindName")
	@ResponseBody
	public List<ConfigMajorKind> queryConfigMajorKindName(Integer id) {
		return cmks.queryConfigMajorKindName(id);
	}
	
	@RequestMapping("/queryConfigMajorKind")
	@ResponseBody
	public List<ConfigMajorKind> queryConfigMajorKind() {
		return cmks.queryConfigMajorKind();
	}
	
	@RequestMapping("/queryById")
	@ResponseBody
	public ConfigMajorKind queryById(Integer id) {
		return cmks.queryById(id);
	}
}
