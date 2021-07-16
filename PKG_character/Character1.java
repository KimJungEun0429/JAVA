package PKG_character;

import PKG_Spot.Spot;

public class Character1 {
	
	private String cNAME;
	private int cAge;
	private int cLVL = 1;
	
	//속성
	public Character1(String cName) {
		this.cNAME = cName;
	}
	
	public String cNAME(String A) {
		this.cNAME = A;
		return cNAME;
	}
	
	public String cNAME(String A, int B) {
		this.cNAME = A;
		this.cLVL = B;
		return cNAME;
	}
	
	public String getcNAME() {
		return this.cNAME;
	}
	
	//행위
	public void run() {
		System.out.println("[" + cNAME + "] 가(이) 걷는다");
	}
	
	public void birth() {
		System.out.println("[" + cNAME + "] 가(이) 태어났다.");
	}
	
	public void lvlup() {
		System.out.println("[" + cNAME + "] 가(이) " + cLVL + "로 레벨업 되었다." );
	}
	
	public int setlvl(int lvl) {
		this.cLVL = lvl;
		return cLVL;
	}
	
	public void getlvl() {
		System.out.println("현재 [" + cNAME + "] 의 레벨은 " + this.cLVL + "입니다.");
	}
	
	public void getSpot(Spot place) {
		System.out.println(cNAME + "의 집은 " + place.getSport() + "입니다.");
	}
}
