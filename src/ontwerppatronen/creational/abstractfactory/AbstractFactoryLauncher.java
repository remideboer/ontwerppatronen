package ontwerppatronen.creational.abstractfactory;

import ontwerppatronen.creational.abstractfactory.themes.*;
import ontwerppatronen.creational.abstractfactory.themes.dark.DarkThemeFactory;
import ontwerppatronen.creational.abstractfactory.themes.light.LightThemeFactory;

/**
 * Used to demonstrate the Abstract Factory pattern
 * Example: ThemeFactory used to produce Buttons, Dialogs and Toolbars
 * in variations Light and Dark theme.
 * @author remideboer
 *
 */
public class AbstractFactoryLauncher {
		// Declare variables using interfaces (yes, using static context here for demo purposes)
		static private ThemeFactory themeFactory;
		static private Button btn;
		static private Toolbar toolBar;
		static private Dialog dialog;
		
	public static void main(String[] args) {
		// now make things concrete:
		// instantiate the concrete classes using a concrete factory
		
		// Start on the light side: use LightThemeFactory to create related UI components
		System.out.println("We are born from Light!");
		themeFactory = new LightThemeFactory(); 
		
		btn = themeFactory.createButton();
		toolBar = themeFactory.createToolbar();
		dialog = themeFactory.createDialog(); 
		
		usingTheForce(); // use the UI components
		
		// Turning to the dark side! Use DarkThemeFactory to create related UI Components
		System.out.println("\nTurning to the Dark Side!");
		themeFactory = new DarkThemeFactory(); 

		btn = themeFactory.createButton();
		toolBar = themeFactory.createToolbar();
		dialog = themeFactory.createDialog(); 
		
		usingTheForce(); // use the UI components
		
	}

	/**
	 * Using UI components to show effect of factory switch
	 */
	private static void usingTheForce() {
		btn.show();
		toolBar.show();
		dialog.show();
		btn.pressMe();
	}

}
