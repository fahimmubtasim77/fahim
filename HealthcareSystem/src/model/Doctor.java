package model;

public abstract class Doctor extends Staff 
{
	public Doctor(String staffID, String name) {
		super(staffID, name);
	}

	public abstract void createPrescription();
}
