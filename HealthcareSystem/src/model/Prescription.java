package model;

public class Prescription 
{
	private String prescriptionID;
	private String patientID;
	private String date;
	private String medication;
	private String dosage;
	
	public Prescription(String prescriptionID, String patientID, String date, String medication, String dosage) 
	{
		this.prescriptionID = prescriptionID;
		this.patientID = patientID;
		this.date = date;
		this.medication = medication;
		this.dosage = dosage;
	}

	public String getPrescriptionID() {
		return prescriptionID;
	}
	
	public String getPatientID() {
		return patientID;
	}

	public String getDate() {
		return date;
	}

	public String getMedication() {
		return medication;
	}
	
	public String getDosage() {
		return dosage;
	}
}
