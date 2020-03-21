package com.hr.jiashiq.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.entity.Users;
import com.hr.jiashiq.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource(name="userservice")
	private UserService us;
	
	@RequestMapping("/userByName")
	@ResponseBody
	public List queryUsersByUname(Users u) {
		return us.queryUserByName(u);
	}
	
	@RequestMapping("/queryByUser")
	@ResponseBody
	public Users queryByUser(Users u,HttpServletRequest req) {
		Users user=us.queryUsersByNameAndPwd(u);
		req.getSession().setAttribute("utruename", user.getuTrueName());
		req.getSession().setAttribute("utype", user.getRole().getRoleName());
		req.getSession().setAttribute("user", user);
		return user;
	}
	
	@RequestMapping("/deletesession")
	@ResponseBody
	public Integer deleteSession(Users u,HttpServletRequest req) {
		req.getSession().removeAttribute("utruename");
		req.getSession().removeAttribute("utype");
		req.getSession().removeAttribute("user");
		return 1;
	}
	
	
}
