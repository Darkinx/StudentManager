package com.StudentManagement;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.Cursor;

public class TeacherInfoPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public TeacherInfoPanel(JButton userButton) {
		setBorder(null);
		setEnabled(false);
		setVisible(false);
		setBackground(new Color(139, 164, 255));
		setSize(1370, 662);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblPictureHolder = new JLabel("");
		springLayout.putConstraint(SpringLayout.SOUTH, lblPictureHolder, 250, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblPictureHolder, -1060, SpringLayout.EAST, this);
		lblPictureHolder.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPictureHolder.setHorizontalAlignment(SwingConstants.CENTER);
		lblPictureHolder.setPreferredSize(new Dimension(250, 250));
		lblPictureHolder.setIcon(
				mainPageFunction.imgCircle(
					mainPageFunction.imgRescale(
						(new ImageIcon(TeacherInfoPanel.class.getResource("/Icons/Others/Teacher_Original.jpg"))),
						lblPictureHolder.getPreferredSize().width,
						lblPictureHolder.getPreferredSize().height),
					2
					));
		add(lblPictureHolder);
		
		JLabel lblFullname = new JLabel("Fullname Here");
		springLayout.putConstraint(SpringLayout.NORTH, lblFullname, 6, SpringLayout.SOUTH, lblPictureHolder);
		springLayout.putConstraint(SpringLayout.WEST, lblFullname, 0, SpringLayout.WEST, lblPictureHolder);
		springLayout.putConstraint(SpringLayout.EAST, lblFullname, 345, SpringLayout.WEST, this);
		lblFullname.setForeground(new Color(255, 255, 255));
		lblFullname.setFont(new Font("Lato Black", Font.PLAIN, 32));
		add(lblFullname);
		
		JLabel lblUsername = new JLabel("Username");
		springLayout.putConstraint(SpringLayout.NORTH, lblUsername, 297, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblUsername, -348, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblFullname, -6, SpringLayout.NORTH, lblUsername);
		springLayout.putConstraint(SpringLayout.WEST, lblUsername, 0, SpringLayout.WEST, lblPictureHolder);
		springLayout.putConstraint(SpringLayout.EAST, lblUsername, -995, SpringLayout.EAST, this);
		lblUsername.setFont(new Font("Lato", Font.PLAIN, 20));
		add(lblUsername);
		
		JLabel lblEmail = new JLabel("Emailprotonmail@gmail.com");
		springLayout.putConstraint(SpringLayout.NORTH, lblEmail, 396, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblEmail, 0, SpringLayout.WEST, lblPictureHolder);
		springLayout.putConstraint(SpringLayout.EAST, lblEmail, 315, SpringLayout.WEST, lblPictureHolder);
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Lato", Font.PLAIN, 16));
		add(lblEmail);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		springLayout.putConstraint(SpringLayout.WEST, lblPhoneNumber, 60, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblPhoneNumber, -130, SpringLayout.SOUTH, this);
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setFont(new Font("Lato", Font.PLAIN, 20));
		add(lblPhoneNumber);
		
		JLabel lblEmployeeNumber = new JLabel("Employee Number: ");
		springLayout.putConstraint(SpringLayout.NORTH, lblEmployeeNumber, 40, SpringLayout.SOUTH, lblPhoneNumber);
		springLayout.putConstraint(SpringLayout.WEST, lblEmployeeNumber, 60, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblEmployeeNumber, -66, SpringLayout.SOUTH, this);
		lblEmployeeNumber.setForeground(Color.WHITE);
		lblEmployeeNumber.setFont(new Font("Lato", Font.PLAIN, 20));
		add(lblEmployeeNumber);
		
		JLabel lblPosition = new JLabel("Teacher");
		springLayout.putConstraint(SpringLayout.NORTH, lblPosition, 447, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblPosition, -193, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblEmail, -30, SpringLayout.NORTH, lblPosition);
		springLayout.putConstraint(SpringLayout.WEST, lblPosition, 60, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, lblPhoneNumber, 39, SpringLayout.SOUTH, lblPosition);
		lblPosition.setForeground(Color.WHITE);
		lblPosition.setFont(new Font("Lato", Font.PLAIN, 20));
		add(lblPosition);
		
