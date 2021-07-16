package PKG_Game;

public class Wizard extends Character
implements fling
{
	private String wName;//마법사만의 마법이름
	
	public Wizard(String cName, String wName) {
		super(cName);
		this.wName = wName;
	}
	
	public String getWName() {
		return this.wName;
	}
	
	public void Magic() {
		System.out.println(cName + "(이)가 마법을 사용한다.");
	}
	
	//@Override // 메써드의 재정의 메모적는거 습관화하기. return '타입'과 '이름'은 똑같아야한다.
 	//public void fly1() {
		//System.out.println(cName + "(이)가 새처럼 날아다닌다.");
	//}
}
