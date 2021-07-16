package hello;

import PKG_std.Student;

public class self_Cal {

	public static void main(String[] args) {
		
		//차를 만들자
		stu car1 = new stu("누리",200,100,"치즈");
		
		stu car2 = new stu("무니");
		
		car2.printCar();
		
		
		stu car4 = new stu(111,222);
		
		stu car3 = new stu();
		
		car3.carName = "꼬리";
		car3.printCar();
		
		/*
		car3.maxSpeed = 500;
		car3.minSpeed = 200;
		car3.carColor = "초록";
		*/
		
		
	}//main

}
