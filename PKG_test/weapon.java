package PKG_test;

public class weapon {
private String wName;
	
	public weapon(String wName) {
		
		this.wName = wName;
	}
	
	public void wShot() {
		
		System.out.println(wName + "À» ½ð´Ù");
	}
	
	public String getWeaponName() {
		return this.wName;
	}
}
