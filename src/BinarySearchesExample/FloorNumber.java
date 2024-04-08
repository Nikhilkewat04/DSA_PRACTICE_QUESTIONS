package BinarySearchesExample;

public class FloorNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 15;
		int ans = floorNumber(arr, target);
		System.out.println(ans);

	}

	static int floorNumber(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return end;
		// it will give -1 if the greatest number is smaller that target number in array
		// i.e. its the smallest number in arrray
	}

}
