package integerJava;

public class intJava {

	public static void main(String[] args) {
		
		//byte�� �ڹٿ��� �������̴�.
		byte a = 5;
		byte b = -5;
		
		//convert, cast -- ����ȭ
		
		//short s3 = a + b; - �������� �ּ�ó��
		//short�� byte�� ���������� ������������ �������� ���� �ޱ�� ��ƴٰ� �����ϰ� �ֱ�
		//int - 4byte ���� ����ؼ� ���꿡 ����Ѵ� - 32bit
		
		short s1 = 24;
		short s2 = 32;
		
		// ���� short�� byte�� ������

		int i0 = 3333;
		int i1 = 5555;
		
		int i2 = a + b;
		int i3 = s1 + s2;
		int i4 = i0 * i1;
		

		//long 64��Ʈ �˳��ϴϱ� ó������ long���� ������ �ȵǳ� => �޸������� �����ϴϱ� �ȵȴ�~~ 
		long L = 100000000;
		long L1 = 10000000;
		
		long L2 = L + L1;
		
		//
		int LL1 = 1000000000;
		int LL2 = 1000000000;
		
		int LL3 = LL1 * LL2;
		//�����÷ο찡 �����ϴµ� �̻��� ������ ����� ������ �����ؾ��Ѵ�.
		System.out.println(LL3);
		
		int hour = 1;
		int minute = 30;
		
		int total = (hour * 60) + minute;
		System.out.println(total);
		
		long L3 = 3000000000L;
		long L4 = 2200000000L;
		
		
		/*64��Ʈ�� �� Ȱ���ϱ� ���ؼ� L��� �ٿ��ش�. �⺻������ int���ΰ����� �����ϰ� �����̴ٰ� 21���� �Ѿ��
		������ �ʱ� ������ L�� �ٿ��� Ȱ���Ѵ�.*/
		
		long L5 = L3*L4;
		
		System.out.println(L5);
		
		//2����
		int aa = 0b1101;
		int bb = 0b1001;
		
		//0b�� �ٿ���� 2������ �ν��ؼ� ����Ѵ�. 
		
		int cc = aa + bb;
		// ����� 10������ ����
		System.out.println(cc);
		
		//8���� (�� �Ⱦ�����)
		int aaa = 023;
		int bbb = 012;
		//0�� �ٿ���� 8������ �ν�
		
		int ccc = aaa + bbb;
		System.out.println(ccc);
		
		//16���� 
		int d = 0xAAA;
		int e = 0x1A2B;
		//0x�� �ٿ���� 16������ �ν�
		
		int f = d + e;
		System.out.println(f);
		
		int ff = aa * e;
		System.out.println(ff);
		/*���� : �������� �� 5������ �ִ�. 
		 		byte,short, int(���� ���� ���), long */
		
		testClass tc = new testClass();
	      //���� ���� Ŭ������ testClass �� ����ϰڴ�
		
		int result = tc.getPlus(8,5);
		
		System.out.println(result);
		
		int result2 = tc.getMinus(12,11);
		System.out.println(result2);
		
		tc.setTest();
		
		int zzz = 123445;
		long xxx = zzz;
		//int yyy = xxx;
		//8����Ʈ�� �־��ٰ� 8����Ʈ�� 4����Ʈ�� �ٽ� ������� ���� �ȵȴ�. ������ �ٸ��ϱ�.
		
		//20210518 - char
		//byte, short, int, long, --������
		//float, double			  --�Ǽ���
		
		//char�� �ٺ����� ������Ÿ���� �������̴�.
		char ch = 'A' + 1;
		
		System.out.println(ch);
		//B�� �������� A�� 65�̱� ������ 66���� ���´�. ���� 93��. �ƽ�Ű�ڵ尪���� ���ڷ� �����Ѵ�.
		
		char ch1 = 'A' + 2;
		int iii = (int)ch1;
		System.out.println(iii);
		
		//������
		String str = "�����ٶ󸶹ٻ�";
		//String str = new String(); ��� ���°� ����. ��� Ŭ������ string���� ���콺 �÷������� �ߴ� ���� �� ����
		String str2 = "����";
		String str3 = str + str2;
		System.out.println(str3);
		
		//int String�� ��ġ�� ��� �Ǵ°�
		int aaaa = 55;
		String str4 = "66";
		
		String re = aaaa + str4;
		//int�� ������ ���� ���. �ڹٸ� ���ڿ��� ���ڿ��� ���ϸ� �ڹٿ����� int�� ���ڿ��� ��ȯ��Ų������ ������� ������ش�
		System.out.println(re);
		
		//String�� Class�̰� int,byte����� ������Ÿ���̴�.
		
		/*����ȯ
		  1. ������ ����ȯ - �ڵ����� ��ȯ
		  2. �Ͻ��� ����ȯ - ǥ������ ��ȯ(���α׷��Ӱ� ǥ���������)
		 */
		int z1 = 2100000000;
		int z2 = 2100000000;
		
		int z3 = z1 + z2;
		
		System.out.println(z3);
		//int�� +-21����� ��� ����
		/*�ΰ��� ���ߴ��� int�� ������ �Ѿ�� long������ �Ǿ����. ������ int�ε� long���� �ٲ㼭 �� �� �ִµ�
		  int�� 4����Ʈ�� long�� 8����Ʈ�� int�� �� �۱� ������ ��ȯ�� ������.
		  �̰��� ������ ����ȯ �̶�� �θ���. ����Ÿ�Կ��� ���������� ����ȯ�� �Ƿ��� �ݵ�� �� ū ������ ������ �־�� ���� 
		int z1 = 2100000000;
		int z2 = 2100000000;
		
		long z3 = z1 + z2; �� ����
		
		long z1 = 2100000000;
		long z2 = 2100000000;
		
		int z3 = z1 + z2; �� �Ұ��� */
		
		//byte < short < int < long �� ������ �־��ָ� ���������� �������� ����ȯ�� ������(char�� �� �ٸ�)
		
		//���������� �������� �ʰ� �Ͻ������� ��ȯ�ϰ��� �Ҷ� ��
		
		//---------------------------------------------------------
		String sss = "44";
		int    sss2 = 56;
		
		//��ġ�� ������ �ƴ϶� ���ϰ� ���� ��, string(���ڿ�)�� ���ڷ� �ٲ����
		//int sss3 = (int)sss;
		//�̷��Դ� �Ұ�����--------------------------------------------
		
		
		//b��� ���ڸ� ���ڰ����� ������� ��------
		char cha = 'b';
		int icha = (int)cha;
		System.out.println(icha);
		//----------------------------------
		
		//double�� int�� ���� �ʹ�.------------
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
		
		//�Ͻ�������ȯ - ���������� ����ȯ
		
	    //String  ->  ����Ÿ������ �ٲ�� ����
	
		
		String st1 = "5";
		String st2 = "7";
		byte by1 = Byte.parseByte(st1);
		byte by2 = Byte.parseByte(st2);
		
		String st3 = st1 + st2;
		int by3 = by1 + by2;
		
		System.out.println("���ڿ��� :" + st3);
		System.out.println("���ڿ��� :" + by3);
		
		int nn1 = Integer.parseInt(st1);
		int nn2 = Integer.parseInt(st2);
		//int nn3 = nn1 + nn2;
		
		System.out.println("INT��" + nn3);
		
		String st4 = "5414.124";
		double dd1 = Double.parseDouble(st4);
		double dd2 = dd1 * dd1;
		
		System.out.println("DOUBLE��" + nn3);
		
		//boolean true or false;
		
		boolean isAct = true;
		
		if(isAct) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		String bStr = "true"; //�����ͺ��̽����� ���� �޾ƿ��� �̷� ��찡 ����. �̷��� ��ȯ ���
		
		if(bStr == "true") {
			
			System.out.println("afsdsfd");
		}
		
		boolean isStr = Boolean.parseBoolean(bStr);
		
		if(isStr) {
					
			System.out.println("afsdsfd");	
		}
		
		
		
		/*����
		 ��������
		 - byte, short, int(+-2100000000), long, char(�ƽ�Ű�ڵ带 ����ϰ� ������ �������̴�)
		 	long lll3 = 1234657978798L;
		 	->L���̴� �� ����ϱ�
		 
		 �ܽǼ���
		 - float, double
		 	float ffffff= 2314.21454f;
		 	->f���̴� �� ����ϱ�
		 	
		 *2���� ǥ�� �� 0b
		  int p = 0b110; -> 2������ 
		  
		 *8���� 0
		  long p2 = 02414114710; -> 8������
		  
		 *16���� 0x
		  int p3 = 0x21441; -> 16������
		  
		  ������ȯ
		   *�Ͻ�������ȯ
		 	int p4 = 1545;
		 	int p5 = 1021444111;
		 	
		 	int p6 = p4 * p5;
		 	������ �Ǵ� ��Ÿ�ӿ��� ������ ���� �ʰ� ������� �������� ���´�.
		 	
		 	
		 	long p7 = (long)p4 * (long)p5;
		 	
		 	String -> ����(����, �Ǽ�)�� ��ȯ 
		 	String str10 = "avdfse";
		 	int nnn333 = Integer.parseInt(str10);
		 	
		 	System.out.println(nnn333);
		 	
		 	->��Ÿ�� ����
		 	
			String str101 = "123456";
		 	int nnn3331 = Integer.parseInt(str101);
		 	
		 	System.out.println(nnn3331);
		 	-> ��� �ȴ�.
		 	*/
		
	
		 	
		
		
		
		
	}//main()

}//class()
