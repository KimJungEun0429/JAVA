package PKG_Cal;

//객체지향언어에서의 class는 객체다
public class Calculator {
	
	//하나의 클래스에는 속성값과 method로 이뤄져있다.
	//함수가 아니라 method다.
	public int  setPlus(int a, int b) {
		int c = a + b;
		
		return c;
		//int로 줬으면 return도 int형식으로 되야한다 그만큼 엄격한다는 것.
	}
	
	public int  setMinus(int a, int b) {
		int c = a - b;
		
		return c;
		
	}
	
	public int  setCross(int a, int b) {
		int c = a * b;
		
		return c;
		
	}
	
	public int  setDevide(int a, int b) {
		int c = a / b;
		
		return c;
		
	}

}
