package LinearSearchesExample;

public class MaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 12, 4, 8, 46 }, { 99, 6 }, { 34, 76, 2 }, { 46, 89, 24, 00 } };
		System.out.println(max(arr));
	}
	static int max(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for(int[] row : arr) {
			for(int element:row) {
				if(element >max ) {
					max =element;
				}
			}
		}
		return max;
		
	}

}
