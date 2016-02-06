<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="./css/reset.css"/>
<link rel="stylesheet" type="text/css" href="./css/jquery.multiselect.css"/>
<link rel="stylesheet" type="text/css" href="./css/jquery-ui.css"/>
<link rel="stylesheet" type="text/css" href="./css/style.css"/>
<link rel="stylesheet" type="text/css" href="./css/prettify.css"/>
<script type="text/javascript" src="./js/hDate.js"></script>
<script type="text/javascript" src="./js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="./js/jquery-ui.min.js"></script>
<script type="text/javascript" src="./js/jquery.multiselect.js"></script>
<script type="text/javascript" src="./js/jquery.select.js"></script>
<script type="text/javascript" src="./js/prettify.js"></script>
<title>Insert title here</title>

</head>
<body>
	门店：<select name = "shopName" id="searchShopSelId"  multiple="multiple" >
			  <option value="">全部</option>
			  <option value="1001">王府井店</option>
			  <option value="1002">亚运村店</option>
			  <option value="1004">五棵松店</option>
			  <option value="1005">中关村店</option>
			  <option value="1006">朝阳门店</option>
			  <option value="1007">三里河店</option>
			  <option value="1008">来广营店</option>
			  <option value="1010">回龙观店</option>
			  <option value="1011">草桥店</option>
			  <option value="1301">下沙店</option>
			  <option value="1311">笕桥店</option>
		</select>
</body>

<script type="text/javascript">
$(document).ready(function(){  
    $("#searchShopSelId").multiselect();  
})  
</script>


</html>