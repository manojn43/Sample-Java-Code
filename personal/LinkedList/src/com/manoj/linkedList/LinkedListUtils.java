package com.manoj.linkedList;

public class LinkedListUtils {

	// util method used to print the linked list in reverse order (backtracking)
	static void printReverse(Node cur) {
		if (cur == null) {
			return;
		} else {
			printReverse(cur.getNext());
			System.out.println(cur.getData());
		}
	}

}
