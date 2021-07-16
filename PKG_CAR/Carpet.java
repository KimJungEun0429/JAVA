package PKG_Car;

public class Carpet implements Fly
{//carpet는 car와 is a관계
	//fly는 is a관계가 아님
	
	public Carpet() {
		
	}
	
	@Override
	public void fly() {
		System.out.println("카페트가 날아가요");
	}
	
	@Override
	public void land() {
		System.out.println("착륙");
	}
	
	public void carPetFly() {
		System.out.println("카페트가 나른다");
	}
}
