package model;

public class Appointment 
{
	private String appointmentID;
	private String dateTime;
	private String status;
	
	public Appointment(String appointmentID, String dateTime, String status) 
	{
		this.appointmentID = appointmentID;
		this.dateTime = dateTime;
		this.status = status;
	}

	public String getAppointmentID() {
		return appointmentID;
	}

	public String getDateTime() {
		return dateTime;
	}

	public String getStatus() {
		return status;
	}	
}
