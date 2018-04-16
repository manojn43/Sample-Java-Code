package com.manoj;

public class TreeTraversing {

	static void preOrder(BTNode node) {
		if (node == null) {
			return;
		} else {
			System.out.println(node.getData());
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}

	static void inOrder(BTNode node) {
		if (node == null) {
			return;
		} else {
			inOrder(node.getLeft());
			System.out.println(node.getData());
			inOrder(node.getRight());
		}
	}

	static void postOrder(BTNode node) {
		if (node == null) {
			return;
		} else {
			postOrder(node.getLeft());
			postOrder(node.getRight());
			System.out.println(node.getData());
		}
	}

	static void printLeafNode(BTNode node) {
		if (node == null) {
			return;
		} else {
			printLeafNode(node.getLeft());
			printLeafNode(node.getRight());
			if (node.getLeft() == null && node.getRight() == null) {
				System.out.println(node.getData());
			}
		}
	}

	boolean isLeafNode(BTNode node) {
		return node.getLeft() == null && node.getRight() == null;
	}

	void printleftNode(BTNode node) {
		if (node == null) {
			return;
		}
		if (isLeafNode(node)) {
			return;
		} else {
			System.out.println(node.getData());

			if (node.getLeft() != null) {
				printleftNode(node.getLeft());
			} else {
				printleftNode(node.getRight());
			}
		}
	}

}
