package PKG_Test;

import PKG_std.Student;

public class Classes {

	Student[] students;//학생타입을 배열로 선언. 접근제한자를 안준것은 디폴트 타입이 되고 겉으로 보여주고 싶지 않으면 private으로 주면 됨.
	int arrNum;
	//String stud;
	
	public Classes() {
		
		this.students = new Student[3];
		this.arrNum = 0;
	}
	
	public void addStudent(Student student) {
		if(arrNum < 3) {
		students[arrNum] = student;
		arrNum++;
		}
		else {
			System.out.println("4명이상은 등록할 수 없습니다.");
		}
		
		/*public void getStudentList() {
			
			for(int i=0; i<students.length; i++) {
			
				System.out.println(students[i].sName1);
				}
				//sName1는 다른 패키지임. 그래서 1만 보이는 것
			
			} //이렇게 만들어버리면 성밖에 못 뽑아냄*/
		
		
		//이렇게 리턴으로 던져버리면 받아서 바로 사용이 된다.*/
	}
	public Student[] getStudentsList() {
		
		return students;
		
		}
	
	public void addStudent1() {
		
	}
	
	
}
