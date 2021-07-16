
public class ExceptionTest {
	
	public static void main(String[] args) {
		//String str = 12345;
		//컴파일 에러
		String[] strs = null;
		
		//strs = new String[4]; 원래는 이렇게 해야하는데
		
		//strs[0] = "1234";
		//까먹고 이렇게 했어. 컴파일은 가능한데 실행 시키면
//		Exception in thread "main" java.lang.NullPointerException: Cannot store to object array because "strs" is null
//		at ExceptionTest.main(ExceptionTest.java:11)
		//라고 오류가 뜨는데 cpu가 알아먹는 언어로(java를 class로 바꾸는 것) 바꿔서 cpu가 실행시키는(일명 런타임) 과정에서 일어나는 에러
		//컴파일, 런타임도 다 잘 되었으나 결과가 엉망징찬인 경우 = 문법은 맞으나 로직이 엉망징찬인 경우 => 로직에러
		
		//예외처리는 런타임에서 에러가 났을 경우를 얘기함.
		
		//int i = 0;
		//int j = 12 /i;
		//어쩌다가 0이 나올때가 있다
		//개발자는 이 사실을 몰랐다
		//다 만들어서 베포를 했는데 이런경우가 생기면 에러메세지가 뜨면서 창이 꺼져버린다 = 예외처리를 해놓으면 프로그램이 꺼지지않음
		
		//예외처리 : 프로그램을 배포하고 '런타임'에서 에러가 발생하면 자연스럽게 에러를 처리하기 위해서 사용.
		//c#과 c++ 예외처리를 개발자가 하지 않으면 그냥 안함
		//java는 엔진이 판단했을 때 에러가 발생할 소지가 있다면 강제로 예외처리를 시킨다.
		
		//예외처리 구문
		try {
			int i2 = 0;
			
			int j2 = 12 / i2;
			
			System.out.println(j2);//여기까진 내가 짠 코딩이 들어가고
			
//			String[] strs3 = null;
//			strs3[0] = "1222";
		}
		catch(Exception e /*RuntimeException이라고 줘도 가능.*/) {
			//class Exception으로 받아들인다.
			//Exception여기다가 에러가 난 정보를 java가 던져준다
			//String strMsg = e.getMessage();//처음보는 메서드를 보면 리턴타입을 봐야한다.
			//System.out.println(strMsg);
				//전부 외울 수 없으므로 https://docs.oracle.com/javase/8/docs/api/ 여기를 자주 쳐다보게 된다,,,ㅎ
			
			e.printStackTrace();
			//개발자가 개발하고 있을 때 많이 사용. 메세지도 띄워주지만 에러까지 다 띄워준다. 베포할 때 쓰면 안됨 개발할때만
			//String strMsg2 = e.toString();//e.getMessage()비해서 좀 더 상세한 에러 이유 메세지를 보여줌
			//System.out.println(strMsg2);
			}
		finally {
			System.out.println("finally");
		}
		
		//NullPointerException랑 ArithmeticException라고 두가지 에러가 뜨는데 exception을 두개가 상속받고 있는 것.
	}
}
