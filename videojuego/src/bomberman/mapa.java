package bomberman;

import java.awt.Color;
import java.util.ArrayList;

import Core.Field;
import Core.Sprite;

public class mapa {

	ArrayList<Sprite> sprites = new ArrayList<Sprite>();
	static ArrayList<Sprite> obstaculos = new ArrayList<Sprite>();
	static ArrayList<Sprite> puntos = new ArrayList<Sprite>();
	static ArrayList<Sprite> bloques = new ArrayList<Sprite>();
	ArrayList<Sprite> puertas = new ArrayList<Sprite>();
	static ArrayList<Sprite> botones = new ArrayList<Sprite>();

	/**
	 * Mapa del juego
	 * 
	 * @author ToniLR
	 * @param string
	 * @param i
	 * @param j
	 * @param k
	 * @param l
	 * @param string2
	 */
	public mapa(String string, int i, int j, int k, int l, String string2) {

	}

	/**
	 * Mapa del juego
	 */
	public mapa() {
		// TODO Auto-generated constructor stub

	}

	/**
	 * Funcion que crea todos los sprites que forman el mapa del nivel 1
	 * 
	 * @author ToniLR
	 */

	public void initmenu(Field f) {

		botones.clear();

		f.background = "fondomenu.jpg";

		botones play = new botones("play", 750, 250, 1150, 350, "botonjugar.png");
		botones.add(play);

		botones levels = new botones("niveles", 750, 450, 1150, 550, "selectlevels.png");
		botones.add(levels);

		botones quit = new botones("quit", 750, 650, 1150, 750, "botonquit.png");
		botones.add(quit);

		botones titulo = new botones("titulo", 660, 100, 1210, 200, "titulo.png");
		botones.add(titulo);

	}

	public void levels(Field f) {

		botones.clear();

		botones playl = new botones("boton lvl 1", 350, 250, 500, 350, "playlevels.png");
		botones.add(playl);

		botones playl1 = new botones("boton lvl 2", 600, 250, 750, 350, "playlevels.png");
		botones.add(playl1);

		botones volver = new botones("volver", 1750, 50, 1850, 150, "volver.png");
		botones.add(volver);
	}

