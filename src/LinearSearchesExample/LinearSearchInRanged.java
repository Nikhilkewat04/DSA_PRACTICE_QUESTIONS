package LinearSearchesExample;

public class LinearSearchInRanged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60,70,80,90,100,110,120,130,140};
		int target = 90;
		int start =3;
		int end = 12;
		int ans =searchInRanged(arr, target, start, end);
		System.out.println("Element found at index :"+ans);
	}
	static int searchInRanged(int[] arr,int target,int start,int end) {
		if(arr.length==0) {
			return -1;
		}
		
		//for loop to iterate through array
		for(int index = start;index <=end;index++) {
			if(target==arr[index]) {
				return index;
			}
		}
		return -1;
	}

}
