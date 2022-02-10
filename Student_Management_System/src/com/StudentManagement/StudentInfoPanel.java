package com.StudentManagement;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SpringLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentInfoPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public StudentInfoPanel(JPanel DatabasePanel, JPanel EditInfo) {
		setBackground(Color.GRAY);
		setSize(1240, 662);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JPanel pnlMainInfo = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, pnlMainInfo, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, pnlMainInfo, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, pnlMainInfo, 662, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, pnlMainInfo, 351, SpringLayout.WEST, this);
		pnlMainInfo.setOpaque(false);
		add(pnlMainInfo);
		pnlMainInfo.setLayout(null);
		
		JLabel lblPictureHere = new JLabel("");
		lblPictureHere.setBounds(30, 30, 250, 250);
		pnlMainInfo.add(lblPictureHere);
		lblPictureHere.setHorizontalAlignment(SwingConstants.CENTER);
		lblPictureHere.setIcon(
				mainPageFunction.imgCircle(
					mainPageFunction.imgRescale(
							new ImageIcon(StudentInfoPanel.class.getResource("/Icons/Others/Student.jpg")), 
							lblPictureHere.getWidth(), 
							lblPictureHere.getHeight()),
					2
				));
		
		JLabel lblFullname = new JLabel("Luwalhati Alcantara");
		lblFullname.setBounds(30, 304, 311, 35);
		pnlMainInfo.add(lblFullname);
		lblFullname.setForeground(Color.WHITE);
		lblFullname.setFont(new Font("Lato Black", Font.PLAIN, 32));
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(30, 337, 311, 15);
		pnlMainInfo.add(lblUsername);
		lblUsername.setFont(new Font("Lato", Font.PLAIN, 20));
		
		JLabel lblGmail = new JLabel("alcantaraLuwalhati@protonmail.com");
		lblGmail.setBounds(30, 365, 311, 20);
		pnlMainInfo.add(lblGmail);
		lblGmail.setForeground(Color.WHITE);
		lblGmail.setFont(new Font("Lato", Font.PLAIN, 16));
		
		JLabel lblGrade = new JLabel("Grade: ");
		lblGrade.setBounds(30, 485, 311, 20);
		pnlMainInfo.add(lblGrade);
		lblGrade.setForeground(Color.WHITE);
		lblGrade.setFont(new Font("Lato", Font.PLAIN, 16));
		
		JLabel lblLrn = new JLabel("LRN:");
		lblLrn.setBounds(30, 525, 311, 20);
		pnlMainInfo.add(lblLrn);
		lblLrn.setForeground(Color.WHITE);
		lblLrn.setFont(new Font("Lato", Font.PLAIN, 16));
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:   091234567891");
		lblPhoneNumber.setBounds(30, 445, 311, 20);
		pnlMainInfo.add(lblPhoneNumber);
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setFont(new Font("Lato", Font.PLAIN, 16));
		
		JTextArea txtrAddress = new JTextArea();
		txtrAddress.setForeground(Color.WHITE);
		txtrAddress.setOpaque(false);
		txtrAddress.setEditable(false);
		txtrAddress.setWrapStyleWord(true);
		txtrAddress.setLineWrap(true);
		txtrAddress.setText("Address: San Nicholas Village, Barangay San Nicholas III, Bacoor City Cavite Philippines Foxy has a ston and throw it everywhere so it kickeds him out.");
		txtrAddress.setFont(new Font("Lato", Font.PLAIN, 16));
		txtrAddress.setBounds(30, 565, 311, 65);
		pnlMainInfo.add(txtrAddress);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatabasePanel.removeAll();
				DatabasePanel.add(EditInfo);
				DatabasePanel.repaint();
				DatabasePanel.revalidate();
			}
		});
		btnEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnEdit.setBackground(new Color(32, 102, 156));
				btnEdit.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnEdit.setForeground(new Color(255, 255, 255));
				btnEdit.setBackground(new Color(47, 74, 95));
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnEdit.setBackground(new Color(81, 125, 160));
				btnEdit.setForeground(Color.BLACK);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnEdit.setBackground(new Color(32, 102, 156));
				btnEdit.setForeground(new Color(255, 255, 255));
			}
		});
		btnEdit.setForeground(new Color(255, 255, 255));
		btnEdit.setBackground(new Color(47, 74, 95));
		btnEdit.setBorder(null);
		btnEdit.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnEdit.setBounds(30, 396, 143, 35);
		pnlMainInfo.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnDelete.setBackground(new Color(200, 40, 40));
				btnDelete.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnDelete.setBackground(new Color(128, 30, 30));
				btnDelete.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnDelete.setBackground(new Color(195, 81, 81));
				btnDelete.setForeground(Color.BLACK);
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				btnDelete.setBackground(new Color(200, 40, 40));
				btnDelete.setForeground(new Color(255, 255, 255));
			}
		});
		btnDelete.setBackground(new Color(128, 30, 30));
		btnDelete.setBorder(null);
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		btnDelete.setBounds(183, 396, 143, 35);
		pnlMainInfo.add(btnDelete);
		
		JPanel pnlDetailInfo = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, pnlDetailInfo, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, pnlDetailInfo, 349, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, pnlDetailInfo, 662, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, pnlDetailInfo, 1240, SpringLayout.WEST, this);
		pnlDetailInfo.setOpaque(false);
		add(pnlDetailInfo);
		GridBagLayout gbl_pnlDetailInfo = new GridBagLayout();
		gbl_pnlDetailInfo.columnWidths = new int[]{65, 751, 0};
		gbl_pnlDetailInfo.rowHeights = new int[]{30, 305, 17, 261, 0};
		gbl_pnlDetailInfo.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlDetailInfo.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlDetailInfo.setLayout(gbl_pnlDetailInfo);
		
		JPanel pnlSlip = new JPanel();
		pnlSlip.setOpaque(false);
		GridBagConstraints gbc_pnlSlip = new GridBagConstraints();
		gbc_pnlSlip.insets = new Insets(0, 0, 5, 0);
		gbc_pnlSlip.fill = GridBagConstraints.BOTH;
		gbc_pnlSlip.gridx = 1;
		gbc_pnlSlip.gridy = 1;
		pnlDetailInfo.add(pnlSlip, gbc_pnlSlip);
		SpringLayout sl_pnlSlip = new SpringLayout();
		pnlSlip.setLayout(sl_pnlSlip);
		
		JLabel lblSeeMore = new JLabel("see more");
		sl_pnlSlip.putConstraint(SpringLayout.NORTH, lblSeeMore, 9, SpringLayout.NORTH, pnlSlip);
		sl_pnlSlip.putConstraint(SpringLayout.WEST, lblSeeMore, 702, SpringLayout.WEST, pnlSlip);
		pnlSlip.add(lblSeeMore);
		lblSeeMore.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSeeMore.setForeground(SystemColor.activeCaptionBorder);
		lblSeeMore.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JLabel lblNewLabel = new JLabel("Slips and Receipts");
		sl_pnlSlip.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, pnlSlip);
		sl_pnlSlip.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, pnlSlip);
		sl_pnlSlip.putConstraint(SpringLayout.SOUTH, lblNewLabel, 30, SpringLayout.NORTH, pnlSlip);
		sl_pnlSlip.putConstraint(SpringLayout.EAST, lblNewLabel, 150, SpringLayout.WEST, pnlSlip);
		pnlSlip.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		JPanel panel = new JPanel();
		sl_pnlSlip.putConstraint(SpringLayout.NORTH, panel, 30, SpringLayout.NORTH, pnlSlip);
		sl_pnlSlip.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, pnlSlip);
		sl_pnlSlip.putConstraint(SpringLayout.EAST, panel, 365, SpringLayout.WEST, pnlSlip);
		pnlSlip.add(panel);
		panel.setOpaque(false);
		panel.setBorder(new LineBorder(Color.BLACK));
		
		JPanel panel_1 = new JPanel();
		sl_pnlSlip.putConstraint(SpringLayout.WEST, panel_1, 20, SpringLayout.EAST, panel);
		sl_pnlSlip.putConstraint(SpringLayout.EAST, panel_1, -1, SpringLayout.EAST, pnlSlip);
		sl_pnlSlip.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, panel_1);
		sl_pnlSlip.putConstraint(SpringLayout.NORTH, panel_1, 30, SpringLayout.NORTH, pnlSlip);
		sl_pnlSlip.putConstraint(SpringLayout.SOUTH, panel_1, 155, SpringLayout.NORTH, pnlSlip);
		pnlSlip.add(panel_1);
		panel_1.setOpaque(false);
		panel_1.setBorder(new LineBorder(Color.BLACK));
		
		JPanel panel_2 = new JPanel();
		sl_pnlSlip.putConstraint(SpringLayout.NORTH, panel_2, 20, SpringLayout.SOUTH, panel);
		sl_pnlSlip.putConstraint(SpringLayout.WEST, panel_2, 0, SpringLayout.WEST, lblNewLabel);
		sl_pnlSlip.putConstraint(SpringLayout.SOUTH, panel_2, 0, SpringLayout.SOUTH, pnlSlip);
		pnlSlip.add(panel_2);
		panel_2.setOpaque(false);
		panel_2.setBorder(new LineBorder(Color.BLACK));
		
		JPanel panel_3 = new JPanel();
		sl_pnlSlip.putConstraint(SpringLayout.EAST, panel_3, 0, SpringLayout.EAST, pnlSlip);
		sl_pnlSlip.putConstraint(SpringLayout.EAST, panel_2, -20, SpringLayout.WEST, panel_3);
		sl_pnlSlip.putConstraint(SpringLayout.NORTH, panel_3, 20, SpringLayout.SOUTH, panel_1);
		sl_pnlSlip.putConstraint(SpringLayout.SOUTH, panel_3, 0, SpringLayout.SOUTH, pnlSlip);
		sl_pnlSlip.putConstraint(SpringLayout.WEST, panel_3, 0, SpringLayout.WEST, panel_1);
		pnlSlip.add(panel_3);
		panel_3.setOpaque(false);
		panel_3.setBorder(new LineBorder(Color.BLACK));
		
		JPanel pnlPersonalInfo = new JPanel();
		GridBagConstraints gbc_pnlPersonalInfo = new GridBagConstraints();
		gbc_pnlPersonalInfo.fill = GridBagConstraints.BOTH;
		gbc_pnlPersonalInfo.gridx = 1;
		gbc_pnlPersonalInfo.gridy = 3;
		pnlDetailInfo.add(pnlPersonalInfo, gbc_pnlPersonalInfo);
		SpringLayout sl_pnlPersonalInfo = new SpringLayout();
		pnlPersonalInfo.setLayout(sl_pnlPersonalInfo);
		
		JLabel lblNewLabel_1 = new JLabel("Personal Information");
		sl_pnlPersonalInfo.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 25, SpringLayout.NORTH, pnlPersonalInfo);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.WEST, lblNewLabel_1, 25, SpringLayout.WEST, pnlPersonalInfo);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 47, SpringLayout.NORTH, pnlPersonalInfo);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.EAST, lblNewLabel_1, 237, SpringLayout.WEST, pnlPersonalInfo);
		lblNewLabel_1.setFont(new Font("Lato Black", Font.PLAIN, 20));
		pnlPersonalInfo.add(lblNewLabel_1);
		
		JLabel lblAge = new JLabel("Age");
		sl_pnlPersonalInfo.putConstraint(SpringLayout.NORTH, lblAge, 22, SpringLayout.SOUTH, lblNewLabel_1);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.WEST, lblAge, 0, SpringLayout.WEST, lblNewLabel_1);
		lblAge.setForeground(Color.GRAY);
		lblAge.setFont(new Font("Lato", Font.PLAIN, 14));
		pnlPersonalInfo.add(lblAge);
		
		JLabel lblAgeInfo = new JLabel("69");
		sl_pnlPersonalInfo.putConstraint(SpringLayout.NORTH, lblAgeInfo, 6, SpringLayout.SOUTH, lblAge);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.WEST, lblAgeInfo, 0, SpringLayout.WEST, lblNewLabel_1);
		lblAgeInfo.setForeground(Color.BLACK);
		lblAgeInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		pnlPersonalInfo.add(lblAgeInfo);
		
		JLabel lblBirthdate = new JLabel("Birthdate");
		sl_pnlPersonalInfo.putConstraint(SpringLayout.NORTH, lblBirthdate, 0, SpringLayout.NORTH, lblAge);
		lblBirthdate.setForeground(Color.GRAY);
		lblBirthdate.setFont(new Font("Lato", Font.PLAIN, 14));
		pnlPersonalInfo.add(lblBirthdate);
		
		JLabel lblBirthdateInfo = new JLabel("2002-11-25");
		sl_pnlPersonalInfo.putConstraint(SpringLayout.NORTH, lblBirthdateInfo, 0, SpringLayout.NORTH, lblAgeInfo);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.WEST, lblBirthdateInfo, 0, SpringLayout.WEST, lblBirthdate);
		lblBirthdateInfo.setForeground(Color.BLACK);
		lblBirthdateInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		pnlPersonalInfo.add(lblBirthdateInfo);
		
		JLabel lblSex = new JLabel("Sex");
		sl_pnlPersonalInfo.putConstraint(SpringLayout.WEST, lblSex, 111, SpringLayout.EAST, lblAge);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.NORTH, lblSex, 0, SpringLayout.NORTH, lblAge);
		lblSex.setForeground(Color.GRAY);
		lblSex.setFont(new Font("Lato", Font.PLAIN, 14));
		pnlPersonalInfo.add(lblSex);
		
		JLabel lblSexInfo = new JLabel("Male");
		sl_pnlPersonalInfo.putConstraint(SpringLayout.WEST, lblBirthdate, 135, SpringLayout.EAST, lblSexInfo);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.NORTH, lblSexInfo, 0, SpringLayout.NORTH, lblAgeInfo);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.WEST, lblSexInfo, 0, SpringLayout.WEST, lblSex);
		lblSexInfo.setForeground(Color.BLACK);
		lblSexInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		pnlPersonalInfo.add(lblSexInfo);
		
		JLabel lblInterest = new JLabel("Interest");
		sl_pnlPersonalInfo.putConstraint(SpringLayout.NORTH, lblInterest, 0, SpringLayout.NORTH, lblAge);
		lblInterest.setForeground(Color.GRAY);
		lblInterest.setFont(new Font("Lato", Font.PLAIN, 14));
		pnlPersonalInfo.add(lblInterest);
		
		JLabel lblInterestInfo = new JLabel("Playing Games");
		sl_pnlPersonalInfo.putConstraint(SpringLayout.EAST, lblBirthdateInfo, -152, SpringLayout.WEST, lblInterestInfo);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.WEST, lblInterest, 0, SpringLayout.WEST, lblInterestInfo);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.WEST, lblInterestInfo, 566, SpringLayout.WEST, pnlPersonalInfo);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.EAST, lblInterestInfo, -25, SpringLayout.EAST, pnlPersonalInfo);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.NORTH, lblInterestInfo, 0, SpringLayout.NORTH, lblAgeInfo);
		lblInterestInfo.setForeground(Color.BLACK);
		lblInterestInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		pnlPersonalInfo.add(lblInterestInfo);
		
		JLabel lblGuardianName = new JLabel("Gurardian Name");
		sl_pnlPersonalInfo.putConstraint(SpringLayout.WEST, lblGuardianName, 0, SpringLayout.WEST, lblNewLabel_1);
		lblGuardianName.setForeground(Color.GRAY);
		lblGuardianName.setFont(new Font("Lato", Font.PLAIN, 14));
		pnlPersonalInfo.add(lblGuardianName);
		
		JLabel lblGuardianNameInfo = new JLabel("Guardian_name_here  bla bla bla bla bla bla bla");
		sl_pnlPersonalInfo.putConstraint(SpringLayout.SOUTH, lblGuardianName, -6, SpringLayout.NORTH, lblGuardianNameInfo);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.EAST, lblGuardianNameInfo, 340, SpringLayout.WEST, lblNewLabel_1);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.WEST, lblGuardianNameInfo, 25, SpringLayout.WEST, pnlPersonalInfo);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.SOUTH, lblGuardianNameInfo, -25, SpringLayout.SOUTH, pnlPersonalInfo);
		lblGuardianNameInfo.setForeground(Color.BLACK);
		lblGuardianNameInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		pnlPersonalInfo.add(lblGuardianNameInfo);
		
		JLabel lblGuardianPhoneInfo = new JLabel("890584989875847875489550294572");
		sl_pnlPersonalInfo.putConstraint(SpringLayout.WEST, lblGuardianPhoneInfo, -340, SpringLayout.EAST, lblInterestInfo);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.SOUTH, lblGuardianPhoneInfo, 0, SpringLayout.SOUTH, lblGuardianNameInfo);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.EAST, lblGuardianPhoneInfo, 0, SpringLayout.EAST, lblInterestInfo);
		lblGuardianPhoneInfo.setForeground(Color.BLACK);
		lblGuardianPhoneInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		pnlPersonalInfo.add(lblGuardianPhoneInfo);
		
		JLabel lblGuardianPhone = new JLabel("Gurardian Phone Number");
		sl_pnlPersonalInfo.putConstraint(SpringLayout.WEST, lblGuardianPhone, 0, SpringLayout.WEST, lblGuardianPhoneInfo);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.SOUTH, lblGuardianPhone, 0, SpringLayout.SOUTH, lblGuardianName);
		lblGuardianPhone.setForeground(Color.GRAY);
		lblGuardianPhone.setFont(new Font("Lato", Font.PLAIN, 14));
		pnlPersonalInfo.add(lblGuardianPhone);
		
		JLabel lblFatherName = new JLabel("Father's Name");
		sl_pnlPersonalInfo.putConstraint(SpringLayout.NORTH, lblFatherName, 17, SpringLayout.SOUTH, lblAgeInfo);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.WEST, lblFatherName, 0, SpringLayout.WEST, lblNewLabel_1);
		lblFatherName.setForeground(Color.GRAY);
		lblFatherName.setFont(new Font("Lato", Font.PLAIN, 14));
		pnlPersonalInfo.add(lblFatherName);
		
		JLabel lblFatherNameInfo = new JLabel("Guardian_name_here  bla bla bla bla bla bla bla");
		sl_pnlPersonalInfo.putConstraint(SpringLayout.NORTH, lblFatherNameInfo, 40, SpringLayout.SOUTH, lblAgeInfo);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.WEST, lblFatherNameInfo, 0, SpringLayout.WEST, lblNewLabel_1);
		lblFatherNameInfo.setForeground(Color.BLACK);
		lblFatherNameInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		pnlPersonalInfo.add(lblFatherNameInfo);
		
		JLabel lblMotherNameInfo = new JLabel("Mother's_name_here  bla bla bla bla bla bla bla");
		sl_pnlPersonalInfo.putConstraint(SpringLayout.NORTH, lblMotherNameInfo, 0, SpringLayout.NORTH, lblFatherNameInfo);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.WEST, lblMotherNameInfo, 0, SpringLayout.WEST, lblGuardianPhoneInfo);
		lblMotherNameInfo.setForeground(Color.BLACK);
		lblMotherNameInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		pnlPersonalInfo.add(lblMotherNameInfo);
		
		JLabel lblMotherName = new JLabel("Mother's Name");
		sl_pnlPersonalInfo.putConstraint(SpringLayout.NORTH, lblMotherName, 0, SpringLayout.NORTH, lblFatherName);
		sl_pnlPersonalInfo.putConstraint(SpringLayout.WEST, lblMotherName, 0, SpringLayout.WEST, lblGuardianPhoneInfo);
		lblMotherName.setForeground(Color.GRAY);
		lblMotherName.setFont(new Font("Lato", Font.PLAIN, 14));
		pnlPersonalInfo.add(lblMotherName);

	}
}
