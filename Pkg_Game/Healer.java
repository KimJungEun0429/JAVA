package PKG_Game;

public class Healer extends Character {

	private String mName;
	
	public Healer(String cName, String mName) {
		super(cName);
		this.mName = mName;
	}
	
	public void heal() {
		System.out.println(cName + "�� ġ���Ѵ�.");
	}
	
	@Override //�Ž���� ������
	//����� �Ҷ� Ư�� �Ž�带 ����� ��Ű���ִ� �θ�Ŭ������ ���� �ִ� �Ž�带  �������Ѵ�. 
	public void fly() {
		System.out.println(cName + "�� ����ٴϴ°� �¾�.");
	}
	
}
