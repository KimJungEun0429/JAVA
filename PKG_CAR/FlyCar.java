package PKG_Car;

//���� ���
public class FlyCar extends Car//�繰�� �߻�ȭ
					implements Fly//������ �߻�ȭ
{
	public FlyCar(String d) {
		super(carName);
	}
	@Override
	public void carRun() {
		System.out.println("��������� �޸���.");
	}
	
	@Override
	public void carStop() {
		System.out.println("��������� �����.");
	}
	
	@Override
	public void fly() {
		System.out.println("��������� �����.");
	}//�������̽� Fly�� ¦��.
}
