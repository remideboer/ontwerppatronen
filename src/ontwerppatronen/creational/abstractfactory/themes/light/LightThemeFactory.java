package ontwerppatronen.creational.abstractfactory.themes.light;

import ontwerppatronen.creational.abstractfactory.themes.Button;
import ontwerppatronen.creational.abstractfactory.themes.Dialog;
import ontwerppatronen.creational.abstractfactory.themes.ThemeFactory;
import ontwerppatronen.creational.abstractfactory.themes.Toolbar;

public class LightThemeFactory implements ThemeFactory {

	@Override
	public Button createButton() {
		return new LightButton();
	}

	@Override
	public Toolbar createToolbar() {
		// TODO Auto-generated method stub
		return new LightToolbar();
	}

	@Override
	public Dialog createDialog() {
		// TODO Auto-generated method stub
		return new LightDialog();
	}

}
