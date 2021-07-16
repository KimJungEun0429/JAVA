package PKG_store;

import PKG_Member.Member;

public class Snack extends Food 
{	
	private String sName;
	//private double hasDiscount;
	//private CallBack callback;
	private double realPrice;
	
	public Snack(String fName, String keepName, int price, String sName, double hasDiscount){
		super(fName, keepName, price);
		this.sName = sName;
		//this.hasDiscount = hasDiscount;
	}
	public String getsName() {
		return this.sName;
	}
	
	public double discount() {
		realPrice = getsale() * 0.5;
		return realPrice;
	}
		
	public String Name() {
		return this.sName;
	}
	
//	public void getPoint(CallBack callback) {
//		this.callback = callback;
//	}
	
	@Override
	public void sale() {
		System.out.println(sName + "은 " + discount() +"원에 판매됩니다.");
	}
	
//	public void getDiscount() {
//		if(hasDiscount < 1) {
//			callback.callback(hasDiscount);
//		}
//		else {
//			System.out.println("할인이 적용 되지 않은 과자입니다.");
//		}
//		this.hasDiscount = 1;
//	}
}//end

	
