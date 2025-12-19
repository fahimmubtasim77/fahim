package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame 
{
	public MainFrame() {
		setTitle("Healthcare Management System");
		setSize(900, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	
		JTabbedPane tabs = new JTabbedPane();
		tabs.add("Patients", new PatientPanel());
		tabs.add("Appointments", new AppointmentPanel());
		tabs.add("Prescriptions", new PrescriptionPanel());
		tabs.add("Referrals", new ReferralPanel());
	
		add(tabs, BorderLayout.CENTER);
		setVisible(true);
	}
}