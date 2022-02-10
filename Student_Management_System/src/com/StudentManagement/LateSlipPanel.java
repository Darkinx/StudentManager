package com.StudentManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

public class LateSlipPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public LateSlipPanel() {
		setLayout(null);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setHorizontalAlignment(SwingConstants.LEFT);
		lblStudentName.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblStudentName.setBounds(45, 40, 139, 30);
		add(lblStudentName);
		
		JTextField txtStudentName = new JTextField();
		lblStudentName.setLabelFor(txtStudentName);
		txtStudentName.setBorder(new LineBorder(new Color(191, 191, 191), 2));
		txtStudentName.setBackground(new Color(255, 255, 255));
		txtStudentName.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtStudentName.setBounds(45, 72, 240, 35);
		add(txtStudentName);
		txtStudentName.setColumns(10);
		
		
		JLabel lblDueDate = new JLabel("Due Date");
		lblDueDate.setHorizontalAlignment(SwingConstants.LEFT);
		lblDueDate.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblDueDate.setBounds(337, 40, 139, 30);
		add(lblDueDate);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(337, 72, 240, 35);
		dateChooser.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		add(dateChooser);
		
		JLabel lblPriority = new JLabel("Priority");
		lblPriority.setHorizontalAlignment(SwingConstants.LEFT);
		lblPriority.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblPriority.setBounds(45, 148, 139, 30);
		add(lblPriority);
		
		JComboBox cmbPriority = new JComboBox();
		cmbPriority.setBorder(txtStudentName.getBorder());
		cmbPriority.setBackground(new Color(255, 255, 255));
		cmbPriority.setModel(new DefaultComboBoxModel(new String[] {"Select Priority", "High ", "Medium", "Low"}));
		cmbPriority.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		cmbPriority.setBounds(45, 184, 240, 35);
		add(cmbPriority);
		
		JLabel lblTaskCode = new JLabel("Class Missed/Late");
		lblTaskCode.setHorizontalAlignment(SwingConstants.LEFT);
		lblTaskCode.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblTaskCode.setBounds(337, 148, 170, 30);
		add(lblTaskCode);
		
		JTextField txtClass = new JTextField();
		txtClass.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtClass.setColumns(10);
		txtClass.setBorder(new LineBorder(new Color(191, 191, 191), 2));
		txtClass.setBackground(Color.WHITE);
		txtClass.setBounds(337, 185, 240, 35);
		add(txtClass);
		
		JLabel lblReason = new JLabel("Reason for Tardiness/Late");
		lblReason.setHorizontalAlignment(SwingConstants.LEFT);
		lblReason.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblReason.setBounds(45, 255, 240, 30);
		add(lblReason);
		
		JTextField txtReason = new JTextField();
		txtReason.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtReason.setColumns(10);
		txtReason.setBorder(new LineBorder(new Color(191, 191, 191), 2));
		txtReason.setBackground(Color.WHITE);
		txtReason.setBounds(45, 289, 532, 35);
		add(txtReason);
		
		JLabel lblAssignment = new JLabel("Punishment/Assignment");
		lblAssignment.setHorizontalAlignment(SwingConstants.LEFT);
		lblAssignment.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblAssignment.setBounds(45, 354, 240, 30);
		add(lblAssignment);
		
		JTextField txtAssignment = new JTextField();
		txtAssignment.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtAssignment.setColumns(10);
		txtAssignment.setBorder(new LineBorder(new Color(191, 191, 191), 2));
		txtAssignment.setBackground(Color.WHITE);
		txtAssignment.setBounds(45, 388, 532, 35);
		add(txtAssignment);
		
		JLabel lblNotes = new JLabel("Notes");
		lblNotes.setHorizontalAlignment(SwingConstants.LEFT);
		lblNotes.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNotes.setBounds(45, 445, 139, 30);
		add(lblNotes);
		
		JTextArea txtrNotes = new JTextArea();
		txtrNotes.setBorder(txtStudentName.getBorder());
		txtrNotes.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtrNotes.setText("Description Here");
		txtrNotes.setBounds(45, 480, 532, 70);
		add(txtrNotes);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				Date dateBDate = dateChooser.getDate();
				System.out.println(dateFormat.format(dateBDate)); // get the date for the datechooser
			}
		});
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setBackground(new Color(21, 135, 89));
		btnSave.setBorder(null);
		btnSave.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnSave.setBounds(417, 590, 75, 30);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnCancel.setBorder(null);
		btnCancel.setBackground(new Color(78, 78, 78));
		btnCancel.setBounds(502, 590, 75, 30);
		add(btnCancel);
		
		JButton btnSavePrint = new JButton("Save and Print");
		btnSavePrint.setForeground(new Color(255, 255, 255));
		btnSavePrint.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnSavePrint.setBorder(null);
		btnSavePrint.setBackground(new Color(52, 81, 104));
		btnSavePrint.setBounds(282, 590, 125, 30);
		add(btnSavePrint);

	}

}
