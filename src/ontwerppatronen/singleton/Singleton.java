package ontwerppatronen.singleton;

/**
 * Simpel Singleton voor singlethreaded environments
 * @author Remi
 */
public class Singleton {
    // 1. we hebben een klassenvariabele (static) nodig om de Singleton tijdens het laden in op te slaan
    // final maken als extra dan kan er via reflection ook geen andere instantie aan toegewezen worden
    private final static Singleton INSTANCE= new Singleton(); // kan ook in constructor en dan in getter instantieeren
    
    // 2. private constructor om te zorgen dat deze klasse niet ergens in het programma geinstantieerd kan worden
    // Ook een subklassen maken kan niet omdat deze subklasse zijn super constructor niet kan aanroepen
    private Singleton(){}
    
    // 3. een static getter om een referentie naar de instantie van de Singleton te verkrijgen 
    public static Singleton getInstance(){
        return INSTANCE;
    }
    
    // methoden die verder van belang zijn, de functionalteit van de klasse
    public void doeIets(){
        System.out.println("Doe iets");
    }
}
