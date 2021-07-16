package PKG_Start;

import PKG_Cal.Calculator;

//다른 패키지에 들어있는 class를 쓰기 위해서 선언을 해준 것.

public class Str {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		int r1 = cal.setPlus(9,5);
		int r2 = cal.setMinus(9,5);
		int r3 = cal.setCross(9,5);
		int r4 = cal.setDevide(9,5);
		/*현재 int로 만들어놔서 나누기에서는 오류가 난다. 데이트 타입이 안맞음. 소수점이 나올 수 없으니까! 
		패키지에서 int를 float나 doubble로 바꿔야하고 바로 위 int r4의 int도 바꿔줘야한다.
		더 정확하게 하고 싶으면 (9.0f, 5.0f)라고 적어주는 것도 좋음 매개변수가 float라는 것을 다른사람이 봤을 때 
		알 수 있게. 점밀도를 높이고 싶으면 더블쓰고.*/
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
	}

}
