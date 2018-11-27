package ontwerppatronen.creational.abstractfactory.themes;

public interface ThemeFactory {

	Button createButton();
	
	Toolbar createToolbar();
	
	Dialog createDialog();
}
