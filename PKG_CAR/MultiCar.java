package PKG_Car;

public class MultiCar extends Car implements Fly 
{
	//잠수, 달린다, 날아간다
	
	@Override
	public void carRun() {
		System.out.println("Multicar 가 달린다.");
	}
	
	@Override
	public void fly() {
		System.out.println("Multicar 가 날아다닌다.");
	}
}
