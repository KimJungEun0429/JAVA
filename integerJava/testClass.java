package integerJava;

public class testClass {

	public int getPlus(int a, int b) {
		
	      return a + b;
		
	}
	
	public int getMinus(int a, int b) {
		
	      return a - b;
		
	}
	
	public void setTest() {
		//void는 리턴값이 없는 것. 소수점 데이터타입 - 4byte - 32bit
		float a = 3.123456f;
		//float를 사용할 땐 맨 마지막에 f를 붙여줘야한다.
		float b = 11.2f;
		float c = a * b;
		
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		
		
		double aa = 3.123456;
		double bb = 11.2;
		//현장에서는 대부분 double를 사용. 실수타입 - 8byte - 64bit
		//소수점 뒷자리수들이 길어지면 정밀도에 따라서 소수점을 잘라내버린다.
		double cc = aa * bb;
		System.out.println(bb);
		
		int eee = 5;
		double ffff = 5.1;
		double gggg = eee * ffff;
		
		System.out.println(gggg);
		
		long eee1 = 5;
		float ffff1 = 5;
		
		double gggg1 = eee1 * ffff1;
		System.out.println(gggg1);
		//8바이트 4바이트 계산 시 8바이트로 받아줘야 한다.(되긴되는데 제한이 있음 나중에 배울 것.)
		System.out.println();
		
	}
	
	
	
	
	
	
}
