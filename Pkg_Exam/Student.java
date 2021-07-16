package Pkg_Exam;

public class Student {
	//속성 - 이름
	public String name;
	public int totalScore;
	public int examCount;
	public double avgScore;
	
	//행위 - 시험을 친다.(어떤 과목을?) - 4과목 시험
	//method
	
	public void exam(String strSubject, int score) {
		
		System.out.println(name + " 학생의 " + strSubject + " 과목점수는 " + score);
		
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
		System.out.println(name + " 학생의 총점은 " + totalScore);
	}
	
	public void getAvg() {
		System.out.println(name + " 학생의 평균은 " + avgScore);
	}
}
