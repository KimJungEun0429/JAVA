package PKG_Prod;

public class Toy extends Product
{
	private String tName;
	
	public Toy(String pPName, int pPrice, String tName) {
		super(pPName, pPrice);
		this.tName = tName;
		
	}
	
	@Override
	public double getPrice(double offRate) {
		//장난감 아무리 할인율을 준다고 해도 실제가격에는 변화가 없다. = 장난감은 할인율이 없다.
		int pPrice = super.getProPrice();
		double realPrice = (double)pPrice;
		
		return realPrice;
	}
}
