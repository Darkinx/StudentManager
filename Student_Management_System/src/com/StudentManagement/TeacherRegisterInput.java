package com.StudentManagement;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;


public class TeacherRegisterInput extends JPanel  {
	private conDB con = new conDB();
	private final JLabel lblPicTeacher = new JLabel("");
	private JPasswordField pwdPassword;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JLabel lblEmployeeNumber;
	private JTextField txtEmployeeNumber;
	private JLabel lblEmailAddress;
	private JTextField txtEmailAddress;
	private JLabel lblPassword;
	private JLabel lblRetypePassword;
	private JPasswordField pwdRetypePassword;
	private JLabel lblPasswordNotice;
	private JPanel pnlLoginAccount;
	private JPanel pnlAccountCreator;
	private JPanel imagePanel;
	private JLabel lblUsername;
	private JTextField txtUsername;

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
		
		JLabel lblCreateAccount = new JLabel("Create your account");
		lblCreateAccount.setBounds(98, 37, 488, 57);
		pnlAccountCreator.add(lblCreateAccount);
		lblCreateAccount.setForeground(new Color(255, 255, 255));
		lblCreateAccount.setFont(new Font("Segoe UI", Font.BOLD, 48));
		lblCreateAccount.setHorizontalAlignment(SwingConstants.CENTER);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		pwdPassword.setBounds(65, 446, 567, 35);
		pnlAccountCreator.add(pwdPassword);
		pwdPassword.setAlignmentX(Component.RIGHT_ALIGNMENT);
		pwdPassword.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		pwdPassword.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtFirstName.setBounds(65, 152, 267, 35);
		pnlAccountCreator.add(txtFirstName);
		txtFirstName.setColumns(10);
		txtFirstName.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
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
		txtLastName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtLastName.setBounds(367, 152, 265, 35);
		pnlAccountCreator.add(txtLastName);
		txtLastName.setColumns(10);
		txtLastName.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblFirstName.setLabelFor(pwdPassword);
		
		
		lblEmployeeNumber = new JLabel("Employee number");
		lblEmployeeNumber.setBounds(67, 214, 203, 35);
		pnlAccountCreator.add(lblEmployeeNumber);
		lblEmployeeNumber.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		lblEmployeeNumber.setLabelFor(txtEmployeeNumber);
		
		txtEmployeeNumber = new JTextField();
		txtEmployeeNumber.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtEmployeeNumber.setBounds(65, 253, 267, 35);
		pnlAccountCreator.add(txtEmployeeNumber);
		txtEmployeeNumber.setColumns(10);
		txtEmployeeNumber.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		lblUsername.setBounds(369, 214, 203, 35);
		pnlAccountCreator.add(lblUsername);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtUsername.setColumns(10);
		txtUsername.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtUsername.setBounds(367, 253, 267, 35);
		pnlAccountCreator.add(txtUsername);
		
		lblEmailAddress = new JLabel("Email address");
		lblEmailAddress.setBounds(65, 313, 154, 35);
		pnlAccountCreator.add(lblEmailAddress);
		lblEmailAddress.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		lblEmailAddress.setLabelFor(txtEmailAddress);
		
		txtEmailAddress = new JTextField();
		txtEmailAddress.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtEmailAddress.setBounds(65, 352, 567, 35);
		pnlAccountCreator.add(txtEmailAddress);
		txtEmailAddress.setColumns(10);
		txtEmailAddress.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(65, 411, 145, 35);
		pnlAccountCreator.add(lblPassword);
		lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		
		lblRetypePassword = new JLabel("Retype Password");
		lblRetypePassword.setBounds(65, 529, 184, 35);
		pnlAccountCreator.add(lblRetypePassword);
		lblRetypePassword.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		
		pwdRetypePassword = new JPasswordField();
		pwdRetypePassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		pwdRetypePassword.setBounds(65, 564, 567, 35);
		pnlAccountCreator.add(pwdRetypePassword);
		pwdRetypePassword.setColumns(10);
		pwdRetypePassword.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		pwdRetypePassword.setAlignmentX(1.0f);
		
		lblPasswordNotice = new JLabel("Make sure it's\u00A0at least 15 characters\u00A0OR\u00A0at least 8 characters\u00A0including a number\u00A0and a lowercase letter.");
		lblPasswordNotice.setBounds(65, 483, 567, 35);
		pnlAccountCreator.add(lblPasswordNotice);
		lblPasswordNotice.setForeground(new Color(88, 96, 105));
		lblPasswordNotice.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( Arrays.equals(pwdPassword.getPassword(), pwdRetypePassword.getPassword())) {
					try {
						String sqlCreateAccount = "INSERT INTO user_info(username, first_name, last_name, user_type, email, ID_user, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
						PreparedStatement statement = con.connectionString().prepareStatement(sqlCreateAccount);
						
						// need to add md5 and salt for encryption of the database
						statement.setString(1, txtUsername.getText());
						statement.setString(2, txtFirstName.getText());
						statement.setString(3, txtLastName.getText());
						statement.setBoolean(4, false);
						statement.setString(5, txtEmailAddress.getText());
						statement.setInt(6, Integer.valueOf(txtEmployeeNumber.getText()));
						statement.setString(7, String.valueOf(pwdPassword.getPassword()));
						
						statement.executeUpdate();
						
						JOptionPane.showMessageDialog(null, "Account Created Succesfully");
						
						txtEmailAddress.setText("");
						txtFirstName.setText("");
						txtLastName.setText("");
						txtUsername.setText("");
						txtEmployeeNumber.setText("");
						pwdPassword.setText("");
						pwdRetypePassword.setText("");
	
					} catch (Exception e2) {
						// TODO: handle exception
						System.out.println("Creating Account error: " + e2);
					}
				} else {
					// need to add lbl for error indicators
				}
			}
		});
		btnCreateAccount.setBounds(260, 635, 173, 47);
		pnlAccountCreator.add(btnCreateAccount);
		btnCreateAccount.setBorder(null);
		btnCreateAccount.setBackground(new Color(47, 74, 95));
		btnCreateAccount.setForeground(new Color(255, 255, 255));
		btnCreateAccount.setFont(new Font("Arial", Font.PLAIN, 16));
		
		pnlLoginAccount = new JPanel();
		pnlLoginAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlLoginAccount.setBounds(260, 693, 173, 19);
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
