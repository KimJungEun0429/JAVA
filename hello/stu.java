package hello;

public class stu {
	
	public String carName;
	private int maxSpeed = 1000;
	private int minSpeed = 100;
	private String carColor = "ġ��";
	

	public stu(String carName,int maxSpeed,int minSpeed, String carColor) {
		System.out.println("1 ���̸� : " + "[" + carName + "]" + " �ְ� �ӵ� : " + "[" + maxSpeed + "]" + " �ּ� �ӵ� : " + "[" + minSpeed + "]" + " ���� �� : " + "[" + carColor + "]" );
	}
	
	public stu(String a) {
		this.carName = a;
		this.maxSpeed = 300;
		this.minSpeed = 1400;
		this.carColor = "�Ķ�";
		
		System.out.println("2 ���̸� : " + "[" + a + "]" + " �ְ� �ӵ� : " + "[" + maxSpeed + "]" + " �ּ� �ӵ� : " + "[" + minSpeed + "]" + " ���� �� : " + "[" + carColor + "]" );
		//return(a);
	}
	
	public stu() {
		System.out.println("3 ���̸� : " + "[" + carName + "]" + " �ְ� �ӵ� : " + "[" + maxSpeed + "]" + " �ּ� �ӵ� : " + "[" + minSpeed + "]" + " ���� �� : " + "[" + carColor + "]" );
	}
	
	public void printCar() {
		
		System.out.println("4 ���̸� : " + "[" + carName + "]" + " �ְ� �ӵ� : " + "[" + maxSpeed + "]" + " �ּ� �ӵ� : " + "[" + minSpeed + "]" + " ���� �� : " + "[" + carColor + "]");
	}
	
	public stu(int maxSpeed, int minSpeed) {
		this.maxSpeed = 333;
		this.minSpeed = 155;
		this.carColor = "�Ķ�";
		
		System.out.println("5 ���̸� : " + "[" + carName + "]" + " �ְ� �ӵ� : " + "[" + maxSpeed  + "]" + " �ּ� �ӵ� : " + "[" + minSpeed + "]" + " ���� �� : " + "[" + carColor + "]" );

	}
	
}

