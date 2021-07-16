package SaleExample;

import java.util.*;

import PKG_Member.Member;
import PKG_store.*;


public class SaleProduct {
	public static void main(String[] args) {
		
		//음식
		Snack[] snack = new Snack[3];
		snack[0] = new Snack("과자","실온",1000,"새우깡",1);
		snack[1] = new Snack("과자","실온",800,"감자깡",0.9);
		snack[2] = new Snack("과자","실온",1500,"포카칩",1);
		
		IceCream[] icecream = new IceCream[3];
		icecream[0] = new IceCream("아이스크림","냉장고",1500,"구구콘");
		icecream[1] = new IceCream("아이스크림","냉장고",800,"옥동자");
		icecream[2] = new IceCream("아이스크림","냉장고",1500,"브라보콘");
		
		Jelly[] jelly = new Jelly[3];
		jelly[0] = new Jelly("젤리","실온",500,"꿈틀이");
		jelly[1] = new Jelly("젤리","실온",1000,"왕꿈틀이");
		jelly[2] = new Jelly("젤리","실온",1500,"하리보");
		
		Drink[] drink = new Drink[3];
		drink[0] = new Drink("음료","냉장고",1200,"포카리");
		drink[1] = new Drink("음료","냉장고",1100,"밀키스");
		drink[2] = new Drink("음료","냉장고",1000,"콜라");
		
		Ramen[] ramen = new Ramen[3];
		ramen[0] = new Ramen("라면","실온",1200,"진라면");
		ramen[1] = new Ramen("라면","실온",1100,"안성탕면");
		ramen[2] = new Ramen("라면","실온",900,"육개장");
		
		Cupbob[] cupbob = new Cupbob[3];
		cupbob[0] = new Cupbob("컵밥","실온",2500,"강된장");
		cupbob[1] = new Cupbob("컵밥","실온",2100,"스팸마요");
		cupbob[2] = new Cupbob("컵밥","실온",2000,"참치마요");
	
		//고객
		Member[] mem = new Member[3];
		mem[0] = new Member("VVIP","소희");
		mem[1] = new Member("VIP","지혜");
		mem[2] = new Member("일반","하린");
		
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
//		System.out.println("사고싶은 것을 말해줘");
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
		
		
		System.out.println("총 매출은 : " + Member.getTotalPrice());
		*/
		
		
		
		
	}//maid
}
