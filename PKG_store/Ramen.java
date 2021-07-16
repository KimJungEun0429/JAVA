package PKG_store;

public class Ramen extends Food implements Oven, HotWater
{
	private String rName;
	
	public Ramen(String fName, String Keep, int price, String rName) {
		super(fName,Keep,price);
		this.rName = rName;
	}
	
	public String getrName() {
		return this.rName;
	}
	
	//�������̽�
	@Override
	public void oven() {
		System.out.println(rName + "��(��) ���ڷ����� �����մϴ�.");
	}
	
	@Override
	public void hotWater() {
		System.out.println(rName + "�� �߰ſ� ���� �ֽ��ϴ�.");
	}
	
	@Override
	public String Name() {
		return this.rName;
	}
	
	@Override
	public void sale() {
		System.out.println(rName + "�� " + getsale() +"���� �Ǹŵ˴ϴ�.");
	}
	
}
