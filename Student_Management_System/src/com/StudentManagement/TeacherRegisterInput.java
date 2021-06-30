package com.StudentManagement;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JPasswordField;


public class TeacherRegisterInput extends JPanel  {
	private final JLabel lblPicTeacher = new JLabel("");
	private JPasswordField txtFirstName;
	private JTextField textField;
	private JTextField txtLastName;
	private JLabel lblEmployeeNumber;
	private JTextField txtEmployeeNumber;
	private JLabel lblEmailAddress;
	private JTextField txtEmailAddress;
	private JLabel lblPassword;
	private JLabel lblRetypePassword;
	private JPasswordField txtRetypePassword;
	private JLabel lblPasswordNotice;
	private JPanel pnlLoginAccount;
	private JPanel pnlAccountCreator;
	private JPanel imagePanel;

	/**
	 * Create the panel.
	 */
	public TeacherRegisterInput(JFrame frame) {
		setBounds(new Rectangle(0, 0, 1920, 1080));
		setMinimumSize(new Dimension(1920, 1080));
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(new Color(143, 170, 220));
		setPreferredSize(new java.awt.Dimension(1920, 1080));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		
		imagePanel = new JPanel();
		imagePanel.setOpaque(false);
		add(imagePanel);
		imagePanel.setLayout(new GridLayout(0, 1, 0, 0));
		lblPicTeacher.setIconTextGap(0);
		lblPicTeacher.setHorizontalAlignment(SwingConstants.CENTER);
		imagePanel.add(lblPicTeacher);
		lblPicTeacher.setBorder(null);
		lblPicTeacher.setIcon(mainPageFunction.imgRescale((new ImageIcon(TeacherRegisterInput.class.getResource("/Icons/Others/Teacher.jpg"))), 800, 750));
		
		pnlAccountCreator = new JPanel();
		pnlAccountCreator.setOpaque(false);
		add(pnlAccountCreator);
		pnlAccountCreator.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create your account");
		lblNewLabel.setBounds(98, 37, 488, 57);
		pnlAccountCreator.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 48));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtFirstName = new JPasswordField();
		txtFirstName.setBounds(65, 366, 567, 35);
		pnlAccountCreator.add(txtFirstName);
		txtFirstName.setAlignmentX(Component.RIGHT_ALIGNMENT);
		txtFirstName.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtFirstName.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(65, 152, 267, 35);
		pnlAccountCreator.add(textField);
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setBounds(367, 117, 145, 35);
		pnlAccountCreator.add(lblLastName);
		lblLastName.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setBounds(67, 117, 145, 35);
		pnlAccountCreator.add(lblFirstName);
		lblFirstName.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		lblLastName.setLabelFor(txtLastName);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(367, 152, 265, 35);
		pnlAccountCreator.add(txtLastName);
		txtLastName.setColumns(10);
		txtLastName.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblFirstName.setLabelFor(txtFirstName);
		
		
		lblEmployeeNumber = new JLabel("Employee number");
		lblEmployeeNumber.setBounds(67, 214, 203, 35);
		pnlAccountCreator.add(lblEmployeeNumber);
		lblEmployeeNumber.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		lblEmployeeNumber.setLabelFor(txtEmployeeNumber);
		
		txtEmployeeNumber = new JTextField();
		txtEmployeeNumber.setBounds(65, 253, 267, 35);
		pnlAccountCreator.add(txtEmployeeNumber);
		txtEmployeeNumber.setColumns(10);
		txtEmployeeNumber.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		lblEmailAddress = new JLabel("Email address");
		lblEmailAddress.setBounds(367, 214, 154, 35);
		pnlAccountCreator.add(lblEmailAddress);
		lblEmailAddress.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		lblEmailAddress.setLabelFor(txtEmailAddress);
		
		txtEmailAddress = new JTextField();
		txtEmailAddress.setBounds(367, 253, 265, 35);
		pnlAccountCreator.add(txtEmailAddress);
		txtEmailAddress.setColumns(10);
		txtEmailAddress.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(65, 331, 145, 35);
		pnlAccountCreator.add(lblPassword);
		lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		
		lblRetypePassword = new JLabel("Retype Password");
		lblRetypePassword.setBounds(65, 462, 184, 35);
		pnlAccountCreator.add(lblRetypePassword);
		lblRetypePassword.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		
		txtRetypePassword = new JPasswordField();
		txtRetypePassword.setBounds(65, 497, 567, 35);
		pnlAccountCreator.add(txtRetypePassword);
		txtRetypePassword.setColumns(10);
		txtRetypePassword.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtRetypePassword.setAlignmentX(1.0f);
		
		lblPasswordNotice = new JLabel("Make sure it's\u00A0at least 15 characters\u00A0OR\u00A0at least 8 characters\u00A0including a number\u00A0and a lowercase letter.");
		lblPasswordNotice.setBounds(65, 403, 567, 35);
		pnlAccountCreator.add(lblPasswordNotice);
		lblPasswordNotice.setForeground(new Color(88, 96, 105));
		lblPasswordNotice.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setBounds(260, 610, 173, 47);
		pnlAccountCreator.add(btnCreateAccount);
		btnCreateAccount.setBorder(null);
		btnCreateAccount.setBackground(new Color(47, 74, 95));
		btnCreateAccount.setForeground(new Color(255, 255, 255));
		btnCreateAccount.setFont(new Font("Arial", Font.PLAIN, 16));
		
		pnlLoginAccount = new JPanel();
		pnlLoginAccount.setBounds(260, 668, 173, 19);
		pnlAccountCreator.add(pnlLoginAccount);
		pnlLoginAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame startPageFrame = new StartPageUI();
				startPageFrame.setVisible(true);
				startPageFrame.setEnabled(true);
//				startPageFrame.pack();
				frame.dispose();
			}
		});
		pnlLoginAccount.setBackground(new Color(255, 255, 255, 0));
		pnlLoginAccount.setLayout(null);
		
		JLabel lblAlready = new JLabel("Already have an account?");
		lblAlready.setBounds(0, 0, 145, 19);
		pnlLoginAccount.add(lblAlready);
		lblAlready.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(142, 0, 42, 19);
		pnlLoginAccount.add(lblLogin);
		lblLogin.setForeground(new Color(47, 74, 95));
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 12));
		
		;
	}
}
