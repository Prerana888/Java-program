package com.xworkz.karnataka;

public class KarnatakaDto {
private String firstname;
private String lastname;
private String phno;
private String email;
private String password;
public KarnatakaDto(String firstname, String lastname, String phno, String email, String password) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.phno = phno;
	this.email = email;
	this.password = password;
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
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "KarnatakaDto [firstname=" + firstname + ", lastname=" + lastname + ", phno=" + phno + ", email=" + email
			+ ", password=" + password + "]";
}
}
