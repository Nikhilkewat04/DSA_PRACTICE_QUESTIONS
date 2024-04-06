package LinearSearchesExample;

public class MaximumWealthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] accounts = { { 9, 1, 2 }, { 5, 1, 1 }, { 9, 9, 9 } };
		System.out.println(maximumWealth(accounts));
	}

	static int maximumWealth(int[][] accounts) {
		// person =col
		// acount =rows
		int ans = Integer.MIN_VALUE;
		for (int[] person : accounts) {
			// when you start the new col take new sum for that col
			int sum = 0;
			for (int account : person) {
				sum += account;
			}
			// now we have sum of accounts of person
			// check that with ans
			if (sum > ans) {
				ans = sum;
			}

		}
		return ans;
	}

}
