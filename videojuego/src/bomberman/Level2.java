package bomberman;

import java.awt.Window;
import java.util.ArrayList;

import Core.Field;
import Core.Sprite;

public class Level2 {

	static Window w = WindowSingleton.getWindowSingleton(lvl1.f);
	static explosiones e = new explosiones(null, 0, 0, 0, 0, null);
	static mapa map = new mapa();
	static enemigo enemies = new enemigo(null, 0, 0, 0, 0, null, 0);

	/**
	 * Personaje principal del juego que es bomberman
	 *
	 */
	static personaje pj = personaje.getInstance("bomberman", 60, 60, 120, 100, "bomberman.jpg");
	/**
	 * Boolean que se acddtiva cuando presionas 'V' y muestra la bomba
	 */
	static boolean bomb = false;

	/**
	 * Boolean que se activa cuando se borra la bomba despues de un tiempo pasado
	 * tras aparecer
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

	public static void main(String[] args) throws InterruptedException {

		lvl1.w.setExtendedState(lvl1.w.MAXIMIZED_BOTH);

		explosiones.puntos = false;

		boolean flag = false;
		e.pts = 0;
		pj.vidas = 0;
		int acc2 = 0;
		int acc = 0;
		int acc3 = 0;

		enemigo.enemigos.clear();

		enemies.init2(lvl1.f);
		map.createmap2(lvl1.f);

		while (!flag) {
			lvl1.w.setExtendedState(lvl1.w.MAXIMIZED_BOTH);

			// mover bomberman
			input();
			enemigo.MovEnemigos2(lvl1.f, enemies);
			pj.efectositems();

			findejuego(explosiones.puntos);

			if (bomb) {
				acc++;
			}
			if (pj.invencible) {

				acc3++;
			}
			// con el item de bomba de control remoto tienes que darle a la tecla 'e' para
			// que explote la bomba
			if (pj.remota && bomb == true) {
				if (lvl1.w.getPressedKeys().contains('e')) {

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
			if (acc3 == 100) {

				pj.invencible = false;

				acc3 = 0;
			}

			if (explosion) {

				acc2++;

				e.explosion(acc2, lvl1.f);

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
	 * Funcion para generar movimiento del personaje
	 * 
	 * @throws InterruptedException
	 * 
	 */
	static void input() throws InterruptedException {

		// System.out.println(pj.x1 + " " + pj.y1 + " " + pj.x2 + " " + pj.y2);

		// bomba
		if (((Core.Window) w).getKeysDown().contains('v') && bomb == false && explosion == false) {
			// creas una bomba todo el rato porque luego en el if acc==50 la borras
			bomba = new bomba("bomba", 50, 50, 120, 100, "bomba.jpg");
			bomba.x1 = pj.x1;
			bomba.x2 = pj.x2;
			bomba.y1 = pj.y1;
			bomba.y2 = pj.y2;
			lvl1.bomba.x1 = bomba.x1;
			lvl1.bomba.x2 = bomba.x2;
			lvl1.bomba.y1 = bomba.y1;
			lvl1.bomba.y2 = bomba.y2;

			bomb = true;

		}

		if (((Core.Window) w).getPressedKeys().contains('d')) {
			pj.moveDer(lvl1.f);
			pj.changeImage("moveright.gif");
		}
		if (((Core.Window) w).getPressedKeys().contains('a')) {
			pj.moveIzq(lvl1.f);
			pj.changeImage("moveleft.gif");
		}
		if (((Core.Window) w).getPressedKeys().contains('w')) {
			pj.moveArr(lvl1.f);
			pj.changeImage("moveback.gif");
		}
		if (((Core.Window) w).getPressedKeys().contains('s')) {
			pj.moveAba(lvl1.f);
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
		sp.addAll(enemigo.enemigos);

		if (explosion) {

			sp.add(explosiones.explosionx);
			sp.add(explosiones.explosiony);
		}

		sp.addAll(map.sprites);
		sp.addAll(mapa.obstaculos);
		sp.addAll(mapa.bloques);
		sp.addAll(mapa.puntos);
		sp.addAll(item.items);

		if (explosiones.puntos) {
			sp.addAll(map.puertas);

		}

		if (bomb) {
			sp.add(bomba);

		}
		int total = 3;
		int restante = total - e.pts;
		marcadores m = new marcadores("banderasrestantes", 30, 0, 40, 20, "Banderas restantes: " + restante);
		sp.add(m);
		m.textColor = 0xFFFFF;

		marcadores vidas = new marcadores("banderasrestantes", 1700, 0, 1800, 20, "Vidas restantes: " + (pj.vidas + 1));
		sp.add(vidas);
		vidas.textColor = 0xFFFFF;

		lvl1.f.draw(sp);

	}

	/**
	 * Funcion que sirve para simular la muerte del bomberman si un enemigo impacta
	 * con el
	 * 
	 * @throws InterruptedException
	 * @author ToniLR
	 */
	public static void findejuego(boolean puntos) throws InterruptedException {

		explosiones.puntos = puntos;

		if (pj.collidesWithList(enemigo.enemigos).size() > 0 && pj.invencible == false) {

			if (personaje.vidas > 0) {
				personaje.restarvida();

			} else if (personaje.vidas == 0) {
				pj.delete();
				Thread.sleep(300);

				w.hide();
				System.out.println("HAS PERDIDO PLEB");
			}

		}
		if (explosion == true) {

			if ((pj.collidesWith(explosiones.explosionx) || pj.collidesWith(explosiones.explosiony))
					&& pj.invencible == false) {

				if (personaje.vidas > 0) {
					personaje.restarvida();
				} else if (personaje.vidas == 0) {
					pj.delete();
					Thread.sleep(300);

					w.hide();
					System.out.println("HAS PERDIDO PLEB");
				}

			}
		}

		if (puntos == true && pj.collidesWith(map.puertas.get(0))) {

			Thread.sleep(500);
			w.hide();

			System.out.println("HAS GANADO ERES BUENISIMO");

		}

	}
}
