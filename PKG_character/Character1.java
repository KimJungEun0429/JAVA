package PKG_character;

import PKG_Spot.Spot;

public class Character1 {
	
	private String cNAME;
	private int cAge;
	private int cLVL = 1;
	
	//�Ӽ�
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
	
	//����
	public void run() {
		System.out.println("[" + cNAME + "] ��(��) �ȴ´�");
	}
	
	public void birth() {
		System.out.println("[" + cNAME + "] ��(��) �¾��.");
	}
	
	public void lvlup() {
		System.out.println("[" + cNAME + "] ��(��) " + cLVL + "�� ������ �Ǿ���." );
	}
	
	public int setlvl(int lvl) {
		this.cLVL = lvl;
		return cLVL;
	}
	
	public void getlvl() {
		System.out.println("���� [" + cNAME + "] �� ������ " + this.cLVL + "�Դϴ�.");
	}
	
	public void getSpot(Spot place) {
		System.out.println(cNAME + "�� ���� " + place.getSport() + "�Դϴ�.");
	}
}
