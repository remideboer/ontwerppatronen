package ontwerppatronen.behavioral.observer;

/**
 * The class that is interested in the updated information
 * @author remideboer
 *
 */
public class Observer {

	public void update(int theInterestingValue) {
		// just print the value that is received on update
		System.out.println(String.format("Printing updated value:[%d] from %s", 
				theInterestingValue, this)); // print out class name with address
		
		// using a pull variant, the update method will ask for the information from the passed object
//		System.out.println(String.format("Printing updated value:[%d] from %s", 
//				theInterestingValue, theObserved.getInterestingValue())); // print out class name with address
		
	}

}
