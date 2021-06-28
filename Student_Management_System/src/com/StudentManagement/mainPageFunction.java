/**
 * This needs more image rescaling function for fixed ratio since the two can't handle it
 */
package com.StudentManagement;

import java.awt.Image;
import javax.swing.ImageIcon;

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
			img = img.getScaledInstance( width, height,  Image.SCALE_AREA_AVERAGING);
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
}