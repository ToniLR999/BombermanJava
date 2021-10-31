package bomberman;

import java.util.ArrayList;
import java.util.Random;

import Core.Sprite;

public class item extends Sprite {

	/**
	 * Lista donde estan todos los items
	 */
	static ArrayList<Sprite> items = new ArrayList<Sprite>();

	/**
	 * Boolean que determina si al romperse un obstaculo dropea item o no
	 */
	static boolean drop = false;

	/**
	 * Numero maximo de items durante un nivel
	 */
	static int c;

	static explosiones e = new explosiones(null, 0, 0, 0, 0, null);

	/**
	 * Sprite de los items del juego que aparecen aleatoriamente al destruir un
	 * obstaculo
	 * 
	 */
	public item(String name, int x1, int y1, int x2, int y2, String path) {
		super(name, x1, y1, x2, y2, path);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Funcion para crear los items y determinar que item dropea en caso de dropear
	 * 
	 * @author ToniLR
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public static void crearitems(int x1, int y1, int x2, int y2) {

		Random r = new Random();
		drop = r.nextBoolean();

		if (c == 5) {

			drop = false;
		}

		if (drop) {

			int a = r.nextInt(101);

			if (a > 0 && a <= 25) {

				Item1(x1, y1, x2, y2);
				c++;
				drop = false;

			} else if (a > 25 && a <= 50) {
				Item5(x1, y1, x2, y2);
				c++;
				drop = false;
			} else if (a > 50 && a <= 75) {

				Item2(x1, y1, x2, y2);
				c++;
				drop = false;
			} else if (a > 75 && a <= 90) {

				Item3(x1, y1, x2, y2);
				c++;
				drop = false;
			} else if (a > 90 && a <= 98) {
				Item4(x1, y1, x2, y2);
				c++;
				drop = false;
			} else if (a > 98) {
				Item6(x1, y1, x2, y2);
				c++;
				drop = false;
			}

		}
	}
/**
 * Da mas velocidad al personaje 
 * @param x1
 * @param y1
 * @param x2
 * @param y2
 */
	public static void Item1(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub

		item a = new item("a", x1, y1, x2, y2, "Skate.png");
		items.add(a);
	}
/**
 * Da mas rango de explosion a la bomba 
 * @param x1
 * @param y1
 * @param x2
 * @param y2
 */
	public static void Item2(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub

		item b = new item("b", x1, y1, x2, y2, "Fire.png");
		items.add(b);
	}
/**
 * Da una vida mas al personaje
 * @param x1
 * @param y1
 * @param x2
 * @param y2
 */
	public static void Item3(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub

		item c = new item("c", x1, y1, x2, y2, "1-Up.png");
		items.add(c);
	}
/**
 * Hace al personaje invencible durante un corto tiempo
 * @param x1
 * @param y1
 * @param x2
 * @param y2
 */
	public static void Item4(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub

		item d = new item("d", x1, y1, x2, y2, "invincible.png");
		items.add(d);
	}
/**
 * Reduce la velocidad del personaje
 * @param x1
 * @param y1
 * @param x2
 * @param y2
 */
	public static void Item5(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub

		item e = new item("e", x1, y1, x2, y2, "geta.png");
		items.add(e);
	}
/**
 * Activa el control remoto de la bomba haciendo que esta no explote sin usar 'e'
 * @param x1
 * @param y1
 * @param x2
 * @param y2
 */
	public static void Item6(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub

		item f = new item("f", x1, y1, x2, y2, "bombaremota.png");
		items.add(f);
	}
}
