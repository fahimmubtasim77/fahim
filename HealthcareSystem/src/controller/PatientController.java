package controller;

import model.Patient;
import utils.CSVReaderUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PatientController 
{
	private ArrayList<Patient> patients = new ArrayList<>();

	public void loadPatients(String filePath) 
	{
		try {
			List<String[]> data = CSVReaderUtil.readCSV(filePath);
			for (String[] row : data) {
				Patient p = new Patient(
						row[0], 
						row[1] + " " + row[2], 
						row[3], 
						row[4]);
				patients.add(p);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addPatient(Patient patient) 
	{
		patients.add(patient);
	}

	public void deletePatient(int index) 
	{
		if (index >= 0 && index < patients.size()) {
			patients.remove(index);
		}
	}

	public ArrayList<Patient> getPatients() 
	{
		return patients;
	}
}
