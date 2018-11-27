package ontwerppatronen.structural.composite.showcase;

import java.util.*;

/**
 * Class that implements the composite patterns
 * Example: a (sales) Person that presents his merchandise, 
 * that implement a Presentable interface
 * @author remideboer
 *
 */
public abstract class Presenter implements Presentable{

	private List<Presentable> items = new ArrayList<>();
	
	@Override
	public void show() {
		for (Presentable presentable : items) {
			presentable.show();
		}
	}
	
	public void add(Presentable presentable) {
		if(presentable != null) {
			items.add(presentable);
		}
	}
	
	public void remove(Presentable presentable) {
		if(presentable != null) {
			items.remove(presentable);
		}
	}

}
