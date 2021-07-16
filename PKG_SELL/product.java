package PKG_SELL;

public class product {
		
	public String proName;
	public String proID;
	public int price;
	
	public product(String a, String b, int c) {
		this.proName = a;
		this.price = c;
	}

	public String getName() {
		return this.proName;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	
}
