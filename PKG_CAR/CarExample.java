package PKG_Car;

public class CarExample {

	public static void main(String[] args) {
		
		Car car1 = new Car("�ҳ�Ÿ", 200);
		car1.carDrive();
		
		
		Sedan s1 = new Sedan("���׽ý�",250);
		
		s1.carDrive();
		s1.getSedan();
		
		Truck t1 = new Truck("Ʈ��",300);
		t1.carDrive();
		t1.getTruck();
		t1.setTruck();
	}

}
