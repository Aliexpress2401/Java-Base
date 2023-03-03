import java.net.URL;

import javax.swing.*;


public class MiaFinestra extends JFrame {
		public MiaFinestra() {
			setSize(300, 200);
			setLocation(300, 200);
			setResizable (false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			URL imageURL = getClass().getResource("img/icon.gif"); 
			ImageIcon image = new ImageIcon(imageURL);
			setIconImage(image.getImage());
			
			setLocationRelativeTo(null);
			
			setVisible(true);
		}
}
