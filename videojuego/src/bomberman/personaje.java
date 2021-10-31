package bomberman;

import java.util.ArrayList;
import java.util.HashSet;

import Core.Field;
import Core.Sprite;
import Core.Window;

public class personaje extends Sprite {

	public static personaje instance = null;
	static int vidas = 0;
	static boolean fire = false;
	static boolean invencible = false;
	static boolean remota = false;
	private static personaje pj = null;

	/**
	 * Personaje principal del juego : Bomberman
	 * 
	 * @author ToniLR
	 */
	private personaje(String name, int x1, int y1, int x2, int y2, String path) {
		super(name, x1, y1, x2, y2, path);

	}

	public static personaje getInstance(String name, int x1, int y1, int x2, int y2, String path) {

		if (instance == null) {
			instance = new personaje(name, x1, y1, x2, y2, path);
		}
		return instance;
	}

	public static personaje getPersonaje(String name, int x1, int y1, int x2, int y2, String path) {
		// si pj es null
		if (pj == null) {
			// faras servir el constructor per a fer l'objecte
			// el pots fer servir perque es privat i estas dintre de la classe
			// al fer servir el consturctor pj deixa de ser null
			pj = new personaje(name, x1, y1, x2, y2, path);
		} else {
			// si ja existeix, tan sols actualitza les seves propietats
			pj.name = name;
			pj.x1 = x1;
			pj.x2 = x2;
			pj.y1 = y1;
			pj.y2 = y2;
			pj.path = path;
		}
		// retorna el personatge
		return pj;

	}

	// velocidad a la que avanzara posicion el personaje
	int vel = 11;

	/**
	 * Movimiento hacia la izquierda del personaje principal
	 * 
	 * @param f aka Field
	 */
	public void moveIzq(Field f) {

		x1 -= vel;
		x2 -= vel;
		// direccion='a';
		if (isOnColumn(f)) {

			getSided(f);

		}

	}

	/**
	 * Movimiento hacia la derecha del personaje principal
	 * 
	 * @param f aka Field
	 */
	public void moveDer(Field f) {
		// TODO Auto-generated method stub
		x1 += vel;
		x2 += vel;
		// direccion='d';
		if (isOnColumn(f)) {

			getSided(f);

		}
	}

	/**
	 * Movimiento hacia arriba del personaje principal
	 * 
	 * @param f aka Field
	 */
	public void moveArr(Field f) {
		y1 -= vel;
		y2 -= vel;
		// direccion='w';
		if (isOnCeiling(f)) {

			getCeiling(f);

		}

	}

	/**
	 * Movimiento hacia abajo del personaje principal
	 *
	 * @param f aka Field
	 */
	public void moveAba(Field f) {
		y1 += vel;
		y2 += vel;
		// direccion='s';
		if (isGrounded(f)) {

			getGrounded(f);

		}

	}

	/**
	 * Funcion para aplicar los efectos de cada item y restringir los usos de los
	 * items
	 * 
	 * @author ToniLR
	 */
	public void efectositems() {

		for (int i = 0; i < item.items.size(); i++) {
			if (lvl1.pj.collidesWith(item.items.get(i)) || Level2.pj.collidesWith(item.items.get(i))) {
				if (item.items.get(i).name.equals("a")) {
					item.items.get(i).delete();

					if (vel != 23) {
						vel = vel + 4;
					}

				} else if (item.items.get(i).name.equals("b")
						&& (fire == false || lvl1.pj.collidesWith(item.items.get(i)) && fire == true)) {

					item.items.get(i).delete();
					fire = true;

				} else if (item.items.get(i).name.equals("c")) {
					item.items.get(i).delete();
					if (vidas != 2) {
						vidas = vidas + 1;
					}

				} else if (item.items.get(i).name.equals("d")) {

					item.items.get(i).delete();
					invencible = true;
				} else if (item.items.get(i).name.equals("e")) {

					item.items.get(i).delete();
					vel = vel - 4;
				} else if (item.items.get(i).name.equals("f")) {

					item.items.get(i).delete();
					remota = true;
				}

			}
			// System.out.println(vidas);
		}
	}

	/**
	 * Funcion para el item c el qual añade una oportunidad de jugar mas en caso de
	 * morir En caso de morir retorna al personaje principal a la posicion inicial
	 * del nivel
	 * 
	 * @author ToniLR
	 */
	public static void restarvida() {

		if (vidas > 0) {

			lvl1.pj.x1 = 60;
			lvl1.pj.y1 = 60;
			lvl1.pj.x2 = 120;
			lvl1.pj.y2 = 100;

			vidas--;
		}
	}

}
