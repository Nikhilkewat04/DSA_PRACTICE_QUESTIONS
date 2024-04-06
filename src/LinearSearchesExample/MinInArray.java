package LinearSearchesExample;

public class MinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {122,34,87,4,-45,45};
		System.out.println(min(arr));
		
	}
	//Assume that arr.length != 0
	//return the minimum value in the array
	static int min(int[] arr) {
		int ans = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<ans) {
				ans =arr[i];
			}
		}
		return ans;
	}

}
