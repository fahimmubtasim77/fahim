package model;

public class AdministrativeStaff extends Staff
{
	public AdministrativeStaff(String staffID, String name) {
		super(staffID, name);
	}

	public void verifyPatientIdentity() {}
	
	public void manageSchedule() {}
	
	public void sendNotifications() {}
}
