package PKG_Prod;

public class Computer extends Product
{//private�� ���������� ����� �޾Ƶ� �ش� �Ӽ��� ����� ��ƴ�

	private String cpuName;
	
	public Computer(String pName, int pPrice, String cpuName) {
		super(pName,pPrice);
		this.cpuName = cpuName;
		//super��  product�� ���� ��ӽ�Ű�� �θ�Ŭ������
	}
	
	@Override
	public double getPrice(double offRate) {
		int pPrice = super.getProPrice();
		double realPrice =  pPrice * (1 - offRate);
		
		return realPrice;
	}
}
