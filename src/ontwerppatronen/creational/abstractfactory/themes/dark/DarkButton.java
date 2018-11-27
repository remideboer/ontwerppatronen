package ontwerppatronen.creational.abstractfactory.themes.dark;

import ontwerppatronen.creational.abstractfactory.themes.Button;

public class DarkButton implements Button {

	@Override
	public void pressMe() {
		System.out.println("Dark Button pressed!");
	}

	@Override
	public void show() {
		System.out.println("Dark Button showing!");
	}

}
