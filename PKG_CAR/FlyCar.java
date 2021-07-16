package PKG_Car;

//다중 상속
public class FlyCar extends Car//사물을 추상화
					implements Fly//행위를 추상화
{
	public FlyCar(String d) {
		super(carName);
	}
	@Override
	public void carRun() {
		System.out.println("비행기차가 달린다.");
	}
	
	@Override
	public void carStop() {
		System.out.println("비행기차가 멈춘다.");
	}
	
	@Override
	public void fly() {
		System.out.println("비행기차가 멈춘다.");
	}//인터페이스 Fly와 짝지.
}
