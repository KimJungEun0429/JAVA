package Pkg_Exam;

public class Student {
	//�Ӽ� - �̸�
	public String name;
	public int totalScore;
	public int examCount;
	public double avgScore;
	
	//���� - ������ ģ��.(� ������?) - 4���� ����
	//method
	
	public void exam(String strSubject, int score) {
		
		System.out.println(name + " �л��� " + strSubject + " ���������� " + score);
		
		setTotal(score);
	}
	
	public void setTotal(int score) {
		
		totalScore += score;
		examCount += 1;
		avgScore = totalScore / examCount;
		
		System.out.println(totalScore);
		System.out.println(examCount);
		System.out.println(avgScore);
	}
	
	public void getTotal() {
		System.out.println(name + " �л��� ������ " + totalScore);
	}
	
	public void getAvg() {
		System.out.println(name + " �л��� ����� " + avgScore);
	}
}
