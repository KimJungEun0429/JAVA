package PKG_store;

public class Cupbob extends Food implements Oven
{
	private String cName;
	private Food fd;
	
	public Cupbob(String fName, String Keep, int price, String dName) {
		super(fName,Keep,price);
		this.cName = dName;
	}
	
	public String getcName() {
		return this.cName;
	}
	
	@Override
	public void oven() {
		System.out.println(cName + "��(��) ���ڷ����� �����մϴ�.");
	}
	
	@Override
	public String Name() {
		return this.cName;
	}
	
	@Override
	public void sale() {
		System.out.println(cName + "�� " + getsale() +"���� �Ǹŵ˴ϴ�.");
	}
}
