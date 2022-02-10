package com.StudentManagement;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Cursor;

public class StudentRegisterInput extends JPanel {

	private conDB con = new conDB();
	private JTextField txtUsername;
	
	/**
	 * Create the panel.
	 */
	public StudentRegisterInput(JFrame frame) {
		setBounds(new Rectangle(0, 0, 1920, 1080));
		setMinimumSize(new Dimension(1920, 1080));
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(new Color(255, 192, 0));
		setPreferredSize(new java.awt.Dimension(1920, 1080));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pnlAccountCreator = new JPanel();
		pnlAccountCreator.setOpaque(false);
		pnlAccountCreator.setLayout(null);
		add(pnlAccountCreator);
		
		JLabel lblCreateAccount = new JLabel("Create your account");
		lblCreateAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateAccount.setForeground(Color.WHITE);
		lblCreateAccount.setFont(new Font("Segoe UI", Font.BOLD, 48));
		lblCreateAccount.setBounds(98, 37, 488, 57);
		pnlAccountCreator.add(lblCreateAccount);
		
		JPasswordField pwdPassword = new JPasswordField();
		pwdPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		pwdPassword.setColumns(10);
		pwdPassword.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		pwdPassword.setAlignmentX(1.0f);
		pwdPassword.setBounds(65, 446, 567, 35);
		pnlAccountCreator.add(pwdPassword);
		
		JTextField txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtFirstName.setColumns(10);
		txtFirstName.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtFirstName.setBounds(65, 152, 267, 35);
		pnlAccountCreator.add(txtFirstName);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		lblLastName.setBounds(367, 117, 145, 35);
		pnlAccountCreator.add(lblLastName);
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		lblFirstName.setBounds(67, 117, 145, 35);
		pnlAccountCreator.add(lblFirstName);
		
		JTextField txtLastName = new JTextField();
		txtLastName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtLastName.setColumns(10);
		txtLastName.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtLastName.setBounds(367, 152, 265, 35);
		pnlAccountCreator.add(txtLastName);
		
		JLabel lblLRN = new JLabel("LRN");
		lblLRN.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		lblLRN.setBounds(67, 214, 203, 35);
		pnlAccountCreator.add(lblLRN);
		
		JTextField txtLRN = new JTextField();
		txtLRN.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtLRN.setColumns(10);
		txtLRN.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtLRN.setBounds(65, 253, 267, 35);
		pnlAccountCreator.add(txtLRN);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtUsername.setColumns(10);
		txtUsername.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtUsername.setBounds(365, 253, 267, 35);
		pnlAccountCreator.add(txtUsername);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		lblUsername.setBounds(367, 214, 203, 35);
		pnlAccountCreator.add(lblUsername);
		
		JLabel lblEmailAddress = new JLabel("Email address");
		lblEmailAddress.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		lblEmailAddress.setBounds(65, 313, 154, 35);
		pnlAccountCreator.add(lblEmailAddress);
		
		JTextField txtEmail = new JTextField();
		txtEmail.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		txtEmail.setColumns(10);
		txtEmail.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtEmail.setBounds(65, 352, 567, 35);
		pnlAccountCreator.add(txtEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		lblPassword.setBounds(65, 411, 145, 35);
		pnlAccountCreator.add(lblPassword);
		
		JLabel lblRetypePassword = new JLabel("Retype Password");
		lblRetypePassword.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		lblRetypePassword.setBounds(65, 529, 184, 35);
		pnlAccountCreator.add(lblRetypePassword);
		
		JPasswordField pwdRetypePassword = new JPasswordField();
		pwdRetypePassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		pwdRetypePassword.setColumns(10);
		pwdRetypePassword.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		pwdRetypePassword.setAlignmentX(1.0f);
		pwdRetypePassword.setBounds(65, 564, 567, 35);
		pnlAccountCreator.add(pwdRetypePassword);
		
		JLabel lblPasswordNotice = new JLabel("Make sure it's\u00A0at least 15 characters\u00A0OR\u00A0at least 8 characters\u00A0including a number\u00A0and a lowercase letter.");
		lblPasswordNotice.setForeground(new Color(88, 96, 105));
		lblPasswordNotice.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPasswordNotice.setBounds(65, 483, 567, 35);
		pnlAccountCreator.add(lblPasswordNotice);
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCreateAccount.addActionListener(new ActionListener() {
			
			// Need to add some notice or warnings when a field wasn't fill out
			public void actionPerformed(ActionEvent e) {
				if( Arrays.equals(pwdPassword.getPassword(), pwdRetypePassword.getPassword())) {
					try {
						String sqlCreateAccount = "INSERT INTO user_info(username, first_name, last_name,user_type, email, ID_user, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
						PreparedStatement statement = con.connectionString().prepareStatement(sqlCreateAccount);
						
						// need to add encryption of the database, see conDB
						// Use java.mail for email churvaness
						statement.setString(1, txtUsername.getText());
						statement.setString(2, txtFirstName.getText());
						statement.setString(3, txtLastName.getText());
						statement.setBoolean(4, false);
						statement.setString(5, txtEmail.getText());
						statement.setInt(6, Integer.valueOf(txtLRN.getText()));
						statement.setString(7, String.valueOf(pwdPassword.getPassword()));
						
						statement.executeUpdate();
						
						JOptionPane.showMessageDialog(null, "Account Created Succesfully");
						
						txtEmail.setText("");
						txtFirstName.setText("");
						txtLastName.setText("");
						txtUsername.setText("");
						txtLRN.setText("");
						pwdPassword.setText("");
						pwdRetypePassword.setText("");
						
						JFrame startPageUIFrame = new StartPageUI();
						startPageUIFrame.setVisible(true);
						frame.dispose();
	
					} catch (Exception e2) {
						// TODO: handle exception
						System.out.println("Creating Account error: " + e2);
					}
				} else {
					// need to add lbl for error indicators
				}
			}
		});
	
		btnCreateAccount.setForeground(Color.WHITE);
		btnCreateAccount.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCreateAccount.setBorder(null);
		btnCreateAccount.setBackground(new Color(47, 74, 95));
		btnCreateAccount.setBounds(260, 635, 173, 47);
		pnlAccountCreator.add(btnCreateAccount);
		
		JPanel pnlLoginAccount = new JPanel();
		pnlLoginAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		pnlLoginAccount.setLayout(null);
		pnlLoginAccount.setBackground(new Color(255, 255, 255, 0));
		pnlLoginAccount.setBounds(260, 693, 173, 19);
		pnlAccountCreator.add(pnlLoginAccount);
		
		JLabel lblAlready = new JLabel("Already have an account?");
		lblAlready.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAlready.setBounds(0, 0, 145, 19);
		pnlLoginAccount.add(lblAlready);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(new Color(47, 74, 95));
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLogin.setBounds(142, 0, 42, 19);
		pnlLoginAccount.add(lblLogin);
		
		JPanel imagePanel = new JPanel();
		imagePanel.setOpaque(false);
		add(imagePanel);
		imagePanel.setLayout(new GridLayout(0, 1, 0, 0));
	
		JLabel lblPicStudent = new JLabel("");
		lblPicStudent.setIcon(mainPageFunction.imgRescale(
				(new ImageIcon(TeacherRegisterInput.class.getResource("/Icons/Others/Student.jpg"))),
				lblPicStudent.getWidth(),
				lblPicStudent.getHeight()
				));
		lblPicStudent.setIconTextGap(0);
		lblPicStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblPicStudent.setBorder(null);
		imagePanel.add(lblPicStudent);

	}
}
