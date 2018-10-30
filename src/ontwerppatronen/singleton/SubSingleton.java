package ontwerppatronen.singleton;

// Ook subklassen werkt niet omdat deze subklasse zijn super niet kan aanroepen
// als je final in de super weghaalt zie je dat de compiler gaat klagen
public class SubSingleton extends Singleton{
	SubSingleton() {}
}
