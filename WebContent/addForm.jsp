<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加页面</title>
</head>
<body>
	<h2>添加学生</h2>
	<hr />
	<form action="AddStu?param=add" method = "post">
		<table>
			<tr>
				<td>id:</td>
				<td><input type = "text" name="id"/></td>
			</tr>
			<tr>	
				<td>学号:</td>
				<td><input type = "text" name="sno"/></td>
			</tr>
			<tr>		
				<td>姓名:</td>
				<td><input type = "text" name="name"/></td>
			</tr>
			<tr>
				<td>年龄:</td>
				<td><input type = "text" name="age"/></td>		
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