package PKG_store;

import PKG_Member.*;

public abstract class Food {
	
	private String fName;
	private String keepName;
	private int price;

	
	public Food(String fName, String keepName, int price) {
		this.fName = fName;
		this.keepName = keepName;
		this.price = price;
	}

	public double getsale() {
		return this.price;
	}
	
	public String getkeepName() {
		return this.keepName;
	}
	
	public String getProPname() {
		return this.fName;
	}
	
	//���� - �Ǹŵȴ�. �����ȴ�.
	public abstract String Name();
	public abstract void sale();
	

	

	
	

	
	
}
