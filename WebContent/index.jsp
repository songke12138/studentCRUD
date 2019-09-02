<%@page import="com.service.AddStuService" import = "java.util.List"
import ="com.pojo.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录成功首页</title>
<script type = "text/javascript">
	function addForm(){
		window.location.href = "addForm.jsp";
	}
	
	function confirmDel(id){
		var result = window.confirm("确认删除吗？");
		if(result){
			window.location.href ="AddStu?param=delete&id="+id;
		}
	}
</script>
</head>
<body>
		
		<%
			//查询所有数据
			AddStuService  stuService = new AddStuService();
			List<Student> stuList= stuService.findAllStu();
		%>



		<h2 align="center">学生信息列表</h2>
		<hr />
		<table  width="800"  align="center">
			<tr>
				<td  align="right"><input type = "button" value="添加"
					onclick="addForm();"/>
			</tr>
		</table>
		<table width="800" border = "1"  align="center">
			<tr>
				<th>id</th>
				<th>姓名</th>
				<th>年龄</th>
				<th>学号</th>
				<th>操作</th>
			</tr>
			<%
				for(Student stu:stuList){
			%>
			<tr>
				<td><%=stu.getId() %></td>
				<td><%=stu.getName() %></td>
				<td><%=stu.getAge() %></td>
				<td><%=stu.getSno() %></td>
				<td align="center"><a href="updateForm.jsp?id=<%=stu.getId() %>
				">修改</a>&nbsp;&nbsp;|&nbsp;&nbsp;
			<a href="#" onclick="confirmDel(<%=stu.getId()%>);">删除</a></td>
			</tr>
			
			<%		
				}
			%>
		</table>
</body>
</html>