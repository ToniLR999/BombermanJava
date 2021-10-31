package bomberman;

import Core.Sprite;

public class puntos extends Sprite implements Destruible{

	/**
	 * Los distintos puntos destruibles necesarios para conseguir avançar de nivel
	 * 
	 * @param name
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param path
	 */
	public puntos(String name, int x1, int y1, int x2, int y2, String path) {
		super(name, x1, y1, x2, y2, path);
		// TODO Auto-generated constructor stub
		terrain = true;
	}

}
