package PKG_Cal;

public class Calcuator {
	
	public int[] getSum(int[] nums) {
		int[] result = new int[2]; 
		for(int i=0; i < nums.length; i++) {
			if(i % 2 == 1) {
			 result[0] += nums[i];	
			}
			else {
			 result[1] += nums[i];	
			}
		}
		
		return result;
	}
	
	
}//end
	
