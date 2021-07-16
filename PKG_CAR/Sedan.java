package PKG_Car;

public class Sedan extends Car {
	//car라는 클래스를 상속받겠습니다라는 뜻.
	public Sedan(String carName, int maxSpeed) {
		super(carName,maxSpeed);
		//super는 Car의 생성자라고 생각
	}
	
	public void getSedan() {
		System.out.println("세단만의 특징");
	}
	
}
