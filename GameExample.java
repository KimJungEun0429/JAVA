
public class GameExample {

	public static void main(String[] args) {
		
		/*
		Car car = new FlyCar();
		//car.carRun();
		//Car car2 = new Truck();
		Fly fly = new FlyCar();
		//fly.fly();
		FlyCar FC = new FlyCar();
		FC.carRun();
		FC.eat();
		FC.fly();
		
		Object obj3 = new FlyCar();
		*/
		Car car = new FlyCar();
		
		Fly car1 = new FlyCar();
		
		
		
		Truck T = new Truck();
		FlyCar FC = new FlyCar();
		NewFlyCar NFC = new NewFlyCar();
		jeep jeep = new jeep();
		
		Member M1 = new Member();
		//////////////////////
		M1.rideCar(T);
		M1.carDrive();
		M1.carFly();
		
		M1.rideCar(FC);
		M1.carDrive();
		M1.carFly();
		//////////////////////
		M1.rideCar(NFC);
		M1.carDrive();
		M1.carFly();
		
		M1.rideCar(jeep);
		M1.carFly();
		M1.carDrive();
		
		
		//Car car = new Truck();
		
		Car car2 = new FlyCar();
		

		
		
		
		//������
		//up castring, down casting
		
	
		
		//instanceof �ϱ���� - �� car�� truck�� �ν��Ͻ�ȭ �Ѱųİ� ���� �� true�� ����� ���´�
		/*
		if(car instanceof Trcuk) {
			System.out.println("Ʈ��Ÿ���ΰ���");
		}*/
		
		//���� Ŭ������ ������ѵ� �ٸ� ��� ���� ���´�. �پ��� ������ ������ ��� �ȴ�. = ��ü������ ������
		
	}

}
