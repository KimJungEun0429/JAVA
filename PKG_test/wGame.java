package PKG_test;

public class wGame {

	public static void main(String[] args) {
		Charactor c = new Charactor("公过磊");
		Charactor c2 = new Charactor("具克捞");
		Charactor c3 = new Charactor("港港捞");
		
		weapon w1 = new weapon("醚");
		weapon w2 = new weapon("措器");
		weapon w3 = new weapon("扁包醚");
		weapon w4 = new weapon("攀农");
		
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
