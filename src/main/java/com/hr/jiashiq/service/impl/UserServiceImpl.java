package com.hr.jiashiq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.entity.Users;
import com.hr.entity.UsersExample;
import com.hr.entity.UsersExample.Criteria;
import com.hr.jiashiq.mapper.UsersMapper;
import com.hr.jiashiq.service.UserService;
@Service("userservice")
public class UserServiceImpl implements UserService{
	@Autowired
	private UsersMapper usermapper;
	@Override
	public List queryUserByName(Users u) {
		UsersExample user = new UsersExample();
		Criteria createCriteria = user.createCriteria();
		if(u.getuName()!=null) {
			createCriteria.andUNameEqualTo(u.getuName());
		}
		if(u.getuPassword()!=null) {
			createCriteria.andUPasswordEqualTo(u.getuPassword());
		}
		return usermapper.selectByExample(user);
	}
	
	public Users queryUsersByNameAndPwd(Users user) {
		return usermapper.queryUsersByNameAndPwd(user);
	}
	
}
