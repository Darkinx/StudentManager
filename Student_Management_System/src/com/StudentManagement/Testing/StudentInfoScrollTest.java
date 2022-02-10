/**
 * This java is a duplication to StudentInfoPanel
 * to be experimented for the scrollPane function
 * since I'm getting a hard time implementing it to other panels
 * this will not prioritize for now to pave way to the task editor
 * but it is a must since some information are automatically generated
 * by the sql and the code so layout manager and scrollPane is a must
 */

package com.StudentManagement.Testing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.StudentManagement.RoundJTextField;
import com.StudentManagement.StudentInfoPanel;
import javax.swing.JTextField;

public class StudentInfoScrollTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentInfoScrollTest frame = new StudentInfoScrollTest();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentInfoScrollTest() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize( Toolkit.getDefaultToolkit().getScreenSize() );
		setMinimumSize(new java.awt.Dimension(1366, 768));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		contentPane.setBackground(Color.GRAY);
		contentPane.setLayout(null);
		contentPane.setSize(1240, 662);
		
		JPanel pnlMainInfo = new JPanel();
		pnlMainInfo.setOpaque(false);
		pnlMainInfo.setBounds(0, 0, 351, 662);
		contentPane.add(pnlMainInfo);
		pnlMainInfo.setLayout(null);
		
		JLabel lblEditPicture = new JLabel("");
		lblEditPicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditPicture.setBounds(216, 209, 50, 50);
		lblEditPicture.setIcon(
				mainPageFunctionTest.imgMethodNonButton(
						(new ImageIcon(StudentInfoScrollTest.class.getResource("/Icons/Navigation_Icons/User.png"))), 
						lblEditPicture.getWidth(), 
						lblEditPicture.getHeight()
				));
		pnlMainInfo.add(lblEditPicture);
		
		JLabel lblPictureHere = new JLabel("");
		lblPictureHere.setBounds(30, 30, 250, 250);
		pnlMainInfo.add(lblPictureHere);
		lblPictureHere.setHorizontalAlignment(SwingConstants.CENTER);
		lblPictureHere.setIcon(
				mainPageFunctionTest.imgCircle(
					mainPageFunctionTest.imgRescale(
							new ImageIcon(StudentInfoPanel.class.getResource("/Icons/Others/Student.jpg")), 
							lblPictureHere.getWidth(), 
							lblPictureHere.getHeight()),
					2
				));
		
		JLabel lblName = new JLabel("Luwalhati Alcantara");
		lblName.setBounds(30, 304, 311, 34);
		pnlMainInfo.add(lblName);
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Lato Black", Font.PLAIN, 32));
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(30, 337, 311, 15);
		pnlMainInfo.add(lblUsername);
		lblUsername.setFont(new Font("Lato", Font.PLAIN, 14));
		
		JLabel lblGmail = new JLabel("alcantaraLuwalhati@protonmail.com");
		lblGmail.setBounds(30, 365, 311, 20);
		pnlMainInfo.add(lblGmail);
		lblGmail.setForeground(Color.WHITE);
		lblGmail.setFont(new Font("Lato", Font.PLAIN, 16));
		
		JLabel lblGrade = new JLabel("Grade: ");
		lblGrade.setBounds(30, 490, 311, 20);
		pnlMainInfo.add(lblGrade);
		lblGrade.setForeground(Color.WHITE);
		lblGrade.setFont(new Font("Lato", Font.PLAIN, 16));
		
		JLabel lblLrn = new JLabel("LRN:");
		lblLrn.setBounds(30, 540, 311, 20);
		pnlMainInfo.add(lblLrn);
		lblLrn.setForeground(Color.WHITE);
		lblLrn.setFont(new Font("Lato", Font.PLAIN, 16));
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(30, 590, 311, 20);
		pnlMainInfo.add(lblAge);
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Lato", Font.PLAIN, 16));
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:   091234567891");
		lblPhoneNumber.setBounds(30, 440, 311, 20);
		pnlMainInfo.add(lblPhoneNumber);
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setFont(new Font("Lato", Font.PLAIN, 16));
		
		textField = new RoundJTextField(15, 2);
		textField.setBounds(30, 621, 292, 30);
		textField.setOpaque(false);
		pnlMainInfo.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setOpaque(false);
		textField_1.setBorder(new LineBorder(Color.BLACK, 2));
		textField_1.setBounds(30, 396, 277, 30);
		pnlMainInfo.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel pnlDetailInfo = new JPanel();
		pnlDetailInfo.setOpaque(false);
		pnlDetailInfo.setBounds(349, 0, 919, 962);
		contentPane.add(pnlDetailInfo);
		pnlDetailInfo.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Slips and Receipts");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel.setBounds(65, 30, 150, 30);
		pnlDetailInfo.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBorder(new LineBorder(Color.BLACK));
		panel.setBounds(65, 60, 350, 150);
		pnlDetailInfo.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBorder(new LineBorder(Color.BLACK));
		panel_1.setBounds(465, 60, 350, 150);
		pnlDetailInfo.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBorder(new LineBorder(Color.BLACK));
		panel_2.setBounds(65, 260, 350, 150);
		pnlDetailInfo.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setOpaque(false);
		panel_2_1.setBorder(new LineBorder(Color.BLACK));
		panel_2_1.setBounds(465, 260, 350, 150);
		pnlDetailInfo.add(panel_2_1);
		
		JLabel lblSeeMore = new JLabel("see more");
		lblSeeMore.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSeeMore.setForeground(Color.GRAY);
		lblSeeMore.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblSeeMore.setBounds(767, 30, 48, 30);
		pnlDetailInfo.add(lblSeeMore);

	}
}
