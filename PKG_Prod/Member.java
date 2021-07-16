package PKG_Prod;

public class Member {
	
	//상품을 구매한다.
	
	
	public void purchase(Product p) {
		double realPrice = p.getPrice(0.5);
		System.out.println(realPrice);
	}
	
	
	/*
	public void purchaseCom(Computer p) {
		double realPrice = p.getPrice(0.5);
		System.out.println(realPrice);
	}//업케스팅이 없으면 이렇게 컴퓨터는 컴퓨터의 계산이 있어야하고 toy는 toy의 계산이 있어야한다.*/
	
	
}
