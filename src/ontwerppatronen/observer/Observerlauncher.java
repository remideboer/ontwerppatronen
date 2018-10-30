package ontwerppatronen.observer;

/**
 * Basic push observer pattern example
 * - Define a one-to-many dependency between objects so that when one object changes state, 
 * all its dependents are notified and updated automatically.
 * - Encapsulate the core (or common or engine) components in a Subject abstraction, 
 * and the variable (or optional or user interface) components in an Observer hierarchy.
 * - The "View" part of Model-View-Controller.
 * - solution to polling
 * Publischer - Subscriber
 * Push - Pull variants
 * @author remideboer
 *
 */
public class Observerlauncher {

	public static void main(String[] args) {
		TheObserved underObservation = new TheObserved();
		Observer observer01 = new Observer();
		Observer observer02 = new Observer();
		Observer observer03 = new Observer();
		
		// attach(subscribe) the observers 
		underObservation.attach(observer01);
		underObservation.attach(observer02);
		underObservation.attach(observer03);
		// adding observer two times won't work
		underObservation.attach(observer03);
		
		// put the observers to work 
		underObservation.setTheInterestingValue(100);
		
		// remove one observer
		underObservation.detach(observer02);
		
		// put the remaining observers to work 
		underObservation.setTheInterestingValue(42);
		
	}

}
