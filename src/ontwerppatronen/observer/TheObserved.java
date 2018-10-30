package ontwerppatronen.observer;

import java.util.*;

/**
 * The class under observation
 * Needs to maintain a list of observers aka subscribers
 * @author remideboer
 *
 */
public class TheObserved {
	// used name subscribers to emphasize subscriber principle
	// 1 - list of observers(subscribers)
	// use Set to prevent duplicate subscribers and on removal only first entry removal
	private Set<Observer> subscribers = new HashSet<>(); 
	private int theInterestingValue;

	// 2 - method to add an observer
	public void attach(Observer observer) {
		subscribers.add(observer);
	}
	
	// 3 - method to remove a observer
	public void detach(Observer observer) {
		subscribers.remove(observer);
	}
	
	// 4 - method of action, that notifies observers
	public void setTheInterestingValue(int theInterestingValue) {
		this.theInterestingValue = theInterestingValue;
		notifyObservers();
	}

	// now let subscribers know it has changed
	// use push or pull variant: push -> we send the information of interest, pull -> we send that we updated with wrapper object (or self), then observer fetches data from object
	private void notifyObservers() {
		for (Observer observer : subscribers) {
			observer.update(theInterestingValue); // we can send whole object, or just value of interest
			// using a pull variant, the update method will ask for the information from the observer
			// observer.update(this)
		}
	}
}
