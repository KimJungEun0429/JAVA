package PKG_SELL;

public class Member_purches {

	public static void main(String[] args) {
		
		Member mem1 = new Member("이승주","M001","F");
		
		product pro = new product("아아메","P001",1500);

		mem1.purchase(pro,1);
		mem1.purchase(pro,2);
	}

}
