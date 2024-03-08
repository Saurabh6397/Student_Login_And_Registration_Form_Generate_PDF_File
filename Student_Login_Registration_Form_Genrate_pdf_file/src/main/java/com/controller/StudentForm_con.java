package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.bean.StudentForm;
import com.db.Studentlogin_Inter;
import com.db.Studentlogin_details;

public class StudentForm_con extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public StudentForm_con() {
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
		
		String firstname=request.getParameter("fname");
		String lastname=request.getParameter("lname");
		
		String gender=request.getParameter("gender");
		String age=request.getParameter("age");
		
		String date=request.getParameter("dob");
		String email=request.getParameter("email");
		
		String password=request.getParameter("password");
		
		String address=request.getParameter("address");
		String state=request.getParameter("state");
		
		long phoneno=Long.parseLong(request.getParameter("phonenumber"));
		//String phoneno = request.getParameter("phonenumber");
		String pincode=request.getParameter("pincode");
		
		System.out.println(1);
		
		StudentForm s=new StudentForm(firstname,lastname,gender,date,email,password,address,state,pincode,phoneno,age);
		
		Studentlogin_Inter Student1=new Studentlogin_details();
		Student1.Studentform(s);
		System.out.println(2);
		out.print("<script>alert(\"Your Application Suceesfully Submited\");</script>\r\n");
		
		HttpSession session=request.getSession(true);
		session.setAttribute("Firstname", firstname);
		session.setAttribute("Lastname", lastname);
		session.setAttribute("Gender", gender);
		session.setAttribute("Date", date);
		session.setAttribute("Email", email);
		session.setAttribute("Address", address);
		session.setAttribute("State", state);
		session.setAttribute("Phoneno", phoneno);
		session.setAttribute("Pincode", pincode);
		session.setAttribute("Age", age);
		request.getRequestDispatcher("Outpute.jsp").forward(request, response);
	}

}
