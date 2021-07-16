package PKG_Car;

public class Charator {

	private String cName;
	private Car myCar;
	
	public Charator(String cName) {
		this.cName = cName;
	}
	
	public void rideCar(Car car) {
		myCar = car;
	}
	
	public void carRun() {
		myCar.carRun();
	}
	
	public void carFly(Fly f) {
		f.fly();
	}
	
}
