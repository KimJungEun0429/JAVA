package PKG_Static;

public class StaticExample {

		public static void main(String[] args) {
			
			/*
			Car c = new Car();
			//�ν��Ͻ�ȭ �ϴ� Ÿ�ֿ̹� �޸𸮿� �ö�´�.
			 
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
