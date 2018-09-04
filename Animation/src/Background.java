import java.awt.Color;
import java.awt.Graphics;

public class Background {
	int width;
	int height;
	public Background(int w, int h) {
		width = w;
		height = h;
	}
	public Graphics draw(Graphics g) {
		//White Border
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, width, height);
        //Black Border
        g.setColor(Color.BLACK);
        g.fillRect(3, 3, width-6, height-6);
        //Inside Color
        g.setColor(Color.BLACK);
        g.fillRect(6, 6, width-10, height-10);
        return g;
		
	}
}
