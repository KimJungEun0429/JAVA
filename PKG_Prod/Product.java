package PKG_Prod;

//추상화 - 추상클래스 - main 메써드에서 instance화 할 수 없다.
public abstract class Product {

	private String pNAME;
	private int pPrice;//정가
	private double sPrice;//판매가격
	
	public Product(String pName) {
	}
	
	public Product(String pName, int pPrice) {
		this.pNAME = pName;
		this.pPrice = pPrice;
	}
	
	public int getProPrice() {
		return this.pPrice;
	}//protected로 열어주면 안되느냐? - 그러면 값을 고칠 수 있으니까
	
	//실제 판매가격
	public abstract double getPrice(double offRate);
	//추상메써드, 추상멤버(리턴값,매게변수,이름도 있는데 내용이 없다.)
	//추상클래스를 상속받는 클래스에서 '반드시' 매써드 재정의해야한다. 
	
	
}//end
