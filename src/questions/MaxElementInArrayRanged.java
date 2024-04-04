package questions;

public class MaxElementInArrayRanged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={1,3,23,9,18};
		System.out.println(maxRanged(arr, 1, 4));
	
	}
	static int maxRanged(int[] arr, int start, int end) {
		int maxVal = arr[start];
		for(int i =start;i<=end;i++) {
			if(arr[i]>maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;
	}

}
