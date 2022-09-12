
public class GameInstance {

	public GamePanel gp;
	public GameFrame gf;
	
	public long time = 0;
	
	public GameInstance()
	{
		gp = new GamePanel();
		gf = new GameFrame();
		
		gf.add(gf);
	}
	
}
