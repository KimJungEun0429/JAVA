
public class NewFlyCar extends Car implements Fly
{
	@Override
	public void carRun() {
		System.out.println("���Ӱ� ������ ���ö����� �޸���.");
	}
	
	@Override
	public void fly() {
		System.out.println("���Ӱ� ������ ���ö����� ���ư���.");
	}

}
