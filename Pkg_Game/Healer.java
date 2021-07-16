package PKG_Game;

public class Healer extends Character {

	private String mName;
	
	public Healer(String cName, String mName) {
		super(cName);
		this.mName = mName;
	}
	
	public void heal() {
		System.out.println(cName + "가 치료한다.");
	}
	
	@Override //매써드의 재정의
	//상속을 할때 특정 매써드를 상속을 시키고있는 부모클래스가 갖고 있는 매써드를  재정의한다. 
	public void fly() {
		System.out.println(cName + "가 날라다니는거 맞어.");
	}
	
}
