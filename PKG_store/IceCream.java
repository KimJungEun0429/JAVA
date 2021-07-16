package PKG_store;

public class IceCream extends Food implements Cold
{
	private String iName;
	
	public IceCream(String fName, String Keep, int price, String iName){
		super(fName, Keep, price);
		this.iName = iName;
	}
	
	@Override
	public double getsale() {
		double realPrice = super.getsale() * 0.5;
		return realPrice;
	}
	
	@Override
	public void cold() {
		System.out.println(iName + "을 " + getkeepName() + "의 냉동고에 보관 합니다.");
	}
	
	@Override
	public String Name() {
		return this.iName;
	}
	
	@Override
	public void sale() {
		System.out.println(iName + "은 " + getsale() +"원에 판매됩니다.");
	}
}
