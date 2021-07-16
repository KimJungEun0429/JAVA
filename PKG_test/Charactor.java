package PKG_test;

public class Charactor {

		//1.필드, 속성, 
		private String cName;
		private weapon weapon;
		//2.생성자
		public Charactor(String cName) {
			this.cName = cName;
		}
		//3. 메써드
		public void getWeapon(weapon weapon) {
			this.weapon = weapon;
		}
		
		
		public String getWeaponName() {
			
			return this.weapon.getWeaponName();
			
		}
		
		public void shot() {
			this.weapon.wShot();
		}
	//-클래스이 멤버들이라고 부르기도 함
}
