package com.StudentManagement;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.LineBorder;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					LoginFrame frame = new LoginFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setName("LoginFrame");
		setUndecorated(true);
		setResizable(false);
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 375);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBorder(null);
		btnLogin.setBackground(new Color(68, 114, 196));
		btnLogin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 24));
		btnLogin.setBounds(154, 272, 120, 40);
		contentPane.add(btnLogin);
		
		txtUsername = new JTextField();
		txtUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtUsername.setMargin(new Insets(2, 8, 2, 2));
		txtUsername.setForeground(Color.LIGHT_GRAY);
		txtUsername.setText("  Username");
		txtUsername.setBorder(new LineBorder(Color.BLACK, 2));
		txtUsername.setFocusable(false);
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtUsername.getText().trim().equals("")) {
					txtUsername.setText("  Username");
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
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		
		JToggleButton tglPassShow = new JToggleButton("");
		tglPassShow.setBounds(233, 125, 30, 30);
		tglPassShow.setAlignmentY(0.0f);
		tglPassShow.setBorderPainted(false);
		tglPassShow.setSelectedIcon(mainPageFunction.imgMethodNonButton((new ImageIcon(LoginFrame.class.getResource("/Icons/Others/passShow.png"))), tglPassShow.getSize().width, tglPassShow.getSize().height));
		tglPassShow.setIcon(mainPageFunction.imgMethodNonButton((new ImageIcon(LoginFrame.class.getResource("/Icons/Others/passHide.png"))), tglPassShow.getSize().width, tglPassShow.getSize().height));
		tglPassShow.setBackground(new Color(0, 0, 0, 0));
		tglPassShow.setBorder(null);
		tglPassShow.setVisible(false);
		contentPane.add(tglPassShow);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBorder(new LineBorder(Color.BLACK, 2));
		pwdPassword.setBounds(26, 117, 248, 46);
		pwdPassword.setMargin(new Insets(2, 2, 2, 100));
		pwdPassword.setForeground(Color.LIGHT_GRAY);
		pwdPassword.setText("  Password");
		pwdPassword.setEchoChar((char) 0);
		pwdPassword.setBackground(Color.WHITE);
		pwdPassword.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		pwdPassword.setFocusable(false);
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String passString = String.valueOf(pwdPassword.getPassword());
				if (passString.trim().equals("")) {
					tglPassShow.setVisible(false);
					pwdPassword.setEchoChar((char) 0);
					pwdPassword.setText("  Password");
					pwdPassword.setForeground(new Color(204, 204, 204));
				}
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				String passString = String.valueOf(pwdPassword.getPassword());
				if (passString.trim().equals("Password")) {
					tglPassShow.setVisible(true);
					pwdPassword.setEchoChar('●');
					pwdPassword.setText("");
					pwdPassword.setForeground(Color.BLACK);
				}
			}
				
		});
		contentPane.add(pwdPassword);
		
		JPanel pnlCreateAccount = new JPanel();
		pnlCreateAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pnlCreateAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame register = new RegisterFrame();
//				register.pack();
				register.setVisible(true);
//				register.setLocationRelativeTo(null);
				register.setDefaultCloseOperation(EXIT_ON_CLOSE);
//				MainPageUI.dispose();
				dispose();
			}
		});
		pnlCreateAccount.setBackground(new Color(0, 0, 0, 0));
		pnlCreateAccount.setBorder(null);
		pnlCreateAccount.setBounds(73, 340, 154, 14);
		contentPane.add(pnlCreateAccount);
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
