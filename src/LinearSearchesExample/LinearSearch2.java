package LinearSearchesExample;

public class LinearSearch2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130 };
		int target = 90;
		int ans = linearSearch(arr, target);
		if (ans == -1) {
			System.out.println("Element not found..");
		} else {
			System.out.println("the Targeted element is :" + ans);
		}
	}

	// search the element and return the element
	// otherwise print element not found
	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		// run for loop each to iterate through the array
		for (int element : arr) {
			if (element == target) {
				return element;
			}
		}
		return -1;
	}
}
