
public class Example {

	public static void main(String[] args) {
		
		Customer mem = new Customer("ÁöÇý");
		
		Product pro = new Product("¸Àµ¿»ê",1);
		Product pro1 = new Product("Ä¡Å²",2);
		
		mem.purchase(pro);
		pro.sale(mem);
		
		mem.askPro();
		
		mem.purchase(pro);
		pro.sale(mem);
		
		mem.askPro();
		
		
		
		
	}

}
