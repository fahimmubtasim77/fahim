package view;

import controller.AppointmentController;
import model.Appointment;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class AppointmentPanel extends JPanel {
	private AppointmentController controller = new AppointmentController();
	private DefaultTableModel tableModel;
	
	public AppointmentPanel() {
		setLayout(new BorderLayout());
		
		controller.loadAppointments("data/appointments.csv");
		
		String[] columns = {"Appointment ID", "Date and Time", "Status"};
		tableModel = new DefaultTableModel(columns, 0);
		JTable table = new JTable(tableModel);
		
		for (Appointment a : controller.getAppointments()) {
			tableModel.addRow(new Object[] {
					a.getAppointmentID(),
					a.getDateTime(),
					a.getStatus()
			});
		}
		add(new JScrollPane(table), BorderLayout.CENTER);
	}
}
