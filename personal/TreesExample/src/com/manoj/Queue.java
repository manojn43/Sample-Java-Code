package com.manoj;

public class Queue<T> {

	private Node<T> front, rear;

	private int size;

	void enqueue(T data) {

		Node<T> newNode = new Node<T>(data);
		if (rear == null) {
			front = rear = newNode;
		} else {
			rear.setNext(newNode);
			rear=newNode;
		}
		size++;

	}

	T dequeue() {
		if (front == null && rear == null) {
			System.out.println("Queue is Empty");
			return null;
		}
		if (front != rear) {
			Node<T> temp = front;
			front = front.getNext();
			T data = temp.getData();
			size--;
			return data;
		} else {
			T data = front.getData();
			front = rear = null;
			size--;
			return data;
		}

	}
	
	boolean isEmpty(){
		
		return front == null && rear == null;
	}
}
