package PKG_Sell;

public class member {

	private String memID;
	private String memName;
	private String memid;
	private int totalPrice = 0;
	
	//������
	//class �� intance(��ü�� ����� ���� ��.)ȭ �Ǿ����� �ڵ����� ���ѹ��� ����Ǵ� �Ž��
	//���Ŀ��� ȣ���� �Ұ��ϴ�.
	//�Ž���� overloading
	
	public member() {
		
		this.memid = "M000";
		this.memName = "�ſ��һ�";
		
		System.out.println(memID + "-" + memName + "��" + prodName + "��" + prodPrice + "���� ���� û���� : " + totalPrice);
	}
	
	
	public member(String prodName, int prodPrice) {
		
		this.memID = "m001";
		this.memName = "����";
		
		System.out.println(memID + "-" + memName + "��" + prodName + "��" + prodPrice + "���� ���� û���� : " + totalPrice);
	}
	
	//public member(String memID, String memName) {
		
		//this.memID = memID;
		//this.memName = memName;
		
		//System.out.println(memID + "-" + memName + "��" + prodName + "��" + prodPrice + "���� ���� û���� : " + totalPrice);
	//}
	
	//public member(int memID, String memName) {
		
		//this.memid = memID;
		//this.memName = memName;
		
		//System.out.println(this.memID);
	//}
	
	//public void memBuy(String prodName, int prodPrice) {
		//totalPrice += prodPrice;
		//System.out.println(memID + "-" + memName + "��" + prodName + "��" + prodPrice + "���� ���� û���� : " + totalPrice);
	//}
	
	//public void memBuy(int prodPrice) {
		//System.out.println("���� int: " + prodPrice);
	//}
	
	//public void memBuy(long prodPrice) {
		//System.out.println("���� long: " + prodPrice);
	//}
	
	//public void memBuy(double prodPrice) {
		//System.out.println("���� double: " + prodPrice);
	//}
	
	//public void memBuy() {
		//System.out.println("�ŰԺ��� ����");
	//}

	//public void memNameChg(String name) {
		
		//this.memName = name;
		
	//}
	
}
