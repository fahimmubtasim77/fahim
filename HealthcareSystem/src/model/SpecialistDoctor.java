package model;

public class SpecialistDoctor extends Doctor
{
	public SpecialistDoctor(String staffID, String name) {
		super(staffID, name);
	}

	@Override
	public void createPrescription() {}

	public void accessReferralDetails() {}
}
