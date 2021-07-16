package PKG_Game;

//charater클래스다. 
public class Fighter extends Character
{
		private String wName = "";//전투사만의 무기 이름
		//보통 private으로 만들어 놓기 때문에 아래 get,set 매써드를 만들어놓는다.
		
		public Fighter(String cName) {
			super(cName);//super는 character한테 전달한다는 늬앙스
		}
		
		public Fighter(String cName,String wName) {
			super(cName);
			this.wName = wName;
		}
		
		public void setWName(String wName) {
			this.wName = wName;
		}//이름을 고치고 싶을 때 부르는 매써드
		
		public String getWName() {
			return this.wName;
		}//이름을 검색하고 싶을 때 부르는 매써드
		
		public void fight() {
			System.out.println(cName+ "가(이) " + wName + "을 가지고 싸운다.");
		}//cName을 쓰고 싶은데 private로 만들어놓으면 사용이 어려워서 protected로 일단 만들어놓음
}
