package PKG_Sale;

public class Computer extends Product
{
	private String cpuName;
	
	//�����ڴ� Ŭ������ �̸��� �Ȱ��� �� Ŭ������ �ν��Ͻ�ȭ �Ǿ��� �� �ѹ��� ����Ǵ� �޽��
	public Computer(String bName, int bPrice, String cpuName) {
		super(bName,bPrice);
		this.cpuName = cpuName;
	}
	
	@Override
	public double setRealPrice(double offRate) {
		
		int price = super.getPrice();
		double realPrice = price * (1 - offRate);
		return realPrice;
	}
}
