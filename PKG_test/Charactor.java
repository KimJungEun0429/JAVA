package PKG_test;

public class Charactor {

		//1.�ʵ�, �Ӽ�, 
		private String cName;
		private weapon weapon;
		//2.������
		public Charactor(String cName) {
			this.cName = cName;
		}
		//3. �޽��
		public void getWeapon(weapon weapon) {
			this.weapon = weapon;
		}
		
		
		public String getWeaponName() {
			
			return this.weapon.getWeaponName();
			
		}
		
		public void shot() {
			this.weapon.wShot();
		}
	//-Ŭ������ ������̶�� �θ��⵵ ��
}
