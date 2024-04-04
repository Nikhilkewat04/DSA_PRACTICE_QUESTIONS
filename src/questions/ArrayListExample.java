package questions;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		list.add(67);
		list.add(55);
		list.add(125);
		list.add(25);
		list.add(99);
		list.add(8);
		list.add(66);
		list.add(44);

		// System.out.println(list.contains(23423));
		System.out.println(list);
		list.remove(1);

		list.set(0, 00);

		System.out.println(list);

		// input
		for (int i = 0; i <= 5; i++) {
			list.add(in.nextInt());
		}

		// get item at any index
		for (int i = 0; i < 5; i++) {
			System.out.println(list.get(i)); // pass index here list[index] syntax will not work here
		}

		System.out.println(list);
	}

}
