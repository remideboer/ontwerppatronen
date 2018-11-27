package ontwerppatronen.structural.composite.showcase.products.components;

import ontwerppatronen.structural.composite.showcase.Presentable;

public class IntelCoreI5 implements Presentable {

	@Override
	public void show() {
		System.out.println("Intel Core I5!");
		System.out.println("Processor: 1.3GHz dual-core Intel Core i5, Turbo Boost up to 3.2GHz, with 4MB L3 cache");
	}

}
