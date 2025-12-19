package view;

import controller.PrescriptionController;
import model.Prescription;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PrescriptionPanel extends JPanel 
{
	private PrescriptionController controller = new PrescriptionController();
	private DefaultTableModel tableModel;
	
	
	public PrescriptionPanel() {
		setLayout(new BorderLayout());
		controller.loadPrescriptions("data/prescriptions.csv");
		
		
		String[] columns = {"Prescription ID", "Patient ID", "Date", "Medication", "Dosage"};
		tableModel = new DefaultTableModel(columns, 0);
		JTable table = new JTable(tableModel);
		
		
		for (Prescription p : controller.getPrescriptions()) {
			tableModel.addRow(new Object[]{p.getPrescriptionID(), p.getPatientID(), p.getDate(), p.getMedication(), p.getDosage()});
		}
		
		
		add(new JScrollPane(table), BorderLayout.CENTER);
	}
}