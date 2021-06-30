package com.StudentManagement;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Frame;
import javax.swing.JMenuItem;
import javax.swing.border.LineBorder;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class HomePageUI extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
	private JTextField txtStudentName;
	private JTextField txtDueDate;
	private JTextField txtTaskCode;
	private JTextField textField;
	private JLabel lblTime = new JLabel("TIME");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePageUI frame = new HomePageUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @see This part needs to separate all the panels on other files to be sort things out more easily.
	 */
	public HomePageUI() {
		clock(); // run clock for the time thread to work
		
		setResizable(false);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Home - SNSM");
		setIconImage(Toolkit.getDefaultToolkit().getImage(HomePageUI.class.getResource("/Icons/SNSMLogo_Text.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setLayout(null);
		headerPanel.setBorder(null);
		headerPanel.setBackground(new Color(242, 242, 242));
		headerPanel.setBounds(0, 0, 1370, 89);
		contentPane.add(headerPanel);
		
		JPanel pnlNavigation = new JPanel();
		pnlNavigation.setBackground(headerPanel.getBackground());
		pnlNavigation.setBounds(64, 5, 870, 78);
		headerPanel.add(pnlNavigation);
		pnlNavigation.setLayout(null);
		
		JLabel lblSelectedTabName = new JLabel("Task Editor");
		lblSelectedTabName.setForeground(new Color(92, 92, 92));
		lblSelectedTabName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 32));
		lblSelectedTabName.setBounds(10, 20, 316, 38);
		pnlNavigation.add(lblSelectedTabName);
		
		JComboBox cmbTaskType = new JComboBox();
		cmbTaskType.setModel(new DefaultComboBoxModel(new String[] {"Late Slip", "Absent Slip", "Complaint", "Drop Slip"}));
		cmbTaskType.setName("taskTypeSelector");
		cmbTaskType.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		cmbTaskType.setBorder(new LineBorder(new Color(0, 0, 0)));
		cmbTaskType.setBounds(265, 24, 162, 30);
		pnlNavigation.add(cmbTaskType);
		
		JButton btnAddStudent = new JButton("");
		btnAddStudent.setBounds(719, 9, 60, 60);
		btnAddStudent.setBackground(pnlNavigation.getBackground());
		btnAddStudent.setIcon(mainPageFunction.imgMethod((new ImageIcon(HomePageUI.class.getResource("/Icons/Navigation_Icons/plus.png"))), btnAddStudent.getWidth(), btnAddStudent.getWidth()));
		btnAddStudent.setBorder(null);
		pnlNavigation.add(btnAddStudent);
		
		JButton btnSearch = new JButton("");
		btnSearch.setBackground(pnlNavigation.getBackground());
		btnSearch.setBounds(789, 9, 60, 60);
		btnSearch.setIcon(mainPageFunction.imgMethod((new ImageIcon(HomePageUI.class.getResource("/Icons/Navigation_Icons/search1600.png"))), btnSearch.getWidth(), btnSearch.getHeight()));
		btnSearch.setBorder(null);
		pnlNavigation.add(btnSearch);
		
		JButton btnSetting = new JButton("");
		btnSetting.setBorder(null);
		btnSetting.setBackground(headerPanel.getBackground());
		btnSetting.setBounds(1042, 0, 88, 88);
		btnSetting.setIcon(mainPageFunction.imgMethod((new ImageIcon(HomePageUI.class.getResource("/Icons/Navigation_Icons/setting-final.png"))), btnSetting.getWidth(), btnSetting.getHeight()));
		btnSetting.setSelectedIcon(mainPageFunction.imgMethod((new ImageIcon(HomePageUI.class.getResource("/Icons/Navigation_Icons/setting-final.png"))), btnSetting.getWidth(), btnSetting.getHeight()));
		headerPanel.add(btnSetting);
		
		JButton btnUser = new JButton("");
		btnUser.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser.setBorder(null);
		btnUser.setBackground(headerPanel.getBackground());
		btnUser.setBounds(944, 0, 88, 88);
		btnUser.setIcon(mainPageFunction.imgMethod((new ImageIcon(HomePageUI.class.getResource("/Icons/Navigation_Icons/User.png"))), btnUser.getWidth(), btnUser.getHeight()));
		headerPanel.add(btnUser);
		lblTime.setVerticalAlignment(SwingConstants.BOTTOM);
		
		
		lblTime.setForeground(new Color(58, 58, 58));
		lblTime.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTime.setFont(new Font("Bebas", Font.PLAIN, 60));
		lblTime.setBounds(1158, 11, 202, 67);
		headerPanel.add(lblTime);
		
		JLabel lblHelp = new JLabel("");
		lblHelp.setBounds(33, 669, 55, 65);
		lblHelp.setIcon(mainPageFunction.imgRescale((new ImageIcon(HomePageUI.class.getResource("/Icons/Navigation_Icons/help_icon.png"))), lblHelp.getWidth(), lblHelp.getHeight()));
		contentPane.add(lblHelp);
		
		// Listens to the changed of tabs to change the pnlNavigation what to show or not
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
//				System.out.println("Tab " + tabbedPane.getSelectedIndex());
				if (tabbedPane.getSelectedIndex() == 0) {
					pnlNavigation.setEnabled(false);
					pnlNavigation.setVisible(false);
				} else if (tabbedPane.getSelectedIndex() == 1) {
					pnlNavigation.setEnabled(true);
					pnlNavigation.setVisible(true);
					lblSelectedTabName.setText("Task Editor");
					cmbTaskType.setEnabled(true);
					cmbTaskType.setVisible(true);
					btnAddStudent.setEnabled(false);
					btnAddStudent.setVisible(false);
					btnSearch.setEnabled(false);
					btnSearch.setVisible(false);
				} else if (tabbedPane.getSelectedIndex() == 2) {
					pnlNavigation.setEnabled(true);
					pnlNavigation.setVisible(true);
					lblSelectedTabName.setText("Calendar");
					cmbTaskType.setEnabled(false);
					cmbTaskType.setVisible(false);
					btnAddStudent.setEnabled(false);
					btnAddStudent.setVisible(false);
					btnSearch.setEnabled(false);
					btnSearch.setVisible(false);
				} else if (tabbedPane.getSelectedIndex() == 3) {
					pnlNavigation.setEnabled(true);
					pnlNavigation.setVisible(true);
					lblSelectedTabName.setText("Student Database");
					cmbTaskType.setEnabled(false);
					cmbTaskType.setVisible(false);
					btnAddStudent.setEnabled(true);
					btnAddStudent.setVisible(true);
					btnSearch.setEnabled(true);
					btnSearch.setVisible(true);
				} else {
					pnlNavigation.setEnabled(false);
					pnlNavigation.setVisible(false);
				}
			}
		});
		tabbedPane.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		tabbedPane.setBackground(new Color(249, 249, 249));
		tabbedPane.setBounds(0, 87, 1370, 662);
		contentPane.add(tabbedPane);
		
		
		
		/**
		 * This part is for the initialization of the icon for the tab
		 * Except for the Help icon since it will use a Jpanel of some sort for its content
		 * 
		 * @see https://stackoverflow.com/questions/9052784/set-size-of-tab-in-jtabbedpane
		 * 		for the information about the tabComponent
		 */
		// Icon for the Notification Tab
		JLabel notificationIcon = new JLabel( mainPageFunction.imgRescale((new ImageIcon(HomePageUI.class.getResource("/Icons/Navigation_Icons/bell-icon[lined].png"))), 75, 75));
		notificationIcon.setPreferredSize(new Dimension(100, 100));
		
		// Icon for the TaskEditor Tab
		JLabel taskEditorIcon = new JLabel( mainPageFunction.imgRescale((new ImageIcon(HomePageUI.class.getResource("/Icons/Navigation_Icons/card.png"))), 75, 75));
		taskEditorIcon.setPreferredSize(new Dimension(100, 100));
		
		
		// Icon for the Calendar Tab
		JLabel calendarIcon = new JLabel( mainPageFunction.imgRescale((new ImageIcon(HomePageUI.class.getResource("/Icons/Navigation_Icons/calendar1600.png"))), 75, 75));
		calendarIcon.setPreferredSize(new Dimension(100, 100));
		
		// Icon for the TaskEditor Tab
		JLabel studentDatabaseIcon = new JLabel( mainPageFunction.imgRescale((new ImageIcon(HomePageUI.class.getResource("/Icons/Navigation_Icons/database.png"))), 75, 75));
		studentDatabaseIcon.setPreferredSize(new Dimension(100, 100));
		
		
		
		JPanel pnlNotification = new JPanel();
		pnlNotification.setBackground(Color.WHITE);
		tabbedPane.addTab("", pnlNotification);
		tabbedPane.setTabComponentAt(0, notificationIcon);
		tabbedPane.setSelectedIndex(0);
		pnlNotification.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 0, 2, (Color) new Color(217, 217, 217)));
		panel.setBackground(new Color(249, 249, 249));
		pnlNotification.add(panel);
		panel.setLayout(null);
		
		// Notifiction header but still don't have any functionalities
		JPanel pnlNotificationHeader = new JPanel();
		pnlNotificationHeader.setBorder(new MatteBorder(0, 0, 2, 2, (Color) new Color(217, 217, 217)));
		pnlNotificationHeader.setBackground(new Color(249, 249, 249));
		pnlNotificationHeader.setBounds(0, 0, 624, 80); // fix the conflict for the border of the header and the panelFeed
		panel.add(pnlNotificationHeader);
		pnlNotificationHeader.setLayout(null);
		
		JLabel lblNotificationFeed = new JLabel("Feed");
		lblNotificationFeed.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNotificationFeed.setBounds(25, 18, 117, 44);
		pnlNotificationHeader.add(lblNotificationFeed);
		
		JLabel lblFilterMenu = new JLabel("");
		lblFilterMenu.setBounds(557, 24, 36, 32);
		lblFilterMenu.setIcon(mainPageFunction.imgMethodNonButton((new ImageIcon(HomePageUI.class.getResource("/Icons/Navigation_Icons/menuShortend.png"))), lblFilterMenu.getBounds().width, lblFilterMenu.getBounds().height ));
		pnlNotificationHeader.add(lblFilterMenu);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(mainPageFunction.imgMethodNonButton((new ImageIcon(HomePageUI.class.getResource("/Icons/MainLogo.png"))), 650, 650));
		pnlNotification.add(lblLogo);
		
		
		
		JPanel pnlTaskEditor = new JPanel();
		pnlTaskEditor.setBackground(new Color(251, 251, 251));
		tabbedPane.addTab("", pnlTaskEditor);
		tabbedPane.setTabComponentAt(1, taskEditorIcon);
		pnlTaskEditor.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pnlTaskMainEditor = new JPanel();
		pnlTaskMainEditor.setBackground(new Color(251, 251, 251));
		pnlTaskEditor.add(pnlTaskMainEditor);
		pnlTaskMainEditor.setLayout(null);
		
		JButton btnSavePrint = new JButton("Save and Print");
		btnSavePrint.setForeground(new Color(255, 255, 255));
		btnSavePrint.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnSavePrint.setBorder(null);
		btnSavePrint.setBackground(new Color(52, 81, 104));
		btnSavePrint.setBounds(289, 572, 125, 30);
		pnlTaskMainEditor.add(btnSavePrint);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setHorizontalAlignment(SwingConstants.LEFT);
		lblStudentName.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblStudentName.setBounds(52, 80, 139, 30);
		pnlTaskMainEditor.add(lblStudentName);
		
		txtStudentName = new JTextField();
		lblStudentName.setLabelFor(txtStudentName);
		txtStudentName.setBorder(new LineBorder(new Color(191, 191, 191), 2));
		txtStudentName.setBackground(new Color(255, 255, 255));
		txtStudentName.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtStudentName.setBounds(52, 112, 240, 35);
		pnlTaskMainEditor.add(txtStudentName);
		txtStudentName.setColumns(10);
		
		txtDueDate = new JTextField();
		txtDueDate.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtDueDate.setColumns(10);
		txtDueDate.setBorder(new LineBorder(new Color(191, 191, 191), 2));
		txtDueDate.setBackground(Color.WHITE);
		txtDueDate.setBounds(344, 112, 150, 35);
		pnlTaskMainEditor.add(txtDueDate);
		
		JLabel lblDueDate = new JLabel("Due Date");
		lblDueDate.setLabelFor(txtDueDate);
		lblDueDate.setHorizontalAlignment(SwingConstants.LEFT);
		lblDueDate.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblDueDate.setBounds(344, 80, 139, 30);
		pnlTaskMainEditor.add(lblDueDate);
		
		JLabel lblPriority = new JLabel("Priority");
		lblPriority.setHorizontalAlignment(SwingConstants.LEFT);
		lblPriority.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblPriority.setBounds(52, 188, 139, 30);
		pnlTaskMainEditor.add(lblPriority);
		
		JComboBox cmbPriority = new JComboBox();
		cmbPriority.setBorder(txtStudentName.getBorder());
		cmbPriority.setBackground(new Color(255, 255, 255));
		cmbPriority.setModel(new DefaultComboBoxModel(new String[] {"Select Priority", "High ", "Medium", "Low"}));
		cmbPriority.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		cmbPriority.setBounds(52, 224, 240, 35);
		pnlTaskMainEditor.add(cmbPriority);
		
		JLabel lblTaskCode = new JLabel("Task code");
		lblTaskCode.setHorizontalAlignment(SwingConstants.LEFT);
		lblTaskCode.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblTaskCode.setBounds(344, 188, 139, 30);
		pnlTaskMainEditor.add(lblTaskCode);
		
		txtTaskCode = new JTextField();
		txtTaskCode.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtTaskCode.setColumns(10);
		txtTaskCode.setBorder(new LineBorder(new Color(191, 191, 191), 2));
		txtTaskCode.setBackground(Color.WHITE);
		txtTaskCode.setBounds(344, 224, 240, 35);
		pnlTaskMainEditor.add(txtTaskCode);
		
		JLabel lblTaskName = new JLabel("Task Name");
		lblTaskName.setHorizontalAlignment(SwingConstants.LEFT);
		lblTaskName.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblTaskName.setBounds(52, 306, 139, 30);
		pnlTaskMainEditor.add(lblTaskName);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(191, 191, 191), 2));
		textField.setBackground(Color.WHITE);
		textField.setBounds(52, 340, 532, 35);
		pnlTaskMainEditor.add(textField);
		
		JLabel lblNotes = new JLabel("Notes");
		lblNotes.setHorizontalAlignment(SwingConstants.LEFT);
		lblNotes.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNotes.setBounds(52, 424, 139, 30);
		pnlTaskMainEditor.add(lblNotes);
		
		JTextArea txtrNotes = new JTextArea();
		txtrNotes.setBorder(txtStudentName.getBorder());
		txtrNotes.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtrNotes.setText("Description Here");
		txtrNotes.setBounds(52, 459, 532, 70);
		pnlTaskMainEditor.add(txtrNotes);
		
		JButton btnSave = new JButton("Save");
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setBackground(new Color(21, 135, 89));
		btnSave.setBorder(null);
		btnSave.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnSave.setBounds(424, 572, 75, 30);
		pnlTaskMainEditor.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnCancel.setBorder(null);
		btnCancel.setBackground(new Color(78, 78, 78));
		btnCancel.setBounds(509, 572, 75, 30);
		pnlTaskMainEditor.add(btnCancel);
		
		JPanel pnlPrintView = new JPanel();
		pnlPrintView.setBackground(new Color(245, 245, 245));
		pnlTaskEditor.add(pnlPrintView);
		
		JPanel pnlCalendar = new JPanel();
		pnlCalendar.setBackground(Color.WHITE);
		tabbedPane.addTab("", pnlCalendar);
		tabbedPane.setTabComponentAt(2, calendarIcon);
		
		JPanel pnlDatabase = new JPanel();
		pnlDatabase.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("", pnlDatabase);
		tabbedPane.setTabComponentAt(3, studentDatabaseIcon);
		pnlDatabase.setLayout(null);
		
		JPanel studentInfo = new RoundedPanel();
		studentInfo.setBounds(70, 35, 300, 150);
		studentInfo.setBackground(new Color(166, 166, 166));
		pnlDatabase.add(studentInfo);
		
		RoundedPanel studentInfo1 = new RoundedPanel();
		studentInfo1.setLocation(460, 35);
		studentInfo1.setSize(studentInfo.getSize());
		studentInfo1.setBackground(new Color(177, 33, 33));
		pnlDatabase.add(studentInfo1);
		
		RoundedPanel studentInfo2 = new RoundedPanel();
		studentInfo2.setLocation(850, 35);
		studentInfo2.setSize(studentInfo.getSize());
		studentInfo2.setBackground(new Color(77, 111, 255));
		pnlDatabase.add(studentInfo2);
	}
	
	
	// See this video for more info: https://youtu.be/tpQAslXjNKU
	public void clock() {
        Thread clock = new Thread() {
			public void run() {
				try {
					while (true) {
						Calendar cal = Calendar.getInstance();
						//get current time
						int Thour = cal.get(Calendar.HOUR_OF_DAY);
						int Tminute = cal.get(Calendar.MINUTE);

						//            //for ;
						//            SimpleDateFormat sdf24 =  new SimpleDateFormat("HH:mm:ss");
						Date dat = cal.getTime();
						//            String time24 = sdf24.format(dat);
						//            
						//            //set to label
						//            time.setText(time24);

						//for 12format
						SimpleDateFormat sdf12 = new SimpleDateFormat("hh:mm aa");
						String time12 = sdf12.format(dat);

						//set to label
						lblTime.setText(time12);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		clock.start();
	}
}
