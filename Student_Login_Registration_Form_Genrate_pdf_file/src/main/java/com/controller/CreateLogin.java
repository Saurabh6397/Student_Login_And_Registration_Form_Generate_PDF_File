package com.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.bean.StudentLogin;
import com.db.Studentlogin_Inter;
import com.db.Studentlogin_details;

public class CreateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CreateLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();	
		response.setContentType("text/html");
		
		String name=request.getParameter("UserId");
		String password=request.getParameter("Password");
		
		StudentLogin s=new StudentLogin(name,password);
		
		Studentlogin_Inter student1=new Studentlogin_details();
		
		student1.CrateLogin(s);
		
		out.print("<script>alert(\"Successfully Create account Please login\");</script>\r\n");
		RequestDispatcher rd = request.getRequestDispatcher("homepage.html");
		rd.include(request, response);
		
		
		System.out.println("Inserted....");
		
	}

}
