package ontwerppatronen.structural.composite.showcase.products.components.leafs;

import ontwerppatronen.structural.composite.showcase.products.components.Presentable;

public class IPadPro implements Presentable {

	@Override
	public void show() {
		System.out.println("\nIPad Pro Pro!");
		System.out.println("Display: 11 or 12.9 inch Liquid Retina HD‑display");
		System.out.println("Capaciteit:\n" + 
				"64 GB\t" + 
				"256 GB\t" + 
				"512 GB\t" + 
				"1 GB\t");
		System.out.println("Weight: 633 gram");
	}

}
