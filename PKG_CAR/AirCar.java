package PKG_Car;

public class AirCar extends Car implements Fly
{

	public AirCar(String airCarName) {
		super(airCarName);
	}
	
	@Override
	public void carRun() {
		System.out.println("����ī�� �޸���.");
	}
	
	@Override
	public void fly() {
		System.out.println("����ī�� ���ư���");
	}
	
	@Override
	public void land() {
		System.out.println("����");
	}
	
	/*
	public void airCarFly() {
		System.out.println("����ī�� ���ư���");
	}
	*/
}
