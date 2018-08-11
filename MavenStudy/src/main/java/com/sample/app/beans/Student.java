package com.sample.app.beans;

public class Student extends Person {
private String firstName;
private String lastName;
private ContactDetails contactDetails;
private EducationDetails educationDetails;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public ContactDetails getContactDetails() {
	return contactDetails;
}
public void setContactDetails(ContactDetails contactDetails) {
	this.contactDetails = contactDetails;
}
public EducationDetails getEducationDetails() {
	return educationDetails;
}
public void setEducationDetails(EducationDetails educationDetails) {
	this.educationDetails = educationDetails;
}



}
