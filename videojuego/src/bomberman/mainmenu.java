package bomberman;

import java.awt.Dimension;

import Core.Field;
import Core.Window;
/**
 * Bomberman Videojuego
 * Controles: 
 * 	Movimiento : WASD
 * 	Bomba : V 
 * 	Bomba Control Remoto(item): E
 * @author ToniLR
 *
 */
public class mainmenu {

	static Field f = new Field();
	static Window w = WindowSingleton.getWindowSingleton(f);
	static mapa map = new mapa();
	static boolean levels = false;

	public static void main(String[] args) throws InterruptedException {

		map.initmenu(f);
		f.draw(map.botones);

		while (true) {

			inputs();

		}

	}

	/**
	 * Utilidades de cada boton del menu principal
	 * 
	 * @throws InterruptedException
	 */
	public static void inputs() throws InterruptedException {

		int x = f.getCurrentMouseX();
		int y = f.getCurrentMouseY();

		if (map.botones.get(0).collidesWithPoint(x, y)) {

			lvl1.main(null);

		}
		if (map.botones.get(1).collidesWithPoint(x, y)) {
			if (levels) {
				Level2.main(null);
			} else {
				f.removeAll();
				for (int i = 0; i < map.botones.size(); i++) {
					map.botones.remove(i);
				}
				map.levels(f);
				f.draw(map.botones);
				levels = true;
			}

		}

		if (map.botones.get(2).collidesWithPoint(x, y)) {

			if (levels) {
				f.removeAll();
				for (int i = 0; i < map.botones.size(); i++) {
					map.botones.remove(i);
				}
				map.initmenu(f);
				f.draw(map.botones);
				levels = false;
			} else {
				w.hide();
			}

		}

	}

}
