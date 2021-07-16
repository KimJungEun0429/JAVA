package PKG_Car;

public class CarExample {

	public static void main(String[] args) {
		
		Car car1 = new Car("소나타", 200);
		car1.carDrive();
		
		
		Sedan s1 = new Sedan("제네시스",250);
		
		s1.carDrive();
		s1.getSedan();
		
		Truck t1 = new Truck("트럭",300);
		t1.carDrive();
		t1.getTruck();
		t1.setTruck();
	}

}
