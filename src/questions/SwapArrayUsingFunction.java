package questions;

import java.util.Arrays;

public class SwapArrayUsingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {99,10,20,40,50};
		System.out.println(Arrays.toString(arr));
		swap(arr, 1 , 4);
		System.out.println(Arrays.toString(arr));
	}
	
	static void swap(int[] arr, int index1, int index2) {
		int temp =  arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
