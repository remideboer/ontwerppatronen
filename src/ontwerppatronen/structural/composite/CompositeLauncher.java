package ontwerppatronen.structural.composite;

import ontwerppatronen.structural.composite.showcase.*;
import ontwerppatronen.structural.composite.showcase.products.*;
import ontwerppatronen.structural.composite.showcase.products.components.IntelCoreI5;
import ontwerppatronen.structural.composite.showcase.products.components.IntelCoreM3;

/**
 * Used to demonstrate the Composite pattern
 * Type: structural
 * Note: compare wrapping with other patterns
 * 	Decorator: wrapping used for having a 'single' object and extending behavior (@ runtime)
 * 	Composite: wrapping for grouping objects having similar behavior
 * 			   presenting client with single interface
 *  Strategy: wrapping used for changing behavior \@runtime not extending
 *  Proxy: wrapping used to controll access to the wrapped object, not extending
 *  Adapter: wrapping object so a suitable interface can be used, 
 *  	   		 not changing/extending functionality
 *  
 *  Example: A sales person presents Apple products, 
 *  some are leafs others are composites
 *  each product or component can 'present' them selves
 *  sales person just starts the 'show'
 * @author remideboer
 *
 */
public class CompositeLauncher {

	public static void main(String[] args) {
		Presenter macSalesPerson = new Merchant("Joop");
		// mac books can be loaded with a different processor
		MacBookPro macBookProI5 = new MacBookPro();
		macBookProI5.add(new IntelCoreI5());
		MacBookPro macBookProM3 = new MacBookPro();
		macBookProM3.add(new IntelCoreM3());
		
		macSalesPerson.add(macBookProM3);
		macSalesPerson.add(macBookProI5);
		
		// IPad en Iphone are leafs
		macSalesPerson.add(new IPadPro());
		macSalesPerson.add(new IPhoneXS());

		// start the show!
		macSalesPerson.show();
	}

}
