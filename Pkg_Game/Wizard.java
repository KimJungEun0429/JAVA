package PKG_Game;

public class Wizard extends Character
implements fling
{
	private String wName;//�����縸�� �����̸�
	
	public Wizard(String cName, String wName) {
		super(cName);
		this.wName = wName;
	}
	
	public String getWName() {
		return this.wName;
	}
	
	public void Magic() {
		System.out.println(cName + "(��)�� ������ ����Ѵ�.");
	}
	
	//@Override // �޽���� ������ �޸����°� ����ȭ�ϱ�. return 'Ÿ��'�� '�̸�'�� �Ȱ��ƾ��Ѵ�.
 	//public void fly1() {
		//System.out.println(cName + "(��)�� ��ó�� ���ƴٴѴ�.");
	//}
}
