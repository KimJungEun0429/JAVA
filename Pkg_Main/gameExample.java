package Pkg_Main;

import PKG_Game.Fighter;
import PKG_Game.Healer;
import PKG_Game.Wizard;


public class gameExample {

	public static void main(String[] args) {
		
		Fighter f1 = new Fighter("�ο��","��");
		f1.run();
		f1.stop();
		f1.fight();
		String f1_Weapon = f1.getWName();
		System.out.println(f1_Weapon);
		f1.fly();
		
		Fighter f2 = new Fighter("�߿���");
		f2.fight();
		//String f2_Weapon = f2.getWName();
		f2.setWName("����");
		//String f2_Weapon = f2.getWName();
		f2.fight();
		f2.fly();
		
		Wizard w1 = new Wizard("�տ���","��������");
		w1.run();
		w1.stop();
		w1.Magic();
		w1.fly();
		String w1_mName = w1.getWName();
		
		
		Healer h1 = new Healer("ġ���","����");
		h1.run();
		h1.stop();
		h1.heal();
		h1.fly();
		
		
		
	}

}
