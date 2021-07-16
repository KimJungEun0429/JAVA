package PKG_Sale;

public class SaleExample {
	
	public static void main(String[] args) {
		
		Computer C = new Computer("ÄÄÇ»ÅÍ", 500, "OLD CPU");
		
		double realPrice = C.setRealPrice(0.1);
		
		System.out.println(C.getName() + " : " + realPrice);
		
	}
}
