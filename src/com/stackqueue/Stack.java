package com.stackqueue;

public class Stack {
	private final LinkedList<Integer> LinkedList;

	public Stack() {
		LinkedList = new LinkedList<Integer>();
	}

	/**
	 * method to add an element into the stack
	 */
	public void push(INode<Integer> element) {
		LinkedList.addFront(element);
	}

	/**
	 * method to print elements of the stack
	 */
	public void printStack() {
		LinkedList.printMyNodes();
	}
}
