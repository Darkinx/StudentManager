package com.StudentManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class StudentManagerUI extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentManagerUI frame = new StudentManagerUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentManagerUI() {
		setBounds(100, 100, 856, 477);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
