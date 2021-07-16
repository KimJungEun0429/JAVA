
public class CarExample {
	public static void main(String[] args) {
	
	Car myCar = new Car(1000);
	//myCar.carRun();
	
	Car myCar2 = new Car(1500);
	//myCar2.carRun();
	
	Car myCar3 = new Car(2000);
	
	//myCar.getPoint();
	
	Member mem = new Member();
	mem.rideCar(myCar);
	myCar.rideCar(mem);
	mem.getPoint();
	mem.getPoint();
	
	/*
	myCar2.rideCar(mem);
	mem.rideCar(myCar2);
	mem.getPoint();
	*/
	/*
	Member mem2 = new Member();
	mem2.rideCar(myCar);
	mem2.getPoint();
	mem2.getPoint();
	*/
	}//main
}
