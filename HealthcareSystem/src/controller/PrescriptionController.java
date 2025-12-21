package controller;

import model.Prescription;
import utils.CSVReaderUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrescriptionController 
{
	private ArrayList<Prescription> prescriptions = new ArrayList<>();

	public void loadPrescriptions(String filePath) {
		try {
			List<String[]> data = CSVReaderUtil.readCSV(filePath);
			for (String[] row : data) {
				Prescription p = new Prescription(row[0], row[1], row[4], row[5], row[6]);
				prescriptions.add(p);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addPrescription(Prescription prescription) {
		prescriptions.add(prescription);
	}

	public ArrayList<Prescription> getPrescriptions() {
		return prescriptions;
	}
}