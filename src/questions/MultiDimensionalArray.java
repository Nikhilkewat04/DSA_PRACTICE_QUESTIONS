package questions;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		//int[][] arr = new int[3][]; // first block represent rows and 2nd represents col rows are mandatory col are
										// not
		//you can declare it by harcoding the values
//		int[][] arr = {
//				
//						{1,2,3},  //0th index
//						{4,5},    //1st index
//						{6,7,8,9}   //2nd index -> arr[2]=[6,7,8,9]
//						
//					 };
		
		int[][] arr = new int[3][3];
//		System.out.println(arr.length);// it will print number of rows
		
		//giving input to multiD array
		
		for(int row =0; row<arr.length;row++) {
			for(int col=0; col<arr[row].length;col++) {
				arr[row][col]= in.nextInt();
			}
		}
		
		//output 
		for(int row =0; row<arr.length;row++) {
			for(int col =0; col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
		
//		//using Arrays.tostring method
//		for(int row=0;row<arr.length;row++) {
//			System.out.println(Arrays.toString(arr[row]));
//		}
		
		//using for each loop
		for(int [] a :arr) {
			System.out.println(Arrays.toString(a));
		}
		

	}

}
