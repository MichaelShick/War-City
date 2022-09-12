import javax.swing.*;

public class Main {
	static int fps = 60;
	public static void main(String[] args) {
		GameInstance gi= initGame();
		gameStart(gi);
	}

	private static void gameStart(GameInstance gi) {
			double drawinterval = 1000000000/fps;
			double delta = 0;
			long lastTime = System.nanoTime(),currentTime;
		
			currentTime = System.nanoTime();
			
			delta+= (currentTime -lastTime)/drawinterval;
			
			lastTime = currentTime;
			
			if(delta>=1)
			{
				update();
				gi.gp.repaint();
			}
	}
 
	private static void update() {
		// TODO Auto-generated method stub
		
	}

	private static GameInstance initGame() {
		GameInstance gi = new GameInstance();
		
		gi.gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gi.gf.setSize(250,250);
		gi.gf.setVisible(true);
		
		return gi;
	}

}
