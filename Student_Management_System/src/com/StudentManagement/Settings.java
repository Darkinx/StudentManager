package com.StudentManagement;

import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import javax.swing.SpringLayout;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Settings extends JPanel {
	private JTextField txtEmail;

	/**
	 * Create the panel.
	 */
	public Settings() {
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1366, 738));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		springLayout.putConstraint(SpringLayout.NORTH, tabbedPane, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, tabbedPane, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, tabbedPane, -45, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, tabbedPane, 1366, SpringLayout.WEST, this);
		tabbedPane.setBackground(Color.BLACK);
		tabbedPane.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		add(tabbedPane);
		
		JPanel pnlGeneralSetting = new JPanel();
		tabbedPane.addTab("General", null, pnlGeneralSetting, null);
		
		JPanel pnlAccountSetting = new JPanel();
		pnlAccountSetting.setBorder(new CompoundBorder(null, new EmptyBorder(4, 0, 0, 0)));
		pnlAccountSetting.setOpaque(false);
		tabbedPane.addTab("Account", null, pnlAccountSetting, null);
		GridBagLayout gbl_pnlAccountSetting = new GridBagLayout();
		gbl_pnlAccountSetting.columnWidths = new int[]{0, 159, 224, 0};
		gbl_pnlAccountSetting.rowHeights = new int[]{0, 25, 0};
		gbl_pnlAccountSetting.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlAccountSetting.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		pnlAccountSetting.setLayout(gbl_pnlAccountSetting);
		
		JLabel lblNewLabel = new JLabel("Email Address");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		pnlAccountSetting.add(lblNewLabel, gbc_lblNewLabel);
		
		txtEmail = new JTextField();
		txtEmail.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), new EmptyBorder(4, 0, 0, 0)));
		txtEmail.setOpaque(false);
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.fill = GridBagConstraints.BOTH;
		gbc_txtEmail.gridx = 2;
		gbc_txtEmail.gridy = 1;
		pnlAccountSetting.add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(10);
		
		JPanel pnlNotifSetting = new JPanel();
		tabbedPane.addTab("Notification", null, pnlNotifSetting, null);
		
		JPanel pnlAppearanceSetting = new JPanel();
		tabbedPane.addTab("Appearance", null, pnlAppearanceSetting, null);
		
		JPanel pnlSettingButton =  new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, pnlSettingButton, 0, SpringLayout.SOUTH, tabbedPane);
		springLayout.putConstraint(SpringLayout.SOUTH, pnlSettingButton, 0, SpringLayout.SOUTH, this);
		pnlSettingButton.setBorder(new MatteBorder(1, 0, 0, 0, (Color) Color.GRAY));
		springLayout.putConstraint(SpringLayout.WEST, pnlSettingButton, 113, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, pnlSettingButton, 0, SpringLayout.EAST, this);
		add(pnlSettingButton);
		SpringLayout sl_pnlSettingButton = new SpringLayout();
		pnlSettingButton.setLayout(sl_pnlSettingButton);
		
		JButton btnBack = new JButton("\u2770 Back");
		sl_pnlSettingButton.putConstraint(SpringLayout.NORTH, btnBack, 10, SpringLayout.NORTH, pnlSettingButton);
		sl_pnlSettingButton.putConstraint(SpringLayout.WEST, btnBack, 30, SpringLayout.WEST, pnlSettingButton);
		btnBack.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		pnlSettingButton.add(btnBack);
		
		JButton btnSave = new JButton("Save");
		sl_pnlSettingButton.putConstraint(SpringLayout.WEST, btnSave, 30, SpringLayout.EAST, btnBack);
		sl_pnlSettingButton.putConstraint(SpringLayout.EAST, btnSave, -1034, SpringLayout.EAST, pnlSettingButton);
		sl_pnlSettingButton.putConstraint(SpringLayout.SOUTH, btnBack, 0, SpringLayout.SOUTH, btnSave);
		sl_pnlSettingButton.putConstraint(SpringLayout.NORTH, btnSave, 9, SpringLayout.NORTH, pnlSettingButton);
		sl_pnlSettingButton.putConstraint(SpringLayout.SOUTH, btnSave, -10, SpringLayout.SOUTH, pnlSettingButton);
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setBorder(null);
		btnSave.setBackground(new Color(52, 81, 104));
		btnSave.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		pnlSettingButton.add(btnSave);
		

	}
}
