package BinarySearchesExample;

import java.util.Arrays;

public class FirstAndLastPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 7, 7, 7, 7, 8, 8, 10 };
		int[] ans = searchRange(arr, 7);
		System.out.println(Arrays.toString(ans));

	}

	static int[] searchRange(int[] arr, int target) {
		int[] ans = { -1, -1 };
		// check for the first occurrence if target is first
		ans[0] = search(arr, target, true);
		if (ans[0] != -1) {
			ans[1] = search(arr, target, false);
		}
		return ans;
	}

	// this function will return the index value of target
	static int search(int[] arr, int target, boolean findStartIndex) {
		int ans = -1;
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				// potential answer
				ans = mid;
				if (findStartIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;

	}

}
