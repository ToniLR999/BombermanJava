package bomberman;

import java.util.ArrayList;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import Core.Field;
import Core.Sprite;

/**
 * Movimiento de los enemigos
 * 
 * @author ToniLR
 *
 */

public class enemigo extends Sprite {

	/**
	 * Arraylist donde estan todos los sprites de los enemigos que estan en el juego
	 */
	static ArrayList<Sprite> enemigos = new ArrayList<Sprite>();

	int status = 0;// 0 izq, 1 arriba, 2 der, 3 abajo

	/**
	 * Velocidad de los enemigos
	 */
	int vel = 13;

	/**
	 * Sprite de los enemigos
	 * 
	 * @param name
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param path
	 * @param direccion
	 */
	public enemigo(String name, int x1, int y1, int x2, int y2, String path, int direccion) {

		super(name, x1, y1, x2, y2, path);
		status = direccion;
		// TODO Auto-generated constructor stub

	}

	/**
	 * Funcion para crear los enemigos del nivel 1
	 * 
	 * @param f
	 */
	public void init(Field f) {

		enemigo enemy = new enemigo("enemigo1", 50, 923, 120, 973, "enemigo.jpg", 1);
		enemigo enemy2 = new enemigo("enemigo2", 1791, 50, 1861, 100, "enemigo.jpg", 0);
		enemigo enemy3 = new enemigo("enemigo3", 1603, 561, 1673, 611, "enemigo.jpg", 1);
		enemigo enemy4 = new enemigo("enemigo4", 460, 50, 530, 100, "enemigo.jpg", 0);
		enemigo enemy5 = new enemigo("enemigo5", 451, 573, 521, 623, "enemigo.jpg", 1);
		enemigo enemy6 = new enemigo("enemigo6", 1419, 937, 1489, 987, "enemigo.jpg", 0);
		enemigo enemy7 = new enemigo("enemigo7", 263, 235, 333, 285, "enemigo.jpg", 1);
		enemigo enemy8 = new enemigo("enemigo8", 1223, 393, 1293, 443, "enemigo.jpg", 1);
		enemigos.add(enemy);
		enemigos.add(enemy2);
		enemigos.add(enemy3);
		enemigos.add(enemy4);
		enemigos.add(enemy5);
		enemigos.add(enemy6);
		enemigos.add(enemy7);
		enemigos.add(enemy8);

	}

	/**
	 * Funcion para crear los enemigos del nivel 2
	 * 
	 * @param f
	 */
	public void init2(Field f) {

		enemigo enemy = new enemigo("enemigo1", 274, 521, 334, 561, "enemigo2.png", 1);
		enemigo enemy2 = new enemigo("enemigo2", 460, 521, 520, 561, "enemigo2.png", 1);
		enemigo enemy3 = new enemigo("enemigo3", 739, 62, 799, 102, "enemigo2.png", 0);
		enemigo enemy4 = new enemigo("enemigo4", 737, 742, 792, 782, "enemigo2.png", 0);
		enemigo enemy5 = new enemigo("enemigo5", 639, 932, 699, 972, "enemigo2.png", 0);
		enemigo enemy6 = new enemigo("enemigo6", 1800, 58, 1860, 98, "enemigo2.png", 0);
		enemigo enemy7 = new enemigo("enemigo7", 1800, 742, 1860, 782, "enemigo2.png", 0);
		enemigo enemy8 = new enemigo("enemigo8", 1606, 576, 1666, 616, "enemigo2.png", 1);
		enemigo enemy9 = new enemigo("enemigo9", 1414, 511, 1474, 551, "enemigo2.png", 1);
		enemigo enemy10 = new enemigo("enemigo10", 1789, 581, 1849, 621, "enemigo2.png", 1);
		enemigo enemy11 = new enemigo("enemigo11", 1800, 931, 1860, 971, "enemigo2.png", 0);

		enemigos.add(enemy);
		enemigos.add(enemy2);
		enemigos.add(enemy3);
		enemigos.add(enemy4);
		enemigos.add(enemy5);
		enemigos.add(enemy6);
		enemigos.add(enemy7);
		enemigos.add(enemy8);
		enemigos.add(enemy9);
		enemigos.add(enemy10);
		enemigos.add(enemy11);

	}

	/**
	 * Funcion para aplicar el rango de movimiento a los enemigos del nivel 1
	 * 
	 * @param f
	 * @param enemies
	 */
	public static void MovEnemigos(Field f, enemigo enemies) {
		((enemigo) enemies.enemigos.get(0)).moveHoryVer(f);
		((enemigo) enemies.enemigos.get(1)).moveHoryVerAbajo(f);
		((enemigo) enemies.enemigos.get(2)).moveVer(f);
		((enemigo) enemies.enemigos.get(3)).moveHor(f);
		((enemigo) enemies.enemigos.get(4)).moveVer(f);
		((enemigo) enemies.enemigos.get(5)).moveHoryVer(f);
		((enemigo) enemies.enemigos.get(6)).moveVer(f);
		((enemigo) enemies.enemigos.get(7)).moveVer(f);

	}

