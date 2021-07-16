package PKG_Static;

public class Car {
	
	public int speed = 0;
	public int carCount = 0; //static 정적멤버
	public int carCNT;
	public String carName;
	
	//정적멤버 - static member

	
	public static int speed2= 0;
	//프로그램이 종료될 때 까지 사라지지않는다.
	//그래서 프로그램이 끝나기 전까지 절대 변하지 않을 값을 주고 싶을 때 static를 사용한다.
	//전체적으로 통합관리가 필요한 상황에만 static을 사용해야 편하다. 함부러 사용하면 안된다n
	
	public Car(String carName) {
		this.carCount += 1;
		this.carCNT = 1;
		this.carName = carName;
		}
	
}
