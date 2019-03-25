package ontwerppatronen.structural.composite.showcase.products.components.composites;

public class MacBook extends Presenter {

	@Override
	public void show() {
		System.out.println("\nMacBook Pro!");
		System.out.println("Display: 12 inch Retina LED-backlit display with IPS technology");
		System.out.println("Weight: 920 gram");
		
		super.show();
	}

}
