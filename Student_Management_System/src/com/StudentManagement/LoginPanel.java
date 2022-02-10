package com.StudentManagement;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class LoginPanel extends JPanel {
	
	private JTextField txtUsername;
	private JPasswordField pwdPassword;
	private JFrame mainFrame; // StartPageUI instance for this panel
	conDB con = new conDB();
	

	/**
	 * Create the panel.
	 */
	public LoginPanel(JFrame frame) {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(Color.WHITE);
		setLayout(null);
		
		
		txtUsername = new JTextField();
		txtUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtUsername.setForeground(Color.LIGHT_GRAY);
		txtUsername.setText("Username");
		txtUsername.setBorder(new LineBorder(Color.BLACK, 2));
		txtUsername.setBorder(
			    BorderFactory.createCompoundBorder(
			    		txtUsername.getBorder(),
			    		BorderFactory.createEmptyBorder(0, 10, 0, 0 )
			        
			    )
			);
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtUsername.getText().trim().equals("")) {
					txtUsername.setText("Username");
					txtUsername.setForeground(new Color(204, 204, 204));
				}
			}
			@Override
			public void focusGained(FocusEvent e) {
				if (txtUsername.getText().trim().equals("Username")) {
					txtUsername.setText("");
					txtUsername.setForeground(Color.BLACK);
				}
			}
		});
		txtUsername.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		txtUsername.setBounds(26, 40, 248, 46);
		add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel lyrdPassword = new JPanel();
		lyrdPassword.setBackground(Color.WHITE);
		lyrdPassword.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lyrdPassword.setBounds(26, 117, 248, 46);
		add(lyrdPassword);
		lyrdPassword.setLayout(null);
		
		
		
		JToggleButton tglPassShow = new JToggleButton("");
		tglPassShow.setVisible(false);
		tglPassShow.setBounds(200, 8, 30, 30);
		lyrdPassword.add(tglPassShow, Integer.valueOf(2));
		tglPassShow.setAlignmentY(0.0f);
		tglPassShow.setBorderPainted(false);
		tglPassShow.setSelectedIcon(mainPageFunction.imgMethodNonButton((new ImageIcon(LoginFrame.class.getResource("/Icons/Others/passShow.png"))), tglPassShow.getSize().width, tglPassShow.getSize().height));
		tglPassShow.setIcon(mainPageFunction.imgMethodNonButton((new ImageIcon(LoginFrame.class.getResource("/Icons/Others/passHide.png"))), tglPassShow.getSize().width, tglPassShow.getSize().height));
		tglPassShow.setBackground(new Color(0, 0, 0, 0));
		tglPassShow.setBorder(null);
		
		// Listener for tglPassShow if the user want to Hide/Show the input pass
		tglPassShow.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(tglPassShow.isSelected()) {
					pwdPassword.setEchoChar((char) 0);
				} else {
					pwdPassword.setEchoChar('●');
				}
			}
		});
		
		// Making the password input to show and hide
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(10, 5, 180, 35);
		lyrdPassword.add(pwdPassword, JLayeredPane.DEFAULT_LAYER);
		pwdPassword.setBorder(null);
		pwdPassword.setBorder(
			    BorderFactory.createCompoundBorder(
			    		pwdPassword.getBorder(),
			    		BorderFactory.createEmptyBorder(0, 5, 0, 0 )
			        
			    )
			);
		pwdPassword.setMargin(new Insets(2, 2, 2, 100));
		pwdPassword.setForeground(Color.LIGHT_GRAY);
		pwdPassword.setText("Password");
		pwdPassword.setEchoChar((char) 0);
		pwdPassword.setBackground(Color.WHITE);
		pwdPassword.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String passString = String.valueOf(pwdPassword.getPassword());
				if (passString.trim().equals("")) {
					tglPassShow.setVisible(false);
					tglPassShow.setEnabled(false);
					pwdPassword.setEchoChar((char) 0);
					pwdPassword.setText("Password");
					pwdPassword.setForeground(new Color(204, 204, 204));
				}
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				String passString = String.valueOf(pwdPassword.getPassword());
				if (passString.trim().equals("Password")) {
					tglPassShow.setVisible(true);
					tglPassShow.setEnabled(true);
					pwdPassword.setEchoChar('●');
					pwdPassword.setText("");
					pwdPassword.setForeground(Color.BLACK);
				}
			}
				
		});
		
		
		JLabel lblError = new JLabel("Incorrect username or password");
		lblError.setVisible(false);
		lblError.setForeground(Color.RED);
		lblError.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		lblError.setBounds(26, 177, 248, 21);
		add(lblError);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setRolloverEnabled(false);
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLogin.setBackground(new Color(58, 103, 184));
				btnLogin.setForeground(new Color(220, 220, 220));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnLogin.setBackground(new Color(68, 114, 196));
				btnLogin.setForeground(Color.WHITE);
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnLogin.setBackground(new Color(50, 89, 160));
				btnLogin.setForeground(new Color(209, 209, 209));
			}
		});
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblError.setVisible(false);
				if(txtUsername.getText().trim().equals("Username")) {
					lblError.setVisible(true);
					lblError.setText("Please enter your username");
					txtUsername.setBorder(
						    BorderFactory.createCompoundBorder(
						    	(new LineBorder(new Color(220, 0, 0), 2)),
						    	BorderFactory.createEmptyBorder(0, 10, 0, 0 )
						        
						    ));
				} else if (Arrays.equals(pwdPassword.getPassword(), "Password".toCharArray())){
					lblError.setVisible(true);
					lblError.setText("Please enter your password");
					lyrdPassword.setBorder(new LineBorder(new Color(220, 0, 0), 2));
					txtUsername.setBorder(
						    BorderFactory.createCompoundBorder(
						    	(new LineBorder(Color.BLACK, 2)),
						    	BorderFactory.createEmptyBorder(0, 10, 0, 0 )
						));
				} else {
					try {
						String usernameString = txtUsername.getText();
						String sqlLogin = "SELECT * FROM user_info WHERE `username` =? AND `password` =?";
						
						PreparedStatement statement = con.connectionString().prepareStatement(sqlLogin);
						statement.setString(1, usernameString);
						statement.setString(2, String.valueOf(pwdPassword.getPassword()));
						
						ResultSet rsl = statement.executeQuery();
						if(rsl.next()) {
							// need to implement the getters and setters for simultaneous use of the information
							String userID = rsl.getString("ID_user");
							String username = rsl.getString("username");
							int idInt = rsl.getInt("id");
							User.setID(userID);
							User.setKey(idInt);
							User.setUser(username);
							
//							User user = new User(username, userID, idInt); 
							JFrame homePage = new HomePageUI();
//								register.pack();
								homePage.setVisible(true);
//								register.setLocationRelativeTo(null);
								mainFrame = frame;
								mainFrame.dispose();
								
						} else {
							lblError.setVisible(true);
							lblError.setText("Incorrect username or password");
							txtUsername.setBorder(
								    BorderFactory.createCompoundBorder(
								    	(new LineBorder(new Color(220, 0, 0), 2)),
								    	BorderFactory.createEmptyBorder(0, 10, 0, 0 )
								        
								    ));
//							pwdPassword.setBorder(
//								    BorderFactory.createCompoundBorder(
//								    	(new LineBorder(new Color(220, 0, 0), 2)),
//								    	BorderFactory.createEmptyBorder(0, 5, 0, 0 )
//								        
//								    ));
							lyrdPassword.setBorder(new LineBorder(new Color(220, 0, 0), 2));
	
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBorder(null);
		btnLogin.setBackground(new Color(68, 114, 196));
		btnLogin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
		btnLogin.setBounds(154, 272, 120, 40);
		add(btnLogin);
		
		
		/**
		 * Panel that need to close the StartPageUI and open the register frame Dispose
		 * the StartPageUI by giving it an instance here See more info about disposing
		 * using instance here: https://coderanch.com/t/561989/java/SOLVED-Disposing-JFrame-class
		 */
		JPanel pnlCreateAccount = new JPanel();
		pnlCreateAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlCreateAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame register = new RegisterFrame();
//				register.pack();
				register.setVisible(true);
//				register.setLocationRelativeTo(null);
				mainFrame = frame;
				mainFrame.dispose();
				
			}
		});
		pnlCreateAccount.setBackground(new Color(0, 0, 0, 0));
		pnlCreateAccount.setBorder(null);
		pnlCreateAccount.setBounds(73, 340, 154, 14);
		add(pnlCreateAccount);
		pnlCreateAccount.setLayout(null);
		
		JLabel lblCreate = new JLabel("Create an Account");
		lblCreate.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCreate.setForeground(new Color(143, 170, 220));
		lblCreate.setBounds(57, 0, 97, 14);
		lblCreate.requestFocusInWindow();
		pnlCreateAccount.add(lblCreate);
		
		JLabel lblNew = new JLabel("New here?");
		lblNew.setPreferredSize(new Dimension(55, 14));
		lblNew.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNew.setMaximumSize(new Dimension(55, 14));
		lblNew.setMinimumSize(new Dimension(55, 14));
		lblNew.setBounds(0, 0, 55, 14);
		pnlCreateAccount.add(lblNew);

	}
}