	public void createmap(Field f) {

		sprites.clear();
		obstaculos.clear();
		bloques.clear();
		puertas.clear();
		puntos.clear();

		f.setBackground(new Color(5, 126, 66));

		// primera columna de bloques
		bloques bloque1 = new bloques("bloques1.1", 150, 120, 250, 220, "bloques.jpg");
		bloques.add(bloque1);
		bloques bloque11 = new bloques("bloques1.2", 150, 290, 250, 390, "bloques.jpg");
		bloques.add(bloque11);
		bloques bloque12 = new bloques("bloques1.3", 150, 460, 250, 560, "bloques.jpg");
		bloques.add(bloque12);
		bloques bloque13 = new bloques("bloques1.4", 150, 630, 250, 730, "bloques.jpg");
		bloques.add(bloque13);
		bloques bloque14 = new bloques("bloques1.5", 150, 800, 250, 900, "bloques.jpg");
		bloques.add(bloque14);

		// segunda columna de bloques

		bloques bloque21 = new bloques("bloques2.1", 340, 120, 440, 220, "bloques.jpg");
		bloques.add(bloque21);
		bloques bloque22 = new bloques("bloques2.2", 340, 290, 440, 390, "bloques.jpg");
		bloques.add(bloque22); // 260 , 310
		bloques bloque23 = new bloques("bloques2.3", 340, 460, 440, 560, "bloques.jpg");
		bloques.add(bloque23);
		bloques bloque24 = new bloques("bloques2.4", 340, 630, 440, 730, "bloques.jpg");
		bloques.add(bloque24); // 260 , 310
		bloques bloque25 = new bloques("bloques2.5", 340, 800, 440, 900, "bloques.jpg");
		bloques.add(bloque25);

		// tercera columna de bloques
		bloques bloque31 = new bloques("bloques3.1", 530, 120, 630, 220, "bloques.jpg");
		bloques.add(bloque31);
		bloques bloque32 = new bloques("bloques3.2", 530, 290, 630, 390, "bloques.jpg");
		bloques.add(bloque32);
		bloques bloque33 = new bloques("bloques3.3", 530, 460, 630, 560, "bloques.jpg");
		bloques.add(bloque33);
		bloques bloque34 = new bloques("bloques3.4", 530, 630, 630, 730, "bloques.jpg");
		bloques.add(bloque34);
		bloques bloque35 = new bloques("bloques3.5", 530, 800, 630, 900, "bloques.jpg");
		bloques.add(bloque35);
		// quarta columna de bloques
		bloques bloque41 = new bloques("bloques4.1", 720, 120, 820, 220, "bloques.jpg");
		bloques.add(bloque41);
		bloques bloque42 = new bloques("bloques4.2", 720, 290, 820, 390, "bloques.jpg");
		bloques.add(bloque42);
		bloques bloque43 = new bloques("bloques4.3", 720, 460, 820, 560, "bloques.jpg");
		bloques.add(bloque43);
		bloques bloque44 = new bloques("bloques4.2", 720, 630, 820, 730, "bloques.jpg");
		bloques.add(bloque44);
		bloques bloque45 = new bloques("bloques4.3", 720, 800, 820, 900, "bloques.jpg");
		bloques.add(bloque45);

		// quinta columna de bloques
		bloques bloque5 = new bloques("bloques5.1", 1110, 120, 1210, 220, "bloques.jpg");
		bloques.add(bloque5);
		bloques bloque51 = new bloques("bloques5.2", 1110, 290, 1210, 390, "bloques.jpg");
		bloques.add(bloque51);
		bloques bloque52 = new bloques("bloques5.3", 1110, 460, 1210, 560, "bloques.jpg");
		bloques.add(bloque52);
		bloques bloque53 = new bloques("bloques5.1", 1110, 630, 1210, 730, "bloques.jpg");
		bloques.add(bloque53);
		bloques bloque54 = new bloques("bloques5.2", 1110, 800, 1210, 900, "bloques.jpg");
		bloques.add(bloque54);

		// sexta columna de bloques
		bloques bloque6 = new bloques("bloques6.1", 1300, 120, 1400, 220, "bloques.jpg");
		bloques.add(bloque6);
		bloques bloque61 = new bloques("bloques6.2", 1300, 290, 1400, 390, "bloques.jpg");
		bloques.add(bloque61);
		bloques bloque62 = new bloques("bloques6.3", 1300, 460, 1400, 560, "bloques.jpg");
		bloques.add(bloque62);
		bloques bloque63 = new bloques("bloques6.2", 1300, 630, 1400, 730, "bloques.jpg");
		bloques.add(bloque63);
		bloques bloque64 = new bloques("bloques6.3", 1300, 800, 1400, 900, "bloques.jpg");
		bloques.add(bloque64);
		// septima columna
		bloques bloque7 = new bloques("bloques7.1", 1490, 120, 1590, 220, "bloques.jpg");
		bloques.add(bloque7);
		bloques bloque71 = new bloques("bloques7.2", 1490, 290, 1590, 390, "bloques.jpg");
		bloques.add(bloque71);
		bloques bloque72 = new bloques("bloques7.3", 1490, 460, 1590, 560, "bloques.jpg");
		bloques.add(bloque72);
		bloques bloque73 = new bloques("bloques7.4", 1490, 630, 1590, 730, "bloques.jpg");
		bloques.add(bloque73);
		bloques bloque74 = new bloques("bloques7.5", 1490, 800, 1590, 900, "bloques.jpg");
		bloques.add(bloque74);
		// octava columna
		bloques bloque8 = new bloques("bloques8.1", 1680, 120, 1780, 220, "bloques.jpg");
		bloques.add(bloque8);
		bloques bloque81 = new bloques("bloques8.2", 1680, 290, 1780, 390, "bloques.jpg");
		bloques.add(bloque81);
		bloques bloque82 = new bloques("bloques8.3", 1680, 460, 1780, 560, "bloques.jpg");
		bloques.add(bloque82);
		bloques bloque83 = new bloques("bloques8.4", 1680, 630, 1780, 730, "bloques.jpg");
		bloques.add(bloque83);
		bloques bloque84 = new bloques("bloques8.5", 1680, 800, 1780, 900, "bloques.jpg");
		bloques.add(bloque84);

		// PAREDES
		paredes suelo = new paredes("Suelo", 0, 1000, 1901, 1050, "pared.jpg");
		sprites.add(suelo);
		paredes techo = new paredes("Techo", 0, 0, 2000, 30, "pared.jpg");
		sprites.add(techo);
		paredes paredIZQ = new paredes("ParedIZQ", 0, 0, 30, 1000, "pared.jpg");
		sprites.add(paredIZQ);
		paredes paredDER = new paredes("ParedDER", 1870, 0, 1900, 1000, "pared.jpg");
		sprites.add(paredDER);

		// nombre es primero columna luego fila EJ:0 columna y fila 2
		obstaculos obs1 = new obstaculos("obs0.2", 30, 220, 150, 290, "obstaculos.jpg");
		obstaculos.add(obs1);

		obstaculos obs2 = new obstaculos("obs2.0", 250, 30, 340, 120, "obstaculos.jpg");
		obstaculos.add(obs2);

		obstaculos obs3 = new obstaculos("obs2.1", 150, 220, 250, 290, "obstaculos.jpg");
		obstaculos.add(obs3);

		obstaculos obs4 = new obstaculos("obs2.1", 250, 120, 340, 220, "obstaculos.jpg");
		obstaculos.add(obs4);

		obstaculos obs5 = new obstaculos("obs0.6", 30, 560, 150, 630, "obstaculos.jpg");
		obstaculos.add(obs5);

		obstaculos obs6 = new obstaculos("obs4.4", 440, 390, 530, 460, "obstaculos.jpg");
		obstaculos.add(obs6);

		obstaculos obs7 = new obstaculos("obs8.2", 250, 730, 340, 800, "obstaculos.jpg");
		obstaculos.add(obs7);

		obstaculos obs8 = new obstaculos("obs8.3", 340, 730, 440, 800, "obstaculos.jpg");
		obstaculos.add(obs8);

		obstaculos obs9 = new obstaculos("obs4.3", 340, 390, 440, 460, "obstaculos.jpg");
		obstaculos.add(obs9);

		obstaculos obs29 = new obstaculos("obs4.2", 440, 220, 530, 290, "obstaculos.jpg");
		obstaculos.add(obs29);

		obstaculos obs10 = new obstaculos("obs6.6", 630, 560, 720, 630, "obstaculos.jpg");
		obstaculos.add(obs10);

		obstaculos obs12 = new obstaculos("obs6.0", 630, 30, 720, 120, "obstaculos.jpg");
		obstaculos.add(obs12);

		obstaculos obs13 = new obstaculos("obs6.1", 630, 120, 720, 220, "obstaculos.jpg");
		obstaculos.add(obs13);

		obstaculos obs14 = new obstaculos("obs0.7", 720, 30, 820, 120, "obstaculos.jpg");
		obstaculos.add(obs14);

		obstaculos obs15 = new obstaculos("obs8.8", 1110, 730, 1210, 800, "obstaculos.jpg");
		obstaculos.add(obs15);

		obstaculos obs16 = new obstaculos("obs8.9", 1210, 730, 1300, 800, "obstaculos.jpg");
		obstaculos.add(obs16);

		obstaculos obs17 = new obstaculos("obs9.9", 1210, 630, 1300, 730, "obstaculos.jpg");
		obstaculos.add(obs17);

		obstaculos obs18 = new obstaculos("obs11.2", 1400, 220, 1490, 290, "obstaculos.jpg");
		obstaculos.add(obs18);

		obstaculos obs19 = new obstaculos("obs12.2", 1490, 220, 1590, 290, "obstaculos.jpg");
		obstaculos.add(obs19);

		obstaculos obs20 = new obstaculos("obs13.2", 1590, 220, 1680, 290, "obstaculos.jpg");
		obstaculos.add(obs20);

		obstaculos obs21 = new obstaculos("obs15.8", 1780, 730, 1870, 800, "obstaculos.jpg");
		obstaculos.add(obs21);

		obstaculos obs23 = new obstaculos("obs10.8", 1110, 900, 1210, 1000, "obstaculos.jpg");
		obstaculos.add(obs23);

		obstaculos obs24 = new obstaculos("obs10.9", 1210, 900, 1300, 1000, "obstaculos.jpg");
		obstaculos.add(obs24);

		obstaculos obs25 = new obstaculos("obs10.10", 1300, 900, 1400, 1000, "obstaculos.jpg");
		obstaculos.add(obs25);

		obstaculos obs26 = new obstaculos("obs0.10", 1300, 30, 1400, 120, "obstaculos.jpg");
		obstaculos.add(obs26);

		obstaculos obs27 = new obstaculos("ob11.6", 1400, 560, 1490, 630, "obstaculos.jpg");
		obstaculos.add(obs27);

		obstaculos obs28 = new obstaculos("obs11.5", 1400, 460, 1490, 560, "obstaculos.jpg");
		obstaculos.add(obs28);

		obstaculos obs30 = new obstaculos("obs2.15", 1780, 220, 1870, 290, "obstaculos.jpg");
		obstaculos.add(obs30);

		obstaculos obs31 = new obstaculos("obs11.4", 1400, 390, 1490, 460, "obstaculos.jpg");
		obstaculos.add(obs31);

		obstaculos obs32 = new obstaculos("obs2.4", 250, 390, 350, 460, "obstaculos.jpg");
		obstaculos.add(obs32);

		obstaculos obs33 = new obstaculos("obs4.10", 440, 730, 530, 800, "obstaculos.jpg");
		obstaculos.add(obs33);

		obstaculos obs34 = new obstaculos("obs4.11", 440, 800, 530, 900, "obstaculos.jpg");
		obstaculos.add(obs34);

		obstaculos obs35 = new obstaculos("obs13.8", 1590, 730, 1680, 800, "obstaculos.jpg");
		obstaculos.add(obs35);

		// los checkpoints para ganar la partida
		puntos p1 = new puntos("puntos", 650, 400, 700, 450, "golf-flag-png-2.png");
		puntos.add(p1);

		puntos p2 = new puntos("puntos", 1800, 920, 1850, 970, "golf-flag-png-2.png");
		puntos.add(p2);

		puntos p3 = new puntos("puntos", 1710, 230, 1760, 280, "golf-flag-png-2.png");
		puntos.add(p3);

		// puerta para terminar el nivel

		puerta puerta = new puerta("La puerta", 880, 470, 1030, 570, "portal.png");
		puertas.add(puerta);

	}

