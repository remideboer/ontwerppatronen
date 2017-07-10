package ontwerppatronen.singleton;

/**
 *
 * @author Remi
 */
public class SingletonRunner {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.doeIets();
        EnumSingleton e = EnumSingleton.INSTANCE;
        e.doeOokIets();
    }
}
