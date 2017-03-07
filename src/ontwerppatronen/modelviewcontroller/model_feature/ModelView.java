package ontwerppatronen.modelviewcontroller.model_feature;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Remi
 */
/**
 *
 * @author Remi
 */
 public class ModelView {

    private final ModelController controller;
    private final Scanner scanner = new Scanner(System.in);

    public ModelView(ModelController controller) {
        this.controller = controller;
    }

    // print menu, wait for input
    // Er kan hier ook nog gewerkt worden met een Menu object en MenuList object
    void printMainMenu() {
        print("-----------------------");
        System.out.println("Show model: 1");
        System.out.println("save model: 2");
        System.out.println("quit: 3");
        print("-----------------------\n");
        
        int input = getIntegerInput();
        controller.processMainMenuChoice(input);
    }

    void showModel(Model model) {
        print("-----------------------");
        System.out.println("Het model is: " + model);
        print("-----------------------\n");
        printMainMenu();
    }

    void printSaveModelMenu() {
        print("-----------------------");
        System.out.println("Voer de naam in van het model");
        print("-----------------------\n");
        String s = scanner.nextLine();
        System.out.println("Is [" + s + "] de naam die je wilt opslaan? (y/n)");
        if (scanner.nextLine().equalsIgnoreCase("y")) {
            controller.saveModel(s);
            printMainMenu();
        } else {
            printSaveModelMenu();
        }
    }

    void printModelNotFoundMenu(int id) {
        print("-----------------------");
        printErr("Model met id [" + id + "] werd niet gevonden");
        print("Wilt u nog een keer zoeken?(y/n)");
        print("-----------------------\n");
        if (scanner.nextLine().equalsIgnoreCase("y")) {
            printIdInputMenu();
        } else {
            printMainMenu();
        }
    }

    private void print(String s) {
        System.out.println(s);
    }
    private void printErr(String s) {
        System.err.println(s);
    }

    void printIdInputMenu() {
        print("-----------------------");
        print("Voer het ID in van model dat u zoekt");
        print("-----------------------\n");
        controller.getModelById(getIntegerInput());
    }

    private int getIntegerInput() {
        // wacht op input en geef deze terug aan de controller
        int keuze = 0;
        try {
            keuze = scanner.nextInt();
        } catch (InputMismatchException e) { // voor als er iets wat iet lijkt op een int wordt ingevoerd
            scanner.nextLine(); // om oneindige loop te voorkomen omdat er anders bij exception een newline blijft staan
            printInvalidInput();
        }finally{
            scanner.nextLine(); // nextInt consumeert de newLine niet, dus entered de volgende newline direct door
        }
        
        return keuze;
    }

    void printDatabaseNotFoundMenu() {
        print("-----------------------");
        printErr("Helaas is er geen database aanwezig met opgeslagen modellen. Sla eerst een model op");
        print("-----------------------\n");
        printMainMenu();
    }

    void printInvalidInput() {
        print("-----------------------");
        printErr("Het ingevoerde is wordt niet begrepen: computer says no!");
        print("-----------------------\n");
        printMainMenu();
    }
}
