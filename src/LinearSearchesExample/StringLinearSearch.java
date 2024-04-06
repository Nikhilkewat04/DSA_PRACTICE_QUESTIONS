package LinearSearchesExample;

import java.util.Arrays;

public class StringLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Nikhil";
		char target = 'i';
		System.out.println(search(str, target));

		// to print string in console but in array
		System.out.println(Arrays.toString(str.toCharArray()));

	}

	static boolean search(String str, char target) {
		if (str.length() == 0) {
			return false;
		}

//		//using for loop
//		for(int i =0;i<str.length();i++) {
//			if(target==str.charAt(i)) {
//				return true;
//			}
//		}

		// using for each loop
		for (char ch : str.toCharArray()) {
			if (ch == target) {
				return true;
			}
		}

		return false;
	}

}
