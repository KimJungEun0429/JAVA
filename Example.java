
public class Example {

	public static void main(String[] args) {
		
		Customer mem = new Customer("����");
		
		Product pro = new Product("������",1);
		Product pro1 = new Product("ġŲ",2);
		
		mem.purchase(pro);
		pro.sale(mem);
		
		mem.askPro();
		
		mem.purchase(pro);
		pro.sale(mem);
		
		mem.askPro();
		
		
		
		
	}

}
