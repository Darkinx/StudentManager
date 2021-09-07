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
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

public class AbsentSlipPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public AbsentSlipPanel() {
		setLayout(null);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setHorizontalAlignment(SwingConstants.LEFT);
		lblStudentName.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblStudentName.setBounds(45, 55, 139, 30);
		add(lblStudentName);
		
		JTextField txtStudentName = new JTextField();
		lblStudentName.setLabelFor(txtStudentName);
		txtStudentName.setBorder(new LineBorder(new Color(191, 191, 191), 2));
		txtStudentName.setBackground(new Color(255, 255, 255));
		txtStudentName.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtStudentName.setBounds(45, 87, 240, 35);
		add(txtStudentName);
		txtStudentName.setColumns(10);
		
		
		JLabel lblDueDate = new JLabel("Due Date");
		lblDueDate.setHorizontalAlignment(SwingConstants.LEFT);
		lblDueDate.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblDueDate.setBounds(337, 55, 139, 30);
		add(lblDueDate);
		
		JDateChooser dtcDueDate = new JDateChooser();
		dtcDueDate.setBounds(337, 87, 240, 35);
		dtcDueDate.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		add(dtcDueDate);
		
		JLabel lblPriority = new JLabel("Priority");
		lblPriority.setHorizontalAlignment(SwingConstants.LEFT);
		lblPriority.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblPriority.setBounds(45, 163, 139, 30);
		add(lblPriority);
		
		JComboBox cmbPriority = new JComboBox();
		cmbPriority.setBorder(txtStudentName.getBorder());
		cmbPriority.setBackground(new Color(255, 255, 255));
		cmbPriority.setModel(new DefaultComboBoxModel(new String[] {"Select Priority", "High ", "Medium", "Low"}));
		cmbPriority.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		cmbPriority.setBounds(45, 199, 240, 35);
		add(cmbPriority);
		
		JLabel lblDateAbsent = new JLabel("Date Absent (Initial)");
		lblDateAbsent.setHorizontalAlignment(SwingConstants.LEFT);
		lblDateAbsent.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblDateAbsent.setBounds(337, 163, 180, 30);
		add(lblDateAbsent);
		
		JDateChooser dtcDateAbsent = new JDateChooser();
		dtcDateAbsent.setBounds(337, 199, 240, 35);
		add(dtcDateAbsent);
		
		JLabel lblDaysAbsent = new JLabel("Days being absent");
		lblDaysAbsent.setHorizontalAlignment(SwingConstants.LEFT);
		lblDaysAbsent.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblDaysAbsent.setBounds(45, 280, 240, 30);
		add(lblDaysAbsent);
		
		JSpinner spnDaysAbsent = new JSpinner();
		spnDaysAbsent.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spnDaysAbsent.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		spnDaysAbsent.setBorder(new LineBorder(new Color(191, 191, 191), 2));
		spnDaysAbsent.setBackground(Color.WHITE);
		spnDaysAbsent.setBounds(45, 314, 240, 35);
		add(spnDaysAbsent);
		
		JLabel lblNotes = new JLabel("Notes");
		lblNotes.setHorizontalAlignment(SwingConstants.LEFT);
		lblNotes.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNotes.setBounds(45, 383, 139, 30);
		add(lblNotes);
		
		JTextArea txtrNotes = new JTextArea();
		txtrNotes.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192), 2), new EmptyBorder(0, 4, 0, 0)));
		txtrNotes.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtrNotes.setText("Description Here");
		txtrNotes.setBounds(45, 420, 532, 100);
		add(txtrNotes);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				Date dateDueDate = dtcDueDate.getDate();
				System.out.println(dateFormat.format(dateDueDate)); // get the date for the datechooser
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
