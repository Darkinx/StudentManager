package com.StudentManagement;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SpringLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class StudentEditInfo extends JPanel {
	private JTextField txtFirstname;
	private JTextField txtMiddlename;
	private JTextField txtLastName;
	private JTextField txtPhoneNumber;
	private JTextField txtBirthdate;
	private JTextField txtInterest;
	private JTextField txtMotherName;
	private JTextField txtFatherName;
	private JTextField txtGuardianName;
	private JTextField txtGuardianPhone;
	private JTextField txtAddress;
	private JTextField txtEmail;
	private JTextField txtLRN;

	/**
	 * Create the panel.
	 */
	public StudentEditInfo() {
		setBackground(Color.LIGHT_GRAY);	
		setSize(1240, 662);
		setLayout(null);
		
		JPanel pnlDetail = new JPanel();
		pnlDetail.setOpaque(false);
		pnlDetail.setBounds(0, 0, 349, 662);
		add(pnlDetail);
		pnlDetail.setLayout(null);
		
		JLabel lblPictureHere = new JLabel("");
		lblPictureHere.setBounds(30, 30, 300, 300);
		lblPictureHere.setIcon(mainPageFunction.imgCircle(
				mainPageFunction.imgMethodNonButton(
					(new ImageIcon(StudentEditInfo.class.getResource("/Icons/Others/Teacher.jpg"))), // The Image Icon or main Image
					lblPictureHere.getSize().width,			// Width
					lblPictureHere.getSize().height),		// Height
				2		// Thickness of the circle border
				));
		lblPictureHere.setHorizontalAlignment(SwingConstants.CENTER);
		pnlDetail.add(lblPictureHere);
		
		JLabel lblDetails = new JLabel("Basic Info");
		lblDetails.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 28));
		lblDetails.setBounds(30, 341, 201, 30);
		pnlDetail.add(lblDetails);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblFirstName.setBounds(30, 395, 121, 25);
		pnlDetail.add(lblFirstName);
		
		txtFirstname = new JTextField();
		txtFirstname.setText("First Name");
		txtFirstname.setCaretColor(Color.WHITE);
		txtFirstname.setForeground(Color.WHITE);
		txtFirstname.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtFirstname.setOpaque(false);
		txtFirstname.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtFirstname.setBackground(UIManager.getColor("ToggleButton.light"));
		txtFirstname.setBounds(30, 420, 300, 25);
		pnlDetail.add(txtFirstname);
		txtFirstname.setColumns(10);
		
		txtMiddlename = new JTextField();
		txtMiddlename.setText("Middle Name");
		txtMiddlename.setOpaque(false);
		txtMiddlename.setForeground(Color.WHITE);
		txtMiddlename.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtMiddlename.setColumns(10);
		txtMiddlename.setCaretColor(Color.WHITE);
		txtMiddlename.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtMiddlename.setBackground(SystemColor.controlHighlight);
		txtMiddlename.setBounds(30, 484, 300, 25);
		pnlDetail.add(txtMiddlename);
		
		JLabel lblMiddleName = new JLabel("Middle Name");
		lblMiddleName.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblMiddleName.setBounds(30, 459, 121, 25);
		pnlDetail.add(lblMiddleName);
		
		txtLastName = new JTextField();
		txtLastName.setText("Last Name");
		txtLastName.setOpaque(false);
		txtLastName.setForeground(Color.WHITE);
		txtLastName.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtLastName.setColumns(10);
		txtLastName.setCaretColor(Color.WHITE);
		txtLastName.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtLastName.setBackground(SystemColor.controlHighlight);
		txtLastName.setBounds(30, 548, 300, 25);
		pnlDetail.add(txtLastName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblLastName.setBounds(30, 523, 121, 25);
		pnlDetail.add(lblLastName);
		
		JLabel lblPhoneNumber = new JLabel("Phone number");
		lblPhoneNumber.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblPhoneNumber.setBounds(30, 585, 121, 25);
		pnlDetail.add(lblPhoneNumber);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setText("Phone Number");
		txtPhoneNumber.setOpaque(false);
		txtPhoneNumber.setForeground(Color.WHITE);
		txtPhoneNumber.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setCaretColor(Color.WHITE);
		txtPhoneNumber.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtPhoneNumber.setBackground(SystemColor.controlHighlight);
		txtPhoneNumber.setBounds(30, 610, 300, 25);
		pnlDetail.add(txtPhoneNumber);
		
		JPanel pnlMainEdit = new JPanel();
		pnlMainEdit.setOpaque(false);
		pnlMainEdit.setBounds(346, 0, 940, 662);
		add(pnlMainEdit);
		GridBagLayout gbl_pnlMainEdit = new GridBagLayout();
		gbl_pnlMainEdit.columnWidths = new int[]{2, 838, 30, 0};
		gbl_pnlMainEdit.rowHeights = new int[]{30, 300, 0, 235, 62, 0};
		gbl_pnlMainEdit.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlMainEdit.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnlMainEdit.setLayout(gbl_pnlMainEdit);
		
		JPanel pnlPersonalEdit = new JPanel();
		GridBagConstraints gbc_pnlPersonalEdit = new GridBagConstraints();
		gbc_pnlPersonalEdit.insets = new Insets(0, 0, 5, 5);
		gbc_pnlPersonalEdit.fill = GridBagConstraints.BOTH;
		gbc_pnlPersonalEdit.gridx = 1;
		gbc_pnlPersonalEdit.gridy = 1;
		pnlMainEdit.add(pnlPersonalEdit, gbc_pnlPersonalEdit);
		SpringLayout sl_pnlPersonalEdit = new SpringLayout();
		pnlPersonalEdit.setLayout(sl_pnlPersonalEdit);
		
		JLabel lblPersonalEdit = new JLabel("Personal Information");
		sl_pnlPersonalEdit.putConstraint(SpringLayout.NORTH, lblPersonalEdit, 20, SpringLayout.NORTH, pnlPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.WEST, lblPersonalEdit, 20, SpringLayout.WEST, pnlPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.SOUTH, lblPersonalEdit, 50, SpringLayout.NORTH, pnlPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.EAST, lblPersonalEdit, 320, SpringLayout.WEST, pnlPersonalEdit);
		lblPersonalEdit.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		pnlPersonalEdit.add(lblPersonalEdit);
		
		JLabel lblBirthdate = new JLabel("Birthdate");
		sl_pnlPersonalEdit.putConstraint(SpringLayout.NORTH, lblBirthdate, 23, SpringLayout.SOUTH, lblPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.WEST, lblBirthdate, 20, SpringLayout.WEST, pnlPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.EAST, lblBirthdate, -733, SpringLayout.EAST, pnlPersonalEdit);
		lblBirthdate.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pnlPersonalEdit.add(lblBirthdate);
		
		txtBirthdate = new JTextField();
		sl_pnlPersonalEdit.putConstraint(SpringLayout.EAST, txtBirthdate, -713, SpringLayout.EAST, pnlPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.SOUTH, lblBirthdate, -6, SpringLayout.NORTH, txtBirthdate);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.WEST, txtBirthdate, 20, SpringLayout.WEST, pnlPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.SOUTH, txtBirthdate, -176, SpringLayout.SOUTH, pnlPersonalEdit);
		txtBirthdate.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		sl_pnlPersonalEdit.putConstraint(SpringLayout.NORTH, txtBirthdate, 94, SpringLayout.NORTH, pnlPersonalEdit);
		txtBirthdate.setBorder(new LineBorder(new Color(171, 173, 179)));
		txtBirthdate.setOpaque(false);
		pnlPersonalEdit.add(txtBirthdate);
		txtBirthdate.setColumns(10);
		
		JLabel lblSex = new JLabel("Sex");
		sl_pnlPersonalEdit.putConstraint(SpringLayout.NORTH, lblSex, 25, SpringLayout.SOUTH, txtBirthdate);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.WEST, lblSex, 0, SpringLayout.WEST, lblPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.SOUTH, lblSex, -129, SpringLayout.SOUTH, pnlPersonalEdit);
		lblSex.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pnlPersonalEdit.add(lblSex);
		
		JComboBox cmbSex = new JComboBox();
		sl_pnlPersonalEdit.putConstraint(SpringLayout.NORTH, cmbSex, 4, SpringLayout.SOUTH, lblSex);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.WEST, cmbSex, 0, SpringLayout.WEST, lblPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.EAST, cmbSex, 0, SpringLayout.EAST, txtBirthdate);
		cmbSex.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		cmbSex.setModel(new DefaultComboBoxModel(new String[] {"--Select Sex--", "Male", "Female"}));
		pnlPersonalEdit.add(cmbSex);
		
		txtInterest = new JTextField();
		sl_pnlPersonalEdit.putConstraint(SpringLayout.NORTH, txtInterest, 245, SpringLayout.NORTH, pnlPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.WEST, txtInterest, 20, SpringLayout.WEST, pnlPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.SOUTH, txtInterest, -25, SpringLayout.SOUTH, pnlPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.EAST, txtInterest, -638, SpringLayout.EAST, pnlPersonalEdit);
		txtInterest.setOpaque(false);
		txtInterest.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtInterest.setColumns(10);
		txtInterest.setBorder(new LineBorder(new Color(171, 173, 179)));
		pnlPersonalEdit.add(txtInterest);
		
		JLabel lblMotherName = new JLabel("Mother's Name");
		sl_pnlPersonalEdit.putConstraint(SpringLayout.NORTH, lblMotherName, -4, SpringLayout.NORTH, lblBirthdate);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.WEST, lblMotherName, 64, SpringLayout.EAST, lblBirthdate);
		lblMotherName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pnlPersonalEdit.add(lblMotherName);
		
		txtMotherName = new JTextField();
		sl_pnlPersonalEdit.putConstraint(SpringLayout.NORTH, txtMotherName, 4, SpringLayout.SOUTH, lblMotherName);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.WEST, txtMotherName, 164, SpringLayout.WEST, pnlPersonalEdit);
		txtMotherName.setOpaque(false);
		txtMotherName.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtMotherName.setColumns(10);
		txtMotherName.setBorder(new LineBorder(new Color(171, 173, 179)));
		pnlPersonalEdit.add(txtMotherName);
		
		txtFatherName = new JTextField();
		sl_pnlPersonalEdit.putConstraint(SpringLayout.EAST, txtMotherName, -43, SpringLayout.WEST, txtFatherName);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.WEST, txtFatherName, 507, SpringLayout.WEST, pnlPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.EAST, txtFatherName, -25, SpringLayout.EAST, pnlPersonalEdit);
		txtFatherName.setOpaque(false);
		txtFatherName.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtFatherName.setColumns(10);
		txtFatherName.setBorder(new LineBorder(new Color(171, 173, 179)));
		pnlPersonalEdit.add(txtFatherName);
		
		JLabel lblFatherName = new JLabel("Father's Name");
		sl_pnlPersonalEdit.putConstraint(SpringLayout.EAST, lblMotherName, -213, SpringLayout.WEST, lblFatherName);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.NORTH, lblFatherName, 69, SpringLayout.NORTH, pnlPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.NORTH, txtFatherName, 4, SpringLayout.SOUTH, lblFatherName);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.WEST, lblFatherName, 507, SpringLayout.WEST, pnlPersonalEdit);
		lblFatherName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pnlPersonalEdit.add(lblFatherName);
		
		JLabel lblGuardianName = new JLabel("Guardian's Name");
		sl_pnlPersonalEdit.putConstraint(SpringLayout.SOUTH, txtMotherName, -26, SpringLayout.NORTH, lblGuardianName);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.NORTH, lblGuardianName, 0, SpringLayout.NORTH, lblSex);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.WEST, lblGuardianName, 118, SpringLayout.EAST, lblSex);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.EAST, lblGuardianName, 0, SpringLayout.EAST, lblMotherName);
		lblGuardianName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pnlPersonalEdit.add(lblGuardianName);
		
		txtGuardianName = new JTextField();
		sl_pnlPersonalEdit.putConstraint(SpringLayout.NORTH, txtGuardianName, 0, SpringLayout.NORTH, cmbSex);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.WEST, txtGuardianName, 0, SpringLayout.WEST, lblMotherName);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.EAST, txtGuardianName, 0, SpringLayout.EAST, txtMotherName);
		txtGuardianName.setOpaque(false);
		txtGuardianName.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtGuardianName.setColumns(10);
		txtGuardianName.setBorder(new LineBorder(new Color(171, 173, 179)));
		pnlPersonalEdit.add(txtGuardianName);
		
		txtGuardianPhone = new JTextField();
		sl_pnlPersonalEdit.putConstraint(SpringLayout.NORTH, txtGuardianPhone, 0, SpringLayout.NORTH, cmbSex);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.WEST, txtGuardianPhone, 507, SpringLayout.WEST, pnlPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.SOUTH, txtGuardianPhone, 0, SpringLayout.SOUTH, cmbSex);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.EAST, txtGuardianPhone, 0, SpringLayout.EAST, txtFatherName);
		txtGuardianPhone.setOpaque(false);
		txtGuardianPhone.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtGuardianPhone.setColumns(10);
		txtGuardianPhone.setBorder(new LineBorder(new Color(171, 173, 179)));
		pnlPersonalEdit.add(txtGuardianPhone);
		
		JLabel lblGuardianPhone = new JLabel("Guardian's Phone Number");
		sl_pnlPersonalEdit.putConstraint(SpringLayout.WEST, lblGuardianPhone, 507, SpringLayout.WEST, pnlPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.NORTH, lblGuardianPhone, 144, SpringLayout.NORTH, pnlPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.SOUTH, txtFatherName, -24, SpringLayout.NORTH, lblGuardianPhone);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.SOUTH, lblGuardianPhone, -129, SpringLayout.SOUTH, pnlPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.EAST, lblGuardianPhone, -136, SpringLayout.EAST, pnlPersonalEdit);
		lblGuardianPhone.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pnlPersonalEdit.add(lblGuardianPhone);
		
		JLabel lblAddress = new JLabel("Address");
		sl_pnlPersonalEdit.putConstraint(SpringLayout.SOUTH, txtGuardianName, -22, SpringLayout.NORTH, lblAddress);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.EAST, lblAddress, -470, SpringLayout.EAST, pnlPersonalEdit);
		lblAddress.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pnlPersonalEdit.add(lblAddress);
		
		txtAddress = new JTextField();
		sl_pnlPersonalEdit.putConstraint(SpringLayout.WEST, lblAddress, 0, SpringLayout.WEST, txtAddress);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.SOUTH, lblAddress, -7, SpringLayout.NORTH, txtAddress);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.WEST, txtAddress, 45, SpringLayout.EAST, txtInterest);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.EAST, txtAddress, -25, SpringLayout.EAST, pnlPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.SOUTH, txtAddress, -24, SpringLayout.SOUTH, pnlPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.NORTH, txtAddress, 246, SpringLayout.NORTH, pnlPersonalEdit);
		txtAddress.setOpaque(false);
		txtAddress.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtAddress.setColumns(10);
		txtAddress.setBorder(new LineBorder(new Color(171, 173, 179)));
		pnlPersonalEdit.add(txtAddress);
		
		JLabel lblInterest = new JLabel("Interest");
		sl_pnlPersonalEdit.putConstraint(SpringLayout.SOUTH, cmbSex, -22, SpringLayout.NORTH, lblInterest);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.WEST, lblInterest, 20, SpringLayout.WEST, pnlPersonalEdit);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.EAST, lblInterest, -128, SpringLayout.WEST, lblAddress);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.NORTH, lblAddress, 0, SpringLayout.NORTH, lblInterest);
		sl_pnlPersonalEdit.putConstraint(SpringLayout.SOUTH, lblInterest, -6, SpringLayout.NORTH, txtInterest);
		lblInterest.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pnlPersonalEdit.add(lblInterest);
		
		JPanel pnlSchoolEdit = new JPanel();
		GridBagConstraints gbc_pnlSchoolEdit = new GridBagConstraints();
		gbc_pnlSchoolEdit.insets = new Insets(0, 0, 5, 5);
		gbc_pnlSchoolEdit.fill = GridBagConstraints.BOTH;
		gbc_pnlSchoolEdit.gridx = 1;
		gbc_pnlSchoolEdit.gridy = 3;
		pnlMainEdit.add(pnlSchoolEdit, gbc_pnlSchoolEdit);
		SpringLayout sl_pnlSchoolEdit = new SpringLayout();
		pnlSchoolEdit.setLayout(sl_pnlSchoolEdit);
		
		JLabel lblSchoolEdit = new JLabel("School Information");
		sl_pnlSchoolEdit.putConstraint(SpringLayout.NORTH, lblSchoolEdit, 25, SpringLayout.NORTH, pnlSchoolEdit);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.WEST, lblSchoolEdit, 25, SpringLayout.WEST, pnlSchoolEdit);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.SOUTH, lblSchoolEdit, -180, SpringLayout.SOUTH, pnlSchoolEdit);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.EAST, lblSchoolEdit, -518, SpringLayout.EAST, pnlSchoolEdit);
		lblSchoolEdit.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		pnlSchoolEdit.add(lblSchoolEdit);
		
		JLabel lblEmail = new JLabel("Email");
		sl_pnlSchoolEdit.putConstraint(SpringLayout.WEST, lblEmail, 25, SpringLayout.WEST, pnlSchoolEdit);
		lblEmail.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pnlSchoolEdit.add(lblEmail);
		
		txtEmail = new JTextField();
		sl_pnlSchoolEdit.putConstraint(SpringLayout.WEST, txtEmail, 25, SpringLayout.WEST, pnlSchoolEdit);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.SOUTH, lblEmail, -6, SpringLayout.NORTH, txtEmail);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.SOUTH, txtEmail, -20, SpringLayout.SOUTH, pnlSchoolEdit);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.NORTH, txtEmail, 185, SpringLayout.NORTH, pnlSchoolEdit);
		txtEmail.setOpaque(false);
		txtEmail.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtEmail.setColumns(10);
		txtEmail.setBorder(new LineBorder(new Color(171, 173, 179)));
		pnlSchoolEdit.add(txtEmail);
		
		JComboBox cmbGrade = new JComboBox();
		sl_pnlSchoolEdit.putConstraint(SpringLayout.SOUTH, cmbGrade, -96, SpringLayout.SOUTH, pnlSchoolEdit);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.NORTH, lblEmail, 23, SpringLayout.SOUTH, cmbGrade);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.NORTH, cmbGrade, 109, SpringLayout.NORTH, pnlSchoolEdit);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.WEST, cmbGrade, 23, SpringLayout.WEST, pnlSchoolEdit);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.EAST, cmbGrade, -688, SpringLayout.EAST, pnlSchoolEdit);
		cmbGrade.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		cmbGrade.setModel(new DefaultComboBoxModel(new String[] {"Grade 11", "Grade 12"}));
		pnlSchoolEdit.add(cmbGrade);
		
		JLabel lblGrade = new JLabel("Grade Level");
		sl_pnlSchoolEdit.putConstraint(SpringLayout.WEST, lblGrade, 25, SpringLayout.WEST, pnlSchoolEdit);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.SOUTH, lblGrade, -6, SpringLayout.NORTH, cmbGrade);
		lblGrade.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pnlSchoolEdit.add(lblGrade);
		
		JComboBox cmbStrand = new JComboBox();
		sl_pnlSchoolEdit.putConstraint(SpringLayout.NORTH, cmbStrand, 1, SpringLayout.NORTH, cmbGrade);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.WEST, cmbStrand, 179, SpringLayout.EAST, cmbGrade);
		cmbStrand.setModel(new DefaultComboBoxModel(new String[] {"--Select Strand--", "TVL - HE", "TVL - ICT Programming", "TVL - ICT CSS", "HUMMS", "GAS"}));
		cmbStrand.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		pnlSchoolEdit.add(cmbStrand);
		
		JLabel lblStrand = new JLabel("Strand");
		sl_pnlSchoolEdit.putConstraint(SpringLayout.NORTH, lblStrand, 82, SpringLayout.NORTH, pnlSchoolEdit);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.WEST, lblStrand, 0, SpringLayout.WEST, cmbStrand);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.SOUTH, lblStrand, -6, SpringLayout.NORTH, cmbStrand);
		lblStrand.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pnlSchoolEdit.add(lblStrand);
		
		JLabel lblSection = new JLabel("Section");
		sl_pnlSchoolEdit.putConstraint(SpringLayout.EAST, lblStrand, -276, SpringLayout.WEST, lblSection);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.WEST, lblSection, 686, SpringLayout.WEST, pnlSchoolEdit);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.EAST, lblSection, -92, SpringLayout.EAST, pnlSchoolEdit);
		lblSection.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pnlSchoolEdit.add(lblSection);
		
		JComboBox cmbSection = new JComboBox();
		sl_pnlSchoolEdit.putConstraint(SpringLayout.WEST, cmbSection, 202, SpringLayout.EAST, cmbStrand);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.EAST, cmbSection, -25, SpringLayout.EAST, pnlSchoolEdit);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.SOUTH, lblSection, -7, SpringLayout.NORTH, cmbSection);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.NORTH, cmbSection, 1, SpringLayout.NORTH, cmbGrade);
		cmbSection.setModel(new DefaultComboBoxModel(new String[] {"--Select Section--", "A", "B", "C", "D", "E", "F", "G"}));
		cmbSection.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		pnlSchoolEdit.add(cmbSection);
		
		txtLRN = new JTextField();
		sl_pnlSchoolEdit.putConstraint(SpringLayout.EAST, txtEmail, -83, SpringLayout.WEST, txtLRN);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.WEST, txtLRN, 458, SpringLayout.WEST, pnlSchoolEdit);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.EAST, txtLRN, -25, SpringLayout.EAST, pnlSchoolEdit);
		txtLRN.setOpaque(false);
		txtLRN.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtLRN.setColumns(10);
		txtLRN.setBorder(new LineBorder(new Color(171, 173, 179)));
		pnlSchoolEdit.add(txtLRN);
		
		JLabel lblLrn = new JLabel("LRN");
		sl_pnlSchoolEdit.putConstraint(SpringLayout.WEST, lblLrn, 458, SpringLayout.WEST, pnlSchoolEdit);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.SOUTH, txtLRN, 31, SpringLayout.SOUTH, lblLrn);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.SOUTH, lblLrn, -50, SpringLayout.SOUTH, pnlSchoolEdit);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.NORTH, txtLRN, 6, SpringLayout.SOUTH, lblLrn);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.EAST, lblEmail, -365, SpringLayout.WEST, lblLrn);
		sl_pnlSchoolEdit.putConstraint(SpringLayout.EAST, cmbStrand, -4, SpringLayout.EAST, lblLrn);
		lblLrn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pnlSchoolEdit.add(lblLrn);
		
		JPanel pnlButtons = new JPanel();
		pnlButtons.setOpaque(false);
		GridBagConstraints gbc_pnlButtons = new GridBagConstraints();
		gbc_pnlButtons.insets = new Insets(0, 0, 0, 5);
		gbc_pnlButtons.fill = GridBagConstraints.BOTH;
		gbc_pnlButtons.gridx = 1;
		gbc_pnlButtons.gridy = 4;
		pnlMainEdit.add(pnlButtons, gbc_pnlButtons);
		SpringLayout sl_pnlButtons = new SpringLayout();
		pnlButtons.setLayout(sl_pnlButtons);
		
		JButton btnSave = new JButton("Save");
		sl_pnlButtons.putConstraint(SpringLayout.NORTH, btnSave, 16, SpringLayout.NORTH, pnlButtons);
		sl_pnlButtons.putConstraint(SpringLayout.WEST, btnSave, 620, SpringLayout.WEST, pnlButtons);
		sl_pnlButtons.putConstraint(SpringLayout.SOUTH, btnSave, 51, SpringLayout.NORTH, pnlButtons);
		btnSave.setBorder(null);
		btnSave.setBackground(new Color(102, 153, 255));
		btnSave.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pnlButtons.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		sl_pnlButtons.putConstraint(SpringLayout.EAST, btnSave, -12, SpringLayout.WEST, btnCancel);
		sl_pnlButtons.putConstraint(SpringLayout.NORTH, btnCancel, 16, SpringLayout.NORTH, pnlButtons);
		sl_pnlButtons.putConstraint(SpringLayout.WEST, btnCancel, 732, SpringLayout.WEST, pnlButtons);
		sl_pnlButtons.putConstraint(SpringLayout.SOUTH, btnCancel, 51, SpringLayout.NORTH, pnlButtons);
		sl_pnlButtons.putConstraint(SpringLayout.EAST, btnCancel, -1, SpringLayout.EAST, pnlButtons);
		btnCancel.setBackground(new Color(220, 220, 220));
		btnCancel.setBorder(null);
		btnCancel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		pnlButtons.add(btnCancel);

	}
}
