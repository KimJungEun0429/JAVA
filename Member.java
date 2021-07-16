 
public class Member {
//회원이 차를 탔다 = has a 관계
	private Car rideCar;
	private Computer com;
	private boolean isFly;
	
	public void rideCar(Car car) {
		//car타입으로 받아야 기능 사용이 다 가능하다.
		this.rideCar = car;
		//할당아니고 참조다. 객체기 때문에~
	}
	
	public void carDrive() {
		rideCar.carRun();
	}
	
	//만약에 fly()메써드를 가지고 있으면 fly()메써드를 실행시키고 없으면 없다 해라
	public void carFly() {
		if(rideCar instanceof Fly) {
			((Fly)rideCar).fly();
			//flycar타입이 확실하니까 다운 캐스팅 시킨다.
		}
		else {
			System.out.println("못난다");
		}	
	}
	
	public void getComputer(Computer com) {
		this.com = com;
	}
	
	public void flyCom() {
		if(com instanceof Fly) {
				com.fly();
		}
		else {
			System.out.println("나는 날수가 없다.");
		}
	}
}
