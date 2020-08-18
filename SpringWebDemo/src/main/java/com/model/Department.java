package com.model;

public class Department {
  private String studentId;
  private String deptName;
  private String subject;
public String getStudentId() {
	return studentId;
}
public void setStudentId(String studentId) {
	this.studentId = studentId;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
@Override
public String toString() {
	return "Department [studentId=" + studentId + ", deptName=" + deptName + ", subject=" + subject + "]";
}
  
}
