package PKG_Prod;

public class Computer extends Product
{//private로 막혀있으면 상속을 받아도 해당 속성은 사용이 어렵다

	private String cpuName;
	
	public Computer(String pName, int pPrice, String cpuName) {
		super(pName,pPrice);
		this.cpuName = cpuName;
		//super는  product다 나를 상속시키는 부모클래스다
	}
	
	@Override
	public double getPrice(double offRate) {
		int pPrice = super.getProPrice();
		double realPrice =  pPrice * (1 - offRate);
		
		return realPrice;
	}
}
