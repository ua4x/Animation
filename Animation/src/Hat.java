import java.awt.Color;
import java.awt.Graphics;

public class Hat implements Movement{
    
	public static final String checkBounds = null;
	
	public int oneX = 200; // Starting X coordinate
    public int oneY = 40; // Starting Y coordinate
	
	
	boolean up = false;
    boolean down = false;
    boolean left = false;
    boolean right = false;
    
	
    public Hat(int i, int direction) {
    	checkBounds(i, direction); 	  	
    }
    
    public int getOneX(){
    	return oneX;
    }
    
    public int getOneY() {
    	return oneY;
    }
    
    public void setOneX(int x) {
    	oneX = x;    	
    }
    
    public void setOneY(int y) {
    	oneY = y; 
    }
    
    public void checkBounds(int i, int direction){
    	if(direction == 0 || oneX >= i){
            left = true;
        }
    	if(direction == 1 || oneX <= i){
            right = true;
        }
    	if(direction == 2 || oneY >= i){
            up = true;
        }
    	if(direction == 3 || oneY <= i){
            down = true;
    	}else if(direction == 3 || oneY >= i){
            down = false;
        }	
    }
    
    
    public void moveLoc(int counter){
    	checkBounds(195, 3);
    	if (counter % 5 == 0) {
    		if(up){
                oneY--;
            }
            if(down){
                oneY++;
            }
            if(left){
                oneX--;
            }
            if(right){
                oneX++;
            }
    	}
    	
    }
    public Graphics draw(Graphics g) {
    	//Dot
        g.setColor(Color.WHITE);
        //g.fillRect(oneX, oneY, 5, 5); // This is the dot
        g.fillRect(getOneX() + 13, getOneY() - 10, 10, 10);
        g.fillRect(getOneX() - 13, getOneY() - 10, 15, 10);
        g.fillRect(getOneX() - 5, getOneY() - 15, 20, 30);
        
        //chef hat
    	g.setColor(Color.WHITE);
     	g.fillArc(getOneX() - 5, getOneY() - 20, 20, 20, 0, 180);
     	g.fillArc(getOneX() - 15, getOneY() - 15, 20, 20, 90, 180);
     	g.fillArc(getOneX() + 5, getOneY() - 15, 20, 20, 90, -180);
     	return g;
    }
}
