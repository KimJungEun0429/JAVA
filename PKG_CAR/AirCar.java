package PKG_Car;

public class AirCar extends Car implements Fly
{

	public AirCar(String airCarName) {
		super(airCarName);
	}
	
	@Override
	public void carRun() {
		System.out.println("에어카가 달린다.");
	}
	
	@Override
	public void fly() {
		System.out.println("에어카가 날아가요");
	}
	
	@Override
	public void land() {
		System.out.println("착륙");
	}
	
	/*
	public void airCarFly() {
		System.out.println("에어카가 날아가요");
	}
	*/
}
