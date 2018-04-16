package com.manoj.stack;

public class TestStack {

	public static void main(String[] args) {
		Stack stack = new Stack(4);
		stack.push(2);
		stack.push(3);
		System.out.println("---------------");
		System.out.println(stack.peek());
		System.out.println("---------------");
		stack.push(4);
		stack.push(5);
		stack.push(6);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("---------------");
		System.out.println(stack.peek());
		System.out.println("---------------");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
