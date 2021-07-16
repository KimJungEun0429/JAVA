package PKG_Static;

public class StaticExample {

		public static void main(String[] args) {
			
			/*
			Car c = new Car();
			//인스턴스화 하는 타이밍에 메모리에 올라온다.
			 
			for(int i=0; i<=100; i++) {
				c.speed += i;
			}
			System.out.println(c.speed);
			
			Car.speed2 = 12;
			*/
			
			for(int i=0; i<=100; i++) {
				Car.speed2 += i;
			}
			System.out.println(Car.speed2);

		}
	
}
