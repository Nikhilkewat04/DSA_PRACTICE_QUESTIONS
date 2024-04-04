package questions;

import java.util.Arrays;

public class PassingUsingFunction {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		nums[4] = 5;
		System.out.println(Arrays.toString(nums));
		change(nums);
		System.out.println(Arrays.toString(nums));
		
	}
	static void change(int arr[]) {
		arr[2] =100;
	}

}
