package com.cwl.smt.web.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cwl.smt.service.login.LoginService;

/**
 * 登录功能
 * 
 * @author cwl
 *
 */
@Controller
@RequestMapping("/login/*")
public class LoginController {
	
	private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);
	

	@Autowired
	LoginService loginService;
	
	/**
	 *  初始化登录页面
	 *  
	 * @return
	 */
	@RequestMapping("intLoginPage")
	public String intLoginPage() {
		LOG.info("*****************init login page***********************");
		return "login/login1";
	}
	
	/**
	 * 跳转到注册页面
	 *  
	 * @return
	 */
	@RequestMapping("goSignUpPage")
	public String goSignUpPage() {
		LOG.info("****************goSignUpPage***********************");
		return "login/signup";
	}
	
	
	/**
	 * 跳转到主页面
	 *  
	 * @return
	 */
	@RequestMapping("goMainPage")
	public String goMainPage() {
		LOG.info("****************goMainPage***********************");
		return "login/main";
	}
	
	/**
	 *  登录
	 *  
	 * @param username
	 *            String 用户名
	 * @param password
	 *            String 密码
	 *            
	 * @return int 0成功,1失败
	 * 
	 */
	@ResponseBody
	@RequestMapping("isLogin")
	public int isLogin(@RequestParam(value="username", required=true) String username,
					   @RequestParam(value="password", required=true) String password) {
		LOG.info("****************isLogin***********************");
		return loginService.isLogin(username, password);
	}
	
	/**
	 *  注册
	 *  
	 * @param username
	 *            String 用户名
	 * @param password
	 *            String 密码
	 *            
	 * @return int 0成功,1失败
	 * 
	 */
	@ResponseBody
	@RequestMapping("isSignUp")
	public int isSignUp(@RequestParam(value="username", required=true) String username,
						@RequestParam(value="password", required=true) String password) {
		LOG.info("****************isSignUp***********************");
		return loginService.isSignUp(username, password);
	}
	
	/**
	 * 登出
	 */
	public void isLoinOut() {
		
	}
}
