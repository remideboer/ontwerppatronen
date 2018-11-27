package ontwerppatronen.structural.composite.showcase.products;

import ontwerppatronen.structural.composite.showcase.Presenter;

public class Merchant extends Presenter {

	private String name;

	public Merchant(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
