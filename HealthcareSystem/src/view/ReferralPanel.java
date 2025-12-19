package view;

import controller.ReferralManager;
import model.Referral;

import javax.swing.*;
import java.awt.*;

public class ReferralPanel extends JPanel 
{
	public ReferralPanel() {
		setLayout(new GridLayout(3, 2));
		
		
		JTextField idField = new JTextField();
		JTextArea notesArea = new JTextArea();
		JButton createBtn = new JButton("Create Referral");
		
		
		add(new JLabel("Referral ID:")); add(idField);
		add(new JLabel("Notes:")); add(new JScrollPane(notesArea));
		add(createBtn);
		
		
		createBtn.addActionListener(e -> {
			Referral referral = new Referral(idField.getText(), notesArea.getText());
			ReferralManager.getInstance().addReferral(referral);
			JOptionPane.showMessageDialog(this, "Referral created and file generated");
		});
	}
}