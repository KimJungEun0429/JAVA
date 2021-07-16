package hello;

public class stu {
	
	public String carName;
	private int maxSpeed = 1000;
	private int minSpeed = 100;
	private String carColor = "치즈";
	

	public stu(String carName,int maxSpeed,int minSpeed, String carColor) {
		System.out.println("1 차이름 : " + "[" + carName + "]" + " 최고 속도 : " + "[" + maxSpeed + "]" + " 최소 속도 : " + "[" + minSpeed + "]" + " 차량 색 : " + "[" + carColor + "]" );
	}
	
	public stu(String a) {
		this.carName = a;
		this.maxSpeed = 300;
		this.minSpeed = 1400;
		this.carColor = "파랑";
		
		System.out.println("2 차이름 : " + "[" + a + "]" + " 최고 속도 : " + "[" + maxSpeed + "]" + " 최소 속도 : " + "[" + minSpeed + "]" + " 차량 색 : " + "[" + carColor + "]" );
		//return(a);
	}
	
	public stu() {
		System.out.println("3 차이름 : " + "[" + carName + "]" + " 최고 속도 : " + "[" + maxSpeed + "]" + " 최소 속도 : " + "[" + minSpeed + "]" + " 차량 색 : " + "[" + carColor + "]" );
	}
	
	public void printCar() {
		
		System.out.println("4 차이름 : " + "[" + carName + "]" + " 최고 속도 : " + "[" + maxSpeed + "]" + " 최소 속도 : " + "[" + minSpeed + "]" + " 차량 색 : " + "[" + carColor + "]");
	}
	
	public stu(int maxSpeed, int minSpeed) {
		this.maxSpeed = 333;
		this.minSpeed = 155;
		this.carColor = "파랑";
		
		System.out.println("5 차이름 : " + "[" + carName + "]" + " 최고 속도 : " + "[" + maxSpeed  + "]" + " 최소 속도 : " + "[" + minSpeed + "]" + " 차량 색 : " + "[" + carColor + "]" );

	}
	
}