		JPanel pnlPersonal = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, pnlPersonal, 445, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, pnlPersonal, -30, SpringLayout.EAST, this);
		pnlPersonal.setBackground(new Color(161, 173, 255));
		springLayout.putConstraint(SpringLayout.NORTH, pnlPersonal, 30, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, pnlPersonal, 330, SpringLayout.NORTH, this);
		add(pnlPersonal);
		
		JPanel pnlSchool = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, pnlSchool, 445, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, pnlSchool, -30, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblPosition, -70, SpringLayout.WEST, pnlSchool);
		springLayout.putConstraint(SpringLayout.EAST, lblEmployeeNumber, -70, SpringLayout.WEST, pnlSchool);
		springLayout.putConstraint(SpringLayout.EAST, lblPhoneNumber, -70, SpringLayout.WEST, pnlSchool);
		pnlSchool.setBackground(pnlPersonal.getBackground());
		springLayout.putConstraint(SpringLayout.NORTH, pnlSchool, 30, SpringLayout.SOUTH, pnlPersonal);
		springLayout.putConstraint(SpringLayout.SOUTH, pnlSchool, -30, SpringLayout.SOUTH, this);
		pnlPersonal.setLayout(null);
		
		JLabel lblPersonalInformation = new JLabel("Personal Information");
		lblPersonalInformation.setFont(new Font("Lato", Font.PLAIN, 20));
		lblPersonalInformation.setBounds(25, 25, 194, 25);
		pnlPersonal.add(lblPersonalInformation);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setForeground(Color.GRAY);
		lblAge.setFont(new Font("Lato", Font.PLAIN, 14));
		lblAge.setBounds(25, 85, 36, 20);
		pnlPersonal.add(lblAge);
		
		JLabel lblAgeInfo = new JLabel("69");
		lblAgeInfo.setForeground(Color.BLACK);
		lblAgeInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		lblAgeInfo.setBounds(25, 109, 194, 25);
		pnlPersonal.add(lblAgeInfo);
		
		JLabel lblBirthdate = new JLabel("Birthdate");
		lblBirthdate.setForeground(Color.GRAY);
		lblBirthdate.setFont(new Font("Lato", Font.PLAIN, 14));
		lblBirthdate.setBounds(25, 175, 120, 20);
		pnlPersonal.add(lblBirthdate);
		
		JLabel lblBirthdateInfo = new JLabel("2002-11-25");
		lblBirthdateInfo.setForeground(Color.BLACK);
		lblBirthdateInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		lblBirthdateInfo.setBounds(25, 199, 194, 25);
		pnlPersonal.add(lblBirthdateInfo);
		
		JLabel lblSexInfo = new JLabel("Male");
		lblSexInfo.setForeground(Color.BLACK);
		lblSexInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		lblSexInfo.setBounds(285, 109, 194, 25);
		pnlPersonal.add(lblSexInfo);
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setForeground(Color.GRAY);
		lblSex.setFont(new Font("Lato", Font.PLAIN, 14));
		lblSex.setBounds(285, 85, 36, 20);
		pnlPersonal.add(lblSex);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.GRAY);
		lblAddress.setFont(new Font("Lato", Font.PLAIN, 14));
		lblAddress.setBounds(285, 175, 85, 20);
		pnlPersonal.add(lblAddress);
		
		JLabel lblLastLogin = new JLabel("Last Login");
		lblLastLogin.setForeground(Color.GRAY);
		lblLastLogin.setFont(new Font("Lato", Font.PLAIN, 14));
		lblLastLogin.setBounds(546, 85, 71, 20);
		pnlPersonal.add(lblLastLogin);
		
		JLabel lblLastLoginInfo = new JLabel("2021-Jul-06");
		lblLastLoginInfo.setForeground(Color.BLACK);
		lblLastLoginInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		lblLastLoginInfo.setBounds(546, 109, 194, 25);
		pnlPersonal.add(lblLastLoginInfo);
		
		JTextArea txtrAddressInfo = new JTextArea();
		txtrAddressInfo.setEditable(false);
		txtrAddressInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		txtrAddressInfo.setLineWrap(true);
		txtrAddressInfo.setText("San Nicholas Village, Barangay San Nicholas III, Bacoor City Cavite Philippines Foxy has a ston and throw it everywhere so it kickeds him out.");
		txtrAddressInfo.setOpaque(false);
		txtrAddressInfo.setBounds(285, 199, 455, 60);
		pnlPersonal.add(txtrAddressInfo);
		add(pnlSchool);
		pnlSchool.setLayout(null);
		
		JLabel lblSchoolPosition = new JLabel("School Position Information");
		lblSchoolPosition.setBounds(25, 25, 240, 25);
		lblSchoolPosition.setFont(new Font("Lato", Font.PLAIN, 20));
		pnlSchool.add(lblSchoolPosition);
		
		JLabel lblRank = new JLabel("Position");
		lblRank.setForeground(Color.GRAY);
		lblRank.setFont(new Font("Lato", Font.PLAIN, 14));
		lblRank.setBounds(25, 170, 68, 20);
		pnlSchool.add(lblRank);
		
		JLabel lblRankInfo = new JLabel("Teacher III");
		lblRankInfo.setForeground(Color.BLACK);
		lblRankInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		lblRankInfo.setBounds(25, 195, 194, 25);
		pnlSchool.add(lblRankInfo);
		
		JLabel lblDepartmentInfo = new JLabel("TVL");
		lblDepartmentInfo.setForeground(Color.BLACK);
		lblDepartmentInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		lblDepartmentInfo.setBounds(25, 104, 194, 25);
		pnlSchool.add(lblDepartmentInfo);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setForeground(Color.GRAY);
		lblDepartment.setFont(new Font("Lato", Font.PLAIN, 14));
		lblDepartment.setBounds(25, 80, 83, 20);
		pnlSchool.add(lblDepartment);
		
		JLabel lblDegreeTakekn = new JLabel("Degree taken");
		lblDegreeTakekn.setForeground(Color.GRAY);
		lblDegreeTakekn.setFont(new Font("Lato", Font.PLAIN, 14));
		lblDegreeTakekn.setBounds(285, 80, 83, 20);
		pnlSchool.add(lblDegreeTakekn);
		
		JLabel lblDegreeInfo = new JLabel("Computer Science");
		lblDegreeInfo.setForeground(Color.BLACK);
		lblDegreeInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		lblDegreeInfo.setBounds(285, 104, 194, 25);
		pnlSchool.add(lblDegreeInfo);
		
		JLabel lblExperienceInfo = new JLabel("5 years");
		lblExperienceInfo.setForeground(Color.BLACK);
		lblExperienceInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		lblExperienceInfo.setBounds(561, 104, 179, 25);
		pnlSchool.add(lblExperienceInfo);
		
		JLabel lblYearsOfExperience = new JLabel("Years of Experience");
		lblYearsOfExperience.setForeground(Color.GRAY);
		lblYearsOfExperience.setFont(new Font("Lato", Font.PLAIN, 14));
		lblYearsOfExperience.setBounds(561, 80, 131, 20);
		pnlSchool.add(lblYearsOfExperience);
		
		JLabel lblSubjectHandle = new JLabel("Subject Handle");
		lblSubjectHandle.setForeground(Color.GRAY);
		lblSubjectHandle.setFont(new Font("Lato", Font.PLAIN, 14));
		lblSubjectHandle.setBounds(285, 171, 102, 20);
		pnlSchool.add(lblSubjectHandle);
		
		JLabel lblSubjectHandleInfo = new JLabel("Programming I & II");
		lblSubjectHandleInfo.setForeground(Color.BLACK);
		lblSubjectHandleInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		lblSubjectHandleInfo.setBounds(285, 195, 179, 25);
		pnlSchool.add(lblSubjectHandleInfo);
		
		JLabel lblAdvisory = new JLabel("Advisory");
		lblAdvisory.setForeground(Color.GRAY);
		lblAdvisory.setFont(new Font("Lato", Font.PLAIN, 14));
		lblAdvisory.setBounds(561, 170, 102, 20);
		pnlSchool.add(lblAdvisory);
		
		JLabel lblAdvisoryInfo = new JLabel("ICT - 12C");
		lblAdvisoryInfo.setForeground(Color.BLACK);
		lblAdvisoryInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		lblAdvisoryInfo.setBounds(561, 194, 179, 25);
		pnlSchool.add(lblAdvisoryInfo);
		
		
		// This is a wide back pnl to fit the design choice but will be disabled due to change of layout
