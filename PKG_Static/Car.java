package PKG_Static;

public class Car {
	
	public int speed = 0;
	public int carCount = 0; //static �������
	public int carCNT;
	public String carName;
	
	//������� - static member

	
	public static int speed2= 0;
	//���α׷��� ����� �� ���� ��������ʴ´�.
	//�׷��� ���α׷��� ������ ������ ���� ������ ���� ���� �ְ� ���� �� static�� ����Ѵ�.
	//��ü������ ���հ����� �ʿ��� ��Ȳ���� static�� ����ؾ� ���ϴ�. �Ժη� ����ϸ� �ȵȴ�n
	
	public Car(String carName) {
		this.carCount += 1;
		this.carCNT = 1;
		this.carName = carName;
		}
	
}
