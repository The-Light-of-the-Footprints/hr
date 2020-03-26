package com.hr.jiashiq.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.ConfigFileFirstKind;
import com.hr.jiashiq.service.ConfigFileFirstKindService;

@Controller
@RequestMapping("/ConfigFileFirstKind")
public class ConfigFileFirstKindController {
	@Resource(name="cffks")
	private ConfigFileFirstKindService cffks;
	@RequestMapping("/queryById")
	@ResponseBody
	public ConfigFileFirstKind queryById(Integer id) {
		return cffks.queryById(id);
	}
	
	@RequestMapping("/queryConfigFileFirstKind")
	@ResponseBody
	public List<ConfigFileFirstKind> queryConfigFileFirstKind() {
		return cffks.queryConfigFileFirstKind();
	}
}
