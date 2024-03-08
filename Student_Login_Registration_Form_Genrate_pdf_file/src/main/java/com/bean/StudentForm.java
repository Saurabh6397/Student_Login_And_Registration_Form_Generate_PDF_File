package com.bean;

public class StudentForm {
	private String firstname;
	private String lastname;
	private String gender;
	private String date;
	private String email;
	private String Password;
	private String address;
	private String state;
	private String pincode;
	private long phoneno;
	private String age;
	 
	public StudentForm()
	{}

	public StudentForm(String firstname, String lastname, String gender, String date, String email, String password, String address,
			String state, String pincode, long phoneno, String age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.date = date;
		this.email = email;
		this.Password = password;
		this.address= address;
		this.state = state;
		this.pincode = pincode;
		this.phoneno = phoneno;
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
	

}
