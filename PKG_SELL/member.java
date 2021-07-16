package PKG_Sell;

public class member {

	private String memID;
	private String memName;
	private String memid;
	private int totalPrice = 0;
	
	//생성자
	//class 가 intance(객체로 만들어 지는 것.)화 되어지면 자동으로 딱한번만 실행되는 매써드
	//이후에는 호출이 불가하다.
	//매써드의 overloading
	
	public member() {
		
		this.memid = "M000";
		this.memName = "신원불상";
		
		System.out.println(memID + "-" + memName + "이" + prodName + "을" + prodPrice + "원에 구매 청가격 : " + totalPrice);
	}
	
	
	public member(String prodName, int prodPrice) {
		
		this.memID = "m001";
		this.memName = "누리";
		
		System.out.println(memID + "-" + memName + "이" + prodName + "을" + prodPrice + "원에 구매 청가격 : " + totalPrice);
	}
	
	//public member(String memID, String memName) {
		
		//this.memID = memID;
		//this.memName = memName;
		
		//System.out.println(memID + "-" + memName + "이" + prodName + "을" + prodPrice + "원에 구매 청가격 : " + totalPrice);
	//}
	
	//public member(int memID, String memName) {
		
		//this.memid = memID;
		//this.memName = memName;
		
		//System.out.println(this.memID);
	//}
	
	//public void memBuy(String prodName, int prodPrice) {
		//totalPrice += prodPrice;
		//System.out.println(memID + "-" + memName + "이" + prodName + "을" + prodPrice + "원에 구매 청가격 : " + totalPrice);
	//}
	
	//public void memBuy(int prodPrice) {
		//System.out.println("가격 int: " + prodPrice);
	//}
	
	//public void memBuy(long prodPrice) {
		//System.out.println("가격 long: " + prodPrice);
	//}
	
	//public void memBuy(double prodPrice) {
		//System.out.println("가격 double: " + prodPrice);
	//}
	
	//public void memBuy() {
		//System.out.println("매게변수 없음");
	//}

	//public void memNameChg(String name) {
		
		//this.memName = name;
		
	//}
	
}
