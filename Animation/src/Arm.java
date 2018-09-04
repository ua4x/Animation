import java.awt.Color;
import java.awt.Graphics;

public class Arm implements Movement{
    int armOffset = 0;
    int armBounds = 5; // Total will be 2x
    boolean armUp = true;

	public Graphics draw(Graphics g) {
		//left arm
     	g.setColor(Color.WHITE);
     	g.fillRect(230, 245 + armOffset, 22, 11);
     	g.fillRect(250, 220 + armOffset, 9, 33);
     	
     	//right arm
     	g.fillRect(145, 245 + armOffset, 22, 11);
     	g.fillRect(140, 220 + armOffset, 9, 33);
     	return g;
	}
	public void moveLoc(int counter) {
		if (counter % 25 == 0) {
			if(armUp){
	        	if (armOffset <= -armBounds) {
	        		armUp = false;
	        	}else {
	        		armOffset--;
	        	}
	        }else{
	        	if (armOffset >= armBounds) {
	        		armUp = true;
	        	}else {
	        		armOffset++;
	        	}
	        }
    	}
	}
    	
}
