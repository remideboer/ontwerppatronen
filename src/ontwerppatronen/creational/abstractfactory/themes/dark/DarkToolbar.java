package ontwerppatronen.creational.abstractfactory.themes.dark;

import ontwerppatronen.creational.abstractfactory.themes.Toolbar;

public class DarkToolbar implements Toolbar {

	@Override
	public void show() {
		System.out.println("Dark Toolbar showing!");
	}

}
