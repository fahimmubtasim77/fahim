package model;

public class GeneralPractitioner extends Doctor
{
	public GeneralPractitioner(String staffID, String name) {
		super(staffID, name);
	}

	@Override
	public void createPrescription() {}
	
	public void referPatientToSpecialist() {}
}
