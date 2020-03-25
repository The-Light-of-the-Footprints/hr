package com.hr.jiashiq.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.SysRight;
import com.hr.entity.Users;
import com.hr.jiashiq.service.SysRightService;
import com.hr.jiashiq.util.MyUtil;

@Controller
@RequestMapping("sysRight")
public class SysRightController {
	@Autowired
	private SysRightService srs;
	@RequestMapping("/querySysRightJson")
	@ResponseBody 
	public List querySysRightJson3(HttpSession session,Integer id) {
		if(id==null) {
			id=0;
		}
		List<SysRight> userList=((Users)session.getAttribute("user")).getRole().getRights();
		List<SysRight> list = MyUtil.getRightByParentId(userList, id);
		System.out.println(list.toString());
		List<Map<String, Object>> meunList = new ArrayList<Map<String, Object>>();
		for (SysRight sysRight : list) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", sysRight.getRightCode());
			map.put("text", sysRight.getRightText());
			if ("fatcherNode".equals(sysRight.getRightType())) {
				map.put("state", "closed");
			}else {
				Map<String,Object> attr=new HashMap<String, Object>();
				attr.put("url",sysRight.getRightUrl());
				attr.put("tip",sysRight.getRightTip());
				map.put("attributes",attr);
			}
			meunList.add(map);
		}
		return meunList;
	}
}
