package hello;

import PKG_std.Student;

public class self_Cal {

	public static void main(String[] args) {
		
		//���� ������
		stu car1 = new stu("����",200,100,"ġ��");
		
		stu car2 = new stu("����");
		
		car2.printCar();
		
		
		stu car4 = new stu(111,222);
		
		stu car3 = new stu();
		
		car3.carName = "����";
		car3.printCar();
		
		/*
		car3.maxSpeed = 500;
		car3.minSpeed = 200;
		car3.carColor = "�ʷ�";
		*/
		
		
	}//main

}
