package PKG_Static;

public class Start {

	public static void main(String[] args) {
		
		Car car = new Car("¾ß¿Ë");
		//System.out.println(car.carCount);
		
		for(int i=0; i<=100; i++) {
			car.speed += i;
		}
		//System.out.println(car.speed);
		
		Car car2 = new Car("¾ß¿Ë");
		
		for(int i=0; i<=100; i++) {
			car2.speed2 += i;
		}
		//System.out.println(car2.speed2);
		
		Car.speed2 = 12;
		//Car.speed = 12;
		
		//System.out.println(car.speed2);
		
		Car c= new Car("¾ß¿ËÀÌ");
		//System.out.println(c.carCount);
	
		Car c2 = new Car("¸Û¸ÛÀÌ");
		//System.out.println(c2.carCount);
		
		Car c3 = new Car("Â÷µ¹ÀÌ");
		//System.out.println(c3.carCount);

		Car c4 = new Car("Ä«Ä«Ä«");
		
		People p1 = new People("±è¼öÀÎ",26);
		p1.gender = "³²ÀÚ";
		
		System.out.println(p1.gender);
		
		People p2 = new People("±è¼ÒÈñ", 29);
		p2.gender = p2.gender + "¿©ÀÚ";
		
		System.out.println(p2.gender);

	}//main end

}
