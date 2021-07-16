package PKG_Game;

public class Character {

	//추상화된 클래스
	//1.속성
	protected String cName;
	
	public Character(String cName) {
		this.cName = cName;
	}
	
	//2.행위
	public void run() {
		System.out.println(cName + "(이)가 간다.");
	}
	
	public void stop() {
		System.out.println(cName + "(이)가 멈춘다.");
	}
	
	//상속받는 각각의 캐릭터들의 나는 방법이 다 다르다.
	//단순하게 날라댕긴다는 추상적인 개념만 가능하다.
	public void fly() {
		System.out.println(cName + "(이)가 날라요.");
	}
}
