 
public class Member {
//ȸ���� ���� ���� = has a ����
	private Car rideCar;
	private Computer com;
	private boolean isFly;
	
	public void rideCar(Car car) {
		//carŸ������ �޾ƾ� ��� ����� �� �����ϴ�.
		this.rideCar = car;
		//�Ҵ�ƴϰ� ������. ��ü�� ������~
	}
	
	public void carDrive() {
		rideCar.carRun();
	}
	
	//���࿡ fly()�޽�带 ������ ������ fly()�޽�带 �����Ű�� ������ ���� �ض�
	public void carFly() {
		if(rideCar instanceof Fly) {
			((Fly)rideCar).fly();
			//flycarŸ���� Ȯ���ϴϱ� �ٿ� ĳ���� ��Ų��.
		}
		else {
			System.out.println("������");
		}	
	}
	
	public void getComputer(Computer com) {
		this.com = com;
	}
	
	public void flyCom() {
		if(com instanceof Fly) {
				com.fly();
		}
		else {
			System.out.println("���� ������ ����.");
		}
	}
}
