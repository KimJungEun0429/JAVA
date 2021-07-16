package PKG_Member;

import PKG_store.CallBack;
import PKG_store.*;

public class Member //implements CallBack
{

	private String rName;
	private String Lvl;
	private double total;
	private static double totalPrice;
	private int qty;
	private String saleFoodName;
	private String rsaleFoodName="";
	//private Snack snack;
	
	public Member(String Lvl,String rName) {
		
		this.Lvl = Lvl;
		this.rName = rName;
	}
	
	public void purchase(Food pro, int qty) {
		this.saleFoodName = pro.Name();
		this.qty = qty;
		if(this.Lvl.equals("VVIP")) {
			total = pro.getsale() * qty * 0.7;
		
			totalPrice += total;
			System.out.println(rName + "가(이) " + /*((Ramen)pro).getProPname()*/ pro.Name() + "을 " + qty +"개 구매해서 총 " + total + "원 입니다.");
			//System.out.println(vName + "의 " + /*((Ramen)pro).getProPname()*/ "총 구매 가격은 " + totalPrice + "원 입니다.");
		}
		
		else if(this.Lvl.equals("VIP")) {
			total = pro.getsale() * qty * 0.8;
			totalPrice += total;
			System.out.println(rName + "가(이) " + /*((Ramen)pro).getProPname()*/ pro.Name() + "을 " + qty +"개 구매해서 총 " + total + "원 입니다.");
			//System.out.println(vName + "의 " + /*((Ramen)pro).getProPname()*/ "총 구매 가격은 " + totalPrice + "원 입니다.");
		}
		
		else {
			total = pro.getsale() * qty;
			totalPrice += total;
			System.out.println(rName + "가(이) " + /*((Ramen)pro).getProPname()*/ pro.Name() + "을 " + qty +"개 구매해서 총 " + total + "원 입니다.");
		}

	}
	
	public static double getTotalPrice() {
		return totalPrice;
	}
	
	public int getQty() {
		return this.qty;
	}
	
	public void Invoice() {
		rsaleFoodName = rsaleFoodName + saleFoodName;
		//Name = rsaleFoodName;
		System.out.println(rsaleFoodName);
	}
	
	
//	//콜백함수
//	public void pursnack(Snack snack) {
//		this.snack = snack;
//	}
//	
//	public void getPoint(Snack snack) {
//		snack.getDiscount();
//	}//내가 할인을 할 수 있을까 물어보면 snack에서 getDiscount을 실행.
//	
//	@Override
//	public void callback(double hasDiscount) {
//		double r = snack.discount() * hasDiscount;
//		System.out.println(r +"원으로 구매되었습니다.");
//	}
}//member end
