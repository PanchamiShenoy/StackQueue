package com.stackqueue;

public class Queue {
	private final LinkedList<Integer> LinkedList;

	public Queue() {
		LinkedList = new LinkedList<Integer>();
	}

	/**
	 * method to add elements to the queue
	 */
	public void push(INode<Integer> element) {
		LinkedList.append(element);
	}

	/**
	 * method to print elements of the queue
	 */
	public void printQueue() {
		LinkedList.printMyNodes();
	}

	/**
	 * to delete element from queue
	 */
	public void pop() {
		LinkedList.deleteFront();
	}
}
