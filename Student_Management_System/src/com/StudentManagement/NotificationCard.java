package com.StudentManagement;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;

public class NotificationCard extends JPanel {

	/**
	 * Create the panel.
	 */
	public NotificationCard(String pictureHolder, String subjectName, String detailHolder, String timeHolder) {
		setLayout(null);
		
		JLabel lblPictureHolder = new JLabel(pictureHolder);
		lblPictureHolder.setHorizontalAlignment(SwingConstants.CENTER);
		lblPictureHolder.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblPictureHolder.setBounds(30, 30, 140, 140);
		add(lblPictureHolder);
		
		JLabel lblSubjectName = new JLabel(subjectName);
		lblSubjectName.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblSubjectName.setBounds(200, 30, 370, 27);
		add(lblSubjectName);
		
		String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
				+ "Donec scelerisque eros vitae nulla sagittis semper. Nam dui sem, varius eu massa sit amet, "
				+ "lacinia blandit tortor. Ut ullamcorper bibendum est, in iaculis dui gravida vel. Mauris "
				+ "pellentesque rhoncus erat sed porta. Quisque ullamcorper nibh urna, sed feugiat nulla "
				+ "viverra id. Ut sodales nunc non dapibus porta.";
		JTextPane txtpnDetailHolder = new JTextPane();
		txtpnDetailHolder.setOpaque(false);
		txtpnDetailHolder.setEnabled(false);
		txtpnDetailHolder.setBorder(null);
		txtpnDetailHolder.setVerifyInputWhenFocusTarget(false);
		txtpnDetailHolder.setRequestFocusEnabled(false);
		txtpnDetailHolder.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtpnDetailHolder.setText(detailHolder);
		txtpnDetailHolder.setBounds(200, 68, 370, 77);
		add(txtpnDetailHolder);
		
		JLabel lblTime = new JLabel(timeHolder);
		lblTime.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblTime.setBounds(200, 148, 370, 22);
		add(lblTime);

	}
}
