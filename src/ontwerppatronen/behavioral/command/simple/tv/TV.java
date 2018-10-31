package ontwerppatronen.behavioral.command.simple.tv;

public class TV {

	private String brand;

	public TV(String brand) {
		this.brand = brand;
	}

	public void turnOn() {
		System.out.println(String.format("Turning %s TV on!", brand));
		
	}

	public void turnOff() {
		System.out.println(String.format("Turning %s TV off!", brand));
	}

}
