import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class WinLogoButton extends JButton{
	
	public WinLogoButton(){
		super();
		try {
		    Image img = ImageIO.read(getClass().getResource("RushHourMeme2.jpg")); 
		    this.setIcon(new ImageIcon(img));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
	}

}
