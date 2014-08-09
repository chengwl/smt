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

	<title>smt zhuye</title>


<script type="text/javascript" src="<%=basePath%>/statics/js/jquery-1.6.2.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/statics/js/common.js"></script>

<script type="text/javascript">

	

	$(document).ready(function(e) {
		
		
		
	
		
		
	});
</script>
</head>


<body>
	<div>
	
		wo shi yi ge hao ren ...
		
		
	</div>
</body>
</html>
