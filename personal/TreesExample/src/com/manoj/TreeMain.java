package com.manoj;

public class TreeMain {

	public static void main(String[] args) {
		Tree tree = new Tree();
		
		tree.traverse();
		tree.insert(5);
		tree.insert(6);
		tree.insert(7);
		//tree.traverse();
		//tree.postOrderTraversing();
		tree.printLeaf();
	}
}
