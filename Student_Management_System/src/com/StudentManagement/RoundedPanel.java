package com.StudentManagement;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



/**
 * @see https://www.codeproject.com/articles/114959/rounded-border-jpanel-jpanel-graphics-improvements
 * for more information
 * 
 * also in needs to incorporate the database for the three labels and image
 *
 */
public class RoundedPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Stroke size. it is recommended to set it to 1 for better view */
    protected int strokeSize = 0;
    /** Color of shadow */
    protected Color shadowColor = Color.blue;
    /** Sets if it drops shadow */
    protected boolean shady = false;
    /** Sets if it has an High Quality view */
    protected boolean highQuality = true;
    /** Double values for Horizontal and Vertical radius of corner arcs */
    protected Dimension arcs = new Dimension(50, 50);
    /** Distance between shadow border and opaque panel border */
    protected int shadowGap = 0;
    /** The offset of shadow.  */
    protected int shadowOffset = 4;
    /** The transparency value of shadow. ( 0 - 255) */
    protected int shadowAlpha = 150;


	/**
	 * Create the panel.
	 */
	public  RoundedPanel(JPanel DatabasePanel, JPanel StudentInfo) {
		super();
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DatabasePanel.removeAll();
				DatabasePanel.add(StudentInfo);
				DatabasePanel.repaint();
				DatabasePanel.revalidate();
			}
		});
		setOpaque(false);
		setBounds(0, 0, 300, 150);
		setLayout(null);
		
		JLabel lblFullName = new JLabel("Luwalhati Alcantara");
		lblFullName.setForeground(Color.WHITE);
		lblFullName.setFont(new Font("Montserrat", Font.PLAIN, 13));
		lblFullName.setBounds(135, 25, 162, 20);
		add(lblFullName);
		
		JLabel lblLrn = new JLabel("LRN: 13689056734");
		lblLrn.setFont(lblFullName.getFont());
		lblLrn.setForeground(lblFullName.getForeground());
		lblLrn.setBounds(135, 53, 162, 20);
		add(lblLrn);
		
		JLabel lblGrade = new JLabel("Grade: ICT 11-A");
		lblGrade.setFont(lblFullName.getFont());
		lblGrade.setForeground(lblFullName.getForeground());
		lblGrade.setBounds(135, 78, 162, 20);
		add(lblGrade);
		
		JLabel lblAge = new JLabel("Age: 17");
		lblAge.setFont(lblFullName.getFont());
		lblAge.setForeground(lblFullName.getForeground());
		lblAge.setBounds(135, 104, 162, 20);
		add(lblAge);
		
		JLabel lblPicture = new JLabel(mainPageFunction.imgCircle(
				mainPageFunction.imgRescale(
						(new ImageIcon(RoundedPanel.class.getResource("/Icons/Others/Student.jpg"))), 118, 118)
				));
	
		lblPicture.setBounds(10, 16, 118, 118);
		add(lblPicture);

	}
	
	@Override
	   protected void paintComponent(Graphics g) {
	       super.paintComponent(g);
	       int width = getWidth();
	       int height = getHeight();
	       int shadowGap = this.shadowGap;
	       Color shadowColorA = new Color(shadowColor.getRed(),
	   shadowColor.getGreen(), shadowColor.getBlue(), shadowAlpha);
	       Graphics2D graphics = (Graphics2D) g;

	       //Sets antialiasing if HQ.
	       if (highQuality) {
	           graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	           RenderingHints.VALUE_ANTIALIAS_ON);
	       }

	       //Draws shadow borders if any.
	       if (shady) {
	           graphics.setColor(shadowColorA);
	           graphics.fillRoundRect(
	                   shadowOffset,// X position
	                   shadowOffset,// Y position
	                   width - strokeSize - shadowOffset, // width
	                   height - strokeSize - shadowOffset, // height
	                   arcs.width, arcs.height);// arc Dimension
	       } else {
	           shadowGap = 1;
	       }

	       //Draws the rounded opaque panel with borders.
	       graphics.setColor(getBackground());
	       graphics.fillRoundRect(0, 0, width - shadowGap, height - shadowGap, arcs.width, arcs.height);
	       graphics.setColor(getForeground());
	       graphics.setStroke(new BasicStroke(strokeSize));
	       graphics.drawRoundRect(0, 0, width - shadowGap,
	       height - shadowGap, arcs.width, arcs.height);

	       //Sets strokes to default, is better.
	       graphics.setStroke(new BasicStroke());
	   }
}
