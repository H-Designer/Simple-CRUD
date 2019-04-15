<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加宿舍人员</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/servlet/crudServlet" style="align-self: left;"><--返回首页</a>
<h3 style="text-align: center;">增加宿舍人员</h3>
<hr color="blue">
	<form method="post" action="${pageContext.request.contextPath}/servlet/addServlet">
		<table align="center">
			<tr>
				<td colspan="4" align="center">请添加新增人员信息</td>
			</tr>
			
		
			<tr>
				<td  style="text-align: center;">姓名</td>
				<td  style="text-align: center;">年龄</td>
				<td  style="text-align: center;">电话</td>
				<td  style="text-align: center;">对象</td>
			</tr>
			<tr>
				<td><input type="text" name="name"></td>
				<td><input type="text" name="age"></td>
				<td><input type="text" name="phonenumber"></td>
				<td><input type="text" name="duixiang"></td>
			</tr>
			<tr  style="text-align: center;">
				<td colspan="4">
					<input type="submit" value="提交">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>