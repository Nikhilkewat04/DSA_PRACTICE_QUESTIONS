package LinearSearchesExample;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 12, 4, 8, 46 }, { 99, 6 }, { 34, 76, 2 }, { 46, 89, 24, 00 } };
		int target = 99;
		int [] ans = search(arr,target);
		System.out.println(Arrays.toString(ans));
	}
//return the index where the targeted element is present
	
	static int[] search(int[][] arr, int target) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) {
					return new int[]{row,col};
				}
			}
		}
		return new int[] {-1,-1};

	}

}
