package bomberman;

import Core.Sprite;

public class obstaculos extends Sprite implements Destruible{

	/**
	 * Bloques destruibles con bombas
	 * 
	 * @author ToniLR
	 */
	public obstaculos(String name, int x1, int y1, int x2, int y2, String path) {
		super(name, x1, y1, x2, y2, path);
		// TODO Auto-generated constructor stub
		terrain = true;
	}

}
