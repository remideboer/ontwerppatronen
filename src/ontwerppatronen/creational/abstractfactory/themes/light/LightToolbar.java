package ontwerppatronen.creational.abstractfactory.themes.light;

import ontwerppatronen.creational.abstractfactory.themes.Toolbar;

public class LightToolbar implements Toolbar {

	@Override
	public void show() {
		System.out.println("Light Toolbar showing!");
	}

}
