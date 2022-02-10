/**
 * 
 */
package com.StudentManagement;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JLabel;

/**
 * @author Darkin
 *
 *@see this stackoverflow link for the query of this
 * https://stackoverflow.com/questions/8515601/java
 */
public class RotateJLabel extends JLabel {
	
	public RotateJLabel(String text) {
        super(text);
        Font font = new Font("Segoe UI", Font.BOLD, 16);
        FontMetrics metrics = new FontMetrics(font){};
        Rectangle2D bounds = metrics.getStringBounds(text, null);
        setBounds(0, 0, (int) bounds.getWidth(), (int) bounds.getHeight());
     }
	
     @Override
     public void paintComponent(Graphics g) {
        Graphics2D gx = (Graphics2D) g;
        gx.rotate(-(Math.PI/2), getX() + getWidth()/2, getY() + getHeight()/2);
        super.paintComponent(g);
     }
}
