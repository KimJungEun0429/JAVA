package PKG_Car;

public class Carpet implements Fly
{//carpet�� car�� is a����
	//fly�� is a���谡 �ƴ�
	
	public Carpet() {
		
	}
	
	@Override
	public void fly() {
		System.out.println("ī��Ʈ�� ���ư���");
	}
	
	@Override
	public void land() {
		System.out.println("����");
	}
	
	public void carPetFly() {
		System.out.println("ī��Ʈ�� ������");
	}
}
