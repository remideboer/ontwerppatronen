package ontwerppatronen.modelviewcontroller;

import ontwerppatronen.modelviewcontroller.model_feature.ModelController;
import ontwerppatronen.modelviewcontroller.model_feature.ModelView;


/**
 *
 * @author Remi
 */
public class Application {
    
    public static String dbFile = "db.txt";
    
    public static void main(String[] args) {
        // nu is er alleen nog 1 controller maar je kunt ook werken met een hoofdcontroller
        // die delegeert naar anderen het Front Controller Pattern
        // https://en.wikipedia.org/wiki/Front_controller
        ModelController modelController = new ModelController();
        modelController.setView(new ModelView(modelController));
        // Er zijn maar een paar methoden van de controller public de rest is 
        // default of private zodat alleen methoden die buiten de package nodig
        // zijn zichtbaar te maken
        modelController.showMainMenu(); // startpunt
    }
}
