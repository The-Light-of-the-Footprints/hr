package com.hr.jiashiq.controller;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hr.entity.EngageMajorRelease;
import com.hr.entity.EngageMajorReleaseWithBLOBs;
import com.hr.jiashiq.service.EngageMajorReleaseService;
@Controller
@RequestMapping("/engagemajorrelease")
public class EngageMajorReleaseController {
	@Resource(name="emrs")
	private EngageMajorReleaseService emrs;
	@RequestMapping("/queryEngageMajorRelease")
	@ResponseBody
	public Map queryEngageMajorRelease(Integer page,Integer rows) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("rows", emrs.queryEngageMajorReleaseService(page,rows));
		map.put("total", emrs.queryCount());
		return map;
	}
	@RequestMapping("/queryByMreId")
	public ModelAndView queryByMreId(Integer id) {
		EngageMajorRelease queryByMreId = emrs.queryByMreId(id);
		String deadline = new SimpleDateFormat("yyyy-MM-dd").format(queryByMreId.getDeadline());
		String registTime = new SimpleDateFormat("yyyy-MM-dd").format(queryByMreId.getRegistTime());
		Map m=new HashMap();
		m.put("EngageMajorRelease", queryByMreId);
		m.put("deadline",deadline);
		m.put("registTime",registTime);
		return new ModelAndView("position/position_release_details.jsp",m);
	}
	
	@RequestMapping("/deleteById")
	@ResponseBody
	public Integer deleteById(Integer id) {		
		return emrs.deleteById(id);
	}
	
	@RequestMapping("/queryById")
	public ModelAndView queryById(Integer id) {
		EngageMajorRelease queryByMreId = emrs.queryByMreId(id);
		String deadline = new SimpleDateFormat("yyyy-MM-dd").format(queryByMreId.getDeadline());
		String registTime = new SimpleDateFormat("yyyy-MM-dd").format(queryByMreId.getRegistTime());
		Map m=new HashMap();
		m.put("EngageMajorRelease", queryByMreId);
		m.put("deadline",deadline);
		m.put("registTime",registTime);
		return new ModelAndView("position/position_release_change.jsp",m);
	}
	@RequestMapping("/updateEngageMajorRelease")
	public String updateEngageMajorRelease(EngageMajorReleaseWithBLOBs emr) {
		emrs.updateEngageMajorRelease(emr);
		return "position/position_change_update.jsp";
	}
	
	@RequestMapping("/insertEngageMajorRelease")
	public String insertEngageMajorRelease(EngageMajorReleaseWithBLOBs emr) {
		System.out.println(emr.toString());
		emrs.insertEngageMajorRelease(emr);
		return "position/position_register.jsp";
	}
	
}
