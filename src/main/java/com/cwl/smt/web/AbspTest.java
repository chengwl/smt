package com.cwl.smt.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cwl.smt.model.UserInfo;
import com.cwl.smt.model.UserInfoMapper;

@Controller
public class AbspTest {
	
	Logger LOG = LoggerFactory.getLogger(AbspTest.class);
	
	@Autowired
	UserInfoMapper userInfoMapper;
	UserInfo userInfo;

	@RequestMapping(value = "index1")
	public String testGoSuccessJsp() {
		System.out.println("***********************");
		
		LOG.debug("*******AbspTest test*************");
		
		List<UserInfo> userInfos = userInfoMapper.selectByExample(null);
		
		System.out.println(userInfos.size());
		
		return "index1";
	}

}
