package com.cwl.smt.service.login;

public interface LoginService {

	/**
	 * 注册
	 * 
	 * @param username
	 *            String 用户名
	 * @param password
	 *            String 密码
	 * @return int 0成功,1失败
	 */
	public abstract int isSignUp(String username, String password);
	
	/**
	 * 登录
	 * 
	 * @param username
	 *            String 用户名
	 * @param password
	 *            String 密码
	 * @return int 0成功,1失败
	 */
	public abstract int isLogin(String username, String password);

}
