package PKG_car;

public class Game {

	public static void main(String[] args) {
		
		//자동차 게임을 만들 것이라면 자동차 게임에 필요한
		//1. 자동차 - 엔진, 타이어, 해들, 음향기기 등등 이 필요하다고 했을 때, 자동차 한대는 이 4개의 클래스로 만들어진다.
		//현재 car1의 이름을 바꾸고 싶다 -> 컴파일을 시켜서 소스를 넘겨줬기 때문에 이름을 바꿀 수 없다.
		Car car1 = new Car("파라곤",250, "노랑");
		
		//자동차를 달리게 하고 싶다.
		car1.carRun();
		car1.carRun();
		car1.carRun();
		car1.carRun();
		car1.carRun();
		
		car1.chgMaxSpeed(150);
		
		//사용자가 자동차 색을 바꾸고 싶다(현재 코딩이 없어서 못바꾼다. 근데 바꾸게 해주고 싶으면 private를 public로 바꾸면 된다)
		//내가 private로 코딩을 짠다는 것은 처음부터 무언가를 바꿀 수 없도록 정하고 코딩을 짜는 것.
		
		//상점에서 자동차색을 파랑으로 바꿨어요
		car1.chgColor("파랑");
		
		
		//Car car2 = new Car("도미노");
		//이렇게 코딩이 되면 maxSpeed가 들어갈 수 없다. max를 public로 열어 놓던지 
		//public void chgMaxSpeed(int maxSpeed){
		//	this.maxSpeed = maxSpeed;
		//		} 이렇게 열어주면 사용자는 자기 마음대로 속도를 바꿀 수 있다.
		// car2.chgMaxSpeed(100); 이런식으로 여기다 코딩이 되는 것.
		
		//클래스를 만드는 사람과 쓰는 사람은 다르다!!!!!!!!!!!!!!!!!!
		

				
	}

}
