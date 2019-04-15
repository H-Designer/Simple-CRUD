<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="dao.userdao"%>
<%@page import="util.dutil"%>
<%@page import="msg.information"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>欢迎来到340</title>
</head>
<body>
<h3 style="text-align: center;">欢迎管理员进行系统数据的管理</h3>

<hr color="blue" />
<div align="center" >
	<a  href="../adduser.jsp">增加宿舍人员</a>
</div>
<div align="center">
	<a  href="../searchuser.jsp">查询宿舍人员</a>

</div>

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
					<td style="text-align: center;">操作</td>
		</tr>
		<c:forEach items="${sessionScope.userBeans}" var="pro">
		<form method="post" action="${pageContext.request.contextPath}/servlet/updateServlet">
		<tr>
			<td ><input type="text"  style="text-align: center; " value="${pro.id}" name="id" > </td>
			<td ><input type="text"  style="text-align: center; " value="${pro.name}" name="name" > </td>
			<td><input type="text"  style="text-align: center;" value="${pro.age}" name="age"></td>
			<td ><input type="text" style="text-align: center;" value="${pro.phonenumber}" name="phonenumber"></td>
			<td ><input type="text" style="text-align: center;" value="${pro.duixiang}" name="duixiang"></td>
			<td  style="text-align: center;">
					<a href="${pageContext.request.contextPath}/serverLet/DeleteServlet?id=${pro.id}">删除</a>
					<input type="submit" value="修改"> 
			</td>
		</tr>
		</form>
		</c:forEach>
	

	</table>
	
</body>
</html>