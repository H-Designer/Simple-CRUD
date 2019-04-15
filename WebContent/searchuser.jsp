<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查询</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/servlet/crudServlet" style="align-self: left;"><--返回首页</a>
<h3 style="text-align: center;">查询宿舍人员</h3>
	<form method="post" action="${pageContext.request.contextPath}/servlet/SearchServlet">
	<div align="center">

		<input style="align-self: center;" type="text" value=""  name="name">
		<input type="submit" value="查询(姓名查询)">
		
		<hr color="blue" />
	<table align="center"  border="1">
		<tr >
		   			<td colspan="6" align="center">系统信息数据</td>
	    </tr>
    	<tr>
					<td style="text-align: center;">id</td>
					<td style="text-align: center;">姓名</td>
					<td style="text-align: center;">年龄</td>
					<td style="text-align: center;">电话</td>
					<td style="text-align: center;">对象情况</td>
		</tr>
		<c:forEach items="${sessionScope.userBeans}" var="pro">
		<tr>
			<td ><input type="text"  style="text-align: center; " value="${pro.id}" name="id" disabled="disabled"> </td>
			<td ><input type="text"  style="text-align: center; " value="${pro.name}" name="name" disabled="disabled"> </td>
			<td><input type="text"  style="text-align: center;" value="${pro.age}" name="age"disabled="disabled"></td>
			<td ><input type="text" style="text-align: center;" value="${pro.phonenumber}" name="phonenumber"disabled="disabled"></td>
			<td ><input type="text" style="text-align: center;" value="${pro.duixiang}" name="duixiang"disabled="disabled"></td>
		</tr>
		</c:forEach>

	</table>
	
	</div>
	</form>
</body>
</html>