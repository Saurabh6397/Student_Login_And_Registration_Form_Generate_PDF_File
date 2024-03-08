package com.db;

import com.bean.StudentForm;
import com.bean.StudentLogin;

public interface Studentlogin_Inter {
	public int crateUser(StudentLogin s);
	
	public boolean veriyfyLogin(StudentLogin s); 
	
	public int Studentform(StudentForm s);
	
	public int CrateLogin(StudentLogin s);

}
