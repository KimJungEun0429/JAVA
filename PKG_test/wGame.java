package PKG_test;

public class wGame {

	public static void main(String[] args) {
		Charactor c = new Charactor("������");
		Charactor c2 = new Charactor("�߿���");
		Charactor c3 = new Charactor("�۸���");
		
		weapon w1 = new weapon("��");
		weapon w2 = new weapon("����");
		weapon w3 = new weapon("�����");
		weapon w4 = new weapon("��ũ");
		
		c.getWeapon(w1);
		
		c.shot();
		
		c.getWeapon(w2);
		
		c.shot();
		
		c.getWeapon(w3);
		c.shot();
		c.shot();
		
		c.getWeapon(w4);
		c.shot();
		
		String wName = c.getWeaponName();
		
		System.out.println(wName);
		
		c.getWeapon(w2);
		
		wName = c.getWeaponName();
		
		System.out.println(wName);
		
		
		c2.getWeapon(w1);
		c2.shot();
		String wName2 = c2.getWeaponName();
		System.out.println(wName2);
		
		
		c3.getWeapon(w4);
		c3.shot();
		System.out.println(c3.getWeaponName());

	}//main

}