	/**
	 * Funcion para aplicar el rango de movimiento a los enemigos del nivel 2
	 * 
	 * @param f
	 * @param enemies
	 */
	public static void MovEnemigos2(Field f, enemigo enemies) {

		((enemigo) enemies.enemigos.get(0)).moveVer(f);
		((enemigo) enemies.enemigos.get(1)).moveVer(f);
		((enemigo) enemies.enemigos.get(2)).moveHor(f);
		((enemigo) enemies.enemigos.get(3)).moveHoryVer(f);
		((enemigo) enemies.enemigos.get(4)).moveHoryVer(f);
		((enemigo) enemies.enemigos.get(5)).moveHoryVerAbajo(f);
		((enemigo) enemies.enemigos.get(6)).moveHoryVer(f);
		((enemigo) enemies.enemigos.get(7)).moveVer(f);
		((enemigo) enemies.enemigos.get(8)).moveVer(f);
		((enemigo) enemies.enemigos.get(9)).moveVer(f);
		((enemigo) enemies.enemigos.get(10)).moveHor(f);

	}

	/**
	 * Movimiento de los enemigos horizontalmente
	 * 
	 * @author ToniLR
	 * @param f AKA Field
	 */
	// 0 izq, 1 arriba, 2 der, 3 abajo
	public void moveHor(Field f) {

		if (isOnColumn(f) && status == 0) {
			getSided(f);
			status = 2;
		} else if (isOnColumn(f) && status == 2) {
			getSided(f);

			status = 0;
		}

		if (status == 0) {
			x1 -= vel;
			x2 -= vel;
		} else if (status == 1) {
			y1 -= vel;
			y2 -= vel;

		} else if (status == 2) {
			x1 += vel;
			x2 += vel;
		} else if (status == 3) {

			y1 += vel;
			y2 += vel;

		}

	}

	/**
	 * Movimiento de los enemigos verticalmente
	 * 
	 * @author ToniLR
	 * @param f AKA Field
	 */
	// 0 izq, 1 arriba, 2 der, 3 abajo
	public void moveVer(Field f) {

		if (isOnCeiling(f)) {
			getCeiling(f);
			status = 3;

		}
		if (isGrounded(f)) {
			getGrounded(f);
			status = 1;

		}

		if (status == 0) {
			x1 -= vel;
			x2 -= vel;
		} else if (status == 1) {
			y1 -= vel;
			y2 -= vel;

		} else if (status == 2) {
			x1 += vel;
			x2 += vel;
		} else if (status == 3) {

			y1 += vel;
			y2 += vel;

		}

	}

	/**
	 * Movimiento horizontal que pasa a vertical para arriba
	 * 
	 * @author ToniLR
	 */
	// 0 izq, 1 arriba, 2 der, 3 abajo
	public void moveHoryVer(Field f) {

		Timer timer = new Timer();
		if (status == 0) {
			TimerTask task2 = new TimerTask() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					if (isOnColumn(f) && status == 0) {
						getSided(f);
						status = 1;
					}
				}

			};
			timer.schedule(task2, 175);
		}
		if (isOnCeiling(f) && status == 1) {
			getCeiling(f);
			status = 3;

		}

		if (isGrounded(f) && status == 3) {
			getGrounded(f);
			status = 2;
		}
		if (status == 2) {

			TimerTask task1 = new TimerTask() {

				@Override

				public void run() {
					// TODO Auto-generated method stub
					if (isOnColumn(f) && status == 2) {
						getSided(f);
						status = 0;

					}
				}

			};
			timer.schedule(task1, 1000);

		}

		if (status == 0) {
			x1 -= vel;
			x2 -= vel;
		} else if (status == 1) {
			y1 -= vel;
			y2 -= vel;

		} else if (status == 2) {
			x1 += vel;
			x2 += vel;
		} else if (status == 3) {

			y1 += vel;
			y2 += vel;

		}

	}

	/**
	 * Movimiento horizontal que pasa a vertical para abajo
	 * 
	 * @author ToniLR
	 */
	// 0 izq, 1 arriba, 2 der, 3 abajo
	public void moveHoryVerAbajo(Field f) {

		Timer timer = new Timer();
		if (status == 0) {
			TimerTask task2 = new TimerTask() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					if (isOnColumn(f) && status == 0) {
						getSided(f);
						status = 3;
					}
				}

			};
			timer.schedule(task2, 175);
		}
		if (isOnCeiling(f) && status == 1) {
			getCeiling(f);
			status = 2;

		}

		if (isGrounded(f) && status == 3) {
			getGrounded(f);
			status = 1;
		}
		if (status == 2) {

			TimerTask task1 = new TimerTask() {

				@Override

				public void run() {
					// TODO Auto-generated method stub
					if (isOnColumn(f) && status == 2) {
						getSided(f);
						status = 0;

					}
				}

			};
			timer.schedule(task1, 1000);

		}

		if (status == 0) {
			x1 -= vel;
			x2 -= vel;
		} else if (status == 1) {
			y1 -= vel;
			y2 -= vel;

		} else if (status == 2) {
			x1 += vel;
			x2 += vel;
		} else if (status == 3) {

			y1 += vel;
			y2 += vel;

		}

	}

}
