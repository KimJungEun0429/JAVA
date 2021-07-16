package PKG_Sale;

public abstract class Product {
//abstract는 Product라는 클래스는 오로지 추상화를 목적으로 만든 추상클래스라는 의미이다.
//이렇게 만들어진 추상클래스는 절대로 인스턴스화 할 수 없다.
//우리는 product를 사용할 것이 아니라 computer과 book클래스를 사용할 것이기 때문.
//추상클래스는 추상멤버를 가질 수 있다.
	private String bName;
	private	int bPrice;
	
	public Product(String bName, int bPrice) {
		this.bName = bName;
		this.bPrice = bPrice;
	}
	
	/*
	public abstract double setRealPrice(double offRate){
		double realPrice = (double)this.bPrice * (1- offRate);
		
		return realPrice;}*/
	//abstract라고 하면 얘는 추상멤바가 된다.
	
	public String getName() {
	
		return this.bName;
	
	}
	
	//추상 멤버 - 내용이 없는 메써드- 행위만 있음. 진정한 추상화
	public abstract double setRealPrice(double offRate);
	
	//abstract라고 하면 얘는 추상멤바가 된다. 어떻게 행위하는지는 모르지만
	//이런 행위를 하면 너를 product라고 인정해주겠다
	//상속을 받는 클래스에서 반드시 반드시 재정의(override)해야만 한다.
	

	protected int getPrice() {
		return this.bPrice;
	}//computer에서 bPrice를 사용하고 싶은데 private로 되어 있으니 만들어줌
	
}
