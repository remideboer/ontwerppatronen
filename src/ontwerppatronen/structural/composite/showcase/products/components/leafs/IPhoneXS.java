package ontwerppatronen.structural.composite.showcase.products.components.leafs;

import ontwerppatronen.structural.composite.showcase.products.components.Presentable;

public class IPhoneXS implements Presentable {

	@Override
	public void show() {
		System.out.println("\nIPhone XS!");
		System.out.println("Display: 5.8 inch Super Retina HD‑display");
		System.out.println("Capaciteit:\n" + 
				"64 GB\t" + 
				"256 GB\t" + 
				"512 GB\t");
		System.out.println("Weight: 177 gram");
		
	}

}
