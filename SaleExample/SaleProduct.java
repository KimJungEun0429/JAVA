package SaleExample;

import java.util.*;

import PKG_Member.Member;
import PKG_store.*;


public class SaleProduct {
	public static void main(String[] args) {
		
		//����
		Snack[] snack = new Snack[3];
		snack[0] = new Snack("����","�ǿ�",1000,"�����",1);
		snack[1] = new Snack("����","�ǿ�",800,"���ڱ�",0.9);
		snack[2] = new Snack("����","�ǿ�",1500,"��īĨ",1);
		
		IceCream[] icecream = new IceCream[3];
		icecream[0] = new IceCream("���̽�ũ��","�����",1500,"������");
		icecream[1] = new IceCream("���̽�ũ��","�����",800,"������");
		icecream[2] = new IceCream("���̽�ũ��","�����",1500,"�����");
		
		Jelly[] jelly = new Jelly[3];
		jelly[0] = new Jelly("����","�ǿ�",500,"��Ʋ��");
		jelly[1] = new Jelly("����","�ǿ�",1000,"�ղ�Ʋ��");
		jelly[2] = new Jelly("����","�ǿ�",1500,"�ϸ���");
		
		Drink[] drink = new Drink[3];
		drink[0] = new Drink("����","�����",1200,"��ī��");
		drink[1] = new Drink("����","�����",1100,"��Ű��");
		drink[2] = new Drink("����","�����",1000,"�ݶ�");
		
		Ramen[] ramen = new Ramen[3];
		ramen[0] = new Ramen("���","�ǿ�",1200,"�����");
		ramen[1] = new Ramen("���","�ǿ�",1100,"�ȼ�����");
		ramen[2] = new Ramen("���","�ǿ�",900,"������");
		
		Cupbob[] cupbob = new Cupbob[3];
		cupbob[0] = new Cupbob("�Ź�","�ǿ�",2500,"������");
		cupbob[1] = new Cupbob("�Ź�","�ǿ�",2100,"���Ը���");
		cupbob[2] = new Cupbob("�Ź�","�ǿ�",2000,"��ġ����");
	
		//��
		Member[] mem = new Member[3];
		mem[0] = new Member("VVIP","����");
		mem[1] = new Member("VIP","����");
		mem[2] = new Member("�Ϲ�","�ϸ�");
		
		mem[0].purchase(drink[0],1);
		
		//mem[0].purchase(drink[2],1);
		//mem[1].purchase(drink[0],1);
		//mem[2].purchase(drink[2],5);
		
		mem[0].Invoice();
		
		//String test1= drink[0].getdName();
		//System.out.println("test : " + test1);
		
		//food pro = new Drink();
		
		ArrayList invoice = new ArrayList();
		invoice.add(drink[0].getdName());
		invoice.add(mem[0].getQty());
		
		//mem[0].getPoint(snack[0]);
		
//		snack[1].getPoint(mem[0]);
//		mem[0].pursnack(snack[1]);
//		mem[0].getPoint(snack[1]);
//		
//		snack[1].getPoint(mem[0]);
//		mem[0].pursnack(snack[1]);
//		mem[0].getPoint(snack[1]);
		
//		Scanner j = new Scanner(System.in); 
//		System.out.println("������ ���� ������");
//		String a = j.next();
//		System.out.println(a);
//		
//		System.out.println();
		
				
		//mem[0].getPoint(snack[2]);
		
		
		/*
		ArrayList invoice = new ArrayList();
		invoice.add(drink[0].getdName());
		invoice.add(drink[0].getdName());
		invoice.add(drink[2].getdName());
		*/
		
		/*
		System.out.println("size : " + invoice.size());
		
		for(int i=0; i<invoice.size(); i++)
		{
			System.out.println(i+1 + " : "  + invoice.get(i) + invoice.get);
			
		}
		
		
		System.out.println("�� ������ : " + Member.getTotalPrice());
		*/
		
		
		
		
	}//maid
}
