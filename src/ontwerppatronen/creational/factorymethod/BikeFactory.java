package ontwerppatronen.creational.factorymethod;

public class BikeFactory implements IVehicleFactory {

	@Override
	public Vehicle create() {
		return new Bike();
	}

}
