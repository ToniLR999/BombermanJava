package bomberman;

import Core.Sprite;

public class bloques extends Sprite{

	/**
	 * Bloques que forman parte del mapa y no se destruyen 
	 * @author ToniLR
	 * @param name
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param path
	 */
	public bloques(String name, int x1, int y1, int x2, int y2, String path) {
		super(name, x1, y1, x2, y2, path);
		// TODO Auto-generated constructor stub
		terrain = true;
	}

	
}
