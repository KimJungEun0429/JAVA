package PKG_Gamestart;

import PKG_Spot.*;
import PKG_character.*;

public class GameStart {

	public static void main(String[] args) {
		
		Character1 c1 = new Character1("뭉");
		c1.birth();
		c1.run();
		c1.setlvl(3);
		c1.lvlup();
		c1.getlvl();
		
		
		Character1 c2 = new Character1("흥구");
		c2.birth();
		c2.run();
		
		Character1 c3 = new Character1("티모");
		c3.birth();
		c3.run();
		
		House s1 = new House("집","오두막");
		c1.getSpot(s1);
		
		Store s2 = new Store("상점","가게");
		
		
		String c3_name = c3.getcNAME();
		System.out.println();
	}

}
