package LinearSearchesExample;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60,70,80,90,100,110,120,130};
		int target =90;
		int ans = linearSearch(arr, target);
		System.out.println(ans);
		
	}
	//Search in the array and return the index if found
	//otherwise if item not found return -1
	static int linearSearch(int[] arr,int target) {
		if(arr.length==0) {
			return -1;
		}
		
		//run a for loop to iterate through array indexes
		for(int index =0;index<arr.length;index++) {
			int element=arr[index];
			if(element==target) 
			{
				return index;
			}
			
		}
		return -1;
		
	}

}
