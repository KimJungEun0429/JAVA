package PKG_Test;

import PKG_std.Student;

public class Classes {

	Student[] students;//�л�Ÿ���� �迭�� ����. ���������ڸ� ���ذ��� ����Ʈ Ÿ���� �ǰ� ������ �����ְ� ���� ������ private���� �ָ� ��.
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
			System.out.println("4���̻��� ����� �� �����ϴ�.");
		}
		
		/*public void getStudentList() {
			
			for(int i=0; i<students.length; i++) {
			
				System.out.println(students[i].sName1);
				}
				//sName1�� �ٸ� ��Ű����. �׷��� 1�� ���̴� ��
			
			} //�̷��� ���������� ���ۿ� �� �̾Ƴ�*/
		
		
		//�̷��� �������� ���������� �޾Ƽ� �ٷ� ����� �ȴ�.*/
	}
	public Student[] getStudentsList() {
		
		return students;
		
		}
	
	public void addStudent1() {
		
	}
	
	
}
