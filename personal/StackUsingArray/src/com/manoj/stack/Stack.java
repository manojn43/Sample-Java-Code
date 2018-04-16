package com.manoj.stack;

public class Stack {

	private int top;
	private int size;
	private int[] stackArr;
	
	public Stack(int capacity) {
		this.stackArr = new int[capacity];
		top=-1;
	}
	
	void push(int data){
		if(size==stackArr.length){
			System.out.println("stack overflow");
		}else{
			stackArr[++top]=data;
			size++;
			System.out.println("Added the value "+data+" and the stack is "+stackArr);
		}
	}
	
	int pop(){
		int data =-1;
		if(isEmpty()){
			System.out.println("stack underflow");
			
		}else{
			data = stackArr[top--];
			size--;
		}
		return data;
	}
	
	int getSize(){
		return size;
	}
	boolean isEmpty(){
		return size==0;
	}
	
	int peek(){
		if(isEmpty()){
			return -1;
		}else{
			return stackArr[top];
		}
	}
}
