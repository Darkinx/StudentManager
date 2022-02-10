package com.StudentManagement;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.toedter.calendar.JCalendar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class HomePageUI extends JFrame {

	// In need to sort these things out first late on
	private JLayeredPane contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
	private JPanel pnlDatabase = new JPanel();
	private JLabel lblTime = new JLabel("TIME");
	private JPanel pnlMainDatabase = new JPanel(); //Panel for the student database in the databaseTabPanel
	private JPanel pnlStudentEditor = new StudentEditInfo(); //Student Info part of the Database tab Panel

	private JPanel pnlMainEditorView = new JPanel(); // Main view for the half of the Task Editor
	private JPanel pnlLateSlip = new LateSlipPanel(); //Panel for LastSlip edit on the Task Editor
	private JPanel pnlAbsentSlip = new AbsentSlipPanel(); // Panel for AbsentSlip edit on the Task Editor
	private JPanel pnlCallParent = new CallParentPanel(); // Panel for CallParent Slip on the Task Editor
	private JPanel pnlDropSlip = new DropSlipPanel(); // Panel for the Drop Slip option of Task Editor
	
	JButton btnUser = new JButton(""); // Button for the User tab part
	
	
	
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					HomePageUI frame = new HomePageUI();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

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
		contentPane = new JLayeredPane();
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
		
		JPanel teacherInfo = new TeacherInfoPanel(btnUser);
		teacherInfo.setVisible(false);
		teacherInfo.setEnabled(false);
		contentPane.add(teacherInfo, JLayeredPane.POPUP_LAYER);
		lblTime.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JButton btnSetting = new JButton("");
		btnSetting.setBorder(null);
		btnSetting.setBackground(headerPanel.getBackground());
		btnSetting.setBounds(1042, 0, 88, 88);
		btnSetting.setIcon(mainPageFunction.imgMethod((new ImageIcon(HomePageUI.class.getResource("/Icons/Navigation_Icons/setting-final.png"))), btnSetting.getWidth(), btnSetting.getHeight()));
		btnSetting.setSelectedIcon(mainPageFunction.imgMethod((new ImageIcon(HomePageUI.class.getResource("/Icons/Navigation_Icons/setting-final.png"))), btnSetting.getWidth(), btnSetting.getHeight()));
		headerPanel.add(btnSetting);
		
		// Need to make the TeacherInfo panel to disappear when not in used
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(teacherInfo.isVisible() == false) {
					teacherInfo.setLocation(0, headerPanel.getY() + headerPanel.getHeight());;
					teacherInfo.setVisible(true);
					teacherInfo.setEnabled(true);
					headerPanel.setBackground(new Color(139, 164, 255));
					btnUser.setBackground(headerPanel.getBackground());
					btnSetting.setBackground(headerPanel.getBackground());
					pnlNavigation.setEnabled(false);
					pnlNavigation.setVisible(false);
				}else {
					pnlNavigation.setEnabled(true);
					pnlNavigation.setVisible(true);
					teacherInfo.setVisible(false);
					teacherInfo.setEnabled(false);
					headerPanel.setBackground(new Color(242, 242, 242));
					btnUser.setBackground(headerPanel.getBackground());
					btnSetting.setBackground(headerPanel.getBackground());
				}
				
			}
		});
		btnUser.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser.setBorder(null);
		btnUser.setBackground(headerPanel.getBackground());
		btnUser.setBounds(944, 0, 88, 88);
		btnUser.setIcon(mainPageFunction.imgMethod((new ImageIcon(HomePageUI.class.getResource("/Icons/Navigation_Icons/User.png"))), btnUser.getWidth(), btnUser.getHeight()));
		headerPanel.add(btnUser);
		
		
		JLabel lblSelectedTabName = new JLabel("Task Editor");
		lblSelectedTabName.setForeground(new Color(92, 92, 92));
		lblSelectedTabName.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 32));
		lblSelectedTabName.setBounds(10, 20, 316, 38);
		pnlNavigation.add(lblSelectedTabName);
		
		// Need to fix the comboBox model to prevent messing up things
		JComboBox<String> cmbTaskType = new JComboBox<String>();
		cmbTaskType.setModel(new DefaultComboBoxModel(new String[] {"Late Slip", "Absent Slip", "Complaint", "Drop Slip"}));
		cmbTaskType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cmbTaskType.getSelectedIndex() == 0) {
					pnlMainEditorView.removeAll();
					pnlMainEditorView.add(pnlLateSlip);
					pnlMainEditorView.repaint();
					pnlMainEditorView.revalidate();
				}else if (cmbTaskType.getSelectedIndex() == 1) {
					pnlMainEditorView.removeAll();
					pnlMainEditorView.add(pnlAbsentSlip);
					pnlMainEditorView.repaint();
					pnlMainEditorView.revalidate();
				}else if (cmbTaskType.getSelectedIndex() == 2) {
					pnlMainEditorView.removeAll();
					pnlMainEditorView.add(pnlCallParent);
					pnlMainEditorView.repaint();
					pnlMainEditorView.revalidate();
				}else if (cmbTaskType.getSelectedIndex() == 3) {
					pnlMainEditorView.removeAll();
					pnlMainEditorView.add(pnlDropSlip);
					pnlMainEditorView.repaint();
					pnlMainEditorView.revalidate();
				}else {
					System.out.println("Error on cmbTaskType Selections");
					System.out.println("Event Error: " + e.toString());
				}
			}
		});
		cmbTaskType.setName("taskTypeSelector");
		cmbTaskType.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		cmbTaskType.setBorder(new LineBorder(new Color(0, 0, 0)));
		cmbTaskType.setBounds(265, 24, 162, 30);
		pnlNavigation.add(cmbTaskType);
		
		JButton btnAddStudent = new JButton("");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				btnAddStudentActionPerformed(e);
				pnlDatabase.removeAll();
				pnlDatabase.add(pnlStudentEditor);
				pnlDatabase.repaint();
				pnlDatabase.revalidate();
			}
		});
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
		
		
		lblTime.setForeground(new Color(58, 58, 58));
		lblTime.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTime.setFont(new Font("Bebas Neue", Font.BOLD, 60));
		lblTime.setBounds(1158, 11, 202, 67);
		headerPanel.add(lblTime);
		
		JLabel lblHelp = new JLabel("");
		lblHelp.setBounds(33, 669, 55, 65);
		lblHelp.setIcon(mainPageFunction.imgRescale((new ImageIcon(HomePageUI.class.getResource("/Icons/Navigation_Icons/help_icon.png"))), lblHelp.getWidth(), lblHelp.getHeight()));
		contentPane.add(lblHelp);
		tabbedPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(tabbedPane.getSelectedComponent() == pnlDatabase) {
					pnlDatabase.removeAll();
					pnlDatabase.add(pnlMainDatabase);
					pnlDatabase.repaint();
					pnlDatabase.revalidate();
				}
			}
		});
		
		// Listens to the changed of tabs to change the pnlNavigation what to show or not
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (tabbedPane.getSelectedIndex() == 0) { // notification tab is selected
					pnlNavigation.setEnabled(false);
					pnlNavigation.setVisible(false);
					
				} else if (tabbedPane.getSelectedIndex() == 1) { // task editor tab is selected
					pnlNavigation.setEnabled(true);
					pnlNavigation.setVisible(true);
					lblSelectedTabName.setText("Task Editor");
					cmbTaskType.setEnabled(true);
					cmbTaskType.setVisible(true);
					btnAddStudent.setEnabled(false);
					btnAddStudent.setVisible(false);
					btnSearch.setEnabled(false);
					btnSearch.setVisible(false);
					
				} else if (tabbedPane.getSelectedIndex() == 2) { // Calandar tab is selected
					pnlNavigation.setEnabled(true);
					pnlNavigation.setVisible(true);
					lblSelectedTabName.setText("Calendar");
					cmbTaskType.setEnabled(false);
					cmbTaskType.setVisible(false);
					btnAddStudent.setEnabled(false);
					btnAddStudent.setVisible(false);
					btnSearch.setEnabled(false);
					btnSearch.setVisible(false);
					
				} else if (tabbedPane.getSelectedIndex() == 3) { // Student database tab is selected
					pnlDatabase.removeAll();
					pnlDatabase.add(pnlMainDatabase);
					pnlDatabase.repaint();
					pnlDatabase.revalidate();
					
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
		
		JPanel pnlMainNotification = new JPanel();
		pnlMainNotification.setBorder(new MatteBorder(0, 0, 0, 2, (Color) new Color(217, 217, 217)));
		pnlMainNotification.setBackground(new Color(249, 249, 249));
		pnlNotification.add(pnlMainNotification);
		pnlMainNotification.setLayout(null);
		
		// Notification header but still don't have any functionalities
		JPanel pnlNotificationHeader = new JPanel();
		pnlNotificationHeader.setBounds(0, 0, 672, 80);
		pnlNotificationHeader.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(217, 217, 217)));
		pnlNotificationHeader.setBackground(new Color(249, 249, 249));
		pnlMainNotification.add(pnlNotificationHeader);
		pnlNotificationHeader.setLayout(null);
		
		JLabel lblNotificationFeed = new JLabel("Feed");
		lblNotificationFeed.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNotificationFeed.setBounds(25, 18, 117, 44);
		pnlNotificationHeader.add(lblNotificationFeed);
		
		JLabel lblFilterMenu = new JLabel("");
		lblFilterMenu.setBounds(557, 24, 36, 32);
		lblFilterMenu.setIcon(mainPageFunction.imgMethodNonButton((new ImageIcon(HomePageUI.class.getResource("/Icons/Navigation_Icons/menuShortend.png"))), lblFilterMenu.getBounds().width, lblFilterMenu.getBounds().height ));
		pnlNotificationHeader.add(lblFilterMenu);
		pnlMainNotification.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBorder(null);
		scrollPane.setBounds(0, 79, 672, 578);
		pnlMainNotification.add(scrollPane);
		
		JPanel pnlNotificationHolder = new JPanel();
		scrollPane.setViewportView(pnlNotificationHolder);
		pnlNotificationHolder.setBackground(new Color(0,0,0,0));
		GridBagLayout gbl_pnlNotificationHolder = new GridBagLayout();
		gbl_pnlNotificationHolder.columnWidths = new int[]{680, 0};
		gbl_pnlNotificationHolder.rowHeights = new int[]{200, 200, 0};
		gbl_pnlNotificationHolder.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_pnlNotificationHolder.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		pnlNotificationHolder.setLayout(gbl_pnlNotificationHolder);
		
		// Sample panelling system for the NotificationHolder
