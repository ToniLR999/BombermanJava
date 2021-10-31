package bomberman;

import Core.Field;
import Core.Window;

public class WindowSingleton {

	static Window w = null;

	private WindowSingleton(Field f) {

		w = new Window(f);

	}

	public static Window getWindowSingleton(Field f) {
		if (w == null) {
			new WindowSingleton(f);

		} else {

			w.changeField(f);
		}

		return w;
	}

}
