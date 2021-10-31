package bomberman;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

import javax.swing.JFrame;

import Core.Field;
import Core.Sprite;
import Core.Window;

import bomberman.personaje;

/**
 * Bomberman Videojuego
 * 
 * @author ToniLR
 *
 */
public class lvl1 {

	static Field f = new Field();
	static Window w = WindowSingleton.getWindowSingleton(f);
	static explosiones e = new explosiones(null, 0, 0, 0, 0, null);
	static item items = new item(null, 0, 0, 0, 0, null);
	static mapa map = new mapa();
	static enemigo enemies = new enemigo(null, 0, 0, 0, 0, null, 0);

	/**
	 * Personaje principal del juego que es bomberman
	 *
	 */
	static personaje pj = personaje.getPersonaje("bomberman", 60, 60, 120, 100, "bomberman.jpg");

	/**
	 * Boolean que se acddtiva cuando presionas 'V' y muestra la bomba
	 */

	/**
	 * INTENTAR QUITARLA DE STATIC PASANDOLA A LA FUNCION INPUT
	 */
	static boolean bomb = false;

	/**
	 * Boolean que se activa cuando se borra la bomba despues de un tiempo pasado
	 * tras aparecer
	 */

	/**
	 * INTENTAR QUITARLA DE STATIC PASANDOLA A LA FUNCION INPUT
	 */
	static boolean explosion = false;

	/**
	 * arraylist donde estan todos los sprites imprimidos en el juego que se dibujan
	 * en la funcion draw()
	 */
	static ArrayList<Sprite> sp = new ArrayList<Sprite>();

	/**
	 * Bomba del juego
	 */
	static bomba bomba = new bomba("bomba", 50, 50, 120, 100, "bomba.jpg");

	/**
	 * Explosion de la bomba en direcion X
	 */

	/**
	 * Explosion de la bomba en direcion Y
	 */

	public static void main(String[] args) throws InterruptedException {

		w.setExtendedState(w.MAXIMIZED_BOTH);

		// contadores de tiempo para la explosion de la bomba y la eliminacion de los
		// sprites de explosion
		int acc2 = 0;
		int acc = 0;
		int acc3 = 0;

		enemies.init(f);
		map.createmap(f);

		while (true) {

			w.setExtendedState(w.MAXIMIZED_BOTH);
			// mover bomberman
			input();
			enemigo.MovEnemigos(f, enemies);
			pj.efectositems();

			findejuego(explosiones.puntos);
			// Si los 3 puntos estan destruidoss y el personaje colisiona con la puerta
			// cambia al nivel 2
			if (explosiones.puntos && pj.collidesWith(map.puertas.get(0))) {

				cleanup();
				sp.clear();
				explosiones.puntos = false;
				Level2.main(null);
				break;
			}

			if (bomb) {
				acc++;
			}
			if (pj.invencible) {

				acc3++;
			}
			// con el item de bomba de control remoto tienes que darle a la tecla 'e' para
			// que explote la bomba
			if (pj.remota && bomb == true) {
				if (w.getPressedKeys().contains('e')) {

					bomb = false;
					bomba.delete();

					explosion = true;

					acc = 0;

				}
			} else {
				if (acc == 50) {

					bomb = false;
					bomba.delete();

					explosion = true;

					acc = 0;

				}
			}
			// tiempo que da de invencibilidad el item
			if (acc3 == 100) {

				pj.invencible = false;

				acc3 = 0;
			}

			if (explosion) {

				acc2++;

				e.explosion(acc2, f);

				if (acc2 == 10) {
					explosion = false;
					acc2 = 0;
				}

			}

			// llama la funcion draw para que dibuje sp
			draw(sp);
			sp.clear();

			// pausas
			Thread.sleep(33);

		}

	}

	/**
	 * Funcion para limpiar todas las listas llamadas en main
	 */
	private static void cleanup() {
		// TODO Auto-generated method stub

		f.clear();
		sp.clear();
		enemies.enemigos.clear();
		map.sprites.clear();
		map.obstaculos.clear();
		map.bloques.clear();
		map.puntos.clear();
		items.items.clear();
		map.puertas.clear();

	}

	/**
	 * Funcion para generar movimiento del personaje
	 * 
	 * @throws InterruptedException
	 * 
	 */
	static void input() throws InterruptedException {

		// bomba
		if (w.getKeysDown().contains('v') && bomb == false && explosion == false) {
			// creas una bomba todo el rato porque al explotar la borras
			bomba = new bomba("bomba", 50, 50, 120, 100, "bomba.jpg");
			bomba.x1 = pj.x1;
			bomba.x2 = pj.x2;
			bomba.y1 = pj.y1;
			bomba.y2 = pj.y2;

			bomb = true;

		}

		if (w.getPressedKeys().contains('d')) {
			pj.moveDer(f);
			pj.changeImage("moveright.gif");
		}
		if (w.getPressedKeys().contains('a')) {
			pj.moveIzq(f);
			pj.changeImage("moveleft.gif");
		}
		if (w.getPressedKeys().contains('w')) {
			pj.moveArr(f);
			pj.changeImage("moveback.gif");
		}
		if (w.getPressedKeys().contains('s')) {
			pj.moveAba(f);
			pj.changeImage("movefront.gif");
		}

	}

	/**
	 * Dibuja los sprites que esten en arraylist "sp" aparte de todos los personajes
	 * y todos los objetos creados en mapa en una lista llamada "sprites" y
	 * "obstaculos"
	 * 
	 * @param sp
	 * 
	 */
	public static void draw(ArrayList<Sprite> sp) {

		sp.add(pj);
		sp.addAll(enemies.enemigos);

		if (explosion) {

			sp.add(explosiones.explosionx);
			sp.add(explosiones.explosiony);
		}

		sp.addAll(map.sprites);
		sp.addAll(map.obstaculos);
		sp.addAll(map.bloques);
		sp.addAll(map.puntos);
		sp.addAll(items.items);

		if (e.puntos) {
			sp.addAll(map.puertas);

		}

		if (bomb) {
			sp.add(bomba);

		}

		int total = 3;
		int restante = total - e.pts;
		marcadores m = new marcadores("banderasrestantes", 30, 0, 40, 20, "Banderas restantes: " + restante);
		sp.add(m);

		marcadores vidas = new marcadores("banderasrestantes", 1700, 0, 1800, 20, "Vidas restantes: " + (pj.vidas + 1));
		sp.add(vidas);

		f.draw(sp);

	}

	/**
	 * Funcion que sirve para simular la muerte del bomberman si un enemigo impacta
	 * con el
	 * 
	 * @throws InterruptedException
	 * @author ToniLR
	 */
	public static void findejuego(boolean puntos) throws InterruptedException {

		e.puntos = puntos;

		if (pj.collidesWithList(enemies.enemigos).size() > 0 && pj.invencible == false) {

			if (pj.vidas > 0) {
				pj.restarvida();

			} else if (pj.vidas == 0) {
				pj.delete();
				Thread.sleep(300);

				w.hide();
				System.out.println("HAS PERDIDO PLEB");
			}

		}
		if (explosion == true) {

			if ((pj.collidesWith(explosiones.explosionx) || pj.collidesWith(explosiones.explosiony))
					&& pj.invencible == false) {

				if (pj.vidas > 0) {
					pj.restarvida();
				} else if (pj.vidas == 0) {
					pj.delete();
					Thread.sleep(300);

					w.hide();
					System.out.println("HAS PERDIDO PLEB");
				}

			}
		}

	}

}
