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
			System.out.println(rName + "��(��) " + /*((Ramen)pro).getProPname()*/ pro.Name() + "�� " + qty +"�� �����ؼ� �� " + total + "�� �Դϴ�.");
			//System.out.println(vName + "�� " + /*((Ramen)pro).getProPname()*/ "�� ���� ������ " + totalPrice + "�� �Դϴ�.");
		}
		
		else if(this.Lvl.equals("VIP")) {
			total = pro.getsale() * qty * 0.8;
			totalPrice += total;
			System.out.println(rName + "��(��) " + /*((Ramen)pro).getProPname()*/ pro.Name() + "�� " + qty +"�� �����ؼ� �� " + total + "�� �Դϴ�.");
			//System.out.println(vName + "�� " + /*((Ramen)pro).getProPname()*/ "�� ���� ������ " + totalPrice + "�� �Դϴ�.");
		}
		
		else {
			total = pro.getsale() * qty;
			totalPrice += total;
			System.out.println(rName + "��(��) " + /*((Ramen)pro).getProPname()*/ pro.Name() + "�� " + qty +"�� �����ؼ� �� " + total + "�� �Դϴ�.");
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
	
	
//	//�ݹ��Լ�
//	public void pursnack(Snack snack) {
//		this.snack = snack;
//	}
//	
//	public void getPoint(Snack snack) {
//		snack.getDiscount();
//	}//���� ������ �� �� ������ ����� snack���� getDiscount�� ����.
//	
//	@Override
//	public void callback(double hasDiscount) {
//		double r = snack.discount() * hasDiscount;
//		System.out.println(r +"������ ���ŵǾ����ϴ�.");
//	}
}//member end
