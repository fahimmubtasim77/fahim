package view;

import controller.PrescriptionController;
import model.Prescription;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PrescriptionPanel extends JPanel {

    private PrescriptionController controller = new PrescriptionController();
    private DefaultTableModel tableModel;

    public PrescriptionPanel() {
        setLayout(new BorderLayout());
        controller.loadPrescriptions("data/prescriptions.csv");

        String[] columns = {"Prescrription ID", "Patient ID", "Date", "Medication", "Dosage"};
        tableModel = new DefaultTableModel(columns, 0);
        JTable table = new JTable(tableModel);

        for (Prescription p : controller.getPrescriptions()) {
            tableModel.addRow(new Object[]{p.getPrescriptionID(), p.getPatientID(), p.getDate(), p.getMedication(), p.getDosage()});
        }

        JPanel form = new JPanel(new GridLayout(6, 2));
        JTextField presidField = new JTextField();
        JTextField patsidField = new JTextField();
        JTextField dateField = new JTextField();
        JTextField medicationField = new JTextField();
        JTextField dosageField = new JTextField();
        JButton addBtn = new JButton("Add Prescription");

        form.add(new JLabel("Prescription ID:")); form.add(presidField);
        form.add(new JLabel("Patient ID:")); form.add(patsidField);
        form.add(new JLabel("Date:")); form.add(dateField);
        form.add(new JLabel("Medication:")); form.add(medicationField);
        form.add(new JLabel("Dosage:")); form.add(dosageField);
        form.add(addBtn);

        add(new JScrollPane(table), BorderLayout.CENTER);
        add(form, BorderLayout.SOUTH);

        addBtn.addActionListener(e -> {
            Prescription p = new Prescription(
            		presidField.getText(),
            		patsidField.getText(),
                    dateField.getText(),
                    medicationField.getText(),
                    dosageField.getText()
            );
            controller.addPrescription(p);
            tableModel.addRow(new Object[]{p.getPrescriptionID(), p.getPatientID(), p.getDate(), p.getMedication(), p.getDosage()});
        });
    }
}
