package Pkg_InOut;

public class InOut {

	public static void main(String[] args) throws Exception {
		//91쪽
		
		/*
		System.out.println("aaaa");
		//ln을 쓰면 한칸 아래로 내려준다
		System.out.print("bbbb");
		System.out.printf("bbbb");
		
		System.out.printf("%d", 241);
		System.out.printf("%08d", 241);
		*/
		
		/*
		int a = System.in.read();
		//문자열의 아스키코드값을 알아내는 방법
		int b = a + 12;
		
		System.out.println(b);
		
		
		int a = 7;
		int b = 3;
		
		int c = a % b;
		//나머지 보여주기
		System.out.println(c);
		*/
		
		
		int a = 1;
		a += 1; // a = a + 1;
		
		System.out.println(a); //2
		
		a -= 1; // a = a - 1;
		
		System.out.println(a); //1
		
		a *= 3; // a = a * 2;
		
		System.out.println(a); //3
		
		a /= 4; // a = a / 4; //1
		
		System.out.println(a);
		
		/*
		
		int b = a++; - 변수에 넣기전에는 둘이 같다. 
		a++;	// a = a + 1; 후행연산자 - int b = a++; 이면 a값을 먼저 b에 할당하고 a = a+1 실행.
		System.out.println("b=" + b);
		
		++a;	// a = a + 1; 선행연산자 - int b = a++; 이면 a = a+1 먼저 실행하고 a값을 b에 할당한다.
		System.out.println("a=" + a);
		
		독특한 로직에서 사용할 듯?
		*/
		
		
		int b = 3;
		String name = (a > b) ? "철수" : "순희";
		//a > b가 참이면 철수 거짓이면 순희
		System.out.println(name);
		
		String strGender = "F";
		String name2 = (strGender == "M") ? "남자" : "여자";
		System.out.println(name2);
		
		String strGender2 = "F";
		int num = (strGender2 == "M") ? 123 : (strGender2 == "F") ? 456 : 678;
		
		System.out.println(num);
		
		//condition 클래스를 사용한다.
		
		Condition con = new Condition();
		//같은 패키지내에 있을 땐 import를 따로 하지 않아도 사용가능
		con.conTest();
		con.conTest2();
	}

}
