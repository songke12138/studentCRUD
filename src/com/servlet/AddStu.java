package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Student;
import com.service.AddStuService;

/**
 * Servlet implementation class AddStu
 */
@WebServlet("/AddStu")
public class AddStu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		String param = request.getParameter("param");
		if(param.equals("add")) {//添加
			int id = Integer.parseInt(request.getParameter("id"));
			int sno = Integer.parseInt(request.getParameter("sno"));
			String name =  request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			
				Student stu = new Student();
				stu.setId(id);
				stu.setSno(sno);
				stu.setName(name);
				stu.setAge(age);
				
			AddStuService addstu = new AddStuService();
			addstu.save(stu);
			
			//重定向到index.jsp
			response.sendRedirect("index.jsp");
		}else if(param.equals("update")){//修改
			int id = Integer.parseInt(request.getParameter("id"));
			int sno = Integer.parseInt(request.getParameter("sno"));
			String name =  request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			
				Student stu = new Student();
				stu.setId(id);
				stu.setSno(sno);
				stu.setName(name);
				stu.setAge(age);
				
			AddStuService addstu = new AddStuService();
			addstu.update(stu);
			
			//重定向到index.jsp
			response.sendRedirect("index.jsp");
			
		}else if(param.equals("delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			AddStuService addstu = new AddStuService();
			addstu.delete(id);
			//重定向到index.jsp
			response.sendRedirect("index.jsp");
		}
	
	}

}
