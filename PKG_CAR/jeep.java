package PKG_Car;

public class jeep extends Car {

	public jeep(String carName) {
		super(carName);
	}
	
	@Override
	public void carRun() {
		System.out.println("¤���� �޸���.");
	}
	
	@Override
	public void carStop() {
		System.out.println("¤���� �����.");
	}
	
	
}
