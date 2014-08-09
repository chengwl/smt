package com.cwl.smt.service.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cwl.smt.model.UserInfo;
import com.cwl.smt.model.UserInfoExample;
import com.cwl.smt.model.UserInfoMapper;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	UserInfoMapper userInfoMapper;
	UserInfoExample userInfoExample;

	public int isSignUp(String username, String password) {
		UserInfo userInfo = new UserInfo();
		userInfo.setUsername(username);
		userInfo.setPassword(password);
		int i = userInfoMapper.insert(userInfo);
		if (i>0) {
			return 1;
		}
		return 0;
	}

	public int isLogin(String username, String password) {
		UserInfoExample userInfoExample = new UserInfoExample();
		userInfoExample.createCriteria().andUsernameEqualTo(username)
										.andPasswordEqualTo(password);
		List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExample);
		if (userInfos.size() > 0) {
			return 1;
		}
		return 0;
	}



}
