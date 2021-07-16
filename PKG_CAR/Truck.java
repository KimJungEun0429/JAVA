package PKG_Car;

public class Truck extends Car{
	public Truck(String carName, int maxSpeed) {
		super(carName,maxSpeed);
		//super는 Car의 생성자라고 생각
	}
	
	public void getTruck() {
		System.out.println("트럭만의 특징");
	}
	
	public void setTruck() {
		System.out.println("트럭만의 특징2");
	}
	
}


