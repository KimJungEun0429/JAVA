package integerJava;

public class testClass {

	public int getPlus(int a, int b) {
		
	      return a + b;
		
	}
	
	public int getMinus(int a, int b) {
		
	      return a - b;
		
	}
	
	public void setTest() {
		//void�� ���ϰ��� ���� ��. �Ҽ��� ������Ÿ�� - 4byte - 32bit
		float a = 3.123456f;
		//float�� ����� �� �� �������� f�� �ٿ�����Ѵ�.
		float b = 11.2f;
		float c = a * b;
		
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		
		
		double aa = 3.123456;
		double bb = 11.2;
		//���忡���� ��κ� double�� ���. �Ǽ�Ÿ�� - 8byte - 64bit
		//�Ҽ��� ���ڸ������� ������� ���е��� ���� �Ҽ����� �߶󳻹�����.
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
		//8����Ʈ 4����Ʈ ��� �� 8����Ʈ�� �޾���� �Ѵ�.(�Ǳ�Ǵµ� ������ ���� ���߿� ��� ��.)
		System.out.println();
		
	}
	
	
	
	
	
	
}
