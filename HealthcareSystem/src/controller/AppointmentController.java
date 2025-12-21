package controller;

import model.Appointment;
import utils.CSVReaderUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppointmentController 
{
	private ArrayList<Appointment> appointments = new ArrayList<>();

	public void loadAppointments(String filePath) 
	{
		try {
			List<String[]> data = CSVReaderUtil.readCSV(filePath);
			for (String[] row : data) {
				Appointment a = new Appointment(
						row[0], 
						row[4] + " " + row[5], 
						row[8]);
				appointments.add(a);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Appointment> getAppointments() {
		return appointments;
	}
}
