package PKG_Sale;

public class Computer extends Product
{
	private String cpuName;
	
	//생성자는 클래스와 이름이 똑같고 이 클래스가 인스턴스화 되어질 때 한번만 실행되는 메써드
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
