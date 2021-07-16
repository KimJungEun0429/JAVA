package Pkg_condition;

//계산기
public class Calculator {
	
	//매써드 Method - 행위 - 두개의 정수값을 받아서 더하고 그 정수값을 돌려주는 메써드
	//관점은 계산기가 실행하는 것.
	
	public int getPlus(int a, int b) {
		
		int c = a + b;
		return c;
	}
	
	//c출력하는 행위
	public void resultPrint(String inStr) {
		
		System.out.println("계산기에 출력한다 : " + inStr);
		
	}
	
		//던져진다는 행위가 필요해졌다.
	public void calThrows() {
		
		System.out.println("던져졌다.");
		//화면에서 실제로 던져질 수 있도록 ui를 만들어야하는데 우리가 현재는 할 수 있는게 없으
	}
}
