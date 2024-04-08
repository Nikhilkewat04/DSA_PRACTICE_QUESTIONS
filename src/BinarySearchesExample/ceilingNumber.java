package BinarySearchesExample;

public class ceilingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 15;
		int ans = ceilingNumber(arr, target);
		System.out.println(ans);
	}

	// return the index
	// return the index of smallest number >= target
	static int ceilingNumber(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		//if target is greater than the greatest number in array
		if(target >arr[arr.length-1]) {
			return -1;
		}

		while (start <= end) {
			// find the mid index
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return start;
	}

}
