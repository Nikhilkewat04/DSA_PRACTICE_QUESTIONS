package questions;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// Practicing arrays (revising)
		Scanner in = new Scanner(System.in);
		int arr[] = new int[5];

		arr[0] = 23;
		arr[1] = 43;
		arr[2] = 6;
		arr[3] = 7;
		arr[4] = 97;
		// [23,43,6,7,97]
		System.out.println(arr[4]);

//		// input using for loop
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = in.nextInt();
//		}
//		// Printing array using for loop
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		
//		//Using Enhance for loop (for each)
//		
//		for(int num : arr) {
//			System.out.print(num+ " ");
//		}
//		
//		//Using toString method which internally uses for loop
//		System.out.println(Arrays.toString(arr));
//		
		//String in Array
		String[] str  = new String[4];
		for(int i =0 ; i<str.length;i++) {
			str[i]=in.next();
		}
		
		System.out.println(Arrays.toString(str));
		
		//modifying the String array
		
		str[1]= "nikhil";
		System.out.println(Arrays.toString(str));

		

	}

}
