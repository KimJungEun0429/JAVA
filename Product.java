
public class Product {

	private String pName;
	private Customer cus;
	private int qty;
	
	public Product(String pName, int qty) {
		this.pName = pName;
		this.qty = qty;
	}
	
	public String getpName() {
		return this.pName;
	}
	
	public void sale(Customer cus) {
		System.out.println(cus.getcName() + "이가 샀어요");
	}
	
	public void getProduct() {
		if(this.qty == 1) {
			System.out.println("구매완");
		}
		else {
			System.out.println("재고가 없어요");
		}
		
		this.qty = 0;
	}

	
	
}
