<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	// 获得本项目的地址(例如: http://localhost:8080/MyApp/)赋值给basePath变量 
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	// 将 "项目路径basePath" 放入pageContext中，待以后用EL表达式读出。 
	pageContext.setAttribute("basePath", basePath);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
<head>

	<title>smt 注册</title>


<script type="text/javascript" src="<%=basePath%>/statics/js/jquery-1.6.2.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/statics/js/common.js"></script>

<script type="text/javascript">

	

	$(document).ready(function(e) {
		
		
		

		
		/** 注册 start */
		$("#signUp_btn").click(function(){
			var username = $("#username").val().trim();
			var password = $("#password").val();
			var password2 = $("#password2").val();
			if (username.length <= 0) {
				$("#username_tishi").html("用户名不能为空");
				return;
			} else {
				$("#username_tishi").html("");
			}
			if (password.length <= 0) {
				$("#password_tishi").html("密码不能为空");
				return;
			} else {
				$("#password_tishi").html("");
			}
			if (password2.length <= 0) {
				$("#password2_tishi").html("确认密码不能为空");
				return;
			} else {
				$("#password2_tishi").html("");
			}
			if (password != password2) {
				alert("密码不一致，请重新输入！");
				return;
			}
			
			 $.ajax({
				url : "<%=basePath%>login/isSignUp?username=" + username + "&password=" + password,
				type : "post",
				dataType : "json",
				success:function(data) {
					if(data==1) {
						alert("注册成功");
						location.href = "<%=basePath%>login/intLoginPage";
					} else {
						alert("注册失败");
					}
				}
			}); 
		
			
		});
		/** 注册 end */
		
	
		
		
	});
</script>
</head>


<body>
	<div>
		<!-- <img width="100%" height="100%" src="./statics/img/login/login.jpg" alt="" /> -->
		
		账户:<input type="text" id="username" name="username"/> <span style="color:red" id="username_tishi"></span> </br>
		密码:<input type="password" id="password" name="password"/>  <span style="color:red" id="password_tishi"></span> </br>
		确认密码:<input type="password" id="password2" name="password2"/>  <span style="color:red" id="password2_tishi"></span> </br>
		<input type="button" id="signUp_btn" value="注册"/>
		
		
	</div>
</body>
</html>
