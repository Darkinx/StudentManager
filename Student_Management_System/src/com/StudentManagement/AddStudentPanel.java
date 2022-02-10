package com.StudentManagement;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;

public class AddStudentPanel extends JPanel {
	private JTextField txtLrn;
	private JTextField txtEmail;
	private JTextField txtPhoneNumber;
	private JTextField txtFirstName;
	private JTextField txtMiddleName;
	private JTextField txtLastName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtMotherName;
	private JTextField txtFatherName;
	private JTextField txtGuardianName;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public AddStudentPanel() {
		setBackground(new Color(102, 204, 255));
		setSize(1240, 662);
		setLayout(null);
		
		JPanel pnlBasicInfo = new JPanel();
		pnlBasicInfo.setOpaque(false);
		pnlBasicInfo.setBounds(0, 0, 320, 662);
		add(pnlBasicInfo);
		SpringLayout sl_pnlBasicInfo = new SpringLayout();
		pnlBasicInfo.setLayout(sl_pnlBasicInfo);
		
		JLabel lblLrn = new JLabel("LRN");
		sl_pnlBasicInfo.putConstraint(SpringLayout.EAST, lblLrn, 155, SpringLayout.WEST, pnlBasicInfo);
		lblLrn.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		pnlBasicInfo.add(lblLrn);
		
		JLabel lblPicture = new JLabel("Picture Here");
		sl_pnlBasicInfo.putConstraint(SpringLayout.NORTH, lblLrn, 49, SpringLayout.SOUTH, lblPicture);
		sl_pnlBasicInfo.putConstraint(SpringLayout.WEST, lblLrn, 0, SpringLayout.WEST, lblPicture);
		sl_pnlBasicInfo.putConstraint(SpringLayout.NORTH, lblPicture, 25, SpringLayout.NORTH, pnlBasicInfo);
		sl_pnlBasicInfo.putConstraint(SpringLayout.WEST, lblPicture, 35, SpringLayout.WEST, pnlBasicInfo);
		sl_pnlBasicInfo.putConstraint(SpringLayout.SOUTH, lblPicture, 275, SpringLayout.NORTH, pnlBasicInfo);
		sl_pnlBasicInfo.putConstraint(SpringLayout.EAST, lblPicture, 285, SpringLayout.WEST, pnlBasicInfo);
		lblPicture.setIcon(mainPageFunction.imgCircle(
				mainPageFunction.imgMethodNonButton(
					(new ImageIcon(StudentEditInfo.class.getResource("/Icons/Others/Teacher.jpg"))), // The Image Icon or main Image
					250,			// Width
					250),		// Height
				2		// Thickness of the circle border
				));
		pnlBasicInfo.add(lblPicture);
		
		txtLrn = new JTextField();
		sl_pnlBasicInfo.putConstraint(SpringLayout.SOUTH, lblLrn, -6, SpringLayout.NORTH, txtLrn);
		sl_pnlBasicInfo.putConstraint(SpringLayout.NORTH, txtLrn, 350, SpringLayout.NORTH, pnlBasicInfo);
		sl_pnlBasicInfo.putConstraint(SpringLayout.SOUTH, txtLrn, -287, SpringLayout.SOUTH, pnlBasicInfo);
		txtLrn.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		sl_pnlBasicInfo.putConstraint(SpringLayout.WEST, txtLrn, 35, SpringLayout.WEST, pnlBasicInfo);
		sl_pnlBasicInfo.putConstraint(SpringLayout.EAST, txtLrn, -35, SpringLayout.EAST, pnlBasicInfo);
		txtLrn.setOpaque(false);
		txtLrn.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		pnlBasicInfo.add(txtLrn);
		txtLrn.setColumns(10);
		
		txtEmail = new JTextField();
		sl_pnlBasicInfo.putConstraint(SpringLayout.WEST, txtEmail, 0, SpringLayout.WEST, lblLrn);
		sl_pnlBasicInfo.putConstraint(SpringLayout.EAST, txtEmail, -35, SpringLayout.EAST, pnlBasicInfo);
		txtEmail.setOpaque(false);
		txtEmail.setColumns(10);
		txtEmail.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		pnlBasicInfo.add(txtEmail);
		
		JLabel lblEmail = new JLabel("Email");
		sl_pnlBasicInfo.putConstraint(SpringLayout.NORTH, txtEmail, 6, SpringLayout.SOUTH, lblEmail);
		sl_pnlBasicInfo.putConstraint(SpringLayout.WEST, lblEmail, 0, SpringLayout.WEST, lblLrn);
		lblEmail.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		pnlBasicInfo.add(lblEmail);
		
		txtPhoneNumber = new JTextField();
		sl_pnlBasicInfo.putConstraint(SpringLayout.SOUTH, txtPhoneNumber, -64, SpringLayout.SOUTH, pnlBasicInfo);
		txtPhoneNumber.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		sl_pnlBasicInfo.putConstraint(SpringLayout.WEST, txtPhoneNumber, 35, SpringLayout.WEST, pnlBasicInfo);
		sl_pnlBasicInfo.putConstraint(SpringLayout.EAST, txtPhoneNumber, 0, SpringLayout.EAST, lblPicture);
		txtPhoneNumber.setOpaque(false);
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		pnlBasicInfo.add(txtPhoneNumber);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		sl_pnlBasicInfo.putConstraint(SpringLayout.SOUTH, txtEmail, -52, SpringLayout.NORTH, lblPhoneNumber);
		sl_pnlBasicInfo.putConstraint(SpringLayout.NORTH, txtPhoneNumber, 6, SpringLayout.SOUTH, lblPhoneNumber);
		sl_pnlBasicInfo.putConstraint(SpringLayout.SOUTH, lblEmail, -83, SpringLayout.NORTH, lblPhoneNumber);
		sl_pnlBasicInfo.putConstraint(SpringLayout.SOUTH, lblPhoneNumber, -95, SpringLayout.SOUTH, pnlBasicInfo);
		sl_pnlBasicInfo.putConstraint(SpringLayout.WEST, lblPhoneNumber, 0, SpringLayout.WEST, lblLrn);
		lblPhoneNumber.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		pnlBasicInfo.add(lblPhoneNumber);
		
		JPanel pnlMainStudentInfo = new JPanel();
		pnlMainStudentInfo.setBorder(null);
		pnlMainStudentInfo.setOpaque(false);
		pnlMainStudentInfo.setBounds(318, 0, 922, 662);
		add(pnlMainStudentInfo);
		pnlMainStudentInfo.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Personal Information");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblNewLabel.setBounds(25, 25, 300, 40);
		pnlMainStudentInfo.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblFirstName.setBounds(25, 100, 101, 20);
		pnlMainStudentInfo.add(lblFirstName);
		
		txtFirstName = new JTextField();
		txtFirstName.setOpaque(false);
		txtFirstName.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtFirstName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		txtFirstName.setBounds(24, 131, 275, 40);
		pnlMainStudentInfo.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtMiddleName = new JTextField();
		txtMiddleName.setOpaque(false);
		txtMiddleName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		txtMiddleName.setColumns(10);
		txtMiddleName.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtMiddleName.setBounds(323, 131, 275, 40);
		pnlMainStudentInfo.add(txtMiddleName);
		
		JLabel lblMiddleName = new JLabel("Middle Name");
		lblMiddleName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblMiddleName.setBounds(323, 101, 150, 20);
		pnlMainStudentInfo.add(lblMiddleName);
		
		txtLastName = new JTextField();
		txtLastName.setOpaque(false);
		txtLastName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		txtLastName.setColumns(10);
		txtLastName.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtLastName.setBounds(618, 131, 275, 40);
		pnlMainStudentInfo.add(txtLastName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblLastName.setBounds(618, 100, 101, 20);
		pnlMainStudentInfo.add(lblLastName);
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblSex.setBounds(25, 200, 35, 20);
		pnlMainStudentInfo.add(lblSex);
		
		JLabel lblBirthdate = new JLabel("Birthdate");
		lblBirthdate.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblBirthdate.setBounds(200, 200, 150, 20);
		pnlMainStudentInfo.add(lblBirthdate);
		
		JLabel lblInterest = new JLabel("Interest");
		lblInterest.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblInterest.setBounds(430, 200, 150, 20);
		pnlMainStudentInfo.add(lblInterest);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblAddress.setBounds(25, 500, 150, 20);
		pnlMainStudentInfo.add(lblAddress);
		
		JComboBox<String> cmbSex = new JComboBox<String>();
		cmbSex.setEditable(true);
		((JTextField) cmbSex.getEditor().getEditorComponent()).setBackground(Color.YELLOW);
		cmbSex.setForeground(Color.WHITE);
		cmbSex.setModel(new DefaultComboBoxModel(new String[] {"--Select Sex--", "Male", "Female"}));
		cmbSex.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		cmbSex.setBounds(26, 231, 130, 40);
		pnlMainStudentInfo.add(cmbSex);
		
		textField = new JTextField();
		textField.setOpaque(false);
		textField.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textField.setBounds(200, 231, 175, 40);
		pnlMainStudentInfo.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setOpaque(false);
		textField_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textField_1.setBounds(430, 231, 463, 40);
		pnlMainStudentInfo.add(textField_1);
		
		JLabel lblMotherName = new JLabel("Mother's Name");
		lblMotherName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblMotherName.setBounds(26, 310, 175, 20);
		pnlMainStudentInfo.add(lblMotherName);
		
		txtMotherName = new JTextField();
		txtMotherName.setOpaque(false);
		txtMotherName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		txtMotherName.setColumns(10);
		txtMotherName.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtMotherName.setBounds(25, 337, 420, 40);
		pnlMainStudentInfo.add(txtMotherName);
		
		JLabel lblFatherName = new JLabel("Father's Name");
		lblFatherName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblFatherName.setBounds(474, 310, 131, 20);
		pnlMainStudentInfo.add(lblFatherName);
		
		txtFatherName = new JTextField();
		txtFatherName.setOpaque(false);
		txtFatherName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		txtFatherName.setColumns(10);
		txtFatherName.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtFatherName.setBounds(474, 337, 420, 40);
		pnlMainStudentInfo.add(txtFatherName);
		
		JLabel lblGuardianName = new JLabel("Guardian's Name");
		lblGuardianName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblGuardianName.setBounds(27, 401, 175, 20);
		pnlMainStudentInfo.add(lblGuardianName);
		
		txtGuardianName = new JTextField();
		txtGuardianName.setOpaque(false);
		txtGuardianName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		txtGuardianName.setColumns(10);
		txtGuardianName.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtGuardianName.setBounds(26, 428, 500, 40);
		pnlMainStudentInfo.add(txtGuardianName);
		
		JLabel lblGuardianPhone = new JLabel("Guardian's Phone number");
		lblGuardianPhone.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblGuardianPhone.setBounds(576, 401, 245, 20);
		pnlMainStudentInfo.add(lblGuardianPhone);
		
		textField_2 = new JTextField();
		textField_2.setOpaque(false);
		textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textField_2.setBounds(576, 428, 318, 40);
		pnlMainStudentInfo.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setOpaque(false);
		textField_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textField_3.setBounds(25, 531, 868, 40);
		pnlMainStudentInfo.add(textField_3);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setBorder(null);
		btnAdd.setBackground(new Color(47, 74, 95));
		btnAdd.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		btnAdd.setBounds(631, 602, 110, 35);
		pnlMainStudentInfo.add(btnAdd);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		btnCancel.setBorder(null);
		btnCancel.setBackground(new Color(132, 15, 15));
		btnCancel.setBounds(783, 602, 110, 35);
		pnlMainStudentInfo.add(btnCancel);

	}
}
