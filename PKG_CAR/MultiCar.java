package PKG_Car;

public class MultiCar extends Car implements Fly 
{
	//���, �޸���, ���ư���
	
	@Override
	public void carRun() {
		System.out.println("Multicar �� �޸���.");
	}
	
	@Override
	public void fly() {
		System.out.println("Multicar �� ���ƴٴѴ�.");
	}
}
