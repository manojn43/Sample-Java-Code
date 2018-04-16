package com.manoj.linkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append(5);
		list.append(6);
		list.append(7);
		System.out.println("Traverse the linked list");
		list.traverse();
		System.out.println("Reverse Traverse the linked list");
		list.reverseTraverse();
		Node n = list.delete(5);
		System.out.println(n == null ? "" : n.getData());
		System.out.println("----------------");
		list.traverse();
	}
}
