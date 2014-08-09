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

<script type="text/javascript" src="<%=basePath%>/statics/js/jquery-1.6.2.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/statics/js/highcharts.js"></script>
<script type="text/javascript" src="<%=basePath%>/statics/js/exporting.js"></script>

<script type="text/javascript">
	$(document).ready(function(e) {

		var options = { //图表展示容器，与div的id保持一致
			chart : {
				renderTo : 'container',
				type : 'column' //指定图表的类型，默认是折线图（line）
			},
			title : {
				text : 'My first Highcharts chart' //指定图表标题
			},
			xAxis : {
				categories : [ 'my', 'first', 'chart' ]
			//指定x轴分组
			},
			yAxis : {
				title : {
					text : 'something' //指定y轴的标题
				}
			},
			series : [ { //指定数据列
				name : 'Jane', //数据列名
				data : [ 1, 0, 4 ]
			//数据
			}, {
				name : 'John',
				data : [ 5, 7, 3 ]
			} ]
		};

		$('#btn1').click(function(e) {
			// Create the chart
			var chart = new Highcharts.Chart(options);
		});
	});
</script>
</head>


<body>
	<input type="button" id="btn1" value="点击" />
	<div id="container" style="min-width:800px; height:400px"></div>
</body>
</html>
