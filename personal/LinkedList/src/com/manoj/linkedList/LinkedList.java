package com.manoj.linkedList;

public class LinkedList {

	private Node head;

	private int size;

	// append the data to the linked list
	void append(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			size++;
		} else {
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
			size++;
		}
	}

	// Traverse the linked list
	void traverse() {

		if (head != null) {
			Node temp = head;

			while (temp != null) {
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
		}
	}

	// Delete the node from the linked list
	Node delete(int data) {
		Node temp = null;
		if (head == null) {
			System.out.println("Linked list is empty");
			return temp;
		} else if (head.getData() == data) {
			temp = head;
			head = head.getNext();
			temp.setNext(null);
			size--;
			return temp;
		} else {
			temp = head.getNext();
			Node prev = head;
			while (temp != null) {
				if (temp.getData() == data) {
					prev.setNext(temp.getNext());
					temp.setNext(null);
					size--;
					return temp;
				} else {
					prev = temp;
					temp = temp.getNext();
				}
			}
			System.out.println("data is not in the linked list");
		}
		return temp;

	}

	// Print the linked list in the reverse order
	void reverseTraverse() {
		LinkedListUtils.printReverse(head);
	}
	
	
	//Reverse the linked list
	void reverseLinkedList(){
		if(size>1){
			Node prev = head;
			Node cur = head.getNext();
			Node temp;
			
			while(cur!=null){
				
			}
		}
	}

}
