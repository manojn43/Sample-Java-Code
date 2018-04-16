package com.manoj.linkedList;

public class NumberPrint {

	public static void main(String[] args) {
		new NumberPrint().print(1, 100);
	}

	void print(int i, int max) {
		if (i > max) {
			System.out.println("-------Now reverse the number--------");
			return;
		} else {
			// Print the number the ascending order
			System.out.println(i);
			print(i + 1, max);
			// Print the number the descending order
			System.out.println(i);
		}
	}
}
