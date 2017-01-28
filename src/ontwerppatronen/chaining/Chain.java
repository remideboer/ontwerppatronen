package ontwerppatronen.chaining;

/**
 * Niet echt een ontwerppatroon, Builder patroon gebruikt chaining
 * chaining geeft zijn eigen instantie steeds terug zodat er opnieuw een methode
 * op aangeroepen kan worden
 * FLUENT Api
 */
public class Chain {

    Chain name(String name) {
        System.out.println("Name: " + name + " ");
        return this; 
    }

    Chain age(int age) {
        System.out.println("Age: " + age + " ");
        return this;
    }

    Chain hobby(String hobby) {
        System.out.println("Hobby: " + hobby + " ");
        return this;
    }

    // We moeten een conclusie methode, build, generate of iets anders hebben
    void show() {
        System.out.println("End of Chain");
    }
}
