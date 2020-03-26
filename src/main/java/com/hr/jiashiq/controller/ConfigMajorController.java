package com.hr.jiashiq.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.ConfigMajor;
import com.hr.jiashiq.service.ConfigMajorService;

@Controller
@RequestMapping("/ConfigMajor")
public class ConfigMajorController {
	
	@Resource(name="cms")
	private ConfigMajorService cms;
	@RequestMapping("/queryConfigMajorName")
	@ResponseBody
	public List<ConfigMajor> queryConfigMajorName(Integer id){
		return cms.queryConfigMajorName(id);
	}
	
	@RequestMapping("/queryByConfigMajorId")
	@ResponseBody
	public List<ConfigMajor> queryByConfigMajorId(Integer id){
		return cms.queryByConfigMajorId(id);
	}
	
	@RequestMapping("/queryById")
	@ResponseBody
	public ConfigMajor queryById(Integer id){
		return cms.queryById(id);
	}
	
	@RequestMapping("/queryConfigMajor")
	@ResponseBody
	public List<ConfigMajor> queryConfigMajor(){
		return cms.queryConfigMajor();
	}
	
}
