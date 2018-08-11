package com.sample.app.beans;

public abstract class Person {
private String gender;
private String nationality;
private int age;
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


}
