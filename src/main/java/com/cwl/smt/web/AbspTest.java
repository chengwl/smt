package com.cwl.smt.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cwl.smt.model.UserInfo;
import com.cwl.smt.model.UserInfoMapper;

@Controller
public class AbspTest {
	
	@Autowired
	UserInfoMapper userInfoMapper;
	UserInfo userInfo;

	@RequestMapping(value = "index1")
	public String testGoSuccessJsp() {
		System.out.println("***********************");
		
		List<UserInfo> userInfos = userInfoMapper.selectByExample(null);
		
		System.out.println(userInfos.size());
		
		return "index1";
	}

}
