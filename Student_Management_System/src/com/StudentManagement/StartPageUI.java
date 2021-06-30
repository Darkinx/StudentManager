package com.StudentManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class StartPageUI extends JFrame {

	LoginFrame loginFrame = new LoginFrame(); //Login UI for some dropdown shit in the btnUser
	int Thour, Tminute, Tsec, month, day, year;
	JLabel lblDate = new javax.swing.JLabel();
	JLabel lblTime = new javax.swing.JLabel();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Windows (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainPageFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPageFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPageFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPageFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartPageUI frame = new StartPageUI();
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
	public StartPageUI() {
		
		setResizable(false);
		setName("MainFrame");
		setBackground(Color.WHITE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		getContentPane().setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(StartPageUI.class.getResource("/Icons/SNSMLogo_Text.png")));
		setTitle("SNSM-Welcome");
		setBounds(0, 0, 1920, 1080);
		setMinimumSize(new java.awt.Dimension(1360, 768));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel homePane = new JPanel();
		getContentPane().add(homePane);
		homePane.setLayout(null);
		
		JPanel loginPanel = new LoginPanel(this); // adding the Login Panel and giving this frame to dispose
		loginPanel.setVisible(false);
		loginPanel.setEnabled(false);
		homePane.add(loginPanel);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBounds(0, 0, 1370, 89);
		homePane.add(headerPanel);
		headerPanel.setBackground(Color.WHITE);
		headerPanel.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.DARK_GRAY));
		headerPanel.setLayout(null);
		
		JButton btnSetting = new JButton("");
		btnSetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSetting.setBorder(null);
		btnSetting.setBackground(Color.WHITE);
		btnSetting.setBounds(1214, 0, 88, 88);
		btnSetting.setIcon(mainPageFunction.imgMethod((new ImageIcon(StartPageUI.class.getResource("/Icons/Navigation_Icons/setting-final.png"))), btnSetting.getWidth(), btnSetting.getHeight()));
		btnSetting.setSelectedIcon(mainPageFunction.imgMethod((new ImageIcon(StartPageUI.class.getResource("/Icons/Navigation_Icons/setting-final.png"))), btnSetting.getWidth(), btnSetting.getHeight()));
		headerPanel.add(btnSetting);
		
		JButton btnUser = new JButton("");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(loginPanel.isVisible() == false) {
				loginPanel.setVisible(true);
				loginPanel.setEnabled(true);
				loginPanel.setBounds((btnUser.getBounds().x - (int)(loginFrame.getWidth() * 0.35)), btnUser.getBounds().height, 300, 375);
				}else {
					loginPanel.setEnabled(false);
					loginPanel.setVisible(false);
				}
			}
		});
		btnUser.setBounds(1115, 0, 88, 88);
		btnUser.setIcon(mainPageFunction.imgMethod((new ImageIcon(StartPageUI.class.getResource("/Icons/Navigation_Icons/User.png"))), btnUser.getWidth(), btnUser.getHeight()));
		btnUser.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnUser.setBorder(null);
		btnUser.setBackground(Color.WHITE);
		headerPanel.add(btnUser);
		
		JPanel Mainpanel = new JPanel();
		Mainpanel.setBounds(0, 87, 1370, 662);
		homePane.add(Mainpanel);
		Mainpanel.setBackground(Color.WHITE);
		Mainpanel.setLayout(null);
		
		JLabel lblMainIcon = new JLabel("");
		lblMainIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainIcon.setBounds(-169, -16, 685, 622);
		lblMainIcon.setIcon(mainPageFunction.imgMethodNonButton((new ImageIcon(StartPageUI.class.getResource("/Icons/MainLogo.png"))), lblMainIcon.getWidth(), lblMainIcon.getHeight()));
		Mainpanel.add(lblMainIcon);
		
		JLabel lblWelcome = new JLabel("");
		lblWelcome.setBackground(Color.WHITE);
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(438, 188, 860, 245);
		lblWelcome.setIcon(mainPageFunction.imgMethodNonButton((new ImageIcon(StartPageUI.class.getResource("/Icons/Others/Welcome.png"))), lblWelcome.getWidth(), lblWelcome.getHeight()));
		Mainpanel.add(lblWelcome);

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
