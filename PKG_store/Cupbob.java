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
		System.out.println(cName + "을(를) 전자렌지에 조리합니다.");
	}
	
	@Override
	public String Name() {
		return this.cName;
	}
	
	@Override
	public void sale() {
		System.out.println(cName + "은 " + getsale() +"원에 판매됩니다.");
	}
}
