package com.StudentManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class DropSlipPanel extends JPanel {
	private JTextField txtOther;

	/**
	 * Create the panel.
	 */
	public DropSlipPanel() {
		setLayout(null);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setHorizontalAlignment(SwingConstants.LEFT);
		lblStudentName.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblStudentName.setBounds(45, 55, 139, 30);
		add(lblStudentName);
		
		JTextField txtStudentName = new JTextField();
		lblStudentName.setLabelFor(txtStudentName);
		txtStudentName.setBorder(new LineBorder(new Color(191, 191, 191), 2));
		txtStudentName.setBackground(new Color(255, 255, 255));
		txtStudentName.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtStudentName.setBounds(45, 87, 240, 35);
		add(txtStudentName);
		txtStudentName.setColumns(10);
		
		JLabel lblPriority = new JLabel("Priority");
		lblPriority.setHorizontalAlignment(SwingConstants.LEFT);
		lblPriority.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblPriority.setBounds(337, 51, 139, 30);
		add(lblPriority);
		
		JComboBox cmbPriority = new JComboBox();
		cmbPriority.setBorder(txtStudentName.getBorder());
		cmbPriority.setBackground(new Color(255, 255, 255));
		cmbPriority.setModel(new DefaultComboBoxModel(new String[] {"Select Priority", "High ", "Medium", "Low"}));
		cmbPriority.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		cmbPriority.setBounds(337, 87, 240, 35);
		add(cmbPriority);
		
		JScrollPane sclpnConditionChoices = new JScrollPane();
		sclpnConditionChoices.setOpaque(false);
		sclpnConditionChoices.setBorder(null);
		sclpnConditionChoices.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		sclpnConditionChoices.getVerticalScrollBar().setUnitIncrement(10);;
		sclpnConditionChoices.setBounds(45, 160, 532, 180);
		add(sclpnConditionChoices);
		
		JPanel pnlConditions = new JPanel();
		pnlConditions.setBorder(null);
		pnlConditions.setOpaque(false);
		sclpnConditionChoices.setViewportView(pnlConditions);
		GridBagLayout gbl_pnlConditions = new GridBagLayout();
		gbl_pnlConditions.columnWidths = new int[]{230, 50, 230, 0};
		gbl_pnlConditions.rowHeights = new int[]{23, 30, 23, 30, 23, 30, 23, 30, 23, 30, 23, 30, 23, 30, 23, 30, 23, 30, 30, 23, 0};
		gbl_pnlConditions.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlConditions.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlConditions.setLayout(gbl_pnlConditions);
		
		JCheckBox chckbxAcademic = new JCheckBox("Academic Difficulty");
		chckbxAcademic.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_chckbxAcademic = new GridBagConstraints();
		gbc_chckbxAcademic.fill = GridBagConstraints.BOTH;
		gbc_chckbxAcademic.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxAcademic.gridx = 0;
		gbc_chckbxAcademic.gridy = 0;
		pnlConditions.add(chckbxAcademic, gbc_chckbxAcademic);
		
		JCheckBox chckbxMarriage = new JCheckBox("Marriage");
		chckbxMarriage.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_chckbxMarriage = new GridBagConstraints();
		gbc_chckbxMarriage.fill = GridBagConstraints.BOTH;
		gbc_chckbxMarriage.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxMarriage.gridx = 2;
		gbc_chckbxMarriage.gridy = 0;
		pnlConditions.add(chckbxMarriage, gbc_chckbxMarriage);
		
		JCheckBox chckbxBehavior = new JCheckBox("Behavior Difficulty");
		chckbxBehavior.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_chckbxBehavior = new GridBagConstraints();
		gbc_chckbxBehavior.fill = GridBagConstraints.BOTH;
		gbc_chckbxBehavior.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxBehavior.gridx = 0;
		gbc_chckbxBehavior.gridy = 2;
		pnlConditions.add(chckbxBehavior, gbc_chckbxBehavior);
		
		JCheckBox chckbxPregnancy = new JCheckBox("Pregnancy");
		chckbxPregnancy.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_chckbxPregnancy = new GridBagConstraints();
		gbc_chckbxPregnancy.fill = GridBagConstraints.BOTH;
		gbc_chckbxPregnancy.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxPregnancy.gridx = 2;
		gbc_chckbxPregnancy.gridy = 2;
		pnlConditions.add(chckbxPregnancy, gbc_chckbxPregnancy);
		
		JCheckBox chckbxDislikeSchoolExperience = new JCheckBox("Dislike School Experience");
		chckbxDislikeSchoolExperience.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_chckbxDislikeSchoolExperience = new GridBagConstraints();
		gbc_chckbxDislikeSchoolExperience.fill = GridBagConstraints.BOTH;
		gbc_chckbxDislikeSchoolExperience.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxDislikeSchoolExperience.gridx = 0;
		gbc_chckbxDislikeSchoolExperience.gridy = 4;
		pnlConditions.add(chckbxDislikeSchoolExperience, gbc_chckbxDislikeSchoolExperience);
		
		JCheckBox chckbxNeededAtHome = new JCheckBox("Needed at home");
		chckbxNeededAtHome.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_chckbxNeededAtHome = new GridBagConstraints();
		gbc_chckbxNeededAtHome.fill = GridBagConstraints.BOTH;
		gbc_chckbxNeededAtHome.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNeededAtHome.gridx = 2;
		gbc_chckbxNeededAtHome.gridy = 4;
		pnlConditions.add(chckbxNeededAtHome, gbc_chckbxNeededAtHome);
		
		JCheckBox chckbxFinancialReasons = new JCheckBox("Financial Reasons");
		chckbxFinancialReasons.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_chckbxFinancialReasons = new GridBagConstraints();
		gbc_chckbxFinancialReasons.fill = GridBagConstraints.BOTH;
		gbc_chckbxFinancialReasons.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxFinancialReasons.gridx = 0;
		gbc_chckbxFinancialReasons.gridy = 6;
		pnlConditions.add(chckbxFinancialReasons, gbc_chckbxFinancialReasons);
		
		JCheckBox chckbxParentalInfluence = new JCheckBox("Parental Influence");
		chckbxParentalInfluence.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_chckbxParentalInfluence = new GridBagConstraints();
		gbc_chckbxParentalInfluence.fill = GridBagConstraints.BOTH;
		gbc_chckbxParentalInfluence.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxParentalInfluence.gridx = 2;
		gbc_chckbxParentalInfluence.gridy = 6;
		pnlConditions.add(chckbxParentalInfluence, gbc_chckbxParentalInfluence);
		
		JCheckBox chckbxEmployment = new JCheckBox("Employment");
		chckbxEmployment.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_chckbxEmployment = new GridBagConstraints();
		gbc_chckbxEmployment.fill = GridBagConstraints.BOTH;
		gbc_chckbxEmployment.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxEmployment.gridx = 0;
		gbc_chckbxEmployment.gridy = 8;
		pnlConditions.add(chckbxEmployment, gbc_chckbxEmployment);
		
		JCheckBox chckbxPhysicalIllnessOr = new JCheckBox("Physical illness or disability");
		chckbxPhysicalIllnessOr.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_chckbxPhysicalIllnessOr = new GridBagConstraints();
		gbc_chckbxPhysicalIllnessOr.fill = GridBagConstraints.BOTH;
		gbc_chckbxPhysicalIllnessOr.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxPhysicalIllnessOr.gridx = 2;
		gbc_chckbxPhysicalIllnessOr.gridy = 8;
		pnlConditions.add(chckbxPhysicalIllnessOr, gbc_chckbxPhysicalIllnessOr);
		
		JCheckBox chckbxExceededAllowableAbsences = new JCheckBox("Exceeded allowable absences");
		chckbxExceededAllowableAbsences.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_chckbxExceededAllowableAbsences = new GridBagConstraints();
		gbc_chckbxExceededAllowableAbsences.fill = GridBagConstraints.BOTH;
		gbc_chckbxExceededAllowableAbsences.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxExceededAllowableAbsences.gridx = 0;
		gbc_chckbxExceededAllowableAbsences.gridy = 10;
		pnlConditions.add(chckbxExceededAllowableAbsences, gbc_chckbxExceededAllowableAbsences);
		
		JCheckBox chckbxPoorStudentstaffRelationship = new JCheckBox("Poor student/staff relationship");
		chckbxPoorStudentstaffRelationship.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_chckbxPoorStudentstaffRelationship = new GridBagConstraints();
		gbc_chckbxPoorStudentstaffRelationship.anchor = GridBagConstraints.WEST;
		gbc_chckbxPoorStudentstaffRelationship.fill = GridBagConstraints.VERTICAL;
		gbc_chckbxPoorStudentstaffRelationship.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxPoorStudentstaffRelationship.gridx = 2;
		gbc_chckbxPoorStudentstaffRelationship.gridy = 10;
		pnlConditions.add(chckbxPoorStudentstaffRelationship, gbc_chckbxPoorStudentstaffRelationship);
		
		JCheckBox chckbxFamilyResponsibilities = new JCheckBox("Family Responsibilities");
		chckbxFamilyResponsibilities.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_chckbxFamilyResponsibilities = new GridBagConstraints();
		gbc_chckbxFamilyResponsibilities.fill = GridBagConstraints.BOTH;
		gbc_chckbxFamilyResponsibilities.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxFamilyResponsibilities.gridx = 0;
		gbc_chckbxFamilyResponsibilities.gridy = 12;
		pnlConditions.add(chckbxFamilyResponsibilities, gbc_chckbxFamilyResponsibilities);
		
		JCheckBox chckbxTransportationDifficulties = new JCheckBox("Transportation difficulties");
		chckbxTransportationDifficulties.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_chckbxTransportationDifficulties = new GridBagConstraints();
		gbc_chckbxTransportationDifficulties.fill = GridBagConstraints.BOTH;
		gbc_chckbxTransportationDifficulties.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxTransportationDifficulties.gridx = 2;
		gbc_chckbxTransportationDifficulties.gridy = 12;
		pnlConditions.add(chckbxTransportationDifficulties, gbc_chckbxTransportationDifficulties);
		
		JCheckBox chckbxLackOfInterest = new JCheckBox("Lack of interest or motivation");
		chckbxLackOfInterest.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_chckbxLackOfInterest = new GridBagConstraints();
		gbc_chckbxLackOfInterest.fill = GridBagConstraints.BOTH;
		gbc_chckbxLackOfInterest.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxLackOfInterest.gridx = 0;
		gbc_chckbxLackOfInterest.gridy = 14;
		pnlConditions.add(chckbxLackOfInterest, gbc_chckbxLackOfInterest);
		
		JCheckBox chckbxExpelled = new JCheckBox("Expelled (with no option to return for the remainder of the school or 14 months)");
		chckbxExpelled.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_chckbxExpelled = new GridBagConstraints();
		gbc_chckbxExpelled.gridwidth = 3;
		gbc_chckbxExpelled.anchor = GridBagConstraints.WEST;
		gbc_chckbxExpelled.fill = GridBagConstraints.VERTICAL;
		gbc_chckbxExpelled.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxExpelled.gridx = 0;
		gbc_chckbxExpelled.gridy = 16;
		pnlConditions.add(chckbxExpelled, gbc_chckbxExpelled);
		
		JPanel pnlOtherReason = new JPanel();
		GridBagConstraints gbc_pnlOtherReason = new GridBagConstraints();
		gbc_pnlOtherReason.insets = new Insets(0, 0, 5, 0);
		gbc_pnlOtherReason.gridwidth = 3;
		gbc_pnlOtherReason.fill = GridBagConstraints.BOTH;
		gbc_pnlOtherReason.gridx = 0;
		gbc_pnlOtherReason.gridy = 18;
		pnlConditions.add(pnlOtherReason, gbc_pnlOtherReason);
		pnlOtherReason.setLayout(null);
		
		txtOther = new JTextField();
		txtOther.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtOther.setBounds(95, 3, 407, 20);
		pnlOtherReason.add(txtOther);
		txtOther.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtOther.setOpaque(false);
		txtOther.setColumns(10);
		
		JCheckBox chckbxOtherReason = new JCheckBox("Other reason: ");
		chckbxOtherReason.setBounds(0, 0, 99, 23);
		pnlOtherReason.add(chckbxOtherReason);
		chckbxOtherReason.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JLabel lblNotes = new JLabel("Notes");
		lblNotes.setHorizontalAlignment(SwingConstants.LEFT);
		lblNotes.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNotes.setBounds(45, 383, 139, 30);
		add(lblNotes);
		
		JTextArea txtrNotes = new JTextArea();
		txtrNotes.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192), 2), new EmptyBorder(0, 4, 0, 0)));
		txtrNotes.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtrNotes.setText("Description Here");
		txtrNotes.setBounds(45, 420, 532, 130);
		add(txtrNotes);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // function of the button when pressed

			}
		});
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setBackground(new Color(21, 135, 89));
		btnSave.setBorder(null);
		btnSave.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnSave.setBounds(417, 590, 75, 30);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnCancel.setBorder(null);
		btnCancel.setBackground(new Color(78, 78, 78));
		btnCancel.setBounds(502, 590, 75, 30);
		add(btnCancel);
		
		JButton btnSavePrint = new JButton("Save and Print");
		btnSavePrint.setForeground(new Color(255, 255, 255));
		btnSavePrint.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnSavePrint.setBorder(null);
		btnSavePrint.setBackground(new Color(52, 81, 104));
		btnSavePrint.setBounds(282, 590, 125, 30);
		add(btnSavePrint);
	}
}
