package bomberman;

import Core.Sprite;

public class marcadores extends Sprite {

	public marcadores(String name, int x1, int y1, int x2, int y2, String path) {
		super(name, x1, y1, x2, y2, path);
		this.text = true;
		this.unscrollable = true;
		this.textColor = 0x000000;
		// TODO Auto-generated constructor stub
	}

}