	/**
	 * Funcion que crea todos los sprites que forman el mapa del nivel 2
	 * 
	 * @author ToniLR
	 */
	public void createmap2(Field f) {

		sprites.clear();
		obstaculos.clear();
		bloques.clear();
		puertas.clear();
		puntos.clear();

		f.background = "fondo2.jpg";

		// primera columna de bloques
		bloques bloque1 = new bloques("bloques1.1", 150, 120, 250, 220, "bloques2.jpg");
		bloques.add(bloque1);
		bloques bloque11 = new bloques("bloques1.2", 150, 290, 250, 390, "bloques2.jpg");
		bloques.add(bloque11);
		bloques bloque12 = new bloques("bloques1.3", 150, 460, 250, 560, "bloques2.jpg");
		bloques.add(bloque12);
		bloques bloque13 = new bloques("bloques1.4", 150, 630, 250, 730, "bloques2.jpg");
		bloques.add(bloque13);
		bloques bloque14 = new bloques("bloques1.5", 150, 800, 250, 900, "bloques2.jpg");
		bloques.add(bloque14);

		// segunda columna de bloques

		bloques bloque21 = new bloques("bloques2.1", 340, 120, 440, 220, "bloques2.jpg");
		bloques.add(bloque21);
		bloques bloque22 = new bloques("bloques2.2", 340, 290, 440, 390, "bloques2.jpg");
		bloques.add(bloque22); // 260 , 310
		bloques bloque23 = new bloques("bloques2.3", 340, 460, 440, 560, "bloques2.jpg");
		bloques.add(bloque23);
		bloques bloque24 = new bloques("bloques2.4", 340, 630, 440, 730, "bloques2.jpg");
		bloques.add(bloque24); // 260 , 310
		bloques bloque25 = new bloques("bloques2.5", 340, 800, 440, 900, "bloques2.jpg");
		bloques.add(bloque25);

		// tercera columna de bloques
		bloques bloque31 = new bloques("bloques3.1", 530, 120, 630, 220, "bloques2.jpg");
		bloques.add(bloque31);
		bloques bloque32 = new bloques("bloques3.2", 530, 290, 630, 390, "bloques2.jpg");
		bloques.add(bloque32);
		bloques bloque33 = new bloques("bloques3.3", 530, 460, 630, 560, "bloques2.jpg");
		bloques.add(bloque33);
		bloques bloque34 = new bloques("bloques3.4", 530, 630, 630, 730, "bloques2.jpg");
		bloques.add(bloque34);
		bloques bloque35 = new bloques("bloques3.5", 530, 800, 630, 900, "bloques2.jpg");
		bloques.add(bloque35);
		// quarta columna de bloques
		bloques bloque41 = new bloques("bloques4.1", 720, 120, 820, 220, "bloques2.jpg");
		bloques.add(bloque41);
		bloques bloque42 = new bloques("bloques4.2", 720, 290, 820, 390, "bloques2.jpg");
		bloques.add(bloque42);
		bloques bloque43 = new bloques("bloques4.3", 720, 460, 820, 560, "bloques2.jpg");
		bloques.add(bloque43);
		bloques bloque44 = new bloques("bloques4.2", 720, 630, 820, 730, "bloques2.jpg");
		bloques.add(bloque44);
		bloques bloque45 = new bloques("bloques4.3", 720, 800, 820, 900, "bloques2.jpg");
		bloques.add(bloque45);

		// quinta columna de bloques
		bloques bloque5 = new bloques("bloques5.1", 1110, 120, 1210, 220, "bloques2.jpg");
		bloques.add(bloque5);
		bloques bloque51 = new bloques("bloques5.2", 1110, 290, 1210, 390, "bloques2.jpg");
		bloques.add(bloque51);
		bloques bloque52 = new bloques("bloques5.3", 1110, 460, 1210, 560, "bloques2.jpg");
		bloques.add(bloque52);
		bloques bloque53 = new bloques("bloques5.1", 1110, 630, 1210, 730, "bloques2.jpg");
		bloques.add(bloque53);
		bloques bloque54 = new bloques("bloques5.2", 1110, 800, 1210, 900, "bloques2.jpg");
		bloques.add(bloque54);

		// sexta columna de bloques
		bloques bloque6 = new bloques("bloques6.1", 1300, 120, 1400, 220, "bloques2.jpg");
		bloques.add(bloque6);
		bloques bloque61 = new bloques("bloques6.2", 1300, 290, 1400, 390, "bloques2.jpg");
		bloques.add(bloque61);
		bloques bloque62 = new bloques("bloques6.3", 1300, 460, 1400, 560, "bloques2.jpg");
		bloques.add(bloque62);
		bloques bloque63 = new bloques("bloques6.2", 1300, 630, 1400, 730, "bloques2.jpg");
		bloques.add(bloque63);
		bloques bloque64 = new bloques("bloques6.3", 1300, 800, 1400, 900, "bloques2.jpg");
		bloques.add(bloque64);
		// septima columna
		bloques bloque7 = new bloques("bloques7.1", 1490, 120, 1590, 220, "bloques2.jpg");
		bloques.add(bloque7);
		bloques bloque71 = new bloques("bloques7.2", 1490, 290, 1590, 390, "bloques2.jpg");
		bloques.add(bloque71);
		bloques bloque72 = new bloques("bloques7.3", 1490, 460, 1590, 560, "bloques2.jpg");
		bloques.add(bloque72);
		bloques bloque73 = new bloques("bloques7.4", 1490, 630, 1590, 730, "bloques2.jpg");
		bloques.add(bloque73);
		bloques bloque74 = new bloques("bloques7.5", 1490, 800, 1590, 900, "bloques2.jpg");
		bloques.add(bloque74);
		// octava columna
		bloques bloque8 = new bloques("bloques8.1", 1680, 120, 1780, 220, "bloques2.jpg");
		bloques.add(bloque8);
		bloques bloque81 = new bloques("bloques8.2", 1680, 290, 1780, 390, "bloques2.jpg");
		bloques.add(bloque81);
		bloques bloque82 = new bloques("bloques8.3", 1680, 460, 1780, 560, "bloques2.jpg");
		bloques.add(bloque82);
		bloques bloque83 = new bloques("bloques8.4", 1680, 630, 1780, 730, "bloques2.jpg");
		bloques.add(bloque83);
		bloques bloque84 = new bloques("bloques8.5", 1680, 800, 1780, 900, "bloques2.jpg");
		bloques.add(bloque84);

		// PAREDES
		paredes suelo = new paredes("Suelo", 0, 1000, 1901, 1050, "pared2.jpg");
		sprites.add(suelo);
		paredes techo = new paredes("Techo", 0, 0, 2000, 30, "pared2.jpg");
		sprites.add(techo);
		paredes paredIZQ = new paredes("ParedIZQ", 0, 0, 30, 1000, "pared2.jpg");
		sprites.add(paredIZQ);
		paredes paredDER = new paredes("ParedDER", 1870, 0, 1900, 1000, "pared2.jpg");
		sprites.add(paredDER);

		// nombre es primero columna luego fila EJ:0 columna y fila 2
		obstaculos obs1 = new obstaculos("obs0.2", 30, 220, 150, 290, "obstaculos2.png");
		obstaculos.add(obs1);

		obstaculos obs2 = new obstaculos("obs2.0", 250, 30, 340, 120, "obstaculos2.png");
		obstaculos.add(obs2);

		obstaculos obs3 = new obstaculos("obs2.1", 150, 220, 250, 290, "obstaculos2.png");
		obstaculos.add(obs3);

		obstaculos obs4 = new obstaculos("obs2.1", 250, 120, 340, 220, "obstaculos2.png");
		obstaculos.add(obs4);

		obstaculos obs5 = new obstaculos("obs0.6", 30, 390, 155, 465, "obstaculos2.png");
		obstaculos.add(obs5);

		obstaculos obs6 = new obstaculos("obs4.4", 150, 390, 250, 465, "obstaculos2.png");
		obstaculos.add(obs6);

		obstaculos obs7 = new obstaculos("obs8.2", 250, 560, 340, 630, "obstaculos2.png");
		obstaculos.add(obs7);

		obstaculos obs8 = new obstaculos("obs8.3", 250, 630, 340, 730, "obstaculos2.png");
		obstaculos.add(obs8);

		obstaculos obs9 = new obstaculos("obs4.3", 340, 390, 440, 460, "obstaculos2.png");
		obstaculos.add(obs9);

		obstaculos obs29 = new obstaculos("obs4.2", 440, 560, 530, 630, "obstaculos2.png");
		obstaculos.add(obs29);

		obstaculos obs10 = new obstaculos("obs6.6", 440, 630, 530, 730, "obstaculos2.png");
		obstaculos.add(obs10);

		obstaculos obs12 = new obstaculos("obs6.0", 440, 120, 530, 220, "obstaculos2.png");
		obstaculos.add(obs12);

		obstaculos obs13 = new obstaculos("obs6.1", 30, 800, 155, 900, "obstaculos2.png");
		obstaculos.add(obs13);

		obstaculos obs14 = new obstaculos("obs0.7", 1110, 30, 1210, 120, "obstaculos2.png");
		obstaculos.add(obs14);

		obstaculos obs15 = new obstaculos("obs8.8", 1110, 730, 1210, 800, "obstaculos2.png");
		obstaculos.add(obs15);

		obstaculos obs16 = new obstaculos("obs8.9", 720, 900, 820, 1000, "obstaculos2.png");
		obstaculos.add(obs16);

		obstaculos obs17 = new obstaculos("obs9.9", 1400, 120, 1490, 220, "obstaculos2.png");
		obstaculos.add(obs17);

		obstaculos obs18 = new obstaculos("obs11.2", 1210, 220, 1305, 290, "obstaculos2.png");
		obstaculos.add(obs18);

		obstaculos obs19 = new obstaculos("obs12.2", 1400, 557, 1490, 634, "obstaculos2.png");
		obstaculos.add(obs19);

		obstaculos obs20 = new obstaculos("obs13.2", 1305, 555, 1400, 635, "obstaculos2.png");
		obstaculos.add(obs20);

		obstaculos obs21 = new obstaculos("obs15.8", 1210, 560, 1305, 635, "obstaculos2.png");
		obstaculos.add(obs21);

		obstaculos obs23 = new obstaculos("obs10.8", 1210, 800, 1305, 900, "obstaculos2.png");
		obstaculos.add(obs23);

		obstaculos obs24 = new obstaculos("obs10.9", 1590, 630, 1680, 730, "obstaculos2.png");
		obstaculos.add(obs24);

		obstaculos obs25 = new obstaculos("obs10.10", 1110, 390, 1210, 465, "obstaculos2.png");
		obstaculos.add(obs25);

		obstaculos obs26 = new obstaculos("obs0.10", 1300, 390, 1400, 465, "obstaculos2.png");
		obstaculos.add(obs26);

		obstaculos obs27 = new obstaculos("ob11.6", 1305, 220, 1400, 290, "obstaculos2.png");
		obstaculos.add(obs27);

		obstaculos obs28 = new obstaculos("obs11.5", 1780, 390, 1870, 465, "obstaculos2.png");
		obstaculos.add(obs28);

		obstaculos obs30 = new obstaculos("obs2.15", 1780, 290, 1870, 390, "obstaculos2.png");
		obstaculos.add(obs30);

		obstaculos obs31 = new obstaculos("obs11.4", 1210, 900, 1305, 1000, "obstaculos2.png");
		obstaculos.add(obs31);

		obstaculos obs32 = new obstaculos("obs2.4", 1780, 800, 1870, 900, "obstaculos2.png");
		obstaculos.add(obs32);

		obstaculos obs33 = new obstaculos("obs4.10", 1780, 220, 1870, 290, "obstaculos2.png");
		obstaculos.add(obs33);

		/*
		 * obstaculos obs34 = new obstaculos("obs4.11", 440, 800, 530, 900,
		 * "obstaculos2.png"); obstaculos.add(obs34);
		 * 
		 * obstaculos obs35 = new obstaculos("obs13.8", 1590, 730, 1680, 800,
		 * "obstaculos2.png"); obstaculos.add(obs35);
		 */

		// los checkpoints para ganar la partida
		puntos p1 = new puntos("puntos", 650, 400, 700, 450, "golf-flag-png-1.png");
		puntos.add(p1);

		puntos p2 = new puntos("puntos", 1610, 230, 1670, 280, "golf-flag-png-1.png");
		puntos.add(p2);

		puntos p3 = new puntos("puntos", 1796, 656, 1856, 716, "golf-flag-png-1.png");
		puntos.add(p3);

		// puerta para terminar el nivel

		puerta puerta = new puerta("La puerta", 880, 470, 1030, 570, "portal2.gif");
		puertas.add(puerta);

	}
}
