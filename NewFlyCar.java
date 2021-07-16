
public class NewFlyCar extends Car implements Fly
{
	@Override
	public void carRun() {
		System.out.println("새롭게 등장한 뉴플라잉이 달린다.");
	}
	
	@Override
	public void fly() {
		System.out.println("새롭게 등장한 뉴플라잉이 날아간다.");
	}

}
