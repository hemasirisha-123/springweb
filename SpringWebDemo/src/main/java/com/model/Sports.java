package com.model;

public class Sports {
private String StudentId;
private String sportsType;
private int noOfPlayers;
public String getStudentId() {
	return StudentId;
}
public void setStudentId(String studentId) {
	StudentId = studentId;
}
public String getSportsType() {
	return sportsType;
}
public void setSportsType(String sportsType) {
	this.sportsType = sportsType;
}
public int getNoOfPlayers() {
	return noOfPlayers;
}
public void setNoOfPlayers(int noOfPlayers) {
	this.noOfPlayers = noOfPlayers;
}
@Override
public String toString() {
	return "Sports [StudentId=" + StudentId + ", sportsType=" + sportsType + ", noOfPlayers=" + noOfPlayers + "]";
}


}
