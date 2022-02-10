package com.StudentManagement;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JTextField;

/**
 * @author Darkin
 * 
 * This part creates a JTextField but rounded 
 * 
 * @see https://stackoverflow.com/questions/8515601/java-swing-rounded-border-for-jtextfield 
 * for more information
 * 
 * and here https://java-swing-tips.blogspot.com/2012/03/rounded-border-for-jtextfield.html
 * 
 * also @see here too https://stackoverflow.com/questions/10258224/change-background-color-editable-jcombobox
 * for the JComboBox
 * 
 *
 */
public class RoundJTextField extends JTextField {
    private Shape shape;
    private int thickness = 0;
    
    public RoundJTextField(int size) {
        super(size);
        setOpaque(false); // As suggested by @AVD in comment.
    }
    
    public RoundJTextField(int size, int thickness) {
    	super(size);
        setOpaque(false); // As suggested by @AVD in comment.
        this.thickness = thickness;
    }
    protected void paintComponent(Graphics g) {
    	mainPageFunction.applyQualityRenderingHints( (Graphics2D) g);
         g.setColor(getBackground()); 
         g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         super.paintComponent(g);
    }
    protected void paintBorder(Graphics g) {
    	if ((this.thickness > 0) && (g instanceof Graphics2D)) {
            Graphics2D g2d = (Graphics2D) g;
    		Shape outer;
    		Shape inner;
    		
    		int off = this.thickness;
    		int size = off + off; 
    		float arc = 15;
    		outer = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
            inner = new RoundRectangle2D.Float(0 + off, 0 + off, getWidth() - size, getHeight() - size, arc, arc);
             
            Path2D path = new Path2D.Float(Path2D.WIND_EVEN_ODD);
            path.append(outer, false);
            path.append(inner, false);
            g2d.fill( path);
            g2d.setColor(Color.BLACK);
            g =(Graphics) g2d;
            mainPageFunction.applyQualityRenderingHints((Graphics2D) g);
   		
    	}else {
    		mainPageFunction.applyQualityRenderingHints( (Graphics2D) g);
            g.setColor(getForeground());
            g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
		}
    }
    public boolean contains(int x, int y) {
         if (shape == null || !shape.getBounds().equals(getBounds())) {
             shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         }
         return shape.contains(x, y);
    }
}