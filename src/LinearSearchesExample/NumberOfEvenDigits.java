package LinearSearchesExample;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class NumberOfEvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums  = {12,345,2,6,7896};
		System.out.println(findNumbers(nums));
		
	}
	//to count the number of numbers of even digits
	static int findNumbers(int[] nums) {
		int count  =0;
		for(int num: nums) {
			if(even(num)) {
				count++;
			}
		}
		return count;
	}
	static boolean even(int num) {
		int numberOfDigits =digits(num);
//		if(numberOfDigits%2==0) {
//			return true;
//		}
//		return false;
		
		return numberOfDigits %2==0;
	}
	
	static int digits(int num) {
		if(num<0) {
			num = num *-1;
		}
		if(num ==0) {
			return 1;
		}
		
		int count =0;
		while(num>0) {
			num=num/10;   //num /= 10;
			count++;
		}
		return count;
	}

}
