
public class Solution {
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 4, 7};
		System.out.println(findLengthOfLCIS(nums));
		
	}
	
	public static int findLengthOfLCIS(int[] nums) {
		int counter = 1;
		int max = 1;
        for(int i = 0; i < nums.length-1; i++) {
        	if(nums[i] < nums[i+1]) {
        		counter++;
        		if(counter > max) {
        			max = counter;
        		}
        		
        	} else {
        		counter = 0;
        	}
        }
        return max;
    }

}
