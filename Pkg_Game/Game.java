package Pkg_Game;

import Pkg_condition.*;
//��Ű���ȿ� ��� Ŭ������ �� import�� ��.

public class Game {

	public static void main(String[] args) {
		
		//�ݺ���(Ȧ��ã��)
		int b = 0;
		for(int a =1; a<=100; a++) {
			
			if(a % 2 == 0) {
				b = b + a;
			}
			
		}
		
		System.out.println(b);
		
		//do while(for�� �� ���� ��)
		b = 0; //b�� �ʱ�ȭ 
		int i = 1;
		do {
			b = b + i;
			
			i += 1;
		}
		while(i <= 100)
		;
		
		System.out.println(b);
		
		//while(do while ���� ���� ��)
		int j = 1;
		b = 0; //b�� �ʱ�ȭ 
		while(true) {
			
			b = b + j;
			if(j == 100) {
				break;
			}
			
			j += 1;
		}
		System.out.println(b);	
		//while�� do while�� ���� �ݺ��� �����ϰ� for�� ���۰� ���� ���س����ϱ� ���ѹݺ��� ��ƴ�
		
		//���ǹ�
		//switch case(if�� �ٸ� ���� ������ ��Ȯ�� ��)
		int num = 4;
		String strOut = "�ʱⰪ";
		switch(num) {
		
			case 1 : strOut = "1�Դϴ�.";
			break;
			//num�� 1�� ���� "1�Դϴ�."
			case 2 : strOut = "2�Դϴ�.";
			break;
			//num�� 2�� ���� "2�Դϴ�."
			case 3 : strOut = "3�Դϴ�.";
			break;
			//num�� 3�� ���� "3�Դϴ�."
		}
		//num�� ������ �ȿ� �������� �����س��� 1,2,3 ���� �����ϱ� ������ break�� �ɾ�����Ѵ�.
		//���࿡ break�� ���� ������ defalult�� ����������� 
		System.out.println(strOut);
		
		int num1 = 4;
		String strOut1 = "�ʱⰪ";
		switch(num1) {
		
			case 1 : strOut1 = "1�Դϴ�.";
			
			case 2 : strOut1 = "2�Դϴ�.";
			
			case 3 : strOut1 = "3�Դϴ�.";
			
			
			default : strOut = "default";
		}
			System.out.println(strOut1);
			
		String str = "ö��";
		switch(str) {
		
		case "ö��" : str = "ö���Դϴ�.";
		break;
		
		case "����" : str = "�����Դϴ�.";
		break;
		
		default : System.out.println("asfdecdfsdf");
		break;
		
		}
		System.out.println(str);
		
		//������ �����
		int result = 0;
		for(int ii =2; ii<=9; ii++) {
			
			for(int jj = 1; jj<=9; jj++) {
				result = ii * jj;
				System.out.println(ii + "*" + jj + " = " + result);
			}
		}
		
		//�迭
		//datatype ����
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
		//call by value�� �����̴� ��. int���� �޸��� �����̶�� ������ ���� ����. 

		int[] arr = new int[6]; // arr�̶�� �Ѱ��� ������ ��Ҵ�.
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
		strs[1] = "ȫ�浿";
		strs[2] = "�谩��";
		*/
		
		String st1 = "ȫ�浿";
		String st2 = "ȫ�浿";
		String st3 = st1; 
		st3 = "����ġ";
		
		System.out.println(st3);
		System.out.println(st1);
		//java���� String �� �Ҵ簪���� �������ϰ� ������ ��ġ call by value ó�� �����δ�.
		
		String st4 = new String("ȫ�浿");
		String st5 = new String("ȫ�浿");
		//call by reference
		
		
		if(st1.equals(st2))//(s2.equals(s1)) 
		{
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ���");
			
		}
		
		if(st4 == st5) {
			System.out.println("���� - object");
		}
		else {
			System.out.println("�ٸ��� - object");
		}
		
		if(st4.equals(st5)) //�ΰ�ü�� ������ �ִ� �������� ���� 
		{
			System.out.println("���� - value");
		}
		else {
			System.out.println("�ٸ��� - value");
			
		} 
		
		
		int aa = 4;
		long bb = 4L;
		double cc = 4.00;
		float dd = 4.00f;
		//call by value
		
		if(dd == cc) {
			
			System.out.println("����");

		}
		else {
			
			System.out.println("�ٸ���");
		}
		
		
		//call by value
		//byte, short, char, int, long
		//float, double
		//String str = ""; //call by value
		//String str = new String("ȫ�浿");  //call by reference
		
		

		
		//�迭
		String[] strs = new String[5];  //call by reference
		strs[0] = "ȫ�浿";  //String
		strs[1] = "����ġ";
		strs[2] = "�̱浿";
		strs[3] = new String("ȫ�浿");
		strs[4] = "";
		
		if(strs[0] == strs[3]) {
			System.out.println("ȫ�浿 ���ƿ�");
		}
		else {
			
			System.out.println("ȫ�浿 �޶��");
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
		

		//down casting, up casting <-  ���
		
		//call by value
		//byte, short, char, int, long
		//float, double
		//String str = ""; // call by value
		//String str = new String("ȫ�浿");
		
		
		
		
	}//main

}
