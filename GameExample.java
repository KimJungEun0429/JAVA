
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
		

		
		
		
		//다형성
		//up castring, down casting
		
	
		
		//instanceof 암기사항 - 이 car가 truck을 인스턴스화 한거냐고 묻는 것 true면 결과가 나온다
		/*
		if(car instanceof Trcuk) {
			System.out.println("트럽타입인가요");
		}*/
		
		//같은 클래스를 실행시켜도 다른 결과 값이 나온다. 다양한 형태의 성질이 띄게 된다. = 객체지향의 다형성
		
	}

}
