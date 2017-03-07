package ontwerppatronen.modelviewcontroller.model_feature;

import ontwerppatronen.modelviewcontroller.ModelNotFoundException;
import ontwerppatronen.modelviewcontroller.DataBaseNotFoundException;

/**
 *
 * @author Remi
 */
public class ModelController {

    private ModelView view;
    
    // hoeft niet perse geintjecteerd te worden, maakt het wel flexibeler en testbaar
    public ModelController(){
       
    }
    
    public void setView(ModelView view){
        this.view = view;
    }
    
    void processMainMenuChoice(int mainMenuChoice) {
        switch(mainMenuChoice){
            case 1: showModelSelectMenu(); break;
            case 2: saveMenu(); break;
            case 3: exit(); break;
            default: view.printInvalidInput();
        }
    }
    // methode die niks doet, zodat het programma stopt
    public void exit(){
        return; // niet nodig maar anders is het zo leeg
    }
    
    void showInputIdMenu(){
        view.printIdInputMenu();
    }
    
    void showModelSelectMenu(){
        // haal data op uit DB of wat dan ook. Nu gewoon new
        view.printIdInputMenu();
    }
    
    public void showMainMenu(){
        view.printMainMenu();
    }

    void saveModel(String s) {
        // opslag model in DB etc nu alleen text
        new ModelDAO().create(new Model(s));
    }

    private void saveMenu() {
        view.printSaveModelMenu();
    }

    void getModelById(int id) {
        Model model = null;
        try {
            // DB activiteit delegeer dit normaliter naar de data persistentie laag
            // nu hier voor gemak
            model = new ModelDAO().findById(id);
        } catch (DataBaseNotFoundException ex) {
            // afhandeling voor al er geen database is
            view.printDatabaseNotFoundMenu();
        } catch (ModelNotFoundException ex) {
            // afhandeling voor als er geen model gevonden wordt
            view.printModelNotFoundMenu(id);
        }
        view.printModel(model);
    }
    
    
}