//		JPanel panel = new JPanel();
//		GridBagConstraints gbc_panel = new GridBagConstraints();
//		gbc_panel.fill = GridBagConstraints.BOTH;
//		gbc_panel.insets = new Insets(0, 0, 5, 0);
//		gbc_panel.gridx = 0;
//		gbc_panel.gridy = 0;
//		pnlNotificationHolder.add(panel, gbc_panel);
//		
//		JPanel panel_1 = new JPanel();
//		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
//		gbc_panel_1.fill = GridBagConstraints.BOTH;
//		gbc_panel_1.gridx = 0;
//		gbc_panel_1.gridy = 1;
//		pnlNotificationHolder.add(panel_1, gbc_panel_1);
		
		//Getting the notifications in the sql and adding to the panel
		//Working sql connection need more polish
		try {
			String sqlNotification = "SELECT * FROM `notification` WHERE user_id=?";
			int user_key = User.getKey(); 
			
			conDB connection = new conDB();
			PreparedStatement statement = connection.connectionString().prepareStatement(sqlNotification);
			statement.setInt(1, user_key);
			
			ArrayList<NotificationCard> notif = new ArrayList<NotificationCard>();
			ArrayList<GridBagConstraints> gbc_notif = new ArrayList<GridBagConstraints>();
			
			ResultSet rsl = statement.executeQuery();
			while(rsl.next()) {
				System.out.print("rsl is in the loop");
				String subject = rsl.getString("subject");
				String detail =  rsl.getString("detail");
				Date timegiven = rsl.getDate("time");
				
				System.out.println("Subject: " + subject + "\n" + "Detail: " + 
				detail + "\n" + "TimeGiven: " + timegiven.toString() + "\n\n");
				
				NotificationCard tempCard = new NotificationCard(User.getUser(), subject, detail, timegiven.toString());
				tempCard.setVisible(true);
				tempCard.setEnabled(true);
				notif.add(tempCard);

			}
			for (int i =0; i < notif.size(); i++) {
				GridBagConstraints gbc_temp = new GridBagConstraints();
				gbc_temp.fill = GridBagConstraints.BOTH;
				gbc_temp.gridx = 0;
				gbc_temp.gridy = i;
				gbc_notif.add(gbc_temp);
				pnlNotificationHolder.add(notif.get(i), gbc_notif.get(i));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(mainPageFunction.imgMethodNonButton((new ImageIcon(HomePageUI.class.getResource("/Icons/MainLogo.png"))), 650, 650));
		pnlNotification.add(lblLogo);
		
		JPanel pnlTaskEditor = new JPanel();
		pnlTaskEditor.setBackground(new Color(251, 251, 251));
		tabbedPane.addTab("", pnlTaskEditor);
		tabbedPane.setTabComponentAt(1, taskEditorIcon);
		pnlTaskEditor.setLayout(new GridLayout(0, 2, 0, 0));
		
		//Main Editor view for the task editor
		pnlTaskEditor.add(pnlMainEditorView);
		pnlMainEditorView.setLayout(new CardLayout(0, 0));
		
		// Adding the panel for the MainEditor View of the Task Editor
		pnlMainEditorView.add(pnlLateSlip, "name_2042741809800");
		pnlLateSlip.setBackground(new Color(251, 251, 251));
		pnlLateSlip.setLayout(null);
		
		pnlMainEditorView.add(pnlAbsentSlip, "name_3553812071800");
		pnlAbsentSlip.setLayout(null);
		
		pnlMainEditorView.add(pnlCallParent, "name_16829928427899");
		pnlCallParent.setBackground(new Color(251, 251, 251));
		pnlCallParent.setLayout(null);
		
		pnlMainEditorView.add(pnlDropSlip);
//		pnlDropSlip.setBackground(Color.WHITE);
		
		JPanel pnlPrintView = new JPanel();
		pnlPrintView.setBackground(new Color(245, 245, 245));
		pnlTaskEditor.add(pnlPrintView);
		
		JPanel pnlCalendar = new JPanel();
		pnlCalendar.setBackground(Color.WHITE);
		tabbedPane.addTab("", pnlCalendar);
		pnlCalendar.setLayout(new GridLayout(1, 0, 0, 0));
		
		JCalendar calendar = new JCalendar();
		pnlCalendar.add(calendar);
		tabbedPane.setTabComponentAt(2, calendarIcon);
		

		pnlDatabase.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("", pnlDatabase);
		tabbedPane.setTabComponentAt(3, studentDatabaseIcon);
		pnlDatabase.setLayout(new CardLayout(0, 0));
		
		// Need to have a separate Database checker on a separate file for every update of it.
		pnlDatabase.add(pnlMainDatabase, "name_39619880518700");
		
		pnlDatabase.add(pnlStudentEditor, "name_40068080409600");
		
		JPanel pnlStudentInfo = new StudentInfoPanel(pnlDatabase, pnlStudentEditor);
		pnlDatabase.add(pnlStudentInfo, "name_40082168911300");
		GridBagLayout gbl_pnlMainDatabase = new GridBagLayout();
		gbl_pnlMainDatabase.columnWidths = new int[]{1349, 0};
		gbl_pnlMainDatabase.rowHeights = new int[]{657, 0};
		gbl_pnlMainDatabase.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_pnlMainDatabase.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pnlMainDatabase.setLayout(gbl_pnlMainDatabase);
		
		JPanel pnlStudentDatabase = new JPanel();
		GridBagConstraints gbc_pnlStudentDatabase = new GridBagConstraints();
		gbc_pnlStudentDatabase.fill = GridBagConstraints.BOTH;
		gbc_pnlStudentDatabase.gridx = 0;
		gbc_pnlStudentDatabase.gridy = 0;
		pnlMainDatabase.add(pnlStudentDatabase, gbc_pnlStudentDatabase);
		GridBagLayout gbl_pnlStudentDatabase = new GridBagLayout();
		gbl_pnlStudentDatabase.columnWidths = new int[]{60, 300, 60, 300, 60, 300, 60, 60};
		gbl_pnlStudentDatabase.rowHeights = new int[]{150, 0};
		gbl_pnlStudentDatabase.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlStudentDatabase.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlStudentDatabase.setLayout(gbl_pnlStudentDatabase);
		
		JPanel studentInfoCard = new RoundedPanel(pnlDatabase, pnlStudentInfo);
		GridBagConstraints gbc_studentInfoCard = new GridBagConstraints();
		gbc_studentInfoCard.fill = GridBagConstraints.BOTH;
		gbc_studentInfoCard.insets = new Insets(0, 0, 0, 5);
		gbc_studentInfoCard.gridx = 1;
		gbc_studentInfoCard.gridy = 0;
		pnlStudentDatabase.add(studentInfoCard, gbc_studentInfoCard);
		studentInfoCard.setBackground(new Color(166, 166, 166));
		
		RoundedPanel studentInfoCard1 = new RoundedPanel(pnlDatabase, pnlStudentInfo);
		GridBagConstraints gbc_studentInfoCard1 = new GridBagConstraints();
		gbc_studentInfoCard1.fill = GridBagConstraints.BOTH;
		gbc_studentInfoCard1.insets = new Insets(0, 0, 0, 5);
		gbc_studentInfoCard1.gridx = 3;
		gbc_studentInfoCard1.gridy = 0;
		pnlStudentDatabase.add(studentInfoCard1, gbc_studentInfoCard1);
		studentInfoCard1.setBackground(new Color(177, 33, 33));
		
		RoundedPanel studentInfoCard2 = new RoundedPanel(pnlDatabase, pnlStudentInfo);
		GridBagConstraints gbc_studentInfoCard2 = new GridBagConstraints();
		gbc_studentInfoCard2.insets = new Insets(0, 0, 0, 5);
		gbc_studentInfoCard2.fill = GridBagConstraints.BOTH;
		gbc_studentInfoCard2.gridx = 5;
		gbc_studentInfoCard2.gridy = 0;
		pnlStudentDatabase.add(studentInfoCard2, gbc_studentInfoCard2);
		studentInfoCard2.setBackground(new Color(77, 111, 255));
		
		JPanel pnlAddStudent = new AddStudentPanel();
		pnlDatabase.add(pnlAddStudent, "name_7061897389500");
		
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