//		JLabel lblBack = new RotateJLabel("GO BACK");
//		lblBack.setBounds(-24, 0, 135, 662);
//		lblBack.setForeground(new Color(200,200,200));
//		lblBack.setFont(new Font("Segoe UI", Font.BOLD, 16));
//		
//		
//		JPanel pnlBack = new JPanel();
//		springLayout.putConstraint(SpringLayout.WEST, lblEmail, 20, SpringLayout.EAST, pnlBack);
//		springLayout.putConstraint(SpringLayout.NORTH, lblPictureHolder, 0, SpringLayout.NORTH, pnlBack);
//		springLayout.putConstraint(SpringLayout.WEST, lblPictureHolder, 20, SpringLayout.EAST, pnlBack);
//		pnlBack.setBackground(getBackground());
//		pnlBack.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				userButton.doClick();
//			}
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				pnlBack.setBackground(new Color(111, 142, 255));
//				lblBack.setForeground(Color.WHITE);
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				pnlBack.setBackground(getBackground());
//				lblBack.setForeground(new Color(200,200,200));
//				
//			}
//		});
//		springLayout.putConstraint(SpringLayout.NORTH, pnlBack, 0, SpringLayout.NORTH, this);
//		springLayout.putConstraint(SpringLayout.WEST, pnlBack, 0, SpringLayout.WEST, this);
//		springLayout.putConstraint(SpringLayout.SOUTH, pnlBack, 662, SpringLayout.NORTH, this);
//		springLayout.putConstraint(SpringLayout.EAST, pnlBack, 40, SpringLayout.WEST, this);
//		add(pnlBack);
//		pnlBack.setLayout(null);
//		pnlBack.add(lblBack);
	
		JButton btnEditProf = new JButton("Edit Profile");
		btnEditProf.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		springLayout.putConstraint(SpringLayout.NORTH, btnEditProf, 26, SpringLayout.SOUTH, lblUsername);
		springLayout.putConstraint(SpringLayout.WEST, btnEditProf, 73, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnEditProf, -26, SpringLayout.NORTH, lblEmail);
		springLayout.putConstraint(SpringLayout.EAST, btnEditProf, -25, SpringLayout.EAST, lblFullname);
		btnEditProf.setBorder(null );
		btnEditProf.setForeground(new Color(255, 255, 255));
		btnEditProf.setBackground(new Color(47, 74, 95));
		btnEditProf.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		add(btnEditProf);

	}
}
