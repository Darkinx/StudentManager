package com.StudentManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JSeparator;
import javax.swing.JTree;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainPageUI extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPageUI frame = new MainPageUI();
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
	public MainPageUI() {
		
		
		setResizable(false);
		// Need to change this to undecorated later on
		setName("MainFrame");
		setBackground(Color.WHITE);
		getContentPane().setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainPageUI.class.getResource("/Icons/SNSMLogo_Text.png")));
		setTitle("SNSM-Welcome");
		setBounds(100, 100, 1920, 1080);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(Color.WHITE);
		headerPanel.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.DARK_GRAY));
		headerPanel.setBounds(0, 0, 1370, 89);
		getContentPane().add(headerPanel);
		headerPanel.setLayout(null);
		
		JButton btnSetting = new JButton("");
		btnSetting.setBorder(null);
		btnSetting.setBackground(Color.WHITE);
		btnSetting.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnSetting.setIcon(new ImageIcon(MainPageUI.class.getResource("/Icons/Navigation_Icons/setting-final.png")));
		btnSetting.setSelectedIcon(new ImageIcon(MainPageUI.class.getResource("/Icons/Navigation_Icons/setting-final.png")));
		btnSetting.setBounds(1214, 0, 89, 89);
		headerPanel.add(btnSetting);
		
		JButton btnUser = new JButton("");
		btnUser.setIcon(new ImageIcon(MainPageUI.class.getResource("/Icons/Navigation_Icons/User.png")));
		btnUser.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser.setBorder(null);
		btnUser.setBackground(Color.WHITE);
		btnUser.setBounds(1115, 0, 89, 89);
		headerPanel.add(btnUser);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 87, 1370, 662);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblMainIcon = new JLabel("New label");
		lblMainIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainIcon.setIcon(new ImageIcon(MainPageUI.class.getResource("/Icons/MainLogo.png")));
		lblMainIcon.setBounds(-85, 87, 532, 492);
		panel.add(lblMainIcon);
		
		JLabel lblWelcome = new JLabel("");
		lblWelcome.setBackground(Color.WHITE);
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setIcon(new ImageIcon(MainPageUI.class.getResource("/Icons/Others/Welcome.png")));
		lblWelcome.setBounds(455, 166, 1054, 263);
		panel.add(lblWelcome);

	}
	
    public void run() {
        while(true){
            Calendar cal =Calendar.getInstance();
            //get current time
            Thour = cal.get(Calendar.HOUR_OF_DAY);
            Tminute = cal.get(Calendar.MINUTE);
            Tsec = cal.get(Calendar.SECOND);
            month=cal.get(Calendar.MONTH);
            day = cal.get(Calendar.DAY_OF_MONTH);
            year = cal.get(Calendar.YEAR);
            
//            //for ;
//            SimpleDateFormat sdf24 =  new SimpleDateFormat("HH:mm:ss");
            Date dat = cal.getTime();
            Date date1 = cal.getTime();
//            String time24 = sdf24.format(dat);
//            
//            //set to label
//            time.setText(time24);
            
             //for 12format
            SimpleDateFormat sdf12 =  new SimpleDateFormat("hh:mm:ss aa");
            SimpleDateFormat date =  new SimpleDateFormat("MMM dd" + ", " +  "yyyy");
            String time12 = sdf12.format(dat);
            String date12 = date.format(dat);
            
            //set to label
            lblTime.setText(time12);
            lblDate.setText(date12.toUpperCase());
            

        }
     }   
}
