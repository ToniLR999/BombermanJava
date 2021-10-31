package bomberman;

import Core.Sprite;

public class paredes extends Sprite {
	/**
	 * Paredes que establecen el limite del mapa
	 * 
	 * @param name x1 y1 x2 y2 path
	 */
	public paredes(String name, int x1, int y1, int x2, int y2, String path) {
		super(name, x1, y1, x2, y2, path);
		// TODO Auto-generated constructor stub
		terrain = true;

	}

}
