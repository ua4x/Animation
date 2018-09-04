import javax.swing.*;
import java.awt.*;

final public class Animate {

	JFrame frame;
    DrawPanel drawPanel;

    public static void main(String[] args) {
        new Animate().go();
    }

    int counter = 0;
    int armOffset = 0;
    int armBounds = 5; // Total will be 2x
    boolean armUp = true;
    
    private void go() {
        frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawPanel = new DrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(400, 400);
        frame.setLocation(375, 55);
        moveDot();
    }

    class DrawPanel extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = -3030379568821478211L;
		
		public void paintComponent(Graphics g) {
        	//White Border
            g.setColor(Color.GREEN);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            //Black Border
            g.setColor(Color.BLACK);
            g.fillRect(3, 3, this.getWidth()-6, this.getHeight()-6);
            //Inside Color
            g.setColor(Color.BLACK);
            g.fillRect(6, 6, this.getWidth()-10, this.getHeight()-10);
            
            //Dot
            g.setColor(Color.WHITE);
            //g.fillRect(oneX, oneY, 5, 5); // This is the dot
            g.fillRect(dot.getOneX() + 13, dot.getOneY() - 10, 10, 10);
            g.fillRect(dot.getOneX() - 13, dot.getOneY() - 10, 15, 10);
            g.fillRect(dot.getOneX() - 5, dot.getOneY() - 15, 20, 30);
            
            //chef hat
        	g.setColor(Color.WHITE);
         	g.fillArc(dot.getOneX() - 5, dot.getOneY() - 20, 20, 20, 0, 180);
         	g.fillArc(dot.getOneX() - 15, dot.getOneY() - 15, 20, 20, 90, 180);
         	g.fillArc(dot.getOneX() + 5, dot.getOneY() - 15, 20, 20, 90, -180);
         	
         	
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
         	
         	//arms
         	//left arm
         	g.setColor(Color.WHITE);
         	g.fillRect(230, 245 + armOffset, 22, 11);
         	g.fillRect(250, 220 + armOffset, 9, 33);
         	
         	//right arm
         	g.fillRect(145, 245 + armOffset, 22, 11);
         	g.fillRect(140, 220 + armOffset, 9, 33);
         	
         	//body
            g.setColor(Color.WHITE);
            g.fillRect(160, 245, 80, 30);
         	
            //buttons
         	g.setColor(new Color(165, 42, 42));
         	g.fillRect(180, 250, 8, 8);
         	g.fillRect(210, 250, 8, 8);
         	g.fillRect(180, 265, 8, 8);
         	g.fillRect(210, 265, 8, 8);

		}

       }
    
    Move dot = new Move(240, 3);
    
    
    private void moveDot() {
        while(true){
            try{
            	counter++;
            	dot.checkBounds(195, 3);
            	if (counter % 5 == 0) {
            		dot.moveLoc();
            	}
            	
            	if (counter % 25 == 0) {
            		moveArm();
            	}
            	//System.out.println("test");
            	Thread.sleep(1);
            } catch (Exception exc){}
            frame.repaint();
        }
    }
    
    private void moveArm() {
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



