package Pkg_InOut;

public class InOut {

	public static void main(String[] args) throws Exception {
		//91��
		
		/*
		System.out.println("aaaa");
		//ln�� ���� ��ĭ �Ʒ��� �����ش�
		System.out.print("bbbb");
		System.out.printf("bbbb");
		
		System.out.printf("%d", 241);
		System.out.printf("%08d", 241);
		*/
		
		/*
		int a = System.in.read();
		//���ڿ��� �ƽ�Ű�ڵ尪�� �˾Ƴ��� ���
		int b = a + 12;
		
		System.out.println(b);
		
		
		int a = 7;
		int b = 3;
		
		int c = a % b;
		//������ �����ֱ�
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
		
		int b = a++; - ������ �ֱ������� ���� ����. 
		a++;	// a = a + 1; ���࿬���� - int b = a++; �̸� a���� ���� b�� �Ҵ��ϰ� a = a+1 ����.
		System.out.println("b=" + b);
		
		++a;	// a = a + 1; ���࿬���� - int b = a++; �̸� a = a+1 ���� �����ϰ� a���� b�� �Ҵ��Ѵ�.
		System.out.println("a=" + a);
		
		��Ư�� �������� ����� ��?
		*/
		
		
		int b = 3;
		String name = (a > b) ? "ö��" : "����";
		//a > b�� ���̸� ö�� �����̸� ����
		System.out.println(name);
		
		String strGender = "F";
		String name2 = (strGender == "M") ? "����" : "����";
		System.out.println(name2);
		
		String strGender2 = "F";
		int num = (strGender2 == "M") ? 123 : (strGender2 == "F") ? 456 : 678;
		
		System.out.println(num);
		
		//condition Ŭ������ ����Ѵ�.
		
		Condition con = new Condition();
		//���� ��Ű������ ���� �� import�� ���� ���� �ʾƵ� ��밡��
		con.conTest();
		con.conTest2();
	}

}
