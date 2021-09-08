package com.StudentManagement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.security.auth.login.FailedLoginException;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;

public class RegisterFrame extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public RegisterFrame() {
		// Still not working 
		setResizable(false);
		setName("RegisterFrame");
		setBackground(Color.WHITE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		getContentPane().setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(StartPageUI.class.getResource("/Icons/SNSMLogo_Text.png")));
		setTitle("SNSM-Welcome");
		setBounds(0, 0, 1920, 1080);
		setMinimumSize(new java.awt.Dimension(1360, 768));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel pnlMainRegister = new JPanel();
		getContentPane().add(pnlMainRegister, "name_42247638375400");
		pnlMainRegister.setLayout(null);
		
		JPanel teacherRegisterPanel = new TeacherRegisterInput(this);
		
		JPanel studentRegisterPanel = new StudentRegisterInput(this);
		
		JLabel lblHomeLogo = new JLabel("");
		lblHomeLogo.setBounds(535, 224, 300, 300);
		pnlMainRegister.add(lblHomeLogo);
		lblHomeLogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame startPageUIFrame = new StartPageUI();
				startPageUIFrame.setVisible(true);
				dispose();
			}
		});
		lblHomeLogo.setIconTextGap(0);
		lblHomeLogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblHomeLogo.setIcon(mainPageFunction.imgMethodNonButton((new ImageIcon(RegisterFrame.class.getResource("/Icons/MainLogo.png"))), lblHomeLogo.getWidth(), lblHomeLogo.getHeight()));
		
		JPanel pnlRegisterSelector = new JPanel();
		pnlRegisterSelector.setBounds(0, 0, 1370, 749);
		pnlMainRegister.add(pnlRegisterSelector);
		pnlRegisterSelector.setBackground(Color.WHITE);
		pnlRegisterSelector.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblTeacher = new JLabel("<html>TEACHER<br>OR<br>ADMIN</html>");
		lblTeacher.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pnlMainRegister.setVisible(false);
				pnlMainRegister.setEnabled(false);
				pnlRegisterSelector.setVisible(false);
				pnlRegisterSelector.setEnabled(false);
				getContentPane().add(teacherRegisterPanel);
				teacherRegisterPanel.setEnabled(true);
				teacherRegisterPanel.setVisible(true);
				
			}
		});
		lblTeacher.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeacher.setBackground(new Color(143, 170, 220));
		lblTeacher.setForeground(new Color(255, 255, 255));
		lblTeacher.setOpaque(true);
		lblTeacher.setFont(new Font("Bebas Neue", Font.BOLD, 99));
		lblTeacher.setAutoscrolls(false);
		lblTeacher.setBorder(null);
		pnlRegisterSelector.add(lblTeacher);
		
		// Uncomment everything when this part of the system is done
//		JLabel lblStudent = new JLabel("<html>LEARNER<br>OR<br>STUDENT</html>");
		JLabel lblStudent = new JLabel("<html>Under<br>Development</html>");
		lblStudent.setForeground(new Color(128, 128, 128));
		lblStudent.setBackground(new Color(184, 134, 11));
//		lblStudent.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				// need to rechange the teacher register creation panel
//				pnlMainRegister.setVisible(false);
//				pnlMainRegister.setEnabled(false);
//				pnlRegisterSelector.setVisible(false);
//				pnlRegisterSelector.setEnabled(false);
//				getContentPane().add(studentRegisterPanel);
//				studentRegisterPanel.setEnabled(true);
//				studentRegisterPanel.setVisible(true);
//				
//				
//			}
//		});
		lblStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudent.setOpaque(true);
//		lblStudent.setForeground(new Color(255, 255, 255));
//		lblStudent.setBackground(new Color(255, 192, 0));
		lblStudent.setFont(new Font("Bebas Neue", Font.BOLD, 99));
		lblStudent.setBorder(null);
		pnlRegisterSelector.add(lblStudent);
	}
}
