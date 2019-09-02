<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录首页</title>
</head>
<body>
	
	<form action="LoginServlet" method = "post"  >
		
		学号:<input type = "text" name = "sno"/><br>
		密码:<input type = "password" name ="password"/><br>
		<input type = "submit" value = "提交"/>
	</form>
	
	
</body>
</html>