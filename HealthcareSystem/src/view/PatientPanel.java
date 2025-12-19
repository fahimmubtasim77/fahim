package view;

import controller.PatientController;
import model.Patient;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PatientPanel extends JPanel 
{
	private PatientController controller = new PatientController();
	private DefaultTableModel tableModel;

	public PatientPanel() {
		setLayout(new BorderLayout());
		controller.loadPatients("data/patients.csv");
		
		String[] columns = {"ID", "Name", "DOB", "Contact"};
		tableModel = new DefaultTableModel(columns, 0);
		JTable table = new JTable(tableModel);
		loadTableData();
	
		JPanel form = new JPanel(new GridLayout(5, 2));
		JTextField idField = new JTextField();
		JTextField nameField = new JTextField();
		JTextField dobField = new JTextField();
		JTextField contactField = new JTextField();
		
		JButton addBtn = new JButton("Add Patient");
		JButton deleteBtn = new JButton("Delete Selected");
		
		form.add(new JLabel("Patient ID:")); form.add(idField);
		form.add(new JLabel("Name:")); form.add(nameField);
		form.add(new JLabel("DOB:")); form.add(dobField);
		form.add(new JLabel("Contact:")); form.add(contactField);
		form.add(addBtn); form.add(deleteBtn);
		
		add(new JScrollPane(table), BorderLayout.CENTER);
		add(form, BorderLayout.SOUTH);
	
		addBtn.addActionListener(e -> {
			Patient p = new Patient(
					idField.getText(),
					nameField.getText(),
					dobField.getText(),
					contactField.getText()
			);
			controller.addPatient(p);
			tableModel.addRow(new Object[]{p.getPatientID(), p.getName(), p.getDob(), p.getContactInfo()});
		});
	
		deleteBtn.addActionListener(e -> {
			int row = table.getSelectedRow();
			controller.deletePatient(row);
			if (row >= 0) tableModel.removeRow(row);
		});
	}
	
	private void loadTableData() {
		for (Patient p : controller.getPatients()) {
			tableModel.addRow(new Object[]{p.getPatientID(), p.getName(), p.getDob(), p.getContactInfo()});
		}
	}
}