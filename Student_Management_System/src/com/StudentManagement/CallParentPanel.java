package com.StudentManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.github.lgooddatepicker.components.TimePicker;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;

public class CallParentPanel extends JPanel {

	/**
	 * Panel for the CallParent Option in Task Editor
	 */
	public CallParentPanel() {
		setLayout(null);
		
		JLabel lblStudentName_1 = new JLabel("Student Name");
		lblStudentName_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblStudentName_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblStudentName_1.setBounds(45, 55, 139, 30);
		add(lblStudentName_1);
		
		JTextField txtStudentName_1 = new JTextField();
		lblStudentName_1.setLabelFor(txtStudentName_1);
		txtStudentName_1.setBorder(new LineBorder(new Color(191, 191, 191), 2));
		txtStudentName_1.setBackground(new Color(255, 255, 255));
		txtStudentName_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtStudentName_1.setBounds(45, 87, 240, 35);
		add(txtStudentName_1);
		txtStudentName_1.setColumns(10);
		
		
		JLabel lblDueDate_1 = new JLabel("Due Date");
		lblDueDate_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDueDate_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblDueDate_1.setBounds(337, 55, 139, 30);
		add(lblDueDate_1);
		
		JDateChooser dtcDueDate = new JDateChooser();
		dtcDueDate.setBounds(337, 87, 240, 35);
		dtcDueDate.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		add(dtcDueDate);
		
		JLabel lblPriority_1 = new JLabel("Priority");
		lblPriority_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPriority_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblPriority_1.setBounds(45, 163, 139, 30);
		add(lblPriority_1);
		
		JComboBox cmbPriority_1 = new JComboBox();
		cmbPriority_1.setBorder(txtStudentName_1.getBorder());
		cmbPriority_1.setBackground(new Color(255, 255, 255));
		cmbPriority_1.setModel(new DefaultComboBoxModel(new String[] {"Select Priority", "High ", "Medium", "Low"}));
		cmbPriority_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		cmbPriority_1.setBounds(45, 199, 240, 35);
		add(cmbPriority_1);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setHorizontalAlignment(SwingConstants.LEFT);
		lblTime.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblTime.setBounds(337, 163, 180, 30);
		add(lblTime);
		
		TimePicker tmpTime = new TimePicker();
		tmpTime.getComponentToggleTimeMenuButton().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		tmpTime.getComponentToggleTimeMenuButton().setBackground(Color.WHITE);
		tmpTime.getComponentToggleTimeMenuButton().setBorder(new MatteBorder(2, 0, 2, 2, (Color) Color.LIGHT_GRAY));
		tmpTime.getComponentTimeTextField().setBorder(new CompoundBorder(new MatteBorder(2, 2, 2, 0, (Color) new Color(192, 192, 192)), new EmptyBorder(1, 3, 2, 2)));
		tmpTime.getComponentTimeTextField().setFont(new Font("Segoe UI", Font.PLAIN, 14));
		tmpTime.setBounds(337, 199, 240, 35);
		add(tmpTime);
		
		JLabel lblReason = new JLabel("Reason of the call");
		lblReason.setHorizontalAlignment(SwingConstants.LEFT);
		lblReason.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblReason.setBounds(45, 280, 240, 30);
		add(lblReason);
		
		JTextField txtReason = new JTextField();
		txtReason.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		txtReason.setBorder(new LineBorder(new Color(191, 191, 191), 2));
		txtReason.setBackground(Color.WHITE);
		txtReason.setBounds(45, 314, 532, 35);
		add(txtReason);
		
		JLabel lblNotes_1 = new JLabel("Notes");
		lblNotes_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNotes_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNotes_1.setBounds(45, 383, 139, 30);
		add(lblNotes_1);
		
		JTextArea txtrNotes_1 = new JTextArea();
		txtrNotes_1.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192), 2), new EmptyBorder(0, 4, 0, 0)));
		txtrNotes_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtrNotes_1.setText("Description Here");
		txtrNotes_1.setBounds(45, 420, 532, 100);
		add(txtrNotes_1);
		
		JButton btnSave_1 = new JButton("Save");
		btnSave_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				Date dateDue = dtcDueDate.getDate();
				System.out.println(dateFormat.format(dateDue)); // get the date for the datechooser
			}
		});
		btnSave_1.setForeground(new Color(255, 255, 255));
		btnSave_1.setBackground(new Color(21, 135, 89));
		btnSave_1.setBorder(null);
		btnSave_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnSave_1.setBounds(417, 590, 75, 30);
		add(btnSave_1);
		
		JButton btnCancel_1 = new JButton("Cancel");
		btnCancel_1.setForeground(Color.WHITE);
		btnCancel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnCancel_1.setBorder(null);
		btnCancel_1.setBackground(new Color(78, 78, 78));
		btnCancel_1.setBounds(502, 590, 75, 30);
		add(btnCancel_1);
		
		JButton btnSavePrint_1 = new JButton("Save and Print");
		btnSavePrint_1.setForeground(new Color(255, 255, 255));
		btnSavePrint_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnSavePrint_1.setBorder(null);
		btnSavePrint_1.setBackground(new Color(52, 81, 104));
		btnSavePrint_1.setBounds(282, 590, 125, 30);
		add(btnSavePrint_1);

	}
}
