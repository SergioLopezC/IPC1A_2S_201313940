import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Canvas extends JPanel{

	private static final long serialVersionUID = 1L;

	WallJump wall=new WallJump();
	
	public Canvas(){
		
	}

 	public void paint(Graphics g) {
  		 update(g);	
  		 g.setColor(Color.darkGray);
		 g.fillRect(0, 0, getSize().width, getSize().height);	
		 wall.Draw(g);
		 repaint();
 	}
	
 	public void update (Graphics g){	
		 wall.Update();
	 }

}
