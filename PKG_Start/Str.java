package PKG_Start;

import PKG_Cal.Calculator;

//�ٸ� ��Ű���� ����ִ� class�� ���� ���ؼ� ������ ���� ��.

public class Str {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		int r1 = cal.setPlus(9,5);
		int r2 = cal.setMinus(9,5);
		int r3 = cal.setCross(9,5);
		int r4 = cal.setDevide(9,5);
		/*���� int�� �������� �����⿡���� ������ ����. ����Ʈ Ÿ���� �ȸ���. �Ҽ����� ���� �� �����ϱ�! 
		��Ű������ int�� float�� doubble�� �ٲ���ϰ� �ٷ� �� int r4�� int�� �ٲ�����Ѵ�.
		�� ��Ȯ�ϰ� �ϰ� ������ (9.0f, 5.0f)��� �����ִ� �͵� ���� �Ű������� float��� ���� �ٸ������ ���� �� 
		�� �� �ְ�. ���е��� ���̰� ������ ������.*/
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
	}

}
