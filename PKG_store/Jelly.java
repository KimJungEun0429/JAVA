package PKG_store;

public class Jelly extends Food
{
	private String jName;
	
	public Jelly(String fName, String Keep, int price, String jName){
		super(fName, Keep, price);
		this.jName = jName;
	}
	
	@Override
	public String Name() {
		return this.jName;
	}
	
	@Override
	public void sale() {
		System.out.println(jName + "은 " + getsale() +"원에 판매됩니다.");
	}
}
