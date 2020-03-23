package com.hr.jiashiq.service;

import java.util.List;

import com.hr.entity.Users;

public interface UserService {
	public Users queryUsersByNameAndPwd(Users user);
	
	public List queryUserByName(Users u);
}
