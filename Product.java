
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
		System.out.println(cus.getcName() + "�̰� ����");
	}
	
	public void getProduct() {
		if(this.qty == 1) {
			System.out.println("���ſ�");
		}
		else {
			System.out.println("��� �����");
		}
		
		this.qty = 0;
	}

	
	
}
