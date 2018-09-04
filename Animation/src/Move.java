
public class Move {
    
	public static String checkBounds = null;
	
	public int oneX = 200; // Starting X coordinate
    public int oneY = 40; // Starting Y coordinate
	
	
	boolean up = false;
    boolean down = false;
    boolean left = false;
    boolean right = false;
    
	
    public Move(int i, int direction) {
    	checkBounds(i, direction);
    	moveLoc(); 	  	
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
    
    
    public void moveLoc(){
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
