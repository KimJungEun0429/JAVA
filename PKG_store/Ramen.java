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
	
	//인터페이스
	@Override
	public void oven() {
		System.out.println(rName + "을(를) 전자렌지에 조리합니다.");
	}
	
	@Override
	public void hotWater() {
		System.out.println(rName + "에 뜨거운 물을 넣습니다.");
	}
	
	@Override
	public String Name() {
		return this.rName;
	}
	
	@Override
	public void sale() {
		System.out.println(rName + "은 " + getsale() +"원에 판매됩니다.");
	}
	
}
