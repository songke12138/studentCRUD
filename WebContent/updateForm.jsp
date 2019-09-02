<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.service.AddStuService" import = "java.util.List"
import ="com.pojo.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	int id = Integer.parseInt(request.getParameter("id"));
	AddStuService addstu = new AddStuService();
	Student stu = addstu.findStuById(id);
%>

</head>
<body>
		<h2 align="center">修改学生信息</h2>
		<hr />
		<form action="AddStu?param=update" method = "post">
		<table>
			<tr>
				<td>id:</td>
				<td><input type = "text" name="id" value="<%=id%>" readOnly="readonly"/></td>
			</tr>
			<tr>	
				<td>学号:</td>
				<td><input type = "text" name="sno"value="<%=stu.getSno()%>"/></td>
			</tr>
			<tr>		
				<td>姓名:</td>
				<td><input type = "text" name="name"value="<%=stu.getName()%>"/></td>
			</tr>
			<tr>
				<td>年龄:</td>
				<td><input type = "text" name="age"value="<%=stu.getAge()%>"/></td>		
			</tr>	
			<tr>
				<td colspan="2">
					<input type = "submit" value = "提交">
					<input type = "reset" value = "重置">
			</tr>		
		</table>
	
	
	</form>
		
		
</body>
</html>