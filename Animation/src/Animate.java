import javax.swing.*;
import java.awt.*;

final public class Animate {

	JFrame frame;
    DrawPanel drawPanel;

    public static void main(String[] args) {
        new Animate().go();
    }

    int counter = 0;

    Hat hat = new Hat(240, 3);
    Arm arms = new Arm();
    
    private void go() {
        frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawPanel = new DrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(400, 400);
        frame.setLocation(375, 55);
        animateStuff();
    }

    class DrawPanel extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = -3030379568821478211L;
		
		public void paintComponent(Graphics g) {
        	Background bg = new Background(this.getWidth(), this.getHeight());
        	bg.draw(g);
            hat.draw(g);
            arms.draw(g);
            new Chef().draw(g);
		}
    }
    
    private void animateStuff() {
        while(true){
            try{
            	counter++;
            	hat.moveLoc(counter);
            	arms.moveLoc(counter);
            	
            	//System.out.println("test");
            	Thread.sleep(1);
            } catch (Exception exc){}
            frame.repaint();
        }
    }    
}



