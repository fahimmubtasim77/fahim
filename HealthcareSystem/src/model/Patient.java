package model;

import java.util.Date;

public class Patient 
{
	private String patientID;
	private String name;
	private String dob;
	private String contactInfo;
	
	public Patient(String patientID, String name, String dob, String contactInfo) 
	{
		this.patientID = patientID;
		this.name = name;
		this.dob = dob;
		this.contactInfo = contactInfo;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getContactInfo() {
		return contactInfo;
	}
	
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
}
