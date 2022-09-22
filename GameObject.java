
import java.awt.Point;
public abstract class GameObject extends Point{
	long lastMoveTime = -1;
	
	public GameObject() {
		super();
	
	}
	public GameObject(int x, int y)
	{
		super(x,y);
	}

	
}
