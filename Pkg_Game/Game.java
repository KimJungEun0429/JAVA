package Pkg_Game;

import Pkg_condition.*;
//패키지안에 모든 클래스를 다 import한 것.

public class Game {

	public static void main(String[] args) {
		
		//반복문(홀수찾기)
		int b = 0;
		for(int a =1; a<=100; a++) {
			
			if(a % 2 == 0) {
				b = b + a;
			}
			
		}
		
		System.out.println(b);
		
		//do while(for를 더 많이 씀)
		b = 0; //b를 초기화 
		int i = 1;
		do {
			b = b + i;
			
			i += 1;
		}
		while(i <= 100)
		;
		
		System.out.println(b);
		
		//while(do while 보단 많이 씀)
		int j = 1;
		b = 0; //b를 초기화 
		while(true) {
			
			b = b + j;
			if(j == 100) {
				break;
			}
			
			j += 1;
		}
		System.out.println(b);	
		//while랑 do while는 무한 반복이 가능하고 for는 시작과 끝을 정해놓으니까 무한반복은 어렵다
		
		//조건문
		//switch case(if랑 다른 점은 조건이 명확할 때)
		int num = 4;
		String strOut = "초기값";
		switch(num) {
		
			case 1 : strOut = "1입니다.";
			break;
			//num이 1일 때는 "1입니다."
			case 2 : strOut = "2입니다.";
			break;
			//num이 2일 때는 "2입니다."
			case 3 : strOut = "3입니다.";
			break;
			//num이 3일 때는 "3입니다."
		}
		//num의 값들이 안에 조건으로 지정해놓은 1,2,3 말고도 존재하기 때문에 break를 걸어줘야한다.
		//만약에 break를 쓰기 싫으면 defalult를 지정해줘야함 
		System.out.println(strOut);
		
		int num1 = 4;
		String strOut1 = "초기값";
		switch(num1) {
		
			case 1 : strOut1 = "1입니다.";
			
			case 2 : strOut1 = "2입니다.";
			
			case 3 : strOut1 = "3입니다.";
			
			
			default : strOut = "default";
		}
			System.out.println(strOut1);
			
		String str = "철수";
		switch(str) {
		
		case "철수" : str = "철수입니다.";
		break;
		
		case "순희" : str = "순희입니다.";
		break;
		
		default : System.out.println("asfdecdfsdf");
		break;
		
		}
		System.out.println(str);
		
		//구구단 만들기
		int result = 0;
		for(int ii =2; ii<=9; ii++) {
			
			for(int jj = 1; jj<=9; jj++) {
				result = ii * jj;
				System.out.println(ii + "*" + jj + " = " + result);
			}
		}
		
		//배열
		//datatype 선언
		int a1 = 1;
		int a2 = 2;
		int a3 = 3;
		int a4 = 4;
		int a5 = 5;
		int a6 = 6;
		
		int b1 = a1;
		a1 = 13;
		
		System.out.println(a1);
		System.out.println(b1);
		//call by value로 움직이는 중. int형은 메모리의 스텍이라는 공간을 쓰고 있음. 

		int[] arr = new int[6]; // arr이라는 한개의 변수를 잡았다.
		arr[0]= 1;
		arr[1]= 2;
		arr[2]= 3;
		arr[3]= 4;
		arr[4]= 5;
		arr[5]= 6;
		
		int[] arr2 = new int[6];
		arr2[0] = arr[0];
		arr[0] = 100;
		
		int[] arr3 = arr;
		arr3[0] = 1234;
				
	
		System.out.println(arr[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		
		/*
		String[] strs = new String[3];
		strs[0] = "1123";
		strs[1] = "홍길동";
		strs[2] = "김갑순";
		*/
		
		String st1 = "홍길동";
		String st2 = "홍길동";
		String st3 = st1; 
		st3 = "전우치";
		
		System.out.println(st3);
		System.out.println(st1);
		//java에서 String 을 할당값으로 선언을하고 받으면 마치 call by value 처럼 움직인다.
		
		String st4 = new String("홍길동");
		String st5 = new String("홍길동");
		//call by reference
		
		
		if(st1.equals(st2))//(s2.equals(s1)) 
		{
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
			
		}
		
		if(st4 == st5) {
			System.out.println("같다 - object");
		}
		else {
			System.out.println("다르다 - object");
		}
		
		if(st4.equals(st5)) //두객체가 가지고 있는 실제값이 같냐 
		{
			System.out.println("같다 - value");
		}
		else {
			System.out.println("다르다 - value");
			
		} 
		
		
		int aa = 4;
		long bb = 4L;
		double cc = 4.00;
		float dd = 4.00f;
		//call by value
		
		if(dd == cc) {
			
			System.out.println("같다");

		}
		else {
			
			System.out.println("다르다");
		}
		
		
		//call by value
		//byte, short, char, int, long
		//float, double
		//String str = ""; //call by value
		//String str = new String("홍길동");  //call by reference
		
		

		
		//배열
		String[] strs = new String[5];  //call by reference
		strs[0] = "홍길동";  //String
		strs[1] = "전우치";
		strs[2] = "이길동";
		strs[3] = new String("홍길동");
		strs[4] = "";
		
		if(strs[0] == strs[3]) {
			System.out.println("홍길동 같아요");
		}
		else {
			
			System.out.println("홍길동 달라요");
		}

		int aaa = 145;
		long[] ll = new long[3];
		ll[0] = aaa;
		ll[1] = 51244;
		ll[2] = 24542315213213123L;
		
		double[] ddd = new double[2];
		ddd[0] = 124.14145;
		ddd[1] = 1544;
 
		byte[] bytes = new byte[128];
		
		int results = 0;
		for(int iii=0;iii<bytes.length;iii++) {
			
			results = iii % 100;
			bytes[iii] = (byte)results;
			
			System.out.println(bytes[iii]);
		}
		
		long ln = 2100000000;
		int[] ints = new int[4];
		ints[0] = (int)ln;
		ints[1] = (int)ln;
		ints[2] = (int)ln;
		
		System.out.println(ints[0]);
		
		/*
		for(int iii = 0; iii< ints.length;iii++) {
			
			ints[iii] = iii;
			
			System.out.println(ints[iii]);
		}
		*/
		

		//down casting, up casting <-  상속
		
		//call by value
		//byte, short, char, int, long
		//float, double
		//String str = ""; // call by value
		//String str = new String("홍길동");
		
		
		
		
	}//main

}
