import java.util.Scanner;

public class Course17BinarySearchEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numsLength = sc.nextInt();
		int target = sc.nextInt();
		int[] nums = new int[numsLength];
		
		for(int i = 0; i < numsLength; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(binarySearch(nums, target));
		sc.close();
		
	}
	
	public static int binarySearch(int[] nums, int target) {
		int left = 0;
		int right = nums.length;

		while (left < right) {
			int middle = (left + right) / 2;

			if (target == nums[middle]) {
				return middle;

			} else if (target < nums[middle]) {
				right = middle;

			} else if (target > nums[middle]) {
				left  = middle + 1;
			}
		}
		return left;
	}
}
