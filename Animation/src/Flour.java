import java.awt.Color;
import java.awt.Graphics;

public class Flour implements Movement {
	public Graphics draw(Graphics g) 
    	g.setColor(Color.WHITE);
     	g.fillOval(getOneX() - 5, getOneY()) - 20, 20, 20, 0, 180);
     	g.fillArc(getOneX() - 15, getOneY() - 15, 20, 20, 90, 180);
     	g.fillArc(getOneX() + 5, getOneY() - 15, 20, 20, 90, -180);
        return g;

	}
}
