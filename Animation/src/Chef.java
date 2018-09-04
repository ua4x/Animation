import java.awt.Color;
import java.awt.Graphics;

public class Chef {
	public Graphics draw(Graphics g) {
     	//head
     	g.setColor(new Color(245,222,179));
     	g.fillRect(170, 210, 60, 30);
     	
     	//eyes
     	g.setColor(new Color(222,184,135));
     	g.fillRect(180, 220, 10, 10);
     	g.fillRect(210, 220, 10, 10);
     	
     	//cheeks
     	g.setColor(Color.WHITE);
     	g.fillRect(171, 230, 9, 9);
     	g.fillRect(221, 230, 9, 9);
     	
     	//neck
     	g.setColor(new Color(245,222,179));
     	g.fillRect(185, 240, 30, 5);
     	
     	//body
        g.setColor(Color.WHITE);
        g.fillRect(160, 245, 80, 30);
     	
        //buttons
     	g.setColor(new Color(165, 42, 42));
     	g.fillRect(180, 250, 8, 8);
     	g.fillRect(210, 250, 8, 8);
     	g.fillRect(180, 265, 8, 8);
     	g.fillRect(210, 265, 8, 8);
     	return g;
	}
}
