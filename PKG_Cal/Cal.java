package PKG_Cal;

public class Cal {

	public static void main(String[] args) {
		
	//2개를 주던 3개를 주던 4개를 주던 
	//홀수번째 숫자의 합과 짝수번째 숫자의 합을 각각 구하면
	//2개가 나와요 return을 하는데 int[]으로 
	//int[] result ==> result[0] : 홀수번째 합
	//result[1] : 짝수번째 합
	
		Calcuator cal = new Calcuator();
		
		int[] nums = new int[5];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		nums[4] = 5;
		//System.out.print(nums[1]);
		//짝수번째 합 1+3+5 = 9
		//홀수번째 합 2+4 = 6
		
		int[] result = cal.getSum(nums);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}//main

}
