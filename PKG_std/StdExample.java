package PKG_std;

import PKG_Test.Classes;

public class StdExample {

	public static void main(String[] args) {
		
		Student st = new Student();//�л� �и� ����
		st.sName1 = "��";
		st.sName2 = "��";
		st.sName3 = "��";
		//st.sName4 �� ������ �ʴ� ���� private�̱� ������.(ĸ��ȭ�� ����)
		Student st2 = new Student();
		st2.sName1 = "ȫ";
		st2.sName2 = "��";
		st2.sName3 = "��";
		
		Student st3 = new Student();
		st3.sName1 = "��";
		st3.sName2 = "��";
		st3.sName3 = "ġ";
		
		Student st4 = new Student();
		st4.sName1 = "��";
		st4.sName2 = "��";
		st4.sName3 = "��";
		System.out.println(st4.sName1);
		
		Student[] a = new Student[25];
		a[0] = new Student();
		a[0].sName1 = "������";
		a[0].age = 26;
		
		a[1] = new Student();
		a[1].sName2 = "������";
		a[1].sName3 = "��";
		
	
		//st5[0].sName1 = "�谩��";
		
		/*
		st5[1] = new Student();
		st5[2] = new Student();
		
		 
		//System.out.println(st5[0].sName1);
		
		String[] st6 = new String[3];
		st6[0] = new String();
		st6[0] = "���";
		st6[1] = "����";
		st6[2] = "���";
		System.out.println(st6[0]);
		
		Classes firstClass = new Classes();
		firstClass.addStudent();
		firstClass.addStudent(st2);
		firstClass.addStudent(st3);
		firstClass.addStudent(st4);
		
		//firstClass.addStudent1(st5);
		
		firstClass.getStudentsList();
		//1.private�� �ʵ峪 �޽�带 ����� class ���ο����� ����� �����ϴ�.
		//2.protected, default�� ���� package������ Ŭ���������� ������ �����ϴ�.
		//3.protected -- ��ӿ��� ����� �����ϴ�
		//4.public : Ŭ��������� ����� ��밡���ϴ�.
		
		Student[] students = firstClass.getStudentsList();
			for(int i=0; i<students.length; i++) {
			
			System.out.println(students[i].sName1 + students[i].sName2);
			}*/
	}

}
