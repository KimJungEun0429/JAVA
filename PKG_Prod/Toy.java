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
		//�峭�� �ƹ��� �������� �شٰ� �ص� �������ݿ��� ��ȭ�� ����. = �峭���� �������� ����.
		int pPrice = super.getProPrice();
		double realPrice = (double)pPrice;
		
		return realPrice;
	}
}
