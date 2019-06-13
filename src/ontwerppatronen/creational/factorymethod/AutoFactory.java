package ontwerppatronen.creational.factorymethod;

public class AutoFactory implements IVehicleFactory {

	@Override
	public Vehicle create() {
		return new Auto();
	}

}
