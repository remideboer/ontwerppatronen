package ontwerppatronen.creational.abstractfactory.themes.light;

import ontwerppatronen.creational.abstractfactory.themes.Button;

public class LightButton implements Button {

	@Override
	public void pressMe() {
		System.out.println("Light Button pressed!");
	}

	@Override
	public void show() {
		System.out.println("Light Button showing!");
	}

}
