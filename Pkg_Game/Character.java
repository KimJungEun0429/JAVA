package PKG_Game;

public class Character {

	//�߻�ȭ�� Ŭ����
	//1.�Ӽ�
	protected String cName;
	
	public Character(String cName) {
		this.cName = cName;
	}
	
	//2.����
	public void run() {
		System.out.println(cName + "(��)�� ����.");
	}
	
	public void stop() {
		System.out.println(cName + "(��)�� �����.");
	}
	
	//��ӹ޴� ������ ĳ���͵��� ���� ����� �� �ٸ���.
	//�ܼ��ϰ� ������ٴ� �߻����� ���丸 �����ϴ�.
	public void fly() {
		System.out.println(cName + "(��)�� �����.");
	}
}
