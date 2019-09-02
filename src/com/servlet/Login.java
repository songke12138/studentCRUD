package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Student;
import com.service.LoginService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginServlet")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		
		int sno = Integer.parseInt(request.getParameter("sno"));
		int password = Integer.parseInt(request.getParameter("password"));
		
		Student stu = new Student();
		stu.setSno(sno);
		stu.setPassword(password);
		
		LoginService login1 = new LoginService();
		
		boolean legal = login1.legal(stu);
		if(legal) {
			//÷ÿ∂®œÚ
			response.sendRedirect("index.jsp");
		}else {
			response.sendRedirect("error.jsp");
		}
		
	}

}
