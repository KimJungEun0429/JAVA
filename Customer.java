
public class Customer {

	private String cName;
	private Product pro;
	
	public Customer(String cName) {
		this.cName = cName;
	}
	
	public String getcName() {
		return this.cName;
	}
	
	public void purchase(Product pro) {
		this.pro = pro;
		System.out.println(pro.getpName() + "�� �ȷȾ��");
	}
	
	public void askPro() {
		pro.getProduct();
	}
}
