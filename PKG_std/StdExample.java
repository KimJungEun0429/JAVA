package PKG_std;

import PKG_Test.Classes;

public class StdExample {

	public static void main(String[] args) {
		
		Student st = new Student();//학생 학명 만듬
		st.sName1 = "김";
		st.sName2 = "갑";
		st.sName3 = "순";
		//st.sName4 는 보이지 않는 것은 private이기 때문에.(캡슐화의 일종)
		Student st2 = new Student();
		st2.sName1 = "홍";
		st2.sName2 = "길";
		st2.sName3 = "동";
		
		Student st3 = new Student();
		st3.sName1 = "전";
		st3.sName2 = "우";
		st3.sName3 = "치";
		
		Student st4 = new Student();
		st4.sName1 = "김";
		st4.sName2 = "갑";
		st4.sName3 = "돌";
		System.out.println(st4.sName1);
		
		Student[] a = new Student[25];
		a[0] = new Student();
		a[0].sName1 = "최지혜";
		a[0].age = 26;
		
		a[1] = new Student();
		a[1].sName2 = "김정은";
		a[1].sName3 = "돌";
		
	
		//st5[0].sName1 = "김갑돌";
		
		/*
		st5[1] = new Student();
		st5[2] = new Student();
		
		 
		//System.out.println(st5[0].sName1);
		
		String[] st6 = new String[3];
		st6[0] = new String();
		st6[0] = "김김";
		st6[1] = "가가";
		st6[2] = "루루";
		System.out.println(st6[0]);
		
		Classes firstClass = new Classes();
		firstClass.addStudent();
		firstClass.addStudent(st2);
		firstClass.addStudent(st3);
		firstClass.addStudent(st4);
		
		//firstClass.addStudent1(st5);
		
		firstClass.getStudentsList();
		//1.private로 필드나 메써드를 만들면 class 내부에서만 사용이 가능하다.
		//2.protected, default는 같은 package내부의 클래스에서만 접근이 가능하다.
		//3.protected -- 상속에서 사용이 가능하다
		//4.public : 클래스사용자 맘대로 사용가능하다.
		
		Student[] students = firstClass.getStudentsList();
			for(int i=0; i<students.length; i++) {
			
			System.out.println(students[i].sName1 + students[i].sName2);
			}*/
	}

}
