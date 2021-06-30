/**
 * This needs more image rescaling function for fixed ratio since the two can't handle it
 */
package com.StudentManagement;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * @author Darkin
 *
 */


/**
 * @author Darkin
 *
 */
/**
 * @author Darkin
 *
 */
public class mainPageFunction {
	
	/**
	    * Returns a scaled down image if the height or width is smaller than the
	    * image size.
	    * 
	    * Note: It can't retain the image ratio
	    * 
	    * @param imgIcon 
	    *            the initial image that will be turned to an icon
	    * @param icon
	    *            the image icon.
	    * @param newHeight
	    *            the preferred height.
	    * @param newWidth
	    *            the preferred width.
	    * @return the icon. of the Scaled down image
	    * 
	    * @see https://www.programcreek.com/java-api-examples/?class=java.awt.Image&method=getScaledInstance 
	    * for the solution and more info
	    */
	protected static ImageIcon imgMethod(ImageIcon imgIcon, int newWidth, int newHeight) {
		ImageIcon icon = imgIcon;
		try {
			Image img = icon.getImage();
			int height = icon.getIconHeight();
			int width = icon.getIconWidth();

			// ensuring that both are less than to the dimension of the new one and add margin of some sort
			if (height > newHeight) {
			    height = (int) (newHeight - (newHeight * 0.3));
			}

			if (width > newWidth) {
			    width = (int) (newWidth - (newWidth * 0.3));
			}
			img = img.getScaledInstance( width, height,  Image.SCALE_SMOOTH);
			icon = new ImageIcon( img );
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return icon;
	}
	
	
	/**
	 * 
	 * everything is similar to the imgMethod above
	 * The difference is this if for default resizing only
	 */
	protected static ImageIcon imgMethodNonButton(ImageIcon imgIcon, int newWidth, int newHeight) {
		ImageIcon icon = imgIcon;
		try {
			Image img = icon.getImage();
			int height = icon.getIconHeight();
			int width = icon.getIconWidth();
			if (height > newHeight) {
			height = newHeight;
			}
			if (width > newWidth) {
			width = newWidth;
			}
			
			img = img.getScaledInstance( newWidth, newHeight,  Image.SCALE_AREA_AVERAGING);
			icon = new ImageIcon( img );
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return icon;
	}



	protected static ImageIcon imgRescale(ImageIcon imgIcon, int boundaryWidth, int boundaryHeight) {
		ImageIcon icon = imgIcon;
		try {
			Image img = icon.getImage();
			int originalHeight = icon.getIconHeight();
			int originalWidth = icon.getIconWidth();
			int newWidth = originalWidth;
			int newHeight = originalHeight;
		
	
			// first check if we need to scale width
		    if (originalWidth > boundaryWidth) {
		        //scale width to fit
		        newWidth = boundaryWidth;
		        //scale height to maintain aspect ratio
		        newHeight = (newWidth * originalHeight) / originalWidth;
		    }
	
		    // then check if we need to scale even with the new height
		    if (newHeight > boundaryHeight) {
		        //scale height to fit instead
		        newHeight = boundaryHeight;
		        //scale width to maintain aspect ratio
		        newWidth = (newHeight * originalWidth) / originalHeight;
		    }
			img = img.getScaledInstance( newWidth, newHeight,  Image.SCALE_AREA_AVERAGING);
			icon = new ImageIcon( img );
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return icon;
	}
	


	/**
	 * @param sourceImage the main image to be converted to have a circled image using g2d and BufferedImage
	 *
	 * @return masked 
	 * 		as an IconImage for the Jlabel
	 * 
	 * @see this Stackoverflow query about this topic here: 
	 * 		(for converting Image for BufferImaged) https://stackoverflow.com/questions/13605248/java-converting-image-to-bufferedimage#13605411
	 * 		(for making Circled image itself) https://stackoverflow.com/questions/31423130/how-to-make-circle-image-label-in-java
	 */
	protected static ImageIcon imgCircle(ImageIcon sourceImage) {
		
		Image master = sourceImage.getImage();

	    int diameter = Math.min(master.getWidth(null), master.getHeight(null));
	    BufferedImage mask = new BufferedImage(master.getWidth(null), master.getHeight(null), BufferedImage.TYPE_INT_ARGB);

	    Graphics2D g2d = mask.createGraphics();
	    applyQualityRenderingHints(g2d);
	    g2d.fillOval(0, 0, diameter - 1, diameter - 1);
	    g2d.dispose();

	    BufferedImage masked = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
	    g2d = masked.createGraphics();
	    applyQualityRenderingHints(g2d);
	    int x = (diameter - master.getWidth(null)) / 2;
	    int y = (diameter - master.getHeight(null)) / 2;
	    g2d.drawImage(master, x, y, null);
	    g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.DST_IN));
	    g2d.drawImage(mask, 0, 0, null);
	    g2d.dispose();
		
	   
		return new ImageIcon(masked);
		
	}

	
	/**
	 * @param g2d for the imgCircle function to apply quality rendering
	 * 
	 * @see also the link for here: 
	 * 			https://stackoverflow.com/questions/31423130/how-to-make-circle-image-label-in-java
	 */
	private static void applyQualityRenderingHints(Graphics2D g2d) {
		// TODO Auto-generated method stub
		g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
		g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
		g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
	}
}