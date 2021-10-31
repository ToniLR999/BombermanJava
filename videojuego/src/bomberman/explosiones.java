package bomberman;

import java.util.ArrayList;

import Core.Field;
import Core.Sprite;

public class explosiones extends Sprite {

	/**
	 * Sprites de la explosion que produce la bomba tanto en el eje de la X y de la
	 * Y
	 */
	static explosiones explosionx = new explosiones("explosionx", 0, 50, 220, 100, "x.jpg");
	static explosiones explosiony = new explosiones("explosiony", 50, 0, 120, 200, "y.jpg");

	/**
	 * Boolean que se activa si las tres banderas del mapa se destruyen
	 */
	static boolean puntos = false;

	/**
	 * Numero de banderas del juego destruidas
	 */
	static int pts = 0;

	/**
	 * Sprite de las explosiones de la bomba
	 * 
	 * @param name x1 y1 x2 y2 path
	 */

	public explosiones(String name, int x1, int y1, int x2, int y2, String path) {
		super(name, x1, y1, x2, y2, path);
		// TODO Auto-generated constructor stub

	}

	/**
	 * Funcion que da funcionamiento a la explosion de la bomba Sirve para limitar
	 * el rango y para eliminar sprites con los que la explosion colisione
	 * 
	 * @param acc2
	 * @param f
	 */
	public void explosion(int acc2, Field f) {

		lvl1.f = f;

		if (personaje.fire) {

			explosionx.x1 = lvl1.bomba.x1 - 200;
			explosionx.y1 = lvl1.bomba.y1;
			explosionx.x2 = lvl1.bomba.x2 + 200;
			explosionx.y2 = lvl1.bomba.y2;

			explosiony.y1 = lvl1.bomba.y1 - 200;
			explosiony.x1 = lvl1.bomba.x1;
			explosiony.y2 = lvl1.bomba.y2 + 200;
			explosiony.x2 = lvl1.bomba.x2;

		} else {
			explosionx.x1 = lvl1.bomba.x1 - 150;
			explosionx.y1 = lvl1.bomba.y1;
			explosionx.x2 = lvl1.bomba.x2 + 150;
			explosionx.y2 = lvl1.bomba.y2;

			explosiony.y1 = lvl1.bomba.y1 - 150;
			explosiony.x1 = lvl1.bomba.x1;
			explosiony.y2 = lvl1.bomba.y2 + 150;
			explosiony.x2 = lvl1.bomba.x2;
		}

		/**
		 * COLISIONES DE LA BOMBA CON LOS BLOQUES GRISES
		 * 
		 * @author ToniLR
		 */
		boolean x = false;
		boolean y = false;

		if (explosiony.collidesWithList(mapa.bloques).size() > 0 && explosionx.collidesWithList(mapa.bloques).size() > 0
				&& ((lvl1.pj.isOnCeiling(f) || Level2.pj.isOnCeiling(f))
						|| (lvl1.pj.isGrounded(f) || Level2.pj.isGrounded(f)))) {

			y = true;

		} else if (explosiony.collidesWithList(mapa.bloques).size() > 0
				&& (lvl1.pj.isOnColumn(f) || Level2.pj.isOnColumn(f)) && x == false
				&& explosionx.collidesWithList(mapa.bloques).size() > 0) {

			x = true;
		} else if (explosiony.collidesWithList(mapa.bloques).size() > 0 && x == false) {

			y = true;
		} else if (explosiony.collidesWithList(mapa.bloques).size() > 0
				&& ((lvl1.pj.isGrounded(f) || Level2.pj.isGrounded(f))
						&& (lvl1.pj.collidesWithList(mapa.obstaculos).size() > 0
								|| Level2.pj.collidesWithList(mapa.obstaculos).size() > 0)
						|| (lvl1.pj.isOnCeiling(f) || Level2.pj.isOnCeiling(f))
								&& (lvl1.pj.collidesWithList(mapa.obstaculos).size() > 0
										|| Level2.pj.collidesWithList(mapa.obstaculos).size() > 0))) {

			y = false;
		}

		else if (explosiony.collidesWithList(mapa.bloques).size() > 0
				&& ((lvl1.pj.isGrounded(f) || Level2.pj.isGrounded(f))
						|| (lvl1.pj.isOnCeiling(f) || Level2.pj.isOnCeiling(f)))) {

			y = true;
		}
// X------------------------------------------------X--------------------------------------------------------X-------------------------------------------X----------------X--------
		if (explosionx.collidesWithList(mapa.bloques).size() > 0 && y == false && x == false) {

			x = true;
		} else if (explosionx.collidesWithList(mapa.bloques).size() > 0
				&& (lvl1.pj.isOnColumn(f) || Level2.pj.isOnColumn(f))
				&& ((lvl1.pj.collidesWithList(mapa.bloques).size() > 0
						|| Level2.pj.collidesWithList(mapa.bloques).size() > 0)
						|| (lvl1.pj.collidesWithList(mapa.obstaculos).size() > 0
								|| Level2.pj.collidesWithList(mapa.obstaculos).size() > 0))) {

			x = true;
		}

		else if (explosionx.collidesWithList(mapa.bloques).size() > 0
				&& (lvl1.pj.isOnColumn(f) || Level2.pj.isOnColumn(f))
				&& (lvl1.pj.collidesWithList(mapa.obstaculos).size() > 0
						|| Level2.pj.collidesWithList(mapa.obstaculos).size() > 0)) {

			x = false;
		}

		if (y) {

			if (personaje.fire) {
				explosiony.y1 = lvl1.bomba.y1 + 160;
				explosiony.y2 = lvl1.bomba.y2 - 160;

			} else {
				explosiony.y1 = lvl1.bomba.y1 + 110;
				explosiony.y2 = lvl1.bomba.y2 - 110;
			}

		}
		if (x) {

			if (personaje.fire) {

				explosionx.x1 = lvl1.bomba.x1 + 150;
				explosionx.x2 = lvl1.bomba.x2 - 150;

			} else {

				explosionx.x1 = lvl1.bomba.x1 + 100;
				explosionx.x2 = lvl1.bomba.x2 - 100;

			}

		}

		y = false;
		x = false;

		/**
		 * Listas que añaden los elementos de las listas obstaculos y enemigos si
		 * colisionan con sprite explosiony o explosionx para luego borrarlas con un for
		 * que lea la lista
		 *
		 *
		 */
		ArrayList<Sprite> exlist = explosionx.collidesWithList(mapa.obstaculos);
		ArrayList<Sprite> exlisty = explosiony.collidesWithList(mapa.obstaculos);
		ArrayList<Sprite> exlistenemigos = explosiony.collidesWithList(enemigo.enemigos);
		ArrayList<Sprite> exlistenemigos2 = explosionx.collidesWithList(enemigo.enemigos);

		ArrayList<Sprite> puntosx = explosionx.collidesWithList(mapa.puntos);
		ArrayList<Sprite> puntosy = explosiony.collidesWithList(mapa.puntos);

		// bucle para crear el item y ponerle la posicion respecto al obstaculos
		// destruido que dropeara
		for (int i = 0; i < mapa.obstaculos.size(); i++) {
			if (mapa.obstaculos.get(i).collidesWith(explosionx)) {
				item.crearitems(mapa.obstaculos.get(i).x1 + 25, mapa.obstaculos.get(i).y1 + 20,
						mapa.obstaculos.get(i).x2 - 25, mapa.obstaculos.get(i).y2 - 20);

			} else if (mapa.obstaculos.get(i).collidesWith(explosiony)) {
				item.crearitems(mapa.obstaculos.get(i).x1 + 25, mapa.obstaculos.get(i).y1 + 20,
						mapa.obstaculos.get(i).x2 - 25, mapa.obstaculos.get(i).y2 - 20);

			}
		}

		for (Sprite s : exlist) {

			s.delete();

		}
		for (Sprite s2 : exlisty) {

			s2.delete();

		}

		for (Sprite s3 : exlistenemigos) {

			s3.delete();

		}

		for (Sprite s4 : exlistenemigos2) {

			s4.delete();

		}
		if (puntosx.size() > 0 && puntosy.size() > 0) {

			for (Sprite s5 : puntosx) {

				s5.delete();

			}

			for (Sprite s6 : puntosy) {

				s6.delete();

			}
			pts++;
		} else {

			for (Sprite s5 : puntosx) {

				s5.delete();
				pts++;

			}

			for (Sprite s6 : puntosy) {

				s6.delete();

				pts++;
			}

		}

		// si las 3 banderas estan rotas puntos es true

		if (pts == 3) {
			puntos = true;

		}

	}
}
