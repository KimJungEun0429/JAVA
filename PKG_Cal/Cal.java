package PKG_Cal;

public class Cal {

	public static void main(String[] args) {
		
	//2���� �ִ� 3���� �ִ� 4���� �ִ� 
	//Ȧ����° ������ �հ� ¦����° ������ ���� ���� ���ϸ�
	//2���� ���Ϳ� return�� �ϴµ� int[]���� 
	//int[] result ==> result[0] : Ȧ����° ��
	//result[1] : ¦����° ��
	
		Calcuator cal = new Calcuator();
		
		int[] nums = new int[5];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		nums[4] = 5;
		//System.out.print(nums[1]);
		//¦����° �� 1+3+5 = 9
		//Ȧ����° �� 2+4 = 6
		
		int[] result = cal.getSum(nums);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}//main

}
