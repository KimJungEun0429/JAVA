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
		System.out.println(sName + "�� " + discount() +"���� �Ǹŵ˴ϴ�.");
	}
	
//	public void getDiscount() {
//		if(hasDiscount < 1) {
//			callback.callback(hasDiscount);
//		}
//		else {
//			System.out.println("������ ���� ���� ���� �����Դϴ�.");
//		}
//		this.hasDiscount = 1;
//	}
}//end

	
