package Pkg_condition;

//청소기라는 객체
public class Cleaner {

	//메써드이고 Cleaner라는 객체의 행위다. 특정값이 들어오면 a를 전부 0으로 만들어버린다.
	public int setClean(int a) {
		
		a = 0;
		
		return a;
	}
	
	
	//출력하는 메써드를 가지자
	public void clearPrint(String inStr) {
		
		System.out.println(inStr);
		
	}
	
}
