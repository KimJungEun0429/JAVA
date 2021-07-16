package integerJava;

public class intJava {

	public static void main(String[] args) {
		
		//byte는 자바에선 정수형이다.
		byte a = 5;
		byte b = -5;
		
		//convert, cast -- 형변화
		
		//short s3 = a + b; - 오류나서 주석처리
		//short와 byte는 개발적으로 정수형이지만 연산으로 값을 받기는 어렵다고 생각하고 있기
		//int - 4byte 형을 사용해서 연산에 사용한다 - 32bit
		
		short s1 = 24;
		short s2 = 32;
		
		// 위의 short와 byte는 오류남

		int i0 = 3333;
		int i1 = 5555;
		
		int i2 = a + b;
		int i3 = s1 + s2;
		int i4 = i0 * i1;
		

		//long 64비트 넉넉하니까 처음부터 long으로 잡으면 안되냐 => 메모리차지를 많이하니까 안된다~~ 
		long L = 100000000;
		long L1 = 10000000;
		
		long L2 = L + L1;
		
		//
		int LL1 = 1000000000;
		int LL2 = 1000000000;
		
		int LL3 = LL1 * LL2;
		//오버플로우가 나야하는데 이상한 값으로 결과가 나오니 주의해야한다.
		System.out.println(LL3);
		
		int hour = 1;
		int minute = 30;
		
		int total = (hour * 60) + minute;
		System.out.println(total);
		
		long L3 = 3000000000L;
		long L4 = 2200000000L;
		
		
		/*64비트를 다 활용하기 위해서 L라고 붙여준다. 기본적으로 int형인가보다 생각하고 움직이다가 21억이 넘어가면
		읽히지 않기 때문에 L을 붙여서 활용한다.*/
		
		long L5 = L3*L4;
		
		System.out.println(L5);
		
		//2진수
		int aa = 0b1101;
		int bb = 0b1001;
		
		//0b를 붙여줘야 2진수로 인식해서 계산한다. 
		
		int cc = aa + bb;
		// 결과는 10진수로 나옴
		System.out.println(cc);
		
		//8진수 (잘 안쓰긴함)
		int aaa = 023;
		int bbb = 012;
		//0을 붙여줘야 8진수로 인식
		
		int ccc = aaa + bbb;
		System.out.println(ccc);
		
		//16진수 
		int d = 0xAAA;
		int e = 0x1A2B;
		//0x를 붙여줘야 16진수로 인식
		
		int f = d + e;
		System.out.println(f);
		
		int ff = aa * e;
		System.out.println(ff);
		/*정리 : 정수형은 총 5가지가 있다. 
		 		byte,short, int(제일 많이 사용), long */
		
		testClass tc = new testClass();
	      //내가 만든 클래스를 testClass 에 사용하겠다
		
		int result = tc.getPlus(8,5);
		
		System.out.println(result);
		
		int result2 = tc.getMinus(12,11);
		System.out.println(result2);
		
		tc.setTest();
		
		int zzz = 123445;
		long xxx = zzz;
		//int yyy = xxx;
		//8바이트에 넣었다가 8바이트를 4바이트에 다시 넣으라는 것은 안된다. 공간이 다르니까.
		
		//20210518 - char
		//byte, short, int, long, --정수형
		//float, double			  --실수형
		
		//char의 근본적인 데이터타입은 정수형이다.
		char ch = 'A' + 1;
		
		System.out.println(ch);
		//B가 나온은데 A가 65이기 때문에 66으로 나온다. 교재 93쪽. 아스키코드값으로 숫자로 인지한다.
		
		char ch1 = 'A' + 2;
		int iii = (int)ch1;
		System.out.println(iii);
		
		//문자형
		String str = "가나다라마바사";
		//String str = new String(); 라고 쓰는게 맞음. 얘는 클래스임 string위에 마우스 올려놓으면 뜨는 것을 잘 보기
		String str2 = "뱌뱌뱌";
		String str3 = str + str2;
		System.out.println(str3);
		
		//int String을 합치면 어떻게 되는가
		int aaaa = 55;
		String str4 = "66";
		
		String re = aaaa + str4;
		//int로 받으면 에러 뜬다. 자바만 문자열과 숫자열을 더하면 자바엔진이 int를 문자열로 변환시킨다음에 결과값을 만들어준다
		System.out.println(re);
		
		//String는 Class이고 int,byte등등은 데이터타입이다.
		
		/*형변환
		  1. 묵시적 형변환 - 자동으로 변환
		  2. 암시적 형변환 - 표현으로 변환(프로그래머가 표현해줘야함)
		 */
		int z1 = 2100000000;
		int z2 = 2100000000;
		
		int z3 = z1 + z2;
		
		System.out.println(z3);
		//int는 +-21억까지 사용 가능
		/*두개를 더했더니 int의 범위를 넘어가서 long범위가 되어버림. 원래는 int인데 long으로 바꿔서 쓸 수 있는데
		  int가 4바이트고 long가 8바이트라서 int가 더 작기 때문에 변환이 가능함.
		  이것을 묵시적 형변환 이라고 부른다. 숫자타입에서 묵시적으로 형변환이 되려면 반드시 더 큰 공간을 가지고 있어야 가능 
		int z1 = 2100000000;
		int z2 = 2100000000;
		
		long z3 = z1 + z2; 는 가능
		
		long z1 = 2100000000;
		long z2 = 2100000000;
		
		int z3 = z1 + z2; 는 불가능 */
		
		//byte < short < int < long 이 순으로 넣어주면 묵시적으로 데이터의 형변환이 가능함(char는 좀 다름)
		
		//묵시적으로 가능하지 않고 암시적으로 변환하고자 할때 ↓
		
		//---------------------------------------------------------
		String sss = "44";
		int    sss2 = 56;
		
		//합치고 싶은게 아니라 더하고 싶을 때, string(문자열)을 숫자로 바꿔야함
		//int sss3 = (int)sss;
		//이렇게는 불가능함--------------------------------------------
		
		
		//b라는 문자를 숫자값으로 보고싶을 때------
		char cha = 'b';
		int icha = (int)cha;
		System.out.println(icha);
		//----------------------------------
		
		//double를 int로 쓰고 싶다.------------
		double n = 1414.8123;
		
		int n2 = (int)n;
		System.out.println(n2);
		//----------------------------------
		
		//----------------------------------
		float fffff = 123.1111f;
		
		long lll = (long)fffff;
		System.out.println(lll);
		//----------------------------------
		
		int n3 = 135;
		
		float n4 = n3 + 0.4f;
		
		int nn3 = 135;
		
		double nn4 = n3 + 0.4;
		//-----------------------------------
		
		//암시적형변환 - 강제적으로 형변환
		
	    //String  ->  숫자타입으로 바뀌는 형태
	
		
		String st1 = "5";
		String st2 = "7";
		byte by1 = Byte.parseByte(st1);
		byte by2 = Byte.parseByte(st2);
		
		String st3 = st1 + st2;
		int by3 = by1 + by2;
		
		System.out.println("문자열합 :" + st3);
		System.out.println("숫자열합 :" + by3);
		
		int nn1 = Integer.parseInt(st1);
		int nn2 = Integer.parseInt(st2);
		//int nn3 = nn1 + nn2;
		
		System.out.println("INT형" + nn3);
		
		String st4 = "5414.124";
		double dd1 = Double.parseDouble(st4);
		double dd2 = dd1 * dd1;
		
		System.out.println("DOUBLE형" + nn3);
		
		//boolean true or false;
		
		boolean isAct = true;
		
		if(isAct) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		String bStr = "true"; //데이터베이스에서 값을 받아오면 이런 경우가 있음. 이럴때 변환 방법
		
		if(bStr == "true") {
			
			System.out.println("afsdsfd");
		}
		
		boolean isStr = Boolean.parseBoolean(bStr);
		
		if(isStr) {
					
			System.out.println("afsdsfd");	
		}
		
		
		
		/*정리
		 ●정수형
		 - byte, short, int(+-2100000000), long, char(아스키코드를 기억하고 있으나 정수형이다)
		 	long lll3 = 1234657978798L;
		 	->L붙이는 것 기억하기
		 
		 ●실수형
		 - float, double
		 	float ffffff= 2314.21454f;
		 	->f붙이는 것 기억하기
		 	
		 *2진수 표현 시 0b
		  int p = 0b110; -> 2진수다 
		  
		 *8진수 0
		  long p2 = 02414114710; -> 8진수다
		  
		 *16진수 0x
		  int p3 = 0x21441; -> 16진수다
		  
		  ●형변환
		   *암시적형변환
		 	int p4 = 1545;
		 	int p5 = 1021444111;
		 	
		 	int p6 = p4 * p5;
		 	컴파일 또는 런타임에서 에러가 나지 않고 결과값이 엉망으로 나온다.
		 	
		 	
		 	long p7 = (long)p4 * (long)p5;
		 	
		 	String -> 숫자(정수, 실수)로 변환 
		 	String str10 = "avdfse";
		 	int nnn333 = Integer.parseInt(str10);
		 	
		 	System.out.println(nnn333);
		 	
		 	->런타임 오류
		 	
			String str101 = "123456";
		 	int nnn3331 = Integer.parseInt(str101);
		 	
		 	System.out.println(nnn3331);
		 	-> 얘는 된다.
		 	*/
		
	
		 	
		
		
		
		
	}//main()

}//class()
