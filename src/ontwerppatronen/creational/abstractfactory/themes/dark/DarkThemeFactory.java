package ontwerppatronen.creational.abstractfactory.themes.dark;

import ontwerppatronen.creational.abstractfactory.themes.Button;
import ontwerppatronen.creational.abstractfactory.themes.Dialog;
import ontwerppatronen.creational.abstractfactory.themes.ThemeFactory;
import ontwerppatronen.creational.abstractfactory.themes.Toolbar;

public class DarkThemeFactory implements ThemeFactory {

	@Override
	public Button createButton() {
		return new DarkButton();
	}

	@Override
	public Toolbar createToolbar() {
		return new DarkToolbar();
	}

	@Override
	public Dialog createDialog() {
		return new DarkDialog();
	}

}
