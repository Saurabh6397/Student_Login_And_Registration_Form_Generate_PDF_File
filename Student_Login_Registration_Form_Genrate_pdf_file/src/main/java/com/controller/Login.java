package com.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.bean.StudentLogin;
import com.db.Studentlogin_Inter;
import com.db.Studentlogin_details;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Login() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();	
		response.setContentType("text/html");
		
		String name=request.getParameter("email");
		String password=request.getParameter("Password");
		StudentLogin s=new StudentLogin(name,password);
		
		Studentlogin_Inter Student1=new Studentlogin_details();
		
		boolean flag=Student1.veriyfyLogin(s);
		
		if(flag) {
			out.print("<h1>welcome<h1>");
			out.print("<h1>appa</h1>");
			RequestDispatcher rd = request.getRequestDispatcher("studentfrom.html");
			rd.forward(request, response);
		}
		else {
			out.print("<script>alert(\"Please Inter valid Password\");</script>\r\n");
			RequestDispatcher rd = request.getRequestDispatcher("/homepage.html");
			rd.include(request, response);
		}
	}

}
