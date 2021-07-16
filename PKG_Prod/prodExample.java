package PKG_Prod;

public class prodExample {

	public static void main(String[] args) {
	
		double[] salePrices = new double[4];
		
		
		Computer[] computers = new Computer[2];
		computers[0] = new Computer("컴퓨터", 50000, "인텔");
		salePrices[0] = computers[0].getPrice(0.25);
		
		computers[1] = new Computer("컴퓨터", 10000, "팬티엄");
		salePrices[1] = computers[1].getPrice(0.25);
		
		Toy[] toys = new Toy[2];
		toys[0] = new Toy("장난감",1000,"트럭");
		toys[1] = new Toy("장난감",500,"인형");
		
	//Computer C = new Computer("컴퓨터", 50000, "인텔");
	//salePrices[0] = C.getPrice(0.25);
	//double salePrice = C.getPrice(0.25);
	
	//Toy T = new Toy("장난감",10000,"트럭");
	//salePrices[1] = T.getPrice(0.25);
	
	//배열로 안만들었을 때 코딩
	//System.out.println(salePrice);
	
	//Toy T = new Toy("장난감",10000,"트럭");
	//double salePrice2 = T.getPrice(0.5);
	
	
	for(int i =0; i<salePrices.length; i++) {
		System.out.println(salePrices[i]);
	}
	
	
	//casting
	Product c1 = new Computer("컴퓨터",1000,"팬티엄");
	Product t1 = new Toy("장난감",500,"트럭");
	//업케스팅 설명을 위한 과정에서 보여준 업케스팅
	//이렇게 쓰는 것이 곧 Member클래스에서 purchase에 Product형으로 불러준 것과 같으나 
	//실제 코딩과정에선 사용할 일이 없음. 완성형은 
	//Computer c11 = new Computer();라고 해놓고 Product p로 받아서 넣어주는 것
	//상속내에서 가능함.
	
	System.out.println();
	
	Computer c11 = new Computer("노트북",100,"인텔");
	Toy t11 = new Toy("장난감",100,"준혁");
	
	Member m = new Member(); 
	m.purchase(t11);
	m.purchase(c11);
	

	}
}
