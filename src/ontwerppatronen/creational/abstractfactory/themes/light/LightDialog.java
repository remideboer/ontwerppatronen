package ontwerppatronen.creational.abstractfactory.themes.light;

import ontwerppatronen.creational.abstractfactory.themes.Dialog;

public class LightDialog implements Dialog {

	@Override
	public void show() {
		System.out.println("Light Dialog showing!");
	}

}
