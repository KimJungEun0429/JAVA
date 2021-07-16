package PKG_Car;

public class Member implements Callback
{
	
	private String memName;
	private Gender memGender;
	//has a 관계
	private Car car;
	private Carpet carpet;
	//has a 관계
	
	public Member(String memName, Gender memGender) {
		this.memName = memName;
		this.memGender = memGender;
	}
	
	public void rideCar(Car car) {
		//29살 소녀가 이쁜 트럭을 탔어요
		this.car = car;
		System.out.println(this.memName + "가" + car.getCarName() + "을 탔어요");
	}
	
	public void driveCar() {
		this.car.carRun();
		//타는 순간 has a 관계로 만들어준다.
	}
	
	public void flyCar() {
		/*
		//혹시 this.car가 flycar타입이면 carFly()을 실행시켜줘
		if(this.car instanceof FlyCar) {
			((FlyCar)car).carFly();
		}
		else if(this.car instanceof AirCar) {
			((AirCar)car).airCarFly();
		}
		else {
			System.out.println("못 날아요");
		}
		*///인터페이스로 만들지 않는다면, if안에 fly가 있는 애들마다 만들어줘야한다.
		//인터페이스로 만들어 놓으면 아래처럼 만들어놓고 끝.
		
		//혹시 this.car가 날라가고 착륙한다는 기능을 가진 인터페이스를 장착했니?
		if(this.car instanceof Fly) {
			((Fly)this.car).fly();
		}
		else if(this.car instanceof Fly) {
			((Fly)this.car).land();
		}
		else {
			System.out.println("못 날아요");
		}
	}
	
	public void hasObject(/*Object obj*/ Carpet carpet) {
		//this.carpet = (Carpet)obj;
		//obj가 카펫이 아니어도 받아지므로 오류가 언젠가는 날걸?
		this.carpet = carpet;
	}
	//자동차 이외의 나머지 물품에 대해서는 적어도 특별한게 없다고 했을 때,
	//Object로 받아오는 것. 추상화가 없을때 근데 좋은 코딩은 아니다

	
	public void carpetFly() {
		this.carpet.carPetFly();
	} //이렇게 코딩하면 코딩이 된 것 처럼 느껴진다
	
	public void returnMsg(String methoName) {
		System.out.println(methoName + "실행이 완료되었데요");
	}
	
	public void getMoney() {
		((FlyCar)this.car).getMoney();
	}
	
	
}
