package Pkg_condition;

//����
public class Calculator {
	
	//�Ž�� Method - ���� - �ΰ��� �������� �޾Ƽ� ���ϰ� �� �������� �����ִ� �޽��
	//������ ���Ⱑ �����ϴ� ��.
	
	public int getPlus(int a, int b) {
		
		int c = a + b;
		return c;
	}
	
	//c����ϴ� ����
	public void resultPrint(String inStr) {
		
		System.out.println("���⿡ ����Ѵ� : " + inStr);
		
	}
	
		//�������ٴ� ������ �ʿ�������.
	public void calThrows() {
		
		System.out.println("��������.");
		//ȭ�鿡�� ������ ������ �� �ֵ��� ui�� �������ϴµ� �츮�� ����� �� �� �ִ°� ����
	}
}
