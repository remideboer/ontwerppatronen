package ontwerppatronen.creational.abstractfactory.themes.dark;

import ontwerppatronen.creational.abstractfactory.themes.Dialog;

public class DarkDialog implements Dialog {

	@Override
	public void show() {
		System.out.println("Dark Dialog showing!");
	}

}
