
import java.awt.*;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Pintar extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		this.setBackground(Color.WHITE);
		
		g.fillRect(15, 24, 35, 45);
		
		
	}
	
	
}
