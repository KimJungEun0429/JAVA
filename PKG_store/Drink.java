package PKG_store;

public class Drink extends Food  
{
	private String dName;
	
	public Drink(String fName, String fID, int price, String dName) {
		super(fName,fID,price);
		this.dName = dName;
	}
	
	public String getdName() {
		return this.dName;
	}
	
	@Override
	public String Name() {
		return this.dName;
	}
	
	@Override
	public void sale() {
		System.out.println(dName + "은 " + getsale() +"원에 판매됩니다.");
	}
	
}

