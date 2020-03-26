package com.hr.jiashiq.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hr.entity.EngageResume;
import com.hr.entity.EngageResumeWithBLOBs;
import com.hr.jiashiq.service.EngageResumeService;

@Controller
@RequestMapping("/EngageResume")
public class EngageResumeController {
	@Resource(name="ers")
	private EngageResumeService ers;
	
	@RequestMapping("/insertEngageResume")
	public String insertEngageResume(EngageResumeWithBLOBs er) {
		ers.insertEngageResume(er);
		return "resume/register.jsp";
	}
	
	@RequestMapping("/queryByWhere")
	@ResponseBody
	public Map queryByWhere(EngageResume er,Integer page,Integer rows) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("total", ers.queryCount(er));
		map.put("rows", ers.queryByWhere(er,page,rows));
		return map;
	}
	
	@RequestMapping("/queryByWhere2")
	@ResponseBody
	public Map queryByWhere2(EngageResume er,Integer page,Integer rows) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("total", ers.queryCount2(er));
		map.put("rows", ers.queryByWhere2(er,page,rows));
		return map;
	}
	
	@RequestMapping("/queryById")
	public ModelAndView queryById(Integer id) {
		return new ModelAndView("resume/resume-register.jsp","EngageResume",ers.queryById(id));
	}
	
	@RequestMapping("/queryById2")
	public ModelAndView queryById2(Integer id) {
		return new ModelAndView("resume/resume-select.jsp","EngageResume",ers.queryById(id));
	}
	
	@RequestMapping("/updateEngageResume")
	public String updateEngageResume(EngageResumeWithBLOBs er) {
		return "resume/resume-choose.jsp";
	}
	
	@RequestMapping("/updateEngageResume2")
	public String updateEngageResume2(EngageResumeWithBLOBs er) {
		return "resume/valid-resume.jsp";
	}
}
