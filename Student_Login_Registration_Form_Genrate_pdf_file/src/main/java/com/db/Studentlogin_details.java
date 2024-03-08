package com.db;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.StudentForm;
import com.bean.StudentLogin;

import jakarta.servlet.RequestDispatcher;

public class Studentlogin_details implements Studentlogin_Inter{
	public Connection getCon() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/profound22","root","");
		return con;
	}

	@Override
	public int crateUser(StudentLogin s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean veriyfyLogin(StudentLogin s) {
		try {
			String pass=null;
			Connection con = getCon();
			String sql="select password from login where email=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, s.getName());
			ResultSet rs=ps.executeQuery();
			System.out.println(1);
			if(rs.next())
			{
				pass=rs.getString("password");//db password value
			}
			rs.close();
			//verifying db password and userpassword
			if(pass.equals(s.getPassword())) {
				return true;
			}
			else {
				return false;
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}

	@Override
	public int CrateLogin(StudentLogin s) {
		try {
			Connection con = getCon();
			
			String q="insert into login(email,password) values(?,?);";
			
			PreparedStatement ps = con.prepareStatement(q);
			
			ps.setString(1, s.getName());
			ps.setString(2, s.getPassword());
			
			ps.executeUpdate();
			
			System.out.println("Inserted....");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public int Studentform(StudentForm s) {
		
		try {
			
			String q="insert into studentfrom(firstname, lastname, gender, date, email, password, address, state, pincode, phoneno, age) values(?,?,?,?,?,?,?,?,?,?,?);";
			Connection con=getCon();
			PreparedStatement ps = con.prepareStatement(q);
			
			ps.setString(1, s.getFirstname());
			ps.setString(2, s.getLastname());
			ps.setString(3, s.getGender());
			ps.setString(4, s.getDate());
			ps.setString(5, s.getEmail());
			ps.setString(6, s.getPassword());
			ps.setString(7, s.getAddress());
			ps.setString(8, s.getState());
			ps.setString(9, s.getPincode());
			ps.setLong(10, s.getPhoneno());
			ps.setString(11, s.getAge());
			

			ps.executeUpdate();
			
			System.out.println("Inserted....");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}	
	
		return 0;
	}

}
