package com.example.demo.Models;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity

@Table(name="Student_details")

public class Student {

@Id

@Column(name="id")

private int id;

public Student(int id, String studentName, String departmentName, String section, long mobile, String mailid,

String address) {

super();

this.id = id;

this.studentName = studentName;

this.departmentName = departmentName;

this.section = section;

this.mobile = mobile;

this.mailid = mailid;

this.address = address;

}

public int getId() {

return id;

}

public void setId(int id) {

this.id = id;

}

public String getStudentName() {

return studentName;

}

public void setStudentName(String studentName) {

this.studentName = studentName;

}

public String getDepartmentName() {

return departmentName;

}

public void setDepartmentName(String departmentName) {

this.departmentName = departmentName;

}

public String getSection() {

return section;

}

public void setSection(String section) {

this.section = section;

}

public long getMobile() {

return mobile;

}

public void setMobile(long mobile) {

this.mobile = mobile;

}

public String getMailid() {

return mailid;

}

public void setMailid(String mailid) {

this.mailid = mailid;

}

public String getAddress() {

return address;

}

public void setAddress(String address) {

this.address = address;

}

@Column(name="studentName")

private String studentName;

@Column(name="departmentName")

private String departmentName;

@Column(name="section ")

private String section ;

@Column(name="mobile ")

private long mobile ;

@Column(name="mailid ")

private String mailid ;

@Column(name="address ")

private String address ;

public Student() {

}

}